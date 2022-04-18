package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class forgot_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/layout/header.jsp");
    _jspx_dependants.add("/layout/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/vendor/bootstrap.min.css\">\n");
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
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<header class=\"header_section header_transparent sticky-header\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("                <div class=\"main_header d-flex justify-content-between align-items-center\">\n");
      out.write("                    <div class=\"header_logo\">\n");
      out.write("                        <a class=\"sticky_none\" href=\"home\"><img aria-label=\"logo\" width=\"215\" height=\"79\" src=\"assets/img/logo/logo.webp\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!--main menu start-->\n");
      out.write("                    <div class=\"main_menu d-none d-lg-block\"> \n");
      out.write("                        <nav>  \n");
      out.write("                            <ul class=\"d-flex\">\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/home\">Home</a></li> \n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/product\">Game</a></li>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/post\">Post</a></li>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/faq\">Faq</a></li>\n");
      out.write("                                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/aboutus\">About us</a></li>\n");
      out.write("                            </ul>  \n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <!--main menu end-->\n");
      out.write("                    <div class=\"header_right_sidebar d-flex align-items-center\">\n");
      out.write("                        <div class=\"sing_up_btn\">\n");
      out.write("                            <a class=\"btn btn-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/signin\">SIGN IN <img width=\"15\" height=\"15\" src=\"assets/img/icon/arrrow-icon2.webp\" alt=\"\"> </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"canvas_open\">\n");
      out.write("                            <button type=\"button\" data-bs-toggle=\"offcanvas\" data-bs-target=\"#offcanvasMenu\"><i class=\"icofont-navigation-menu\"></i></button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("        <!-- breadcrumbs area start -->\n");
      out.write("        <div class=\"breadcrumbs_aree breadcrumbs_bg mb-140\" data-bgimg=\"assets/img/bg/breadcrumbs-bg.webp\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"breadcrumbs_text text-center\">\n");
      out.write("                            <h1>Login</h1>\n");
      out.write("                            <ul class=\"d-flex justify-content-center\">\n");
      out.write("                                <li><a href=\"home\">Home </a></li>\n");
      out.write("                                <li> <span>//</span></li>\n");
      out.write("                                <li>  Forgot</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- breadcrumbs area end -->\n");
      out.write("        <!-- page wrapper start -->\n");
      out.write("        <div class=\"page_wrapper\">\n");
      out.write("\n");
      out.write("            <!-- contact section start -->\n");
      out.write("            <section class=\"contact_page_section mb-140\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row justify-content-between align-items-center mb-n50\">\n");
      out.write("                        <div class=\"col-lg-6 col-md-8 col-12 mx-auto mb-50\">\n");
      out.write("                            <img width=\"550\" height=\"550\" src=\"assets/img/others/about-thumb.webp\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-5 col-md-8 col-12 mx-auto mb-50\">\n");
      out.write("                            <form method=\"post\" action=\"forgot\">\n");
      out.write("                                <div class=\"section_title text-center mb-60\">\n");
      out.write("                                    <h2>Forgot Password</h2>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form_input\">\n");
      out.write("                                    <input name=\"email\" placeholder=\"Email\" type=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form_input_btn text-center mb-40\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-link\">Reset password<img width=\"20\" height=\"20\" src=\"assets/img/icon/arrrow-icon.webp\" alt=\"\"></button>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                            <p class=\"text-center\">Remembered password, <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/signin\">Login here</a></p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <!-- contact section end -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- page wrapper end -->\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<footer class=\"footer_widgets\">\n");
      out.write("        <div class=\"main_footer\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"main_footer_inner d-flex\">\n");
      out.write("                            <div class=\"footer_widget_list\">\n");
      out.write("                                <div class=\"footer_logo\">\n");
      out.write("                                    <a href=\"#\"><img aria-label=\"logo\" width=\"215\" height=\"79\" src=\"assets/img/logo/logo.webp\" alt=\"\"></a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer_contact_desc\">\n");
      out.write("                                    <p>It Games Shop, a project we are making in SWP391. You can buy hottest key game in here.</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer_social\">\n");
      out.write("                                    <ul class=\"d-flex\">\n");
      out.write("                                        <li><a aria-label=\"facebook\" class=\"facebook\" href=\"https://www.facebook.com\"><i class=\"icofont-facebook\"></i></a></li>\n");
      out.write("                                        <li><a aria-label=\"dribble\" class=\"dribbble\" href=\"https://dribbble.com\"><i class=\"icofont-dribbble\"></i></a></li>\n");
      out.write("                                        <li><a aria-label=\"youtube\" class=\"youtube\" href=\"https://www.youtube.com\"><i class=\"icofont-youtube-play\"></i></a></li>\n");
      out.write("                                        <li><a aria-label=\"twitter\" class=\"twitter\" href=\"https://twitter.com\"><i class=\"icofont-twitter\"></i></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"footer_widget_list contact\">\n");
      out.write("                                <h3>Contact</h3>\n");
      out.write("                                <div class=\"footer_contact_info\">\n");
      out.write("                                    <div class=\"footer_contact_info_list\">\n");
      out.write("                                        <span>Location:</span>\n");
      out.write("                                        <p>Khu Công nghệ cao Hòa Lạc, Km29 Đại lộ Thăng Long, huyện Thạch Thất, Hà Nội</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"footer_contact_info_list\">\n");
      out.write("                                        <span>Phone:</span>\n");
      out.write("                                        <p><a href=\"#\">(+84) 999 999 999</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"footer_widget_list\">\n");
      out.write("                                <h3>today’s Game</h3>\n");
      out.write("                                <div class=\"footer_winners_gallery\">\n");
      out.write("                                    <div class=\"footer_winners_list d-flex\">\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\n");
      out.write("                                            <a href=\"game-details.html\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"assets/img/others/winners1.webp\" alt=\"\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\n");
      out.write("                                            <a href=\"game-details.html\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"assets/img/others/winners2.webp\" alt=\"\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\n");
      out.write("                                            <a href=\"game-details.html\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"assets/img/others/winners3.webp\" alt=\"\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"footer_winners_list d-flex\">\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\n");
      out.write("                                            <a href=\"game-details.html\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"assets/img/others/winners4.webp\" alt=\"\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\n");
      out.write("                                            <a href=\"game-details.html\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"assets/img/others/winners5.webp\" alt=\"\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"footer_winners_thumb\">\n");
      out.write("                                            <a href=\"game-details.html\"><img aria-label=\"game-team\" width=\"75\" height=\"75\" src=\"assets/img/others/winners6.webp\" alt=\"\"></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"footer_widget_list footer_list_menu\">\n");
      out.write("                                <h3>Content</h3>\n");
      out.write("                                <div class=\"footer_menu\">\n");
      out.write("                                    <ul>\n");
      out.write("                                        <li><a href=\"aboutus\"> About Us</a></li>\n");
      out.write("                                        <li><a href=\"about.html\">Social Media</a></li>\n");
      out.write("                                        <li><a href=\"about.html\">Interactive Media</a></li>\n");
      out.write("                                        <li><a href=\"about.html\">Motion Design</a></li>\n");
      out.write("                                        <li><a href=\"about.html\">Illustration</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer_bottom\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-12\">\n");
      out.write("                        <div class=\"footer_bottom_inner d-flex justify-content-between\">\n");
      out.write("                            <div class=\"copyright_right\">\n");
      out.write("                                <p> © 2022 in SWP391  Made with  <i class=\"icofont-heart\"></i></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"footer_bottom_link_menu\">\n");
      out.write("                                <ul class=\"d-flex\">\n");
      out.write("                                    <li><a href=\"about.html\">Terms & Condition  </a></li>\n");
      out.write("                                    <li><a href=\"about.html\">Privacy Policy  </a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"scroll__top_icon\">\n");
      out.write("                                <a id=\"scroll-top\" href=\"#\"><img aria-label=\"scroll-top\" width=\"46\" height=\"40\" src=\"assets/img/icon/scroll-top.webp\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("        <!-- JS\n");
      out.write("============================================ -->\n");
      out.write("        <!--modernizr min js here-->\n");
      out.write("        <script src=\"assets/js/vendor/modernizr-3.7.1.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Vendor JS -->\n");
      out.write("        <script src=\"assets/js/vendor/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/vendor/jquery-migrate-3.3.2.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/vendor/popper.js\"></script>\n");
      out.write("        <script src=\"assets/js/vendor/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/slick.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/wow.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.nice-select.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.counterup.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/jquery-waypoints.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Main JS -->\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
      out.write("    </body>\n");
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
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.equals('1')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                            Email is not existed!\n");
        out.write("                                        </div>\n");
        out.write("                                    ");
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.equals('2')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                            Some things error, try a again!\n");
        out.write("                                        </div>\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error.equals('3')}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <div class=\"alert alert-success\" role=\"alert\">\n");
        out.write("                                            Reset link had sent to your email!\n");
        out.write("                                        </div> \n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
