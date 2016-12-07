package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sample_005fhtml_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<h1>Sample HTML Tags</h1>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\tThis page outlines basic HTML tags you can use to decorate your web\r\n");
      out.write("\t\tapp pages.<br>\r\n");
      out.write("\r\n");
      out.write("\t\t<blockquote>\r\n");
      out.write("\t\t\t<b>This is bolded text.</b><br> &lt;b&gt;This is bolded\r\n");
      out.write("\t\t\ttext.&lt;/b&gt;\r\n");
      out.write("\t\t</blockquote>\r\n");
      out.write("\r\n");
      out.write("\t\t<blockquote>\r\n");
      out.write("\t\t\t<i>This is italicized text.</i><br> &lt;i&gt;This is italicized\r\n");
      out.write("\t\t\ttext.&lt;/i&gt;\r\n");
      out.write("\t\t</blockquote>\r\n");
      out.write("\r\n");
      out.write("\t\t<blockquote>\r\n");
      out.write("\t\t\t<u>This is underlined text.</u><br> &lt;u&gt;This is underlined\r\n");
      out.write("\t\t\ttext.&lt;/u&gt;\r\n");
      out.write("\t\t</blockquote>\r\n");
      out.write("\r\n");
      out.write("\t\t<blockquote>\r\n");
      out.write("\t\t\tThis text contains<br>a line break.<br> This text\r\n");
      out.write("\t\t\tcontains&lt;br&gt;a line break.\r\n");
      out.write("\t\t</blockquote>\r\n");
      out.write("\r\n");
      out.write("\t\t<table style=\"width: 100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Jill</td>\r\n");
      out.write("\t\t\t\t<td>Smith</td>\r\n");
      out.write("\t\t\t\t<td>50</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>Eve</td>\r\n");
      out.write("\t\t\t\t<td>Jackson</td>\r\n");
      out.write("\t\t\t\t<td>94</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"w3-code notranslate htmlHigh\">\r\n");
      out.write("\t\t\t&lt;table style=&quot;width:100%&quot;&gt;<br> &nbsp; &lt;tr&gt;<br>&nbsp;\r\n");
      out.write("\t\t\t&nbsp; &lt;td&gt;Jill&lt;/td&gt;<br> &nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t&lt;td&gt;Smith&lt;/td&gt; <br>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t&lt;td&gt;50&lt;/td&gt;<br> &nbsp; &lt;/tr&gt;<br>&nbsp;\r\n");
      out.write("\t\t\t&lt;tr&gt;<br>&nbsp;&nbsp;&nbsp; &lt;td&gt;Eve&lt;/td&gt;<br>\r\n");
      out.write("\t\t\t&nbsp;&nbsp;&nbsp; &lt;td&gt;Jackson&lt;/td&gt; <br>&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t&lt;td&gt;94&lt;/td&gt;<br> &nbsp; &lt;/tr&gt;<br>&lt;/table&gt;\r\n");
      out.write("\t\t</div>\r\n");
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
