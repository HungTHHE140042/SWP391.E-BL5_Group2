<%-- 
    Document   : dashboardProductEdit
    Created on : Apr 16, 2022, 8:52:04 PM
    Author     : trinh
--%>

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

        <title>Dashboard</title>

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
                        <i class="fas fa-gamepad"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">Products</div>
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
                <div class="sidebar-heading">
                    Admin
                </div>

                <li class="nav-item">
                    <a class="nav-link" href="dashboard-account">
                        <i class="fas fa-user"></i>
                        <span>Accounts</span></a>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">

                <!-- Heading -->
                <div class="sidebar-heading">
                    Seller
                </div>

                <li class="nav-item active">
                    <a class="nav-link" href="dashboard-product">
                        <i class="fas fa-gamepad"></i>
                        <span>Products</span></a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="dashboard-order">
                        <i class="fas fa-shopping-cart"></i>
                        <span>Orders</span></a>
                </li>

                <!-- Divider -->
                <hr class="sidebar-divider">

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
                            <h4><a href="dashboard-product">Products</a> > Edit</h4>
                        </div>

                        <!-- DataTales Example -->
                        <form method="post" action="">
                            <div class="card shadow mb-4">
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        ID
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="Username" value="1" disabled="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Name
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="Product name" value="PUBG" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> URL Image (370x368)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="" value="https://fap.fpt.edu.vn/Default.aspx" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> URL Image (570x330)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="" value="https://fap.fpt.edu.vn/Default.aspx" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Original Price ($)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="number" placeholder="" value="100" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        Sale   Percent (%)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="number" placeholder="" value="50">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Category
                                    </div>
                                    <div class="col-10">
                                        <select class="form-control">
                                            <option value="1">Action</option>
                                            <option value="2">Teamwork</option>
                                            <option value="3">Tactic</option>
                                        </select>
                                    </div>
                                    <div class="col-1 text-center">
                                        <a  href="dashboard-category"class="btn btn-primary btn-sm"><i class="fas fa-folder"></i> Categories</a>
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Amount
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="number" placeholder="" value="12" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Status
                                    </div>
                                    <div class="col-10">
                                        <select class="form-control">
                                            <option value="1">Public</option>
                                            <option value="2">Unpublic</option>
                                            <option value="3">Out of stock</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        Description
                                    </div>
                                    <div class="col-10">
                                        <textarea class="form-control" rows="5">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electrotypesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and morerecently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</textarea>
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        Add Product key
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" accept=".xls,.xlsx" type="file" >
                                    </div>
                                    <div class="col-1 text-center">
                                        <a href="file/product_key_template.xlsx" class="btn btn-warning btn-sm"><i class="fas fa-arrow-circle-down"></i> Template</a>
                                    </div>
                                </div>

                                <div class="div mb-4 mr-4">
                                    <button type="submit" class="btn btn-success float-right ml-2">
                                        <span class="text">Save</span>
                                    </button>
                                    <a href="dashboard-product" class="btn btn-danger float-right">
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
