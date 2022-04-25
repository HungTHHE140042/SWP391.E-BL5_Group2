package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.User;

public final class homePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/layout/header.jsp");
    _jspx_dependants.add("/layout/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("        <title>Shop Game</title>\r\n");
      out.write("        <meta name=\"description\" content=\"Bonx is a terrific esports website template with a slick and modern look.  It’s a robust gaming HTML template for bloggers and online gamers who want to share their enthusiasm for games on the internet.\"/>\r\n");
      out.write("        <meta name=\"keywords\" content=\"\tbootstrap, clean, esports, game, game portal, Game website, gamer, games, gaming, magazine, match, modern, online game, sport, sports\">\r\n");
      out.write("        <meta name=\"author\" content=\"Code Carnival\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Add site Favicon -->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/png\">\r\n");
      out.write("\r\n");
      out.write("        <!-- CSS \r\n");
      out.write("        ========================= -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Exo:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Metal+Mania&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/vendor/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/icofont.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\r\n");
      out.write("        <!-- Main Style CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"body__bg\" data-bgimg=\"assets/img/bg/body-bg.webp\">       \r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<header class=\"header_section header_transparent sticky-header\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-12\">\r\n");
      out.write("                <div class=\"main_header d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <div class=\"header_logo\">\r\n");
      out.write("                        <a class=\"sticky_none\" href=\"home\"><img aria-label=\"logo\" width=\"215\" height=\"79\" src=\"assets/img/logo/logo.webp\" alt=\"\"></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--main menu start-->\r\n");
      out.write("                    <div class=\"main_menu d-none d-lg-block\"> \r\n");
      out.write("                        <nav>  \r\n");
      out.write("                            <ul class=\"d-flex\">\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a></li> \r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">Game</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/post\">Post</a></li>\r\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/faq\">Faq</a></li>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("                               \r\n");
      out.write("                            </ul>  \r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!--main menu end-->\r\n");
      out.write("                    <div class=\"header_right_sidebar d-flex align-items-center\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</header>\r\n");
      out.write("<!-- Logout Modal -->\r\n");
      out.write("<div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-10\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("    <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <div class=\"modal-header\">\r\n");
      out.write("                <h5 class=\"modal-title\" style=\"color: black\" id=\"exampleModalLongTitle\">Are you sure Logout?</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-body\">\r\n");
      out.write("                <div class=\"container\" style=\"color: black\" >\r\n");
      out.write("                    Select \"Logout\" below if you are sure to logout this account.\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">Close</button>\r\n");
      out.write("                <a href=\"logout\" class=\"btn btn-danger\">Logout</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- page wrapper start -->\r\n");
      out.write("        <div class=\"page_wrapper\">          \r\n");
      out.write("\r\n");
      out.write("            <!--slide banner section start-->\r\n");
      out.write("            <section class=\"hero_banner_section d-flex align-items-center mb-130\" data-bgimg=\"\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"hero_banner_inner\">\r\n");
      out.write("                        <div class=\"row align-items-center\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <div class=\"hero_content\">\r\n");
      out.write("                                    <h1 class=\"wow fadeInUp\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.1s\">Newest Game <br>\r\n");
      out.write("                                        Selling Today.</h1>\r\n");
      out.write("                                    <p class=\"wow fadeInUp\" data-wow-delay=\"0.2s\" data-wow-duration=\"1.2s\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastProduct.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                    <a class=\"btn btn-link wow fadeInUp\" data-wow-delay=\"0.3s\" data-wow-duration=\"1.3s\" href=\"productDetails?productID=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastProduct.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">Buy now <img width=\"20\" height=\"20\" src=\"assets/img/icon/arrrow-icon.webp\" alt=\"\"> </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>    \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"hero_position_img\">\r\n");
      out.write("                    <img width=\"926px\" height=\"772px\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastProduct.productImgURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" style=\"border-radius: 50px\" alt=\"\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!--slider area end-->\r\n");
      out.write("            <section>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <form action=\"search\" method=\"post\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-11\">\r\n");
      out.write("                                <div class=\"form_input\">\r\n");
      out.write("                                    <input name=\"txtSearch\" placeholder=\"Search here\" type=\"text\">\r\n");
      out.write("                                    <input name=\"categoryID\" placeholder=\"Search here\" type=\"text\" hidden=\"\" value=\"0\">\r\n");
      out.write("                                    <input name=\"price\" placeholder=\"Search here\" type=\"text\" hidden=\"\" value=\"0\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-1\">\r\n");
      out.write("                                <button class=\"btn btn-primary\" style=\"height: 62px\" type=\"submit\">SEARCH</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- gaming  world section start -->\r\n");
      out.write("            <section class=\"gaming_world_section mb-140\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"section_title text-center wow fadeInUp mb-60\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.1s\">\r\n");
      out.write("                        <h2>Top Discount game</h2>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"gaming_world_inner\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- gaming  world section end -->\r\n");
      out.write("\r\n");
      out.write("            <!-- counterup section start -->\r\n");
      out.write("            <section class=\"counterup_section mb-115 wow fadeInUp\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.1s\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"counterup_inner d-flex justify-content-center\">\r\n");
      out.write("                                <div class=\"single_counterup one\">\r\n");
      out.write("                                    <div class=\"counterup_text\">\r\n");
      out.write("                                        <h2 class=\"counterup color1\">");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("                                        <span>CUSTOMER</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"single_counterup two\">\r\n");
      out.write("                                    <div class=\"counterup_text\">\r\n");
      out.write("                                        <h2 class=\"counterup color2\">");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("                                        <span>TOTAL GAMES</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"single_counterup three\">\r\n");
      out.write("                                    <div class=\"counterup_text\">\r\n");
      out.write("                                        <h2 class=\"counterup color3\">");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("</h2>\r\n");
      out.write("                                        <span>SOLD</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- counterup section end -->\r\n");
      out.write("\r\n");
      out.write("            <!-- popular gaming  section start -->\r\n");
      out.write("            <section class=\"popular_gaming_section mb-140\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"section_title text-center wow fadeInUp mb-60\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.1s\">\r\n");
      out.write("                        <h2>Popular GAME</h2>\r\n");
      out.write("                        <p>When unknown printer took type and scrambled it to make <br>\r\n");
      out.write("                            type specimen book centuries,</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"popular_gaming_inner wow fadeInUp\" data-wow-delay=\"0.2s\" data-wow-duration=\"1.2s\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("                         \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- popular gaming section end -->\r\n");
      out.write("\r\n");
      out.write("            <!-- blog section start -->\r\n");
      out.write("            <section class=\"blog_section mb-90\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"section_title text-center wow fadeInUp mb-70\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.1s\">\r\n");
      out.write("                        <h2>Latest Post</h2>\r\n");
      out.write("                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod <br> tempor incididunt ut labore et dolore magna</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"row blog_inner\">\r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </section>\r\n");
      out.write("            <!-- blog section end -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- page wrapper end -->\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<footer class=\"footer_widgets\">\r\n");
      out.write("        <div class=\"main_footer\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"main_footer_inner d-flex\">\r\n");
      out.write("                            <div class=\"footer_widget_list\">\r\n");
      out.write("                                <div class=\"footer_logo\">\r\n");
      out.write("                                    <a href=\"#\"><img aria-label=\"logo\" width=\"215\" height=\"79\" src=\"assets/img/logo/logo.webp\" alt=\"\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"footer_contact_desc\">\r\n");
      out.write("                                    <p>It Games Shop, a project we are making in SWP391. You can buy hottest key game in here.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"footer_social\">\r\n");
      out.write("                                    <ul class=\"d-flex\">\r\n");
      out.write("                                        <li><a aria-label=\"facebook\" class=\"facebook\" href=\"https://www.facebook.com\"><i class=\"icofont-facebook\"></i></a></li>\r\n");
      out.write("                                        <li><a aria-label=\"dribble\" class=\"dribbble\" href=\"https://dribbble.com\"><i class=\"icofont-dribbble\"></i></a></li>\r\n");
      out.write("                                        <li><a aria-label=\"youtube\" class=\"youtube\" href=\"https://www.youtube.com\"><i class=\"icofont-youtube-play\"></i></a></li>\r\n");
      out.write("                                        <li><a aria-label=\"twitter\" class=\"twitter\" href=\"https://twitter.com\"><i class=\"icofont-twitter\"></i></a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"footer_widget_list contact\">\r\n");
      out.write("                                <h3>Contact</h3>\r\n");
      out.write("                                <div class=\"footer_contact_info\">\r\n");
      out.write("                                    <div class=\"footer_contact_info_list\">\r\n");
      out.write("                                        <span>Location:</span>\r\n");
      out.write("                                        <p>Khu Công nghệ cao Hòa Lạc, Km29 Đại lộ Thăng Long, huyện Thạch Thất, Hà Nội</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"footer_contact_info_list\">\r\n");
      out.write("                                        <span>Phone:</span>\r\n");
      out.write("                                        <p><a href=\"#\">(+84) 999 999 999</a></p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"footer_widget_list\">\r\n");
      out.write("                                <h3>Administrative Council</h3>\r\n");
      out.write("                                <div class=\"footer_winners_gallery\">\r\n");
      out.write("                                    <div class=\"footer_winners_list d-flex\">\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://i.ibb.co/sPYKw8q/Dinh-Dep-Trai.jpg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://i.ibb.co/2yxkzK0/sang.jpg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://i.ibb.co/Wgbw1rY/son.jpg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"footer_winners_list d-flex\">\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://i.ibb.co/rw4yXC8/long.jpg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://i.ibb.co/0nmsjY3/quanghung.png\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://i.ibb.co/84GCBfk/hung.jpg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"footer_widget_list footer_list_menu\">\r\n");
      out.write("                                <h3>Content</h3>\r\n");
      out.write("                                <div class=\"footer_menu\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li><a href=\"aboutus\"> About Us</a></li>\r\n");
      out.write("                                        <li><a href=\"about.html\">Social Media</a></li>\r\n");
      out.write("                                        <li><a href=\"about.html\">Interactive Media</a></li>\r\n");
      out.write("                                        <li><a href=\"about.html\">Motion Design</a></li>\r\n");
      out.write("                                        <li><a href=\"about.html\">Illustration</a></li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"footer_bottom\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-12\">\r\n");
      out.write("                        <div class=\"footer_bottom_inner d-flex justify-content-between\">\r\n");
      out.write("                            <div class=\"copyright_right\">\r\n");
      out.write("                                <p> © 2022 in SWP391  Made with  <i class=\"icofont-heart\"></i></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"footer_bottom_link_menu\">\r\n");
      out.write("                                <ul class=\"d-flex\">\r\n");
      out.write("                                    <li><a href=\"about.html\">Terms & Condition  </a></li>\r\n");
      out.write("                                    <li><a href=\"about.html\">Privacy Policy  </a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"scroll__top_icon\">\r\n");
      out.write("                                <a id=\"scroll-top\" href=\"#\"><img aria-label=\"scroll-top\" width=\"46\" height=\"40\" src=\"assets/img/icon/scroll-top.webp\" alt=\"\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer>\r\n");
      out.write("\r\n");
      out.write("        <!-- JS\r\n");
      out.write("============================================ -->\r\n");
      out.write("        <!--modernizr min js here-->\r\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-3.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Vendor JS -->\r\n");
      out.write("        <script src=\"assets/js/vendor/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/vendor/jquery-migrate-3.3.2.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/vendor/popper.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/vendor/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/slick.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/wow.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.nice-select.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery.counterup.min.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/jquery-waypoints.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Main JS -->\r\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionScope.user == null)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("              \r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/aboutus\">About us</a></li>\r\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <li><a href=\"profile\"><img width=\"15\" height=\"15\" src=\"assets/img/icon/user.png\" style=\"position: absolute; left: -20px; top: 6px; margin-right: 2px;\" alt=\"\">Profile</a>\r\n");
        out.write("                                        <ul class=\"sub_menu\">\r\n");
        out.write("                                            <li><a href=\"profile\"><img width=\"15\" height=\"15\" src=\"assets/img/icon/settings_violet.png\"> Profile</a></li>\r\n");
        out.write("                                            <li><a href=\"changePassword\"><img width=\"15\" height=\"15\" src=\"assets/img/icon/change-password.png\"> Change Password</a></li>\r\n");
        out.write("                                            <li><a href=\"order-history\"><img width=\"15\" height=\"15\" src=\"assets/img/icon/refresh_violet.png\"> Order History</a></li>\r\n");
        out.write("                                            <li><a href=\"#\" class=\"\" data-bs-toggle=\"modal\" data-bs-target=\"#logoutModal\"><img width=\"15\" height=\"15\" src=\"assets/img/icon/logout_violet.png\"> Logout</a></li>\r\n");
        out.write("                                        </ul>\r\n");
        out.write("                                    </li>\r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionScope.user != null) and (sessionScope.user.roleId != 3)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("              \r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/cms\"><img width=\"15\" height=\"15\" src=\"assets/img/icon/crown.png\" style=\"position: absolute; left: -20px; top: 6px; margin-right: 2px;\" alt=\"\"> <span style=\"color: yellow\">Manage</span> </a></li>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                    <li><a><img width=\"15\" height=\"15\" src=\"assets/img/icon/bell_noti.png\" alt=\"\"></a>\r\n");
        out.write("                                        <ul class=\"sub_menu\">\r\n");
        out.write("                                            <li>\r\n");
        out.write("                                                <a class=\"dropdown-item d-flex align-items-center\" href=\"notification-detail\">\r\n");
        out.write("                                                    <div>\r\n");
        out.write("                                                        <div class=\"small text-gray-500\">April 12, 2022</div>\r\n");
        out.write("                                                        <span class=\"font-weight-bold\">We will sale-off all products in next month.</span>\r\n");
        out.write("                                                    </div>\r\n");
        out.write("                                                </a>\r\n");
        out.write("                                            </li>\r\n");
        out.write("                                            <li>\r\n");
        out.write("                                                <a class=\"dropdown-item d-flex align-items-center\" href=\"notification-detail\">\r\n");
        out.write("                                                    <div>\r\n");
        out.write("                                                        <div class=\"small text-gray-500\">April 12, 2022</div>\r\n");
        out.write("                                                        Your order #5946221 had accepted.\r\n");
        out.write("                                                    </div>\r\n");
        out.write("                                                </a>\r\n");
        out.write("                                            </li>\r\n");
        out.write("                                            <div class=\"text-center btn-secondary\">\r\n");
        out.write("                                                <a href=\"notifications\" style=\"color: white; font-size: 10px\" >Show all Notifications</a>\r\n");
        out.write("                                            </div>\r\n");
        out.write("                                        </ul>\r\n");
        out.write("                                    </li>    \r\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <div class=\"sing_up_btn\">\r\n");
        out.write("                                <a class=\"btn btn-link\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/signin\">SIGN IN <img width=\"15\" height=\"15\" src=\"assets/img/icon/arrrow-icon2.webp\" alt=\"\"> </a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"canvas_open\">\r\n");
        out.write("                                <button type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#offcanvasMenu\"><i class=\"icofont-navigation-menu\"></i></button>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                            <div class=\"cart_btn\">\r\n");
        out.write("                                <a class=\"btn btn-link\" href=\"cart\">Cart <img width=\"15\" height=\"15\" src=\"assets/img/icon/shopping-cart.png\" alt=\"\"> </a>\r\n");
        out.write("                            </div>\r\n");
        out.write("                            <div class=\"canvas_open\">\r\n");
        out.write("                                <button type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#offcanvasMenu\"><i class=\"icofont-navigation-menu\"></i></button>\r\n");
        out.write("                            </div>\r\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTop3ProductSale}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("product");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <div class=\"col-lg-4 col-md-4 col-sm-6\">\r\n");
          out.write("                                    <div class=\"single_gaming_world wow fadeInUp\" data-bgimg=\"assets/img/others/gaming-world-bg1.webp\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.1s\">\r\n");
          out.write("                                        <div class=\"gaming_world_thumb\">\r\n");
          out.write("                                            <img width=\"156px\" height=\"156px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productImgURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"border-radius: 10px\" alt=\"\">\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"gaming_world_text\">\r\n");
          out.write("                                            <div style=\"height: 120px\">\r\n");
          out.write("                                                <h3><a href=\"productDetails?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col-6\" style=\"font-size:20px; color:gray; text-decoration-line:line-through;\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.originalPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                                                <div class=\"col-6 btn-danger\">-");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.salePercent}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%</div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <p>\r\n");
          out.write("                                            <div class=\"btn-success\" style=\"font-size: 25px\">$");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.sellPrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${countUser}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${countProduct}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${countOrderDetail}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTop4Pupular}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("pupular");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <div class=\"col-lg-6 col-md-6\">\r\n");
          out.write("                                    <div class=\"popular_gaming_thumb text-center\">\r\n");
          out.write("                                        <a href=\"productDetails?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pupular.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><img style=\"width: 600px; height: 600px;\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pupular.productImgURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\"></a>\r\n");
          out.write("                                        <div class=\"gaming_details_btn\">\r\n");
          out.write("                                            <a class=\"btn btn-link\" href=\"productDetails?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pupular.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Game Details <img width=\"20\" height=\"20\" src=\"assets/img/icon/arrrow-icon.webp\" alt=\"\"> </a>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listTop4LastestPost}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("post");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <div class=\"col-lg-6\">\r\n");
          out.write("                                <div class=\"single_blog d-flex align-items-center wow fadeInUp\" data-wow-delay=\"0.1s\" data-wow-duration=\"1.1s\">\r\n");
          out.write("                                    <div class=\"blog_thumb\">\r\n");
          out.write("                                        <a href=\"blog-details.html\"><img width=\"200px\" height=\"200px\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.imageLinkThumbnail}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"border-radius: 10px\" alt=\"\"></a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                    <div class=\"blog_content\">\r\n");
          out.write("                                        <div class=\"blog_date\">\r\n");
          out.write("                                            <span><i class=\"icofont-calendar\"></i>  ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.date}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <h3><a href=\"post-detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\r\n");
          out.write("                                        <a href=\"post-detail?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${post.ID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">READ MORE</a>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </div>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
