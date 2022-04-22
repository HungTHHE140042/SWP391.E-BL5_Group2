package org.apache.jsp.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cms_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/dashboard/layout/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
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
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/img/favicon.ico\" type=\"image/png\">\r\n");
      out.write("\r\n");
      out.write("        <title>Dashboard</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom fonts for this template-->\r\n");
      out.write("        <link href=\"dashboard/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom styles for this template-->\r\n");
      out.write("        <link href=\"dashboard/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Wrapper -->\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Sidebar -->\r\n");
      out.write("            <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar - Brand -->\r\n");
      out.write("                <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"cms\" style=\"color: yellow\">\r\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("                        <i class=\"fas fa-crown\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\">Dashboard</div>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Nav Item - Dashboard -->\r\n");
      out.write("                <li class=\"nav-item active\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"cms\">\r\n");
      out.write("                        <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("                        <span>Dashboard</span></a>\r\n");
      out.write("                </li>\r\n");
      out.write("\r\n");
      out.write("                <!-- Divider -->\r\n");
      out.write("                <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Heading -->\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                <!-- Heading -->\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("                <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("                    <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("            <!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Content Wrapper -->\r\n");
      out.write("            <div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Main Content -->\r\n");
      out.write("                <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar -->\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("        <!-- Topbar Navbar -->\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("            <!-- Nav Item - Messages -->\r\n");
      out.write("            <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"home\" role=\"button\"\r\n");
      out.write("                   aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                    <i class=\"fas fa-home\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Nav Item - User Information -->\r\n");
      out.write("            <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\r\n");
      out.write("                   data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                    <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">@");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <!-- Dropdown - User Information -->\r\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("                     aria-labelledby=\"userDropdown\">\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"profile\">\r\n");
      out.write("                        <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                        Profile\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                        <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("                        Logout\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("\r\n");
      out.write("    <!-- Logout Modal-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\r\n");
      out.write("         aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\r\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\r\n");
      out.write("                    <a class=\"btn btn-danger\" href=\"login.html\">Logout</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("                    <!-- End of Topbar -->\r\n");
      out.write("\r\n");
      out.write("                    <!-- Begin Page Content -->\r\n");
      out.write("                    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Page Heading -->\r\n");
      out.write("                        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\r\n");
      out.write("                            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\r\n");
      out.write("                            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"><i\r\n");
      out.write("                                    class=\"fas fa-download fa-sm text-white-50\"></i> Generate Report</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Content Row -->\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("                                <div class=\"card border-left-primary shadow h-100 py-2\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-primary text-uppercase mb-1\">\r\n");
      out.write("                                                    Earnings (Monthly)</div>\r\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">$");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-calendar fa-2x text-gray-300\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("                                <div class=\"card border-left-success shadow h-100 py-2\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-success text-uppercase mb-1\">\r\n");
      out.write("                                                    Earnings (Annual)</div>\r\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">$");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-dollar-sign fa-2x text-gray-300\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Earnings (Monthly) Card Example -->\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("                                <div class=\"card border-left-info shadow h-100 py-2\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-info text-uppercase mb-1\">Success order\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                                    <div class=\"col-auto\">\r\n");
      out.write("                                                        <div class=\"h5 mb-0 mr-3 font-weight-bold text-gray-800\">");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-clipboard-list fa-2x text-gray-300\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Pending Requests Card Example -->\r\n");
      out.write("                            <div class=\"col-xl-3 col-md-6 mb-4\">\r\n");
      out.write("                                <div class=\"card border-left-warning shadow h-100 py-2\">\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"row no-gutters align-items-center\">\r\n");
      out.write("                                            <div class=\"col mr-2\">\r\n");
      out.write("                                                <div class=\"text-xs font-weight-bold text-warning text-uppercase mb-1\">\r\n");
      out.write("                                                    Waiting order</div>\r\n");
      out.write("                                                <div class=\"h5 mb-0 font-weight-bold text-gray-800\">");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-auto\">\r\n");
      out.write("                                                <i class=\"fas fa-comments fa-2x text-gray-300\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Content Row -->\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Area Chart -->\r\n");
      out.write("                            <div class=\"col-xl-8 col-lg-7\">\r\n");
      out.write("                                <div class=\"card shadow mb-4\">\r\n");
      out.write("                                    <!-- Card Header - Dropdown -->\r\n");
      out.write("                                    <div\r\n");
      out.write("                                        class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\r\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Earnings Overview</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Card Body -->\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"chart-area\">\r\n");
      out.write("                                            <canvas id=\"myAreaChart\"></canvas>\r\n");
      out.write("                                            <div id=\"dataChart\" data-thang1=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPriceMonth1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" data-thang2=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPriceMonth2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" \r\n");
      out.write("                                                 data-thang3=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPriceMonth3}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" data-thang4=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPricePerMonthNow}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Pie Chart -->\r\n");
      out.write("                            <div class=\"col-xl-4 col-lg-5\">\r\n");
      out.write("                                <div class=\"card shadow mb-4\">\r\n");
      out.write("                                    <!-- Card Header - Dropdown -->\r\n");
      out.write("                                    <div\r\n");
      out.write("                                        class=\"card-header py-3 d-flex flex-row align-items-center justify-content-between\">\r\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Revenue Sources</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <!-- Card Body -->\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"chart-pie pt-4 pb-2\">\r\n");
      out.write("                                            <canvas id=\"myPieChart\"></canvas>\r\n");
      out.write("                                            <div id=\"dataChart1\" data-category1=\"30\" data-category2=\"30\" \r\n");
      out.write("                                                 data-category3=\"20\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"mt-4 text-center small\">\r\n");
      out.write("                                            <span class=\"mr-2\">\r\n");
      out.write("                                                <i class=\"fas fa-circle text-primary\"></i> Action\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"mr-2\">\r\n");
      out.write("                                                <i class=\"fas fa-circle text-success\"></i> Adventure\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                            <span class=\"mr-2\">\r\n");
      out.write("                                                <i class=\"fas fa-circle text-info\"></i> RPG\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Content Row -->\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Content Column -->\r\n");
      out.write("                            <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Project Card Example -->\r\n");
      out.write("                                <div class=\"card shadow mb-4\">\r\n");
      out.write("                                    <div class=\"card-header py-3\">\r\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Projects</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <h4 class=\"small font-weight-bold\">Server Migration <span\r\n");
      out.write("                                                class=\"float-right\">20%</span></h4>\r\n");
      out.write("                                        <div class=\"progress mb-4\">\r\n");
      out.write("                                            <div class=\"progress-bar bg-danger\" role=\"progressbar\" style=\"width: 20%\"\r\n");
      out.write("                                                 aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <h4 class=\"small font-weight-bold\">Sales Tracking <span\r\n");
      out.write("                                                class=\"float-right\">40%</span></h4>\r\n");
      out.write("                                        <div class=\"progress mb-4\">\r\n");
      out.write("                                            <div class=\"progress-bar bg-warning\" role=\"progressbar\" style=\"width: 40%\"\r\n");
      out.write("                                                 aria-valuenow=\"40\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <h4 class=\"small font-weight-bold\">Customer Database <span\r\n");
      out.write("                                                class=\"float-right\">60%</span></h4>\r\n");
      out.write("                                        <div class=\"progress mb-4\">\r\n");
      out.write("                                            <div class=\"progress-bar\" role=\"progressbar\" style=\"width: 60%\"\r\n");
      out.write("                                                 aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <h4 class=\"small font-weight-bold\">Payout Details <span\r\n");
      out.write("                                                class=\"float-right\">80%</span></h4>\r\n");
      out.write("                                        <div class=\"progress mb-4\">\r\n");
      out.write("                                            <div class=\"progress-bar bg-info\" role=\"progressbar\" style=\"width: 80%\"\r\n");
      out.write("                                                 aria-valuenow=\"80\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <h4 class=\"small font-weight-bold\">Account Setup <span\r\n");
      out.write("                                                class=\"float-right\">Complete!</span></h4>\r\n");
      out.write("                                        <div class=\"progress\">\r\n");
      out.write("                                            <div class=\"progress-bar bg-success\" role=\"progressbar\" style=\"width: 100%\"\r\n");
      out.write("                                                 aria-valuenow=\"100\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Color System -->\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-primary text-white shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Primary\r\n");
      out.write("                                                <div class=\"text-white-50 small\">#4e73df</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-success text-white shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Success\r\n");
      out.write("                                                <div class=\"text-white-50 small\">#1cc88a</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-info text-white shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Info\r\n");
      out.write("                                                <div class=\"text-white-50 small\">#36b9cc</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-warning text-white shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Warning\r\n");
      out.write("                                                <div class=\"text-white-50 small\">#f6c23e</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-danger text-white shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Danger\r\n");
      out.write("                                                <div class=\"text-white-50 small\">#e74a3b</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-secondary text-white shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Secondary\r\n");
      out.write("                                                <div class=\"text-white-50 small\">#858796</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-light text-black shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Light\r\n");
      out.write("                                                <div class=\"text-black-50 small\">#f8f9fc</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("                                        <div class=\"card bg-dark text-white shadow\">\r\n");
      out.write("                                            <div class=\"card-body\">\r\n");
      out.write("                                                Dark\r\n");
      out.write("                                                <div class=\"text-white-50 small\">#5a5c69</div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-lg-6 mb-4\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Illustrations -->\r\n");
      out.write("                                <div class=\"card shadow mb-4\">\r\n");
      out.write("                                    <div class=\"card-header py-3\">\r\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Illustrations</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <img class=\"img-fluid px-3 px-sm-4 mt-3 mb-4\" style=\"width: 25rem;\"\r\n");
      out.write("                                                 src=\"img/undraw_posting_photo.svg\" alt=\"...\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <p>Add some quality, svg illustrations to your project courtesy of <a\r\n");
      out.write("                                                target=\"_blank\" rel=\"nofollow\" href=\"https://undraw.co/\">unDraw</a>, a\r\n");
      out.write("                                            constantly updated collection of beautiful svg images that you can use\r\n");
      out.write("                                            completely free and without attribution!</p>\r\n");
      out.write("                                        <a target=\"_blank\" rel=\"nofollow\" href=\"https://undraw.co/\">Browse Illustrations on\r\n");
      out.write("                                            unDraw &rarr;</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Approach -->\r\n");
      out.write("                                <div class=\"card shadow mb-4\">\r\n");
      out.write("                                    <div class=\"card-header py-3\">\r\n");
      out.write("                                        <h6 class=\"m-0 font-weight-bold text-primary\">Development Approach</h6>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"card-body\">\r\n");
      out.write("                                        <p>SB Admin 2 makes extensive use of Bootstrap 4 utility classes in order to reduce\r\n");
      out.write("                                            CSS bloat and poor page performance. Custom CSS classes are used to create\r\n");
      out.write("                                            custom components and custom utility classes.</p>\r\n");
      out.write("                                        <p class=\"mb-0\">Before working with this theme, you should become familiar with the\r\n");
      out.write("                                            Bootstrap framework, especially the utility classes.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.container-fluid -->\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("                <!-- Footer -->\r\n");
      out.write("                <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                    <div class=\"container my-auto\">\r\n");
      out.write("                        <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                            <span>Copyright &copy; SWP391 2022</span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </footer>\r\n");
      out.write("                <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Scroll to Top Button-->\r\n");
      out.write("        <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("            <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap core JavaScript-->\r\n");
      out.write("        <script src=\"dashboard/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"dashboard/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Core plugin JavaScript-->\r\n");
      out.write("        <script src=\"dashboard/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Custom scripts for all pages-->\r\n");
      out.write("        <script src=\"dashboard/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level plugins -->\r\n");
      out.write("        <script src=\"dashboard/vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Page level custom scripts -->\r\n");
      out.write("        <script src=\"dashboard/js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("        <script src=\"dashboard/js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script src=\"https://kit.fontawesome.com/228aa84c51.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user.roleId == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <div class=\"sidebar-heading\">\r\n");
        out.write("                        Admin\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a class=\"nav-link\" href=\"dashboard-account\">\r\n");
        out.write("                            <i class=\"fas fa-user\"></i>\r\n");
        out.write("                            <span>Accounts</span></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                    <!-- Divider -->\r\n");
        out.write("                    <hr class=\"sidebar-divider\">\r\n");
        out.write("                ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionScope.user.roleId == 1) or (sessionScope.user.roleId == 2)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <div class=\"sidebar-heading\">\r\n");
        out.write("                        Seller\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a class=\"nav-link\" href=\"dashboard-product\">\r\n");
        out.write("                            <i class=\"fas fa-gamepad\"></i>\r\n");
        out.write("                            <span>Products</span></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a class=\"nav-link\" href=\"dashboard-order\">\r\n");
        out.write("                            <i class=\"fas fa-shopping-cart\"></i>\r\n");
        out.write("                            <span>Orders</span></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                    <!-- Divider -->\r\n");
        out.write("                    <hr class=\"sidebar-divider\">\r\n");
        out.write("                ");
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(sessionScope.user.roleId == 1) or (sessionScope.user.roleId == 4)}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <!-- Heading -->\r\n");
        out.write("                    <div class=\"sidebar-heading\">\r\n");
        out.write("                        Marketing\r\n");
        out.write("                    </div>\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a class=\"nav-link\" href=\"dashboard-post\">\r\n");
        out.write("                            <i class=\"fas fa-file\"></i>\r\n");
        out.write("                            <span>Posts</span></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a class=\"nav-link\" href=\"dashboard-faq\">\r\n");
        out.write("                            <i class=\"fas fa-question-circle\"></i>\r\n");
        out.write("                            <span>FAQs</span></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                    <li class=\"nav-item\">\r\n");
        out.write("                        <a class=\"nav-link\" href=\"dashboard-notification\">\r\n");
        out.write("                            <i class=\"fas fa-bell\"></i>\r\n");
        out.write("                            <span>Notifications</span></a>\r\n");
        out.write("                    </li>\r\n");
        out.write("\r\n");
        out.write("                    <!-- Divider -->\r\n");
        out.write("                    <hr class=\"sidebar-divider d-none d-md-block\">\r\n");
        out.write("                ");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPricePerMonthNow}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
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
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalOrderSuccess}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalOrderProcessing}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}
