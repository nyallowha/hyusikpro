/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.53
 * Generated at: 2020-05-11 09:04:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class informationpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>서울 만남의 광장 휴게소</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=d033ab2c0002c3aedd619825d12b4956\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header class=\"header\">\r\n");
      out.write("        <h2 class=\"logo\"><a href=\"#\">로고</a></h2>\r\n");
      out.write("        <h1 class=\"title\">서울 만남의 광장 휴게소 상세페이지</h1>\r\n");
      out.write("</header>\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <h2 class=\"cont_title\">서울 만남의 광장 휴게소 상세정보</h2>\r\n");
      out.write("        <div class=\"image\"><img src=\"http://cfile211.uf.daum.net/image/991F6B4E5D3CECD426A30B\" width=\"800px\"/></div><br/><br/>\r\n");
      out.write("        <table class=\"location\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td rowspan=\"2\"><div id=\"map\" style=\"width:500px;height:400px;\"></div>\r\n");
      out.write("                <script src=\"info.js\"></script>\r\n");
      out.write("                </td>\r\n");
      out.write("                <div class=\"address\"><td>주소</td>\r\n");
      out.write("                <td>서울 서초구 양재대로12길 73-71 (원지동, 만남의 광장)</td></div>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <div class=\"tel\"><td>전화번호</td>\r\n");
      out.write("                <td>휴게소02-578-3372 | 주유소02-573-7430</td></div>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table><br/><br/><br/>\r\n");
      out.write("            <p class=\"intro\">휴게소 소개</p>\r\n");
      out.write("                <p class=\"intro1\">서울만남의광장 휴게시설은 경부고속도로에 위치하여 부산방향으로 향하는 첫번째 고속도로휴게소입니다.<br/>\r\n");
      out.write("                고속도로휴게소의 첫 시작인만큼 보다더 맛있는 식음료를 제공하고 있으며 청결한 화장실과 수유실 등의 <br/>\r\n");
      out.write("                국민을 위한 편의시설이 배치하여 고속도로 이용객에게 많은 사랑을 받는 휴게소입니다. <br/>\r\n");
      out.write("                서울만남의광장 휴게소의 대표메뉴 '말죽거리 소고기국밥'는 3년 연속 EX-FOOD 선정되었으며 <br/>\r\n");
      out.write("                2016년 전국 고속도로 휴개시설 운영서비스 평가 1등급(우수) 선정되었습니다.</p>\r\n");
      out.write("        </div><br/>\r\n");
      out.write("        <ul>\r\n");
      out.write("        <div class=\"information\">\r\n");
      out.write("            <p class=\"information_title\"> 시설정보</p>\r\n");
      out.write("            <li>편의시설\r\n");
      out.write("                <table name=\"information\" id=\"information\" width=\"500\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><i class=\"fas fa-baby fa-3x\"></i></td>\r\n");
      out.write("                    <td><i class=\"fas fa-bed fa-3x\"></i></td>\r\n");
      out.write("                    <td><i class=\"fas fa-gas-pump fa-3x\"></i></td>\r\n");
      out.write("                    <td><i class=\"fas fa-store fa-3x\"></i></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>수유실</td>\r\n");
      out.write("                    <td>수면실</td>\r\n");
      out.write("                    <td>주유소<a href=\"#oilPrice\">(더보기)</a></td>\r\n");
      out.write("                    <td>편의점</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </li><br/>\r\n");
      out.write("            <li>\r\n");
      out.write("             입점매장\r\n");
      out.write("            <table name=\"information\" id=\"brand\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><img src=\"https://t1.daumcdn.net/cfile/tistory/991001475BA3B25321\" class=\"txc-image\" width=\"126\" height=\"95\" actualwidth=\"126\"></td>\r\n");
      out.write("                    <td><img src=\"https://t1.daumcdn.net/cfile/tistory/99FDE34D5BA3B2601D\" class=\"txc-image\" width=\"126\" height=\"95\" actualwidth=\"126\"></td>\r\n");
      out.write("                    <td><img src=\"https://t1.daumcdn.net/cfile/tistory/9974C24F5BA3B26731\" class=\"txc-image\" width=\"126\" height=\"95\" actualwidth=\"126\"></td>\r\n");
      out.write("                    <td><i class=\"fas fa-utensils fa-3x\"></i></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>TOM N TOMS</td>\r\n");
      out.write("                    <td>HOLLYS COFFEE</td>\r\n");
      out.write("                    <td>ROTTIBUN</td>\r\n");
      out.write("                    <td>말죽거리한식당</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </li><br/>\r\n");
      out.write("            <li>주차장 현황<br/>\r\n");
      out.write("            면적 : 2,192㎡<br/>\r\n");
      out.write("            주차대수 : 141대 [대형 :12, 소형 :125, 장애인 :4] </li><br/>\r\n");
      out.write("            <li>화장실 현황<br/>\r\n");
      out.write("            면적 : 276㎡(남:122㎡, 여:136㎡)<br/>\r\n");
      out.write("            편의시설 : 핸드드라이, 소지품비치대, 어린이용부스, 파우더 룸, 아기기저귀교체대, 모유수유실, 비상용아기기저귀교체물품함, 유아용보호의자, 에티켓 벨\r\n");
      out.write("            </li><br/>\r\n");
      out.write("            <li>편의시설 현황<br/>\r\n");
      out.write("            공중전화 설치 : 장애인용 1대, 일반 11대<br/>\r\n");
      out.write("            편의시설 : 장애인용(워커,휠체어,목발), 유아용(유모차)<br/></li>\r\n");
      out.write("        </div>\r\n");
      out.write("        </ul><br/>\r\n");
      out.write("    <div class=\"another\">\r\n");
      out.write("        <div class=\"food1\">대표음식 <br/>\r\n");
      out.write("            말죽거리소고기국밥 6,500원 <a href=\"#food2\">더보기</a></div><br/>\r\n");
      out.write("        <div class=\"recommend\">주변에 가볼 만한 곳 추천<br/>\r\n");
      out.write("            <a href=\"#\">공원</a><br/>\r\n");
      out.write("            <a href=\"#\">공원</a><br/>\r\n");
      out.write("        </div><br/>\r\n");
      out.write("        <div class=\"oilPrice\" id=\"oilPrice\">\r\n");
      out.write("        <ul>주유소 현황<br/>\r\n");
      out.write("        <li>주유소 특징<br/>\r\n");
      out.write("        전국 안심주유소 1호점 (2015년04월08일)<br/>\r\n");
      out.write("        산업통상부자원부 관리하는 석유관리원에서 주기적으로 관리하는 시스템으로 인증한 주유소<br/>\r\n");
      out.write("        2016~2017년 착한주유소 선정<br/>\r\n");
      out.write("        산업통상자원부, (사)석유시장감시단의 최저가주유소(착한주유소) 선정<br/>\r\n");
      out.write("        2016년 산업통상자원부 장관표창 수상<br/>\r\n");
      out.write("        </li><br/>\r\n");
      out.write("        <li>\r\n");
      out.write("        주유소 시설 등 현황<br/>\r\n");
      out.write("        편의시설(무료)<br/>\r\n");
      out.write("        셀프서비스코너 : 공기압 주입기, 진공청소기, 에어건, 매트청소기 운영<br/>\r\n");
      out.write("        고객쉼터 : 컴퓨터, 팩스, 혈압계, 신장계, 안마기, 커피자판기, 정수기<br/>\r\n");
      out.write("        </li><br/>\r\n");
      out.write("        <li>\r\n");
      out.write("        유가정보<br/>\r\n");
      out.write("        휘발유 000원\r\n");
      out.write("        경유 000원\r\n");
      out.write("        LPG 000원\r\n");
      out.write("        전기 000원\r\n");
      out.write("        </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"food2\" id=\"food2\">\r\n");
      out.write("        <ul>휴게소 음식\r\n");
      out.write("            <li>설악추어탕</li>\r\n");
      out.write("            <li>짜글이순두부찌개</li>\r\n");
      out.write("            <li>콩나물해장국</li>\r\n");
      out.write("            <li>오모가리김치찌개</li>\r\n");
      out.write("            <li>뚝배기버섯불고기</li>\r\n");
      out.write("            <li>제육된장찌개정식</li>\r\n");
      out.write("            <li>직화제육불고기</li>\r\n");
      out.write("            <li>옛날돈가스</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div><br/><br/>\r\n");
      out.write("    </div>\r\n");
      out.write("    <form name=\"review\" id=\"review\" method=\"post\" action=\"#\">\r\n");
      out.write("        <div class=\"review_star\">\r\n");
      out.write("            휴게소 만족도\r\n");
      out.write("            <input type=\"radio\" name=\"rating\" id=\"1\"> <i class=\"far fa-angry\"> 1</i>\r\n");
      out.write("            <input type=\"radio\" name=\"rating\" id=\"2\"> <i class=\"far fa-frown\"> 2</i>\r\n");
      out.write("            <input type=\"radio\" name=\"rating\" id=\"3\"> <i class=\"far fa-meh\"> 3</i>\r\n");
      out.write("            <input type=\"radio\" name=\"rating\" id=\"4\"> <i class=\"far fa-smile\"> 4</i>\r\n");
      out.write("            <input type=\"radio\" name=\"rating\" id=\"5\"> <i class=\"far fa-laugh\"> 5</i>\r\n");
      out.write("        </div><br/>\r\n");
      out.write("        <label for=\"comment\">댓글</label>\r\n");
      out.write("        <textarea id=\"comment\" name=\"comment\"></textarea>\r\n");
      out.write("        <input type=\"submit\" value=\"등록\" id=\"submit\">\r\n");
      out.write("    </form>\r\n");
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
}
