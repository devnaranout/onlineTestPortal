
package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginDAO {
    
    public String checkInfo(String email,String psw) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/onlinetestportal";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
            
           
            String query="select * from tbstudent where email=? and password=?";
            pr=con.prepareStatement(query);
            pr.setString(1,email);
            pr.setString(2,psw);
            
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "you are logged in";
            }
           
                return "incorrect data";

            
    }
    
    
    public String checkInfo1(String email,String psw) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/onlinetestportal";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
            
           
            String query="select * from tbadmin where email=? and password=?";
            pr=con.prepareStatement(query);
            pr.setString(1,email);
            pr.setString(2,psw);
            
            ResultSet rs;
            rs=pr.executeQuery();
            if(rs.next())
            {
                return "you are logged in";
            }
           
                return "incorrect data";

            
    }
    
    public String addStudent(String name,String email,String mobNo,String psw) throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        PreparedStatement pr=null;
            String myUrl="jdbc:mysql://localhost/onlinetestportal";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(myUrl,"root","");
            
           
            
            String query="insert into tbstudent(name,email,mobNo,password) values(?,?,?,?)";
            pr=con.prepareStatement(query);
            pr.setString(1,name);
            pr.setString(2,email);
            pr.setString(3,mobNo);
            pr.setString(4,psw);
            boolean a=pr.execute();
            if(!a)
            {
                return "data inserted successfully";
            }
            return "data not inserted";
    }
    
    
}
