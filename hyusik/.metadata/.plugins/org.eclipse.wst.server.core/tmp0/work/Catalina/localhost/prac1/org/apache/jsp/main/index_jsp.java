/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-05-13 07:38:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/project1/hyusik/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/prac1/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/tags/notLogin.tag", Long.valueOf(1589266511036L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1589173211115L));
    _jspx_dependants.put("/WEB-INF/tags/isLogin.tag", Long.valueOf(1589266504704L));
    _jspx_dependants.put("/header/header.jsp", Long.valueOf(1589355452712L));
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
  }

  public void _jspDestroy() {
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>header</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#rank {width: 200px;position: relative;top: -35px;left: 950px;}\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/header/header_style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"body\">\r\n");
      out.write("<form name=\"form1\" action=\"");
      out.print(request.getContextPath());
      out.write("/info.go\" method=\"get\">\r\n");
      out.write("<!-- target=\"_blank\" 클릭하면 새창 -->\r\n");
      out.write("<span class=\"logo\"><a href=\"https://www.naver.com/\">휴~ 식</a></span>\t\r\n");
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
      out.write("\t\t\t\t<!-- filter설정하기 -->\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"notice.go\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"qna.go\">Q&A</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"road.go\">도로 교통 상황</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"recommand.go\">추천휴게소</a></li>\r\n");
      out.write("                <li class=\"list-item\"><a href=\"oilprice.go\">추천주유소</a></li>\r\n");
      out.write("                \r\n");
      out.write("                ");
      if (_jspx_meth_u_005fisLogin_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_u_005fnotLogin_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \r\n");
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
      out.write("</header>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>MAIN</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://localhost:8090/prac1/header/header_style.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=d033ab2c0002c3aedd619825d12b4956\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<main class=\"body\">\r\n");
      out.write("<div class=\"main\" style=\"height:750px;padding:20px;\">\r\n");
      out.write("\t<p id=\"button\" align=\"right\">\r\n");
      out.write("\t\t<button onclick=\"setOverlayMapTypeId('TRAFFIC')\">교통정보</button>\r\n");
      out.write("\t\t<button onclick=\"setOverlayMapTypeId('ROADMAP')\">보기</button></p>\r\n");
      out.write("\t<div id=\"map\" style=\"width:100%;height:95%\" ></div>\r\n");
      out.write("\t<script src=\"main_script.js\"></script>\r\n");
      out.write("</div>\r\n");
      out.write("</main>\r\n");
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

  private boolean _jspx_meth_u_005fisLogin_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  u:isLogin
    org.apache.jsp.tag.web.isLogin_tag _jspx_th_u_005fisLogin_005f0 = new org.apache.jsp.tag.web.isLogin_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_u_005fisLogin_005f0);
    try {
      _jspx_th_u_005fisLogin_005f0.setJspContext(_jspx_page_context);
      _jspx_th_u_005fisLogin_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_u_005fisLogin_005f0, null));
      _jspx_th_u_005fisLogin_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_u_005fisLogin_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_u_005fnotLogin_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  u:notLogin
    org.apache.jsp.tag.web.notLogin_tag _jspx_th_u_005fnotLogin_005f0 = new org.apache.jsp.tag.web.notLogin_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_u_005fnotLogin_005f0);
    try {
      _jspx_th_u_005fnotLogin_005f0.setJspContext(_jspx_page_context);
      _jspx_th_u_005fnotLogin_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_u_005fnotLogin_005f0, null));
      _jspx_th_u_005fnotLogin_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_u_005fnotLogin_005f0);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, javax.servlet.jsp.JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write(" <!-- 미로그인시 -->\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"login.go\">로그인</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"list-item\"><a href=\"join.go\">회원가입</a></li>\r\n");
      out.write("                ");
      return false;
    }
    public boolean invoke1( javax.servlet.jsp.JspWriter out ) 
      throws java.lang.Throwable
    {
      out.write(" <!--로그인시--> \r\n");
      out.write("                \t<li class=\"list-item\"><a href=\"mypage.go\">마이페이지</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"list-item\"><a href=\"logout.go\">로그아웃</a></li>\r\n");
      out.write("                ");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws javax.servlet.jsp.JspException
    {
      javax.servlet.jsp.JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        Object _jspx_saved_JspContext = this.jspContext.getELContext().getContext(javax.servlet.jsp.JspContext.class);
        this.jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
        }
        jspContext.getELContext().putContext(javax.servlet.jsp.JspContext.class,_jspx_saved_JspContext);
      }
      catch( java.lang.Throwable e ) {
        if (e instanceof javax.servlet.jsp.SkipPageException)
            throw (javax.servlet.jsp.SkipPageException) e;
        throw new javax.servlet.jsp.JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
