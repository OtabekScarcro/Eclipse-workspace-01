/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-24 10:14:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileReader;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("java.io.FileInputStream");
    _jspx_imports_classes.add("java.io.FileReader");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"ISO-8859-1\">\r\n");
      out.write("	<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("	<title>Docs</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        li{\r\n");
      out.write("        	padding: 10px;\r\n");
      out.write("        }\r\n");
      out.write("        .info{\r\n");
      out.write("        	margin: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        p{\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg bg-body-tertiary\">\r\n");
      out.write("	  <div class=\"container-fluid container\">\r\n");
      out.write("	    <a class=\"navbar-brand\" href=\"#\">Navbar</a>\r\n");
      out.write("	    <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("	      <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("	    </button>\r\n");
      out.write("	    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("	      <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("	        <li class=\"nav-item\">\r\n");
      out.write("	          <a class=\"nav-link active\" aria-current=\"page\" href=\"#\">Home</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav-item\">\r\n");
      out.write("	          <a class=\"nav-link\" href=\"#\">Link</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav-item dropdown\">\r\n");
      out.write("	          <a class=\"nav-link dropdown-toggle\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("	            Dropdown\r\n");
      out.write("	          </a>\r\n");
      out.write("	          <ul class=\"dropdown-menu\">\r\n");
      out.write("	            <li><a class=\"dropdown-item\" href=\"#\">Action</a></li>\r\n");
      out.write("	            <li><a class=\"dropdown-item\" href=\"#\">Another action</a></li>\r\n");
      out.write("	            <li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("	            <li><a class=\"dropdown-item\" href=\"#\">Something else here</a></li>\r\n");
      out.write("	          </ul>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav-item\">\r\n");
      out.write("	          <a class=\"nav-link disabled\">Disabled</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	      </ul>\r\n");
      out.write("	      <form class=\"d-flex\" role=\"search\">\r\n");
      out.write("	        <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("	        <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\r\n");
      out.write("	      </form>\r\n");
      out.write("	    </div>\r\n");
      out.write("	  </div>\r\n");
      out.write("	</nav>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"w-30 d-flex\">\r\n");
      out.write("        <div class=\"topics\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    sggwrgwgrsrwbwb\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    sggwrgwgrsrwbwb\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    sggwrgwgrsrwbwb\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    sggwrgwgrsrwbwb\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    sggwrgwgrsrwbwb\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"info\">\r\n");
      out.write("\r\n");
      out.write("            ");

            try{
            	FileInputStream fis = new FileInputStream("/intro.txt");
            	byte[] b = new byte[fis.available()];
            	fis.read(b);
            	String s = new String(b);
            	System.out.println(s);
            } catch(IOException e){e.printStackTrace();}
            
      out.write("\r\n");
      out.write("            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}