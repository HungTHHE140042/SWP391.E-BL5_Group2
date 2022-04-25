<%-- 
    Document   : dashboardProductEdit
    Created on : Apr 16, 2022, 8:52:04 PM
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
                            <h4><a href="dashboard-product">Products</a> > Edit</h4>
                        </div>

                        <!-- DataTales Example -->
                        <form method="post" action="" enctype="multipart/form-data">
                            <div class="card shadow mb-4">
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        ID
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="ID" name="idEdit" value="${product.productID}" readonly="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Name
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="Product name" name="name" value="${product.productName}" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> URL Image (370x368)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="URL Image (370x368)" name="imageSquare" value="${product.productImgURL}" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> URL Image (570x330)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="URL Image (570x330)" name="imageRectangle" value="${product.productImgUrlDetail}" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Original Price ($)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="Original Price" name="originalPrice" value="${product.originalPrice}" required="">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        Sale   Percent (%)
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" type="text" placeholder="Sale Percent" name="salePercent" value="${product.salePercent}">
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Category
                                    </div>
                                    <div class="col-10">
                                        <select name="categoryId" class="form-control">
                                            <c:forEach items="${listCategory}" var="category">
                                                <option value="${category.categoryID}" <c:if test="${product.categoryID == category.categoryID}">selected</c:if>>${category.categoryName}</option>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="col-1 text-center">
                                        <a  href="dashboard-category"class="btn btn-primary btn-sm"><i class="fas fa-folder"></i> Categories</a>
                                    </div>
                                </div>
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        <span style="color: red">*</span> Status
                                    </div>
                                    <div class="col-10">
                                        <select class="form-control" name="statusId">
                                            <option value="1" <c:if test="${product.statusID == 1}">selected</c:if>>Public</option>
                                            <option value="2"<c:if test="${product.statusID == 2}">selected</c:if>>Not public</option>
                                            <option value="3"<c:if test="${product.statusID == 3}">selected</c:if>>Out of stock</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="row mt-4 mb-4">
                                        <div class="col-1 text-center">
                                            Description
                                        </div>
                                        <div class="col-10">
                                            <textarea class="form-control" rows="5" name="description">${product.description}</textarea>
                                    </div>
                                </div>
                                <input type="hidden" name="amount" value="${product.amount}">
                                <div class="row mt-4 mb-4">
                                    <div class="col-1 text-center">
                                        Add Product key
                                    </div>
                                    <div class="col-10">
                                        <input class="form-control" name="product-key-file" accept=".xls,.xlsx" type="file" >
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
