<%-- 
    Document   : dashboardAccountEdit
    Created on : Apr 16, 2022, 2:41:50 PM
    Author     : long
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="assets/img/favicon.ico" type="image/png">

        <title>Management</title>

        <!-- Custom fonts for this template-->
        <link href="dashboard/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="dashboard/css/sb-admin-2.min.css" rel="stylesheet">

        <link href="dashboard/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

    </head>

    <body id="page-top">

        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="cms" style="color: yellow">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-crown"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">Dashboard</div>
                </a>

                <!-- Divider -->
                <hr class="sidebar-divider my-0">

                <!-- Nav Item - Dashboard -->
                <li class="nav-item">
                    <a class="nav-link" href="cms">
                        <i class="fas fa-fw fa-tachometer-alt"></i>
                        <span>Dashboard</span></a>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">

                <!-- Heading -->
                <c:if test="${sessionScope.user.roleId == 1}">
                    <div class="sidebar-heading">
                        Admin
                    </div>

                    <li class="nav-item active">
                        <a class="nav-link" href="dashboard-account">
                            <i class="fas fa-user"></i>
                            <span>Accounts</span></a>
                    </li>

                    <!-- Divider -->
                    <hr class="sidebar-divider">
                </c:if>
                <!-- Heading -->
                <c:if test="${(sessionScope.user.roleId == 1) or (sessionScope.user.roleId == 2)}">
                    <div class="sidebar-heading">
                        Seller
                    </div>

                    <li class="nav-item">
                        <a class="nav-link" href="dashboard-product">
                            <i class="fas fa-gamepad"></i>
                            <span>Products</span></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="pomotionManager">
                            <i class="fas fa-ticket-alt"></i>
                            <span>Promotion</span></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="dashboard-order">
                            <i class="fas fa-shopping-cart"></i>
                            <span>Orders</span></a>
                    </li>
                    <!-- Divider -->
                    <hr class="sidebar-divider">
                </c:if>
                <c:if test="${(sessionScope.user.roleId == 1) or (sessionScope.user.roleId == 4)}">
                    <!-- Heading -->
                    <div class="sidebar-heading">
                        Marketing
                    </div>

                    <li class="nav-item">
                        <a class="nav-link" href="dashboard-post">
                            <i class="fas fa-file"></i>
                            <span>Posts</span></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="dashboard-faq">
                            <i class="fas fa-question-circle"></i>
                            <span>FAQs</span></a>
                    </li>

                    <li class="nav-item">
                        <a class="nav-link" href="dashboard-notification">
                            <i class="fas fa-bell"></i>
                            <span>Notifications</span></a>
                    </li>
                    <!-- Divider -->
                    <hr class="sidebar-divider d-none d-md-block">
                </c:if>
                <!-- Sidebar Toggler (Sidebar) -->
                <div class="text-center d-none d-md-inline">
                    <button class="rounded-circle border-0" id="sidebarToggle"></button>
                </div>


            </ul>
            <!-- End of Sidebar -->

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <%@include file="layout/header.jsp" %>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <div class="div mb-4">
                            <h4><a href="dashboard-account">Accounts</a> > Edit</h4>
                        </div>

                        <!-- DataTales Example -->
                        <form method="post" action="">
                            <div class="card shadow mb-4">
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        ID
                                    </div>
                                    <div class="col-10">
                                        <input name="id" class="form-control" type="text"  value="${user.userId}" disabled="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Username
                                    </div>
                                    <div class="col-10">
                                        <input name="username" class="form-control" type="text"  value="${user.username}" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Email
                                    </div>
                                    <div class="col-10">
                                        <input name="email" class="form-control" type="text" value="${user.email}" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Role
                                    </div>
                                    <div class="col-10">
                                        
                                        <select name="roleId" class="form-control">
                                            <option value="1" <c:if test="${user.roleId eq 1}">selected</c:if>>Admin</option>
                                            <option value="2" <c:if test="${user.roleId eq 2}">selected</c:if>>Seller</option>
                                            <option value="3" <c:if test="${user.roleId eq 3}">selected</c:if>>Customer</option>
                                            <option value="4" <c:if test="${user.roleId eq 4}">selected</c:if>>Marketing</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Status
                                    </div>
                                    <div class="col-10">
                                        <select name="statusId" class="form-control">
                                            <option value="1" <c:if test="${user.statusId eq 1}">selected</c:if>>Active</option>
                                            <option value="2" <c:if test="${user.statusId eq 2}">selected</c:if>>Not Active</option>
                                            <option value="3" <c:if test="${user.statusId eq 3}">selected</c:if>>Ban</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="div mb-4 mr-4">
                                    <button type="submit" class="btn btn-success float-right ml-2">
                                        <span class="text">Save</span>
                                    </button>
                                    <a href="dashboard-account" class="btn btn-danger float-right">
                                        <span class="text">Close</span>
                                    </a>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- /.container-fluid -->

                </div>
                <!-- End of Main Content -->

                <!-- Footer -->
                <footer class="sticky-footer bg-white">
                    <div class="container my-auto">
                        <div class="copyright text-center my-auto">
                            <span>Copyright &copy; SWP391 2022</span>
                        </div>
                    </div>
                </footer>
                <!-- End of Footer -->

            </div>
            <!-- End of Content Wrapper -->

        </div>
        <!-- End of Page Wrapper -->

        <!-- Scroll to Top Button-->
        <a class="scroll-to-top rounded" href="#page-top">
            <i class="fas fa-angle-up"></i>
        </a>

        <!-- Bootstrap core JavaScript-->
        <script src="dashboard/vendor/jquery/jquery.min.js"></script>
        <script src="dashboard/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

        <!-- Core plugin JavaScript-->
        <script src="dashboard/vendor/jquery-easing/jquery.easing.min.js"></script>

        <!-- Custom scripts for all pages-->
        <script src="dashboard/js/sb-admin-2.min.js"></script>

        <!-- Page level plugins -->
        <script src="dashboard/vendor/datatables/jquery.dataTables.min.js"></script>
        <script src="dashboard/vendor/datatables/dataTables.bootstrap4.min.js"></script>

        <!-- Page level custom scripts -->
        <script src="dashboard/js/demo/datatables-demo.js"></script>

        <script src="https://kit.fontawesome.com/228aa84c51.js" crossorigin="anonymous"></script>

    </body>
</html>
