package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.User;

public final class changePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/layout/header.jsp");
    _jspx_dependants.add("/layout/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Shop Game</title>\n");
      out.write("        <meta name=\"description\" content=\"Bonx is a terrific esports website template with a slick and modern look.  It’s a robust gaming HTML template for bloggers and online gamers who want to share their enthusiasm for games on the internet.\"/>\n");
      out.write("        <meta name=\"keywords\" content=\"\tbootstrap, clean, esports, game, game portal, Game website, gamer, games, gaming, magazine, match, modern, online game, sport, sports\">\n");
      out.write("        <meta name=\"author\" content=\"Code Carnival\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Add site Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/png\">\n");
      out.write("\n");
      out.write("        <!-- CSS \n");
      out.write("        ========================= -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Exo:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Metal+Mania&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"assets/css/vendor/bootstrap.min.css\">-->\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/slick.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/icofont.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/animate.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\">\n");
      out.write("        <!-- Main Style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"body__bg\" data-bgimg=\"assets/img/bg/body-bg.webp\">\n");
      out.write("\n");
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
      out.write("       \n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- breadcrumbs area start -->\n");
      out.write("        <div class=\"breadcrumbs_aree breadcrumbs_bg mb-140\" data-bgimg=\"assets/img/bg/breadcrumbs-bg.webp\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"breadcrumbs_text text-center\">\n");
      out.write("                            <h1>Profile</h1>\n");
      out.write("                            <ul class=\"d-flex justify-content-center\">\n");
      out.write("                                <li><a href=\"index.html\">Home </a></li>\n");
      out.write("                                <li> <span>//</span></li>\n");
      out.write("                                <li>  Profile</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- breadcrumbs area end -->\n");
      out.write("\n");
      out.write("        <!-- page wrapper start -->\n");
      out.write("        <div class=\"page_wrapper\">\n");
      out.write("            <div class=\"container mb-100\">\n");
      out.write("                <div class=\"contact_form_inner\">\n");
      out.write("                    <form id=\"contact-form\" action=\"profile\" method=\"post\">\n");
      out.write("                        <div class=\"row\" style=\"display: none\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"form_input\">\n");
      out.write("                                    <input name=\"userId\" placeholder=\"Username\" type=\"text\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            Current Password\n");
      out.write("                        </div> \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"form_input\">\n");
      out.write("                                    <input name=\"username\" placeholder=\"\" type=\"text\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--.-->\n");
      out.write("                        <div>\n");
      out.write("                            Email\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <div class=\"form_input\">\n");
      out.write("                                    <input name=\"email\" disabled=\"true\" placeholder=\"Email\" type=\"text\"s value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!--.-->\n");
      out.write("                        <div>\n");
      out.write("                            Password\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-11\">\n");
      out.write("                                <div class=\"form_input\">\n");
      out.write("                                    <input name=\"password\" placeholder=\"Password\" type=\"password\" value=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" disabled=\"true\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-1\">\n");
      out.write("                                <div class=\"question_form_btn\">\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary\" data-bs-toggle=\"modal\" data-bs-target=\"#changePassword\" data-id=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                        <i class=\"fas fa-edit\"></i>\n");
      out.write("                                    </button>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("           \n");
      out.write("\n");
      out.write("                        <div class=\"form_input_btn text-center\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-link\">SAVE</button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- page wrapper end -->\n");
      out.write("\n");
      out.write("    ");
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
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://previews.dropbox.com/p/thumb/ABiOx00-7kLUj0iuuHBWZlltnOFTw4C1v0_tTy-877VWATjThugmuyzFkB9t5mLX9uviFalvMEEf5wKRIKoXjAUAmWw6-9BbHdYghbwAFi9t-nOlvHSaBhA3wAdikaPyy2b6ki5QWAOVrzeLyKtn1_5KqXjGu7hhu6eL1gWDZA8puEwckO9Y5HgsFkvR5YFbLXCvW1MmHbycdW76mKp33XYW_OQctIUCgvru4XUSdSWQExQIOUQJ-MRUiEw7139MJA-Pv9_uPa-5udV-hAGzgwDDVSRUFTmXKK6nQYaYEqSgCvI90JxYkOS6NB-P20DsXmdr3LOMO-kSOxAGp332O_0mVPTXiTIdNoehR6RsFgc-YUwuUjZ6Pk4eQ_9cY-b9e7k/p.jpeg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://previews.dropbox.com/p/thumb/ABjhDQ9b-iH7380-Lr8ddeo9xbcBUu5cUF7h_Hi7s1XiWcLW1OwDBaIcgq1z5t9TKiP3-Lq85U8Saa7QmdKzN4y0uOUmUn330Lk8xeJdLDyFg_uN3jgu8c9RTqnWmkbBd4VAVcWtRnAp4ff0Qeob0TmYdbH57kjQLp14hEPO73s8Mjw0_2uZzHNQndBUxUiLiQfUMhsDr2HDPtX3B767rJ7DLe1gcq7NxryjcqrGXdRIgqBABmdERqvp6ZhpVJfBEk_Da44BD0BvZGCJf_tE1fBDo4Re_4sFBa9j76kTxOSmt3prNgco3Z6t_IWwcKC-BDAI14ZWTPtmTl-CaH0cGft3AJM1DzMOIL1XkaQ6KHTsC3WHGBi3g74xpU6U0Tl48KU/p.png\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://previews.dropbox.com/p/thumb/ABgyH6Ny73nE0bns6i6chcW-JJGtNRScHK6k7MfjxT961ifTs-OLvIDGARoWvHOMPkrE0df6-03xPcW2xN0CUKXfwtSHtAnGStNM1lYGP8_3nL6iWdzvuQLjuOtgyv_YqC98urjH-RKMrbf2NsG2zr-GkwOghBDTYxrD7mVVemCdu3UHmcHil3xbVDaXlywHL5WcFzTbO9ho4D4Vhc6WS3sKt9ELojgTZmPlSb_lO8Age4dIbHzrdrwHy7JqI87v2YEP8G47TreKGTA_dUTP0ul1zXgW0d9fls3gcj5E0LZ4KpziYaGUMXULCYQJJhGMlQZFiaI-BPerR8B9imyBIiLz7_1JUBeHAL576pXbrqFdDJaGg0zufa8ry28sRGU0emk/p.jpeg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"footer_winners_list d-flex\">\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://previews.dropbox.com/p/thumb/ABiy43OPR4zx8UaPCaVEVenyvD1Mv7vuBD-Uyarc44VyO7-Oza3ldjIU_sOo7-OJCDYtV9pZutenwoLzCt09CSDhqU_CV4bWIosRK571PSjNpcQwogMfVabASKahjoPYzlYGNKO6KB2LUUonQxn1vO1BN2Im4wArFAfsce0rYvwPPeBKtmbuml7Jd1y5-7xJYv4wzGzAryF9y51EOxULE4wnufnfPiegWUbIYDu58x_ZLiy6Pk4oIdlZSzzhR4l3TbTIBnTBPHo__3g8yG6mcs2OWgtzNKYWjtL2g04HuJ7CxeAk56ciKF3_TZcqm15Qz4NoVu1IulRhWYYbeLhhbiIWQ-JiPt98pMaGqO2QzuqeBnar3N_N6VOL3KmuoqOIRIQ/p.jpeg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://previews.dropbox.com/p/thumb/ABhTCqnlf3tbI-03ngU5qj_3WovAVBCFDnmiPrA4OA_5OwVqCBKgtUaZCbsiRShMsvGbszDkpjiAqxqBHNIPvoV730ySKWy6_jKJHpHcpTKyxMDAl4SpqVhO-_7nyGhr8WK37JLktplS1T5Iz9_g23lbcZ11rY0p4W1_Ksg9IdANjIkUmvX6E27prYg78oOFKLgeA5P0DGpvMRlyBM14ZnHWZxtAJXxwsK92_NtTbcOtofrKq9N2G9UhyJ1JFDS0tgiA_8fF141Gp5IHWr7-WU1hUlfCo-ZZ5L3BKSHDDbKCIQd5VnAuQv8Bn9gTH9O0Z69BUDRhg1alAYJIsfalVHonWIAz2KCsD2LmLUq_-PYm-S672ISU3hhPXq15llATKVM/p.jpeg\" alt=\"\"></a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\r\n");
      out.write("                                            <a href=\"#\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"https://previews.dropbox.com/p/thumb/ABjjDK79YXNWJz23CmvTv9l12jfr-CG5fG6GJmjw5OcJMTBa1_8x8fG20_Uyta_sNve7RWIxc-RPOm3gjZOtVzNun_LXvqiU_8-KFAzWgmp7oZ_2l-Pvj3c_U2sWaQmIk2sr66BQv7RpEwV9hgjARSyJC4IwD4NnlTEIVI53tUMrqHOw1mCS55e7kGl1coOMUT6JML4LwSkDckm0AaMvorGhtg_3fp0iN55y1xpqQXTuApoy9HUKa3Q2yZp0Z4EfXjINCgQfLTpMEda4jBmofuoVgDXTJ1QcD3T5c5YEeMeE6ZGSFJBw9huzK7jPywLLTI-tOkqBMDA-TAkotjP_MSe65t5H703FGO6iCzm9SXjYuhmTpF1QNNhCfJaMeJf1ZRo/p.jpeg\" alt=\"\"></a>\r\n");
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
      out.write("\n");
      out.write("    <!-- JS\n");
      out.write("    ============================================ -->\n");
      out.write("    <!--modernizr min js here-->\n");
      out.write("    <script src=\"assets/js/vendor/modernizr-3.7.1.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Vendor JS -->\n");
      out.write("    <script src=\"assets/js/vendor/jquery-3.6.0.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/vendor/jquery-migrate-3.3.2.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/vendor/popper.js\"></script>\n");
      out.write("    <script src=\"assets/js/vendor/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/slick.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/wow.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.nice-select.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.counterup.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery-waypoints.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Main JS -->\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("    <script src=\"https://kit.fontawesome.com/228aa84c51.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $('#changePassword').on('show.bs.modal', function (event) {\n");
      out.write("            var button = $(event.relatedTarget); // Button that triggered the modal\n");
      out.write("            var id = button.data('id');\n");
      out.write("            var modal = $(this);\n");
      out.write("            modal.find('.modal-dialog .modal-content .modal-body #id').val(id);\n");
      out.write("            console.log(id);\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionScope.user != null) and (sessionScope.user.userId != 3)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("              \r\n");
        out.write("                                    <li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/cms\"><img width=\"15\" height=\"15\" src=\"assets/img/icon/crown.png\" style=\"position: absolute; left: -20px; top: 6px; margin-right: 2px;\" alt=\"\"> <span style=\"color: yellow\">Dashboard</span> </a></li>\r\n");
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.userId == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
        out.write("                                <a class=\"btn btn-link\" href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("/cart\">Cart <img width=\"15\" height=\"15\" src=\"assets/img/icon/shopping-cart.png\" alt=\"\"> </a>\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msgUpdate == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"row\">\n");
        out.write("                                    <div class=\"col-lg-12\">\n");
        out.write("                                        <div class=\"alert alert-success\" role=\"alert\">\n");
        out.write("                                            Updated successfully\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.msgUpdate == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <div class=\"row\">\n");
        out.write("                                    <div class=\"col-lg-12\">\n");
        out.write("                                        <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                            Updated fail\n");
        out.write("                                        </div>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }
}
