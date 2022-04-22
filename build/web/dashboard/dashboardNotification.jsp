<%-- 
    Document   : dashboardNotification
    Created on : Apr 17, 2022, 4:26:45 PM
    Author     : trinh
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
            <%@include file="layout/slideboad.jsp" %>
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
                            <h4>Notifications</h4>
                            <div class="row">
                                <div class="col-6">
                                    <a href="#" class="btn btn-success btn-icon-split" data-toggle="modal" data-target="#createModal">
                                        <span class="icon text-white-50">
                                            <i class="fas fa-plus"></i>
                                        </span>
                                        <span class="text">CREATE NEW</span>
                                    </a>
                                </div>
                            </div>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th class="col-1">ID</th>
                                                <th>Last</th>
                                                <th>Title</th>
                                                <th>Content</th>
                                                <th class="col-1">Status</th>
                                                <th class="col-2">Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr>
                                                <td>1</td>
                                                <td>17/4/2022</td>
                                                <td>HOW CAN I CONTACT THE TEAM FOR HELP?</td>
                                                <td>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been industry standard unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five reIcentem with desktop publishing softwa like including versions has been industry standard unknown printer took a galley of type and scramIblrd it to make a type specimen book ha with desktop publishing software like including versions.</td>
                                                <td>
                                                    <a href="#" class="btn btn-outline-primary btn-sm">
                                                        Sent
                                                    </a>
                                                </td>
                                                <td>
                                                    <a href="dashboard-notification-detail" class="btn btn-warning btn-icon-split btn-sm">
                                                        <span class="text">Detail</span>
                                                    </a>
                                                    <a href="#" class="btn btn-danger btn-icon-split btn-sm" data-toggle="modal" data-target="#deleteModal" data-id="id here">
                                                        <span class="text">Delete</span>
                                                    </a>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>2</td>
                                                <td>17/4/2022</td>
                                                <td>HOW CAN I CONTACT THE TEAM FOR HELP?</td>
                                                <td>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been industry standard unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five reIcentem with desktop publishing softwa like including versions has been industry standard unknown printer took a galley of type and scramIblrd it to make a type specimen book ha with desktop publishing software like including versions.</td>
                                                <td>
                                                    <a href="#" class="btn btn-outline-secondary btn-sm">
                                                        Not send
                                                    </a>
                                                </td>
                                                <td>
                                                    <a href="dashboard-notification-detail" class="btn btn-warning btn-icon-split btn-sm">
                                                        <span class="text">Detail</span>
                                                    </a>
                                                    <a href="#" class="btn btn-danger btn-icon-split btn-sm" data-toggle="modal" data-target="#deleteModal" data-id="id here">
                                                        <span class="text">Delete</span>
                                                    </a>
                                                </td>
                                            </tr>
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
                    <div class="modal-body">Select "Delete" below if you are sure to delete this Notification.
                        <form method="post" action="">
                            <input type="hidden" name="id" id="id">
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
                        <h5 class="modal-title" id="exampleModalLabel">Create new Notification</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <form method="post" action="">
                        <div class="modal-body">
                            <div class="mb-3">
                                <label for="title" class="col-form-label"><span style="color: red">*</span> Title:</label>
                                <input type="text" class="form-control" name="title" required="">
                            </div>
                            <div class="mb-3">
                                <label for="content" class="col-form-label"><span style="color: red">*</span> Content:</label>
                                <textarea type="text" class="form-control" name="content" required=""></textarea>
                            </div>
                            <div class="mb-3">
                                <label for="content" class="col-form-label"><span style="color: red">*</span> Receiver:</label>
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="user" checked="">
                                    <label class="form-check-label" for="user">
                                        All Customers
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="seller">
                                    <label class="form-check-label" for="seller">
                                        All Sellers
                                    </label>
                                </div>
                                <div class="form-check">
                                    <input class="form-check-input" type="checkbox" value="" id="marketing">
                                    <label class="form-check-label" for="marketing">
                                        All Marketing
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                            <button type="submit" class="btn btn-success">Create</button>
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
                console.log(id);
                var modal = $(this);
                console.log(modal);
                modal.find('.modal-dialog .modal-content .modal-body #id').val(id);
            });
        </script>
    </body>
</html>
