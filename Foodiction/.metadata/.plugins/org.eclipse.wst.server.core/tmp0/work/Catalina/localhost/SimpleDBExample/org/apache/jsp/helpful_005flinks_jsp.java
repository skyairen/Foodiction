package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class helpful_005flinks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<h1>Other Links</h1>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<p>As well, below are some links that may be of use.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t<u><b>Java Server Pages (JSP)</b></u>\r\n");
      out.write("\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>JSP - Actions: <a\r\n");
      out.write("\t\t\t\thref=\"http://www.tutorialspoint.com/jsp/jsp_actions.htm\">http://www.tutorialspoint.com/jsp/jsp_actions.htm</a></li>\r\n");
      out.write("\t\t\t<li>JSP - Form Processing: <a\r\n");
      out.write("\t\t\t\thref=\"http://www.tutorialspoint.com/jsp/jsp_form_processing.htm\">http://www.tutorialspoint.com/jsp/jsp_form_processing.htm</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t<u><b>HyperText Markup Language (HTML)</b></u>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>W3Schools' HTML Tutorial: <a\r\n");
      out.write("\t\t\t\thref=\"http://www.w3schools.com/html/default.asp\" target=\"_blank\">http://www.w3schools.com/html/default.asp</a></li>\r\n");
      out.write("\t\t\t<li>Overview of basic HTML tags: <a\r\n");
      out.write("\t\t\t\thref=\"http://www.htmlcodetutorial.com/document/\" target=\"_blank\">http://www.htmlcodetutorial.com/document/</a></li>\r\n");
      out.write("\t\t\t<li>Mozilla's Introduction to HTML: <a\r\n");
      out.write("\t\t\t\thref=\"https://developer.mozilla.org/en-US/docs/HTML/Introduction\"\r\n");
      out.write("\t\t\t\ttarget=\"_blank\">https://developer.mozilla.org/en-US/docs/HTML/Introduction</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t<u><b>Cascading Style Sheets (CSS)</b></u>\r\n");
      out.write("\t\t<ul>\r\n");
      out.write("\t\t\t<li>W3Schools' CSS Tutorial: <a\r\n");
      out.write("\t\t\t\thref=\"http://www.w3schools.com/css/default.asp\" target=\"_blank\">http://www.w3schools.com/css/default.asp</a></li>\r\n");
      out.write("\t\t\t<li>Overview of style sheets: <a\r\n");
      out.write("\t\t\t\thref=\"http://www.htmlcodetutorial.com/css/css.html\" target=\"_blank\">http://www.htmlcodetutorial.com/css/css.html</a></li>\r\n");
      out.write("\t\t\t<li>Mozilla's CSS Tutorial for Beginners: <a\r\n");
      out.write("\t\t\t\thref=\"https://developer.mozilla.org/en-US/docs/CSS/Getting_Started\"\r\n");
      out.write("\t\t\t\ttarget=\"_blank\">https://developer.mozilla.org/en-US/docs/CSS/Getting_Started</a></li>\r\n");
      out.write("\t\t\t<li>W3C's Tutorial on Starting with HTML + CSS: <a\r\n");
      out.write("\t\t\t\thref=\"http://www.w3.org/Style/Examples/011/firstcss.en.html\"\r\n");
      out.write("\t\t\t\ttarget=\"_blank\">http://www.w3.org/Style/Examples/011/firstcss.en.html</a></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<br />Please keep in mind that the overall <b><i><span\r\n");
      out.write("\t\t\t\t\tstyle=\"text-decoration: underline;\">functionality</span> </i></b>of your\r\n");
      out.write("\t\t\tweb application is more important than aesthetics, so don't spend too\r\n");
      out.write("\t\t\tmuch time making your web applications pretty!\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
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
