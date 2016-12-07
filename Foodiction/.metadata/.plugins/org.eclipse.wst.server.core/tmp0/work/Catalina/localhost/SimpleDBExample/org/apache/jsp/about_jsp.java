package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.List<java.lang.String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<java.lang.String>(2);
    _jspx_dependants.add("/navbar.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.List<java.lang.String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>MIE350 Sample Database Web App</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/theme.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("<nav>\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h1>MIE350 Sample Database Web App</h1>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<ul id=\"nav\">\r\n");
      out.write("\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("\t\t<li><a href=\"/SimpleDBExample/UserController?action=listUser\" />Users\r\n");
      out.write("\t\t\tin DB</a></li>\r\n");
      out.write("\t\t<li><a href=\"searchUser.jsp\">Search A User</a></li>\r\n");
      out.write("\t\t<li><a href=\"helpful_links.jsp\">Other Links</a>\r\n");
      out.write("\t\t\t<ul id=\"nav\">\r\n");
      out.write("\t\t\t\t<li><a href=\"sample_html.jsp\">Sample HTML Tags</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://www.w3schools.com/html/default.asp\">HTML Tutorial</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"http://www.w3schools.com/bootstrap/\">BootStrap CSS Tutorial</a></li>\r\n");
      out.write("\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<h1>About</h1>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\tThis is a sample web app created for the <b>MIE350</b> course at the <a\r\n");
      out.write("\t\t\thref=\"http://www.utoronto.ca\">University of Toronto</a> for\r\n");
      out.write("\t\tdemonstration purposes. <br> <br> It was developed using the\r\n");
      out.write("\t\tfollowing:<br>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>Eclipse Java EE IDE for Web Developers,</li>\r\n");
      out.write("\t\t\t<li>The Java programming language,</li>\r\n");
      out.write("\t\t\t<li>Java Server Pages (JSP),</li>\r\n");
      out.write("\t\t\t<li>Apache Tomcat 7.0, and</li>\r\n");
      out.write("\t\t\t<li>A simple Microsoft Access database.</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<br> This is a toy example that does the following: <br>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li><b>Create</b> new users in the database.</li>\r\n");
      out.write("\t\t\t<li><b>Read</b> in users from the database.</li>\r\n");
      out.write("\t\t\t<li><b>Update</b> user information in the database.</li>\r\n");
      out.write("\t\t\t<li><b>Delete</b> users in the database.</li>\r\n");
      out.write("\t\t\t<li><b>Search</b> for users in the database.</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<br> You are free to use this template file for your projects.<br>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("<div id=\"footer\">\r\n");
      out.write("\t<ul class=\"bottom\">\r\n");
      out.write("\t\tThis sample web app is for demonstration purposes only.\r\n");
      out.write("\t\t<br> MIE350 Sample Web Application &#169;\r\n");
      out.write("\t\t");
      out.print(new java.text.SimpleDateFormat("yyyy")
					.format(new java.util.Date()));
      out.write("\r\n");
      out.write("\t\tUniversity of Toronto<br>\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
