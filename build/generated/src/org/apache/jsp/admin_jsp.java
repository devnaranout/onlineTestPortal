package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin Login</title>\n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("body {\n");
      out.write("background-size:cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("  list-style-type: none;\n");
      out.write("  margin: 0;\n");
      out.write("  padding: 0;\n");
      out.write("  overflow: hidden;\n");
      out.write("  border: 1px solid #e7e7e7;\n");
      out.write("  background-color: #f3f3f3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a, .dropbtn  {\n");
      out.write("  display: block;\n");
      out.write("  color: #666;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover:not(.active), .dropdown:hover .dropbtn {\n");
      out.write("  background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a.active {\n");
      out.write("  color: white;\n");
      out.write("  background-color: #4CAF50;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li.dropdown {\n");
      out.write("  display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color: #f9f9f9;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("  color: black;\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  display: block;\n");
      out.write("  text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {background-color: #f1f1f1;}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("  display: block;\n");
      out.write("  margin-left: auto;\n");
      out.write("  margin-right: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".center {\n");
      out.write("text-align: center;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("input[type=text], input[type=password] {\n");
      out.write("    width: 50%;\n");
      out.write("    padding: 15px;\n");
      out.write("    margin: 5px 0 22px 0;\n");
      out.write("    border: none;\n");
      out.write("    background: #f1f1f1;\n");
      out.write("}\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\n");
      out.write("    background-color: #ddd;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("/* Set a style for the submit button */\n");
      out.write(".btn {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("    padding: 16px 20px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 50%;\n");
      out.write("    opacity: 0.9;\n");
      out.write("}\n");
      out.write(".btn:hover {\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write("/*a:link, a:visited {\n");
      out.write("    background-color: #f44336;\n");
      out.write("    color: white;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("    a:hover, a:active {\n");
      out.write("    background-color:red;\n");
      out.write("} \n");
      out.write("*/\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("<body background=\"480421.jpg\">\n");
      out.write("\n");
      out.write("    <ul>\n");
      out.write("    <li><font face=\"Comic Sans MS\" size=\"6\"><b><i><u>Test Portal</u></i></b></font></li>\n");
      out.write("  <li style=\"float:right\"><a href=\"#news\">Admin</a></li>\n");
      out.write("  <li style=\"float:right\" class=\"dropdown\">\n");
      out.write("    <a href=\"javascript:void(0)\" class=\"dropbtn\">Student</a>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Login</a>\n");
      out.write("      <a href=\"#\">Register</a>\n");
      out.write("    </div>\n");
      out.write("  </li>\n");
      out.write("  <li style=\"float:right\"><a class=\"active\" href=\"homepage.jsp\">Home</a></li>\n");
      out.write("</ul>\n");
      out.write("    <hr><br><br>\n");
      out.write("    \n");
      out.write("    <img src=\"images.jpg\" height=\"150\" width=\"150\">\n");
      out.write("    <div class=\"bg-img center\">\n");
      out.write("   <form action=\"admin\" method=\"post\" class=\"container\">\n");
      out.write("       <br><br>\n");
      out.write("\n");
      out.write("      <input type=\"text\" placeholder=\"Enter id\" name=\"id\" pattern=\"[0-9]{10}\" title=\"ten digits\" required>\n");
      out.write("\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n");
      out.write("\n");
      out.write("    <button type=\"submit\" class=\"btn\">Login</button>\n");
      out.write("  </form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
