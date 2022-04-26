<%-- 
    Document   : dashboardEmail
    Created on : Apr 26, 2022, 2:00:58 PM
    Author     : QUANG HUNG
--%>

<%@page import="entity.Email"%>
<%@page import="java.sql.Date"%>
<%@page import="dao.EmailDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
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
        <c:choose>
            <c:when test="${stt.equals('1')}">
                <div class="position-fixed bottom-0 end-0 p-3" style="right: 10px; bottom: 10px; z-index: 11">
                    <div class="toast" data-autohide="false">
                        <div class="toast-header bg-success">
                            <strong class="mr-auto text-white"><h4>Create Successfully</h4></strong>
                            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast">&times;</button>
                        </div>
                        <div class="toast-body">
                            Create new Mail success.
                        </div>
                    </div>
                </div>
            </c:when>
            <c:when test="${stt.equals('2')}">
                <div class="position-fixed bottom-0 end-0 p-3" style="right: 10px; bottom: 10px; z-index: 11">
                    <div class="toast" data-autohide="false">
                        <div class="toast-header bg-danger">
                            <strong class="mr-auto text-white"><h4>Create Fail</h4></strong>
                            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast">&times;</button>
                        </div>
                        <div class="toast-body">
                            Create new Mail fail, try again!
                        </div>
                    </div>
                </div>
            </c:when>
            <c:when test="${stt.equals('3')}">
                <div class="position-fixed bottom-0 end-0 p-3" style="right: 10px; bottom: 10px; z-index: 11">
                    <div class="toast" data-autohide="false">
                        <div class="toast-header bg-success">
                            <strong class="mr-auto text-white"><h4>Delete Successfully</h4></strong>
                            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast">&times;</button>
                        </div>
                        <div class="toast-body">
                            Delete Mail success.
                        </div>
                    </div>
                </div>
            </c:when>
            <c:when test="${stt.equals('4')}">
                <div class="position-fixed bottom-0 end-0 p-3" style="right: 10px; bottom: 10px; z-index: 11">
                    <div class="toast" data-autohide="false">
                        <div class="toast-header bg-danger">
                            <strong class="mr-auto text-white"><h4>Delete Fail</h4></strong>
                            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast">&times;</button>
                        </div>
                        <div class="toast-body">
                            Delete Mail fail, try again!
                        </div>
                    </div>
                </div>
            </c:when>
            <c:when test="${stt.equals('5')}">
                <div class="position-fixed bottom-0 end-0 p-3" style="right: 10px; bottom: 10px; z-index: 11">
                    <div class="toast" data-autohide="false">
                        <div class="toast-header bg-success">
                            <strong class="mr-auto text-white"><h4>Send Mail Successfully</h4></strong>
                            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast">&times;</button>
                        </div>
                        <div class="toast-body">
                            Send Mail success, try again!
                        </div>
                    </div>
                </div>
            </c:when>
            <c:otherwise></c:otherwise>
        </c:choose>
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
                            <h4>Mail Management</h4>
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
                                                <th>ID</th>
                                                <th>Title</th>
                                                <th>Content</th>
                                                <th>Date</th>
                                                <th>Status</th>
                                                <th>Option</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${listEmail}" var="email">
                                                <tr>
                                                    <td>${email.emailID}</td>
                                                    <td>${email.title}</td>
                                                    <td>${email.content}</td>
                                                    <%
                                                        EmailDAO emailDAO = new EmailDAO();
                                                        Email email = (Email)pageContext.getAttribute("email");
                                                        String dateMail = emailDAO.formatDate(email.getDate());
                                                        request.setAttribute("dateMail", dateMail);
                                                    %>
                                                    <td>${dateMail}</td>
                                                    <c:if test="${email.status == 0}">
                                                        <td>
                                                            <div class="btn btn-outline-secondary btn-sm">
                                                                Draft
                                                            </div>
                                                        </td>
                                                        <td>
                                                        <a href="dashboard-email-edit?id=${email.emailID}" class="btn btn-warning btn-icon-split btn-sm">
                                                            <span class="text">Edit</span>
                                                        </a>
                                                        <a href="#" class="btn btn-danger btn-icon-split btn-sm" data-toggle="modal" data-target="#deleteModal" data-id="${email.emailID}">
                                                            <span class="text">Delete</span>
                                                        </a>
                                                        <a href="#" class="btn btn-success btn-icon-split btn-sm" data-toggle="modal" data-target="#sendMailModal" data-id="${email.emailID}">
                                                            <span class="text">Send</span>
                                                        </a>    
                                                    </td>
                                                    </c:if>
                                                    <c:if test="${email.status == 1}">
                                                        <td>
                                                            <div class="btn btn-outline-danger btn-sm">
                                                                Sent
                                                            </div>
                                                        </td>
                                                        <td>
                                                            <a href="#" class="btn btn-danger btn-icon-split btn-sm" data-toggle="modal" data-target="#deleteModal" data-id="${email.emailID}">
                                                            <span class="text">Delete</span>
                                                        </a>
                                                        </td>
                                                    </c:if>                                                    
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
        
        <!-- Send Mail Modal-->
        <div class="modal fade" id="sendMailModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Are you sure to Send this Mail?</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <div class="modal-body">Select "Send" below if you are sure to send this Mail.
                        <form method="get" action="">
                            <input type="hidden" name="idSend" id="sendID">
                            <div class="modal-footer">
                                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                                <button type="submit" class="btn btn-success">Send</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

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
                    <div class="modal-body">Select "Delete" below if you are sure to delete this Mail.
                        <form method="get" action="">
                            <input type="hidden" name="idDelete" id="deleteID">
                            <div class="modal-footer">
                                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                                <button type="submit" class="btn btn-danger">Delete</button>
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
                        <h5 class="modal-title" id="exampleModalLabel">Create new Draft Mail</h5>
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
                                <label for="who" class="col-form-label"><span style="color: red">*</span> Who Receive Mail:</label>
                                <select class="form-control" name="whoID">
                                    <option value="3">All Customer</option>
                                    <option value="5">Subscribers</option>
                                </select>
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
            modal.find('.modal-dialog .modal-content .modal-body #deleteID').val(id);
        });
        
        $('#sendMailModal').on('show.bs.modal', function (event) {
            var button = $(event.relatedTarget); // Button that triggered the modal
            var id = button.data('id');
            console.log(id);
            var modal = $(this);
            console.log(modal);
            modal.find('.modal-dialog .modal-content .modal-body #sendID').val(id);
        });

        $(document).ready(function () {
            $('.toast').toast('show');
        });
    </script>
    
</body>
</html>
