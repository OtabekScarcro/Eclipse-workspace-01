/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-05-13 22:14:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1682259072135L));
    _jspx_dependants.put("/head.jsp", Long.valueOf(1682263799600L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"ISO-8859-1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/main-header.css\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\" integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    <title>");

    		if(request.getAttribute("title") == null){
    			out.println("Welcome Java Learning");
    		}else {
    			out.println(request.getAttribute("title"));
    		}
			
      out.write("\r\n");
      out.write("	</title>\r\n");
      out.write("</head> \r\n");
      out.write("<body>\r\n");
      out.write("	<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("	\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("	  <div class=\"container-fluid container hover-white\">\r\n");
      out.write("	    <a class=\"navbar-brand fs-2 fw-bold text-white\" href=\"#\">Learn With Bryan</a>\r\n");
      out.write("	    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("	      <ul class=\"navbar-nav ms-auto mb-2 mb-lg-0\">\r\n");
      out.write("	        <li class=\"nav-item me-3\">\r\n");
      out.write("	          <a class=\"nav-link fw-bold fs-5 text-white\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/java-coders?page=home\">Home</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav-item me-3\">\r\n");
      out.write("	          <a class=\"nav-link fw-bold fs-5 text-white\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/java-coders?page=docs\">Docs</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav-item me-3\">\r\n");
      out.write("	          <a class=\"nav-link fw-bold fs-5 text-white\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/java-coders?page=questions\">Questions</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav-item me-3\">\r\n");
      out.write("	          <a class=\"nav-link fw-bold fs-5 text-white\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/java-coders?page=resources\">Best Resources</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        <li class=\"nav-item me-3\">\r\n");
      out.write("	          <a class=\"nav-link fw-bold fs-5 text-white\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/java-coders?page=about-me\">About me</a>\r\n");
      out.write("	        </li>\r\n");
      out.write("	        ");
if(request.getSession().getAttribute("user") != null){ 
      out.write("\r\n");
      out.write("	        	<li class=\"nav-item me-3\">\r\n");
      out.write("		          <a class=\"nav-link fw-bold fs-5 text-white\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/java-coders?page=sign-out\">Sign out</a>\r\n");
      out.write("		        </li>\r\n");
      out.write("		    ");
}
      out.write("\r\n");
      out.write("	      </ul>\r\n");
      out.write("	    </div>\r\n");
      out.write("	  </div>\r\n");
      out.write("	</nav>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"card w-50 mx-auto my-5\">\r\n");
      out.write("			<div class=\"card-header text-center\">\r\n");
      out.write("				User Login\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<form action=\"user-login\" method=\"get\">\r\n");
      out.write("					<div class=\"form-group my-3\">\r\n");
      out.write("						<label class=\"form-label\">Email Address</label>\r\n");
      out.write("						<input type=\"email\" class=\"form-control\" name=\"login-email\" placeholder=\"Enter your email\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group my-3\">\r\n");
      out.write("						<label class=\"form-label\">Password</label>\r\n");
      out.write("						<input type=\"password\" class=\"form-control\" name=\"login-password\" required>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"text-center my-3\">\r\n");
      out.write("						<button type=\"submit\" class=\"btn btn-primary\">Login</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("<footer class=\"footer\" id=\"footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"footer-navigation__icon\">\r\n");
      out.write("            <a href=\"#\" class=\"footer-icon\">\r\n");
      out.write("             <i class=\"fa-brands fa-java\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <nav class=\"footer-navigation\">\r\n");
      out.write("            <ul class=\"footer-navigation__items my-3\">\r\n");
      out.write("                <li class=\"nav-item hover-white\">\r\n");
      out.write("         <a class=\"nav-link fw-bold\" href=\"#\">Home</a>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li class=\"nav-item hover-white\">\r\n");
      out.write("         <a class=\"nav-link fw-bold\" href=\"#\">Docs</a>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li class=\"nav-item hover-white\">\r\n");
      out.write("         <a class=\"nav-link fw-bold\" href=\"#\">Questions</a>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li class=\"nav-item hover-white\">\r\n");
      out.write("         <a class=\"nav-link fw-bold\" href=\"#\">Achievements</a>\r\n");
      out.write("       </li>\r\n");
      out.write("       <li class=\"nav-item hover-white\">\r\n");
      out.write("         <a class=\"nav-link fw-bold\" href=\"#\">About me</a>\r\n");
      out.write("       </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <div class=\"socials\">\r\n");
      out.write("            <a href=\"#\" class=\"text-primary fs-3\">\r\n");
      out.write("                <i class=\"fa-brands fa-twitter\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" class=\"text-danger fs-3\">\r\n");
      out.write("                <i class=\"fa-brands fa-youtube\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" class=\"text-primary fs-3\">\r\n");
      out.write("                <i class=\"fa-brands fa-instagram\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" class=\"text-primary fs-3\">\r\n");
      out.write("                <i class=\"fa-brands fa-telegram\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("            <a href=\"#\" class=\"text-primary fs-3\">\r\n");
      out.write("                <i class=\"fa-brands fa-linkedin\"></i>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <p class=\"footer-text\">\r\n");
      out.write("            Copyright Â©2023 All rights reserved | This template is made with <i class=\"fa fa-heart\"></i> by Bryan\r\n");
      out.write("        </p>\r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
