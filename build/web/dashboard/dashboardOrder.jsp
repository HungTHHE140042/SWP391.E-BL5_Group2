<%-- 
    Document   : dashboardOrder
    Created on : Apr 17, 2022, 11:05:55 AM
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

        <!--Delete modal-->
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
                            <h4>Orders</h4>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="card-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                                        <thead>
                                            <tr>
                                                <th>ID</th>
                                                <th>Date</th>
                                                <th>User</th>
                                                <th>Total</th>
                                                <th>Note</th>
                                                <th>Status</th>
                                                <th class="col-2 text-center">Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${orders}" var="order">
                                                <tr>
                                                    <td>${order.id}</td>
                                                    <td>${order.date}</td>
                                                    <td>${sessionScope.user.username}</td>
                                                    <td>${order.total}</td>
                                                    <td>${order.note}</td>

                                                    <c:if test="${order.status == 1}">
                                                        <td><div class="btn btn-outline-warning btn-sm">
                                                                Processing
                                                            </div></td>

                                                    </c:if>
                                                    <c:if test="${order.status == 2}">
                                                        <td><div class="btn btn-outline-success btn-sm">
                                                                Accepted
                                                            </div></td>
                                                        </c:if>
                                                        <c:if test="${order.status == 3}">
                                                        <td><div class="btn btn-outline-danger btn-sm">
                                                                Reject
                                                            </div></td>
                                                        </c:if>

                                                    <td class="text-center">
                                                        <c:if test="${order.status == 1}">
                                                            <a href="dashboard-order-detail?orderID=${order.id}" class="btn btn-warning btn-icon-split btn-sm">
                                                                <span class="text">Detail</span>
                                                            </a>                                                           
                                                            <a href="#" class="btn btn-success btn-icon-split btn-sm" data-toggle="modal" data-target="#acceptModal" data-id="${order.id}">
                                                                <span class="text">Accept</span>
                                                            </a>
                                                            <a href="#" class="btn btn-danger btn-icon-split btn-sm" data-toggle="modal" data-target="#rejectModal" data-id="${order.id}">
                                                                <span class="text">Reject</span>
                                                            </a>
                                                        </c:if>
                                                        <c:if test="${order.status == 2 || order.status == 3}">
                                                            <a href="dashboard-order-detail?orderID=${order.id}" class="btn btn-warning btn-icon-split btn-sm">
                                                                <span class="text">Detail</span>
                                                            </a>  
                                                        </c:if>
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

        <!-- Reject Modal-->
        <div class="modal fade" id="rejectModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Are you sure Reject this order?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">??</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form method="post" action="dashboard-order">
                            <input type="hidden" name="rejectID" id="rejectID">
                            <div class="mb-3">
                                <label for="note" class="col-form-label"> Note:</label>
                                <textarea class="form-control" name="note"></textarea>
                            </div>
                            <div class="modal-footer">
                                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                                <button type="submit" class="btn btn-danger">Reject</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Accept Modal-->
        <div class="modal fade" id="acceptModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Are you sure Accept this order?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">??</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <form method="post" action="dashboard-order">
                            <input type="hidden" name="acceptID" id="acceptID" >
                            <div class="mb-3">
                                <label for="note" class="col-form-label"> Note:</label>
                                <textarea class="form-control" name="note"></textarea>
                            </div>
                            <div class="modal-footer">
                                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                                <button type="submit" class="btn btn-success">Accept</button>
                            </div>
                        </form>
                    </div>
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
            $('#acceptModal').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget); // Button that triggered the modal
                var id = button.data('id');
                console.log(id);
                var modal = $(this);
                console.log(modal);
                modal.find('.modal-dialog .modal-content .modal-body #acceptID').val(id);
            });

            $('#rejectModal').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget); // Button that triggered the modal
                var id = button.data('id');
                console.log(id);
                var modal = $(this);
                console.log(modal);
                modal.find('.modal-dialog .modal-content .modal-body #rejectID').val(id);
            });
        </script>
    </body>
</html>
