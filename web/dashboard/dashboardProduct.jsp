<%-- 
    Document   : dashboardProduct
    Created on : Apr 16, 2022, 3:33:35 PM
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
        <c:choose>
            <c:when test="${stt.equals('1')}">
                <div class="position-fixed bottom-0 end-0 p-3" style="right: 10px; bottom: 10px; z-index: 11">
                    <div class="toast" data-autohide="false">
                        <div class="toast-header bg-success">
                            <strong class="mr-auto text-white"><h4>Create Successfully</h4></strong>
                            <button type="button" class="ml-2 mb-1 close" data-dismiss="toast">&times;</button>
                        </div>
                        <div class="toast-body">
                            Create new Product success.
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
                            Create new Product fail, try again!
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
                            Delete Product success.
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
                            Delete Product fail, try again!
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
                            <h4>Products</h4>
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
                                                <th>Name</th>
                                                <th>370x368</th>
                                                <th>570x330</th>
                                                <th class="col-1">Original Price</th>
                                                <th class="col-1">Sale Percent</th>
                                                <th class="col-1">Sale Price</th>
                                                <th>Category</th>
                                                <th>Amount</th>
                                                <th class="col-1">Status</th>
                                                <th>Seller</th>
                                                <th class="col-2 text-center">Action</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${listProduct}" var="product">

                                                <tr>
                                                    <td>${product.productID}</td>
                                                    <td>${product.productName}</td>
                                                    <td><img width="50px" src="${product.productImgURL}" alt=""></td>
                                                    <td><img width="100px" src="${product.productImgUrlDetail}" alt=""></td>
                                                    <td>$${product.originalPrice}</td>
                                                    <td>
                                                        <c:if test="${product.salePercent > 0}">
                                                            <div class="btn btn-outline-danger btn-sm">
                                                                -${product.salePercent}%
                                                            </div>
                                                        </c:if>
                                                    </td>
                                                    <td>$${product.sellPrice}</td>
                                                    <td>${product.categoryName}</td>
                                                    <td>${product.amount}</td>
                                                    <td>
                                                        <c:if test="${product.statusID == 1}">
                                                            <div class="btn btn-outline-primary btn-sm">
                                                                Public
                                                            </div>
                                                        </c:if>
                                                        <c:if test="${product.statusID == 2}">
                                                            <div class="btn btn-outline-secondary btn-sm">
                                                                Not public
                                                            </div>
                                                        </c:if>
                                                        <c:if test="${product.statusID == 3}">
                                                            <div class="btn btn-outline-danger btn-sm">
                                                                Out of stock
                                                            </div>
                                                        </c:if>
                                                    </td>
                                                    <td>@${product.sellerName}</td>
                                                    <td class="text-center">
                                                        <a href="dashboard-product-view?id=${product.productID}" class="btn btn-warning btn-icon-split btn-sm">
                                                            <span class="text">View</span>
                                                        </a>
                                                        <a href="dashboard-product-edit?id=${product.productID}" class="btn btn-success btn-icon-split btn-sm">
                                                            <span class="text">Edit</span>
                                                        </a>
                                                        <a class="btn btn-danger btn-icon-split btn-sm" data-toggle="modal" data-target="#deleteModal" data-id="${product.productID}">
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
                    <div class="modal-body">Select "Delete" below if you are sure to delete this product.
                        <form method="get" action="">
                            <input type="hidden" name="id" id="id">
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
                        <h5 class="modal-title" id="exampleModalLabel">Create new Product</h5>
                        <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">×</span>
                        </button>
                    </div>
                    <form method="post" enctype="multipart/form-data" action="">
                        <div class="modal-body">
                            <div class="mb-3">
                                <label for="name" class="col-form-label"><span style="color: red">*</span> Product name:</label>
                                <input type="text" class="form-control" name="name" required="">
                            </div>
                            <div class="mb-3">
                                <label for="price" class="col-form-label"><span style="color: red">*</span> Price ($):</label>
                                <input type="text" class="form-control" name="price" required="">
                            </div>
                            <div class="mb-3">
                                <div class="row">
                                    <div class="col-3"><span style="color: red">*</span> Category:</div>
                                    <div class="col-9">
                                        <a href="dashboard-category" class="btn btn-primary btn-sm float-right"><i class="fas fa-folder"></i> Categories</a>
                                    </div>
                                </div>
                                <select class="form-control" name="category">
                                    <c:forEach items="${listCategory}" var="cat">
                                        <option value="${cat.categoryID}">${cat.categoryName}</option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div class="mb-3">
                                <label for="image1" class="col-form-label"><span style="color: red">*</span> URL Image (370x368):</label>
                                <input type="text" class="form-control" name="imageSqu" required="">
                            </div>
                            <div class="mb-3">
                                <label for="image2" class="col-form-label"><span style="color: red">*</span> URL Image (570x330):</label>
                                <input type="text" class="form-control" name="imageRec" required="">
                            </div>
                            <div class="mb-3">
                                <label for="desc" class="col-form-label">Description:</label>
                                <textarea type="text" class="form-control" name="description"></textarea>
                            </div>
                            <c:if test="${sessionScope.user.roleId == 1}">
                                <div class="mb-3">
                                    <div class="row">
                                        <div class="col-4"><span style="color: red">*</span> Product key:</div>
                                        <div class="col-8">
                                            <a href="file/product_key_template.xlsx" class="btn btn-warning btn-sm float-right"><i class="fas fa-arrow-circle-down"></i> Template File</a>
                                        </div>
                                    </div>
                                    <input type="file" accept=".xls,.xlsx" name="product-key-file" class="form-control-file" required="">
                                </div>
                            </c:if>
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

            $(document).ready(function () {
                $('.toast').toast('show');
            });
        </script>
    </body>
</html>
