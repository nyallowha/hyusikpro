/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-05-12 02:02:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.header;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/project1/hyusik/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/prac1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1589173211115L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#rank {margin: 20px;padding: 10px;width: 200px;position: absolute;top: 105px;left: 950px;}\r\n");
      out.write("#rank-list {overflow: hidden;width: 160px;height: 20px;margin: 0;}\r\n");
      out.write("#rank-list dd {position: relative;margin: 0;}\r\n");
      out.write("#rank-list ol {position: absolute;top: 0;left: 0;margin: 0;padding: 0;list-style-type: none;}\r\n");
      out.write("#rank-list li {height: 20px;line-height: 20px;}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(function() {\r\n");
      out.write("    var count = $('#rank-list li').length;\r\n");
      out.write("    var height = $('#rank-list li').height();\r\n");
      out.write("\r\n");
      out.write("    function step(index) {\r\n");
      out.write("        $('#rank-list ol').delay(2000).animate({\r\n");
      out.write("            top: -height * index,\r\n");
      out.write("        }, 500, function() {\r\n");
      out.write("            step((index + 1) % count);\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    step(1);\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"header_style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"body\">\r\n");
      out.write("\t<form name=\"form1\">\r\n");
      out.write("\t<!-- target=\"_blank\" 클릭하면 새창 -->\r\n");
      out.write("\t<span class=\"logo\"><a href=\"https://www.naver.com/\">휴~ 식</a></span>\t\r\n");
      out.write("  <div id=\"choice\">\r\n");
      out.write("  <!-- http://localhost:8090/kim/header/header_login.jsp?site=? -->\r\n");
      out.write("    <select name=\"site\" id=\"site\" style=\"width:50%;height:30px;\">\r\n");
      out.write("    \t<option selected>선택하세요</option>\r\n");
      out.write("        \t<option value=\"1\">서울 만남의 광장 부산방향</option>\r\n");
      out.write("            <option value=\"2\">죽전휴게소 서울방향</option>\r\n");
      out.write("            <option value=\"3\">기흥휴게소 부산방향</option>\r\n");
      out.write("            <option value=\"4\">안성휴게소 서울방향</option>\r\n");
      out.write("            <option value=\"5\">입장거봉포도휴게소 서울방향</option>\r\n");
      out.write("            <option value=\"6\">망향휴게소 부산방향</option>\r\n");
      out.write("            <option value=\"7\">천안삼거리휴게소 서울방향</option>\r\n");
      out.write("            <option value=\"8\">천안호두휴게소 부산방향</option>\r\n");
      out.write("            <option value=\"9\">청주휴게소 서울방향</option>\r\n");
      out.write("            <option value=\"10\">옥산휴게소 부산방향</option>\r\n");
      out.write("            <option value=\"11\">죽암휴게소 서울방향</option>\r\n");
      out.write("            <option value=\"12\">죽암휴게소 부산방향</option>\r\n");
      out.write("            <option value=\"13\">신탄진휴게소 서울방향</option>\r\n");
      out.write("    </select>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"찾기\" style=\"height:30px;\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<nav class=\"nav\">\r\n");
      out.write("\t\t\t<ul class=\"list\">\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"https://www.naver.com/\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"#\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"#\">도로 교통 상황</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"#\">추천휴게소</a></li>\r\n");
      out.write("                <li class=\"list-item\"><a href=\"#\">추천주유소</a></li>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"rank\">\r\n");
      out.write("\t\t<dl id=\"rank-list\">\r\n");
      out.write("\t\t\t<dd>\r\n");
      out.write("\t\t\t\t<ol>\r\n");
      out.write("\t\t\t\t<li><a href=\"#\">1 순위</a></li>\r\n");
      out.write("                <li><a href=\"#\">2 순위</a></li>\r\n");
      out.write("                <li><a href=\"#\">3 순위</a></li>\r\n");
      out.write("                <li><a href=\"#\">4 순위</a></li>\r\n");
      out.write("                <li><a href=\"#\">5 순위</a></li>\r\n");
      out.write("                </ol>\r\n");
      out.write("            </dd>\r\n");
      out.write("        </dl>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /header/header_login.jsp(69,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty AUTHUSER }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" <!-- 미로그인시 -->\r\n");
          out.write("\t\t\t\t<li class=\"list-item\"><a href=\"#\">로그인</a></li>\r\n");
          out.write("\t\t\t\t<li class=\"list-item\"><a href=\"#\">회원가입</a></li>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /header/header_login.jsp(73,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${! empty AUTHUSER }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write(" <!--로그인시--> \r\n");
          out.write("                \t<li class=\"list-item\"><a href=\"#\">마이페이지</a></li>\r\n");
          out.write("\t\t\t\t\t<li class=\"list-item\"><a href=\"#\">로그아웃</a></li>\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
