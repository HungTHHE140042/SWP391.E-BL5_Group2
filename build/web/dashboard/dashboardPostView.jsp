<%-- 
    Document   : dashboardPostView
    Created on : Apr 17, 2022, 3:48:46 PM
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
                            <h4><a href="dashboard-post">Posts</a> > View</h4>
                        </div>

                        <!-- DataTales Example -->
                        <div class="card shadow mb-4">
                            <div class="row mt-4 mb-4">
                                <div class="col-1 text-center">
                                    ID
                                </div>
                                <div class="col-10">
                                    <input class="form-control" type="text" placeholder="id" value="${post.postId}" disabled="">
                                </div>
                            </div>
                            <div class="row mt-4 mb-4">
                                <div class="col-1 text-center">
                                    Title
                                </div>
                                <div class="col-10">
                                    <input class="form-control" type="text" placeholder="title" value="${post.title}" disabled="">
                                </div>
                            </div>
                            <div class="row mt-4 mb-4">
                                <div class="col-1 text-center">
                                    Image (376x376)
                                </div>
                                <div class="col-10">
                                    <img width="100px" src="${post.imageLinkThumbnail}" alt="">
                                </div>
                            </div>
                            <div class="row mt-4 mb-4">
                                <div class="col-1 text-center">
                                    Image (1170x350)
                                </div>
                                <div class="col-10">
                                    <img width="200px" src="${post.imageLinkDetail}" alt="">
                                </div>
                            </div>

                            <div class="row mt-4 mb-4">
                                <div class="col-1 text-center">
                                    Content
                                </div>
                                <div class="col-10">
                                    <textarea class="form-control" rows="5" disabled="">${post.content}</textarea>
                                </div>
                            </div>
                            <div class="row mt-4 mb-4">
                                <div class="col-1 text-center">
                                    Author
                                </div>
                                <div class="col-10">
                                    @${post.username}
                                </div>
                            </div>
                            <div class="row mt-4 mb-4">
                                <div class="col-1 text-center">
                                    Date
                                </div>
                                <div class="col-10">
                                    ${post.date}
                                </div>
                            </div>

                            <div class="div mb-4 mr-4">
                                <a href="dashboard-post" class="btn btn-danger float-right">
                                    <span class="text">Close</span>
                                </a>
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
