<%-- 
    Document   : cmsAccount
    Created on : Apr 20, 2022, 1:23:12 PM
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

        <title>Dashboard</title>

        <!-- Custom fonts for this template-->
        <link href="dashboard/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- Custom styles for this template-->
        <link href="dashboard/css/sb-admin-2.min.css" rel="stylesheet">

        <link href="dashboard/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">

        <!--Delete modal-->
    </head>

    <body id="page-top">


        <!-- Page Wrapper -->
        <div id="wrapper">

            <!-- Sidebar -->
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

                <!-- Sidebar - Brand -->
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="cms" style="color: yellow">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-user"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">Accounts</div>
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

                <li class="nav-item active">
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

                <li class="nav-item">
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
                            <h4>Accounts</h4>
                            <a href="#" class="btn btn-success btn-icon-split" data-toggle="modal" data-target="#createModal">
                                <span class="icon text-white-50">
                                    <i class="fas fa-plus"></i>
                                </span>
                                <span class="text">CREATE NEW</span>
                            </a>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>UserID</th>
                                                <th>Username</th>
                                                <th>Password</th>
                                                <th>Email</th>
                                                <th>Role</th>
                                                <th>Status</th>
                                                <th>Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach var="c" items="${LIST_User}">
                                            <tr>
                                                <td>${c.userId}</td>
                                                <td>${c.username}</td>
                                                <td>${c.password}</td>
                                                <td>${c.email}</td>
                                                <c:if test="${c.roleId == 1}">
                                                    <td>
                                                        <div class="btn btn-outline-danger btn-sm">
                                                            Admin
                                                        </div>
                                                    </td>
                                                </c:if>
                                                <c:if test="${c.roleId == 2}">
                                                    <td>
                                                        <div class="btn btn-outline-primary btn-sm">
                                                            Seller
                                                        </div>
                                                    </td>
                                                </c:if>
                                                <c:if test="${c.roleId == 3}">
                                                    <td>
                                                        <div class="btn btn-outline-warning btn-sm">
                                                            Customer
                                                        </div>
                                                    </td>
                                                </c:if>
                                                <c:if test="${c.roleId == 4}">
                                                    <td>
                                                        <div class="btn btn-outline-secondary btn-sm">
                                                            Marketing
                                                        </div>
                                                    </td>
                                                </c:if>
                                                <c:if test="${c.statusId == 1}">
                                                    <td>
                                                        <div style="color: blue">
                                                            Active
                                                        </div>
                                                    </td>
                                                </c:if>
                                                    <c:if test="${c.statusId == 2}">
                                                    <td>
                                                        <div style="color: gray">
                                                            Inactive
                                                        </div>
                                                    </td>
                                                </c:if>
                                                    <c:if test="${c.statusId== 3} ">
                                                    <td>
                                                        <div style="color: red">
                                                            Banned
                                                        </div>
                                                    </td>
                                                </c:if>
                                                <td>
                                                    <a href="dashboard-account-edit?id=${c.userId}" class="btn btn-success btn-icon-split btn-sm">
                                                        <span class="text">Edit</span>
                                                    </a>
                                                    <a href="#" class="btn btn-danger btn-icon-split btn-sm" data-toggle="modal" data-target="#deleteModal" data-id="${c.userId}">
                                                        <span class="text">Delete</span>
                                                    </a>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                        </tbody> 
                                    </table>
                                </div>
                            </div>
                        </div>

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

        <!-- Delete Modal-->
        <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Are you sure Delete?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Delete" below if you are sure to delete this account.
                        <form method="get" action="">
                            <input type="hidden" name="idDelete" id="id">
                            <div class="modal-footer">
                                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                                <button type="submit" class="btn btn-danger" href="login.html">Delete</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Create Modal-->
        <div class="modal fade" id="createModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Create new Account</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <form method="post" action="">
                        <div class="modal-body">
                            <div class="mb-3">
                                <label for="username" class="col-form-label"><span style="color: red">*</span> Username:</label>
                                <input type="text" class="form-control" name="username" required="">
                            </div>
                            <div class="mb-3">
                                <label for="email" class="col-form-label"><span style="color: red">*</span> Email:</label>
                                <input type="email" class="form-control" name="email" required="">
                            </div>
                            <div class="mb-3">
                                <label for="role" class="col-form-label"><span style="color: red">*</span> Role:</label>
                                <select class="form-control" name="roleId">
                                    <option value="1">Admin</option>
                                    <option value="2">Seller</option>
                                    <option value="3">Marketing</option>
                                    <option value="4">Customer</option>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="password" class="col-form-label"><span style="color: red">*</span> Password:</label>
                                <input type="password" class="form-control" name="password" required="">
                            </div>
                            <div class="mb-3">
                                <label for="repassword" class="col-form-label"><span style="color: red">*</span> Retype-password:</label>
                                <input type="password" class="form-control" name="repassword" required="">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                            <button type="submit" class="btn btn-success" href="login.html">Create</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>

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

        <script>
            $('#deleteModal').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget); // Button that triggered the modal
                var id = button.data('id');
                var modal = $(this);
                modal.find('.modal-dialog .modal-content .modal-body #id').val(id);
            });
        </script>
    </body>
</html>
