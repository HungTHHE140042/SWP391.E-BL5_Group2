<%-- 
    Document   : cart
    Created on : Apr 13, 2022, 10:42:03 AM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Shop Game</title>
        <meta name="description" content="Bonx is a terrific esports website template with a slick and modern look.  It’s a robust gaming HTML template for bloggers and online gamers who want to share their enthusiasm for games on the internet."/>
        <meta name="keywords" content="	bootstrap, clean, esports, game, game portal, Game website, gamer, games, gaming, magazine, match, modern, online game, sport, sports">
        <meta name="author" content="Code Carnival">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Add site Favicon -->
        <link rel="shortcut icon" href="assets/img/favicon.ico" type="image/png">

        <!-- CSS 
        ========================= -->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Exo:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Metal+Mania&display=swap" rel="stylesheet">

        <!--        <link rel="stylesheet" href="assets/css/vendor/bootstrap.min.css">-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/icofont.min.css">
        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/nice-select.css">
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <!-- Main Style CSS -->
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/table.css">

    </head>
    <body class="body__bg" data-bgimg="assets/img/bg/body-bg.webp">
        <c:if test="${sessionScope.checkQuantity.equals('1')}">
            <div class="position-fixed bottom-0 end-0 p-3" style="z-index: 11">
                <div class="toast align-items-center text-white border-0" role="alert" aria-live="assertive" aria-atomic="true" style="background-color: #851e3e" >
                    <div class="d-flex">
                        <div class="toast-body">
                            Sorry quantity of this product is maximum!!!
                        </div>
                        <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                    </div>
                </div>
            </div>
            <% session.removeAttribute("checkQuantity");%>
        </c:if>

        <%@include file="layout/header.jsp" %>

        <!-- breadcrumbs area start -->
        <div class="breadcrumbs_aree breadcrumbs_bg mb-140" data-bgimg="assets/img/bg/breadcrumbs-bg.webp">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="breadcrumbs_text text-center">
                            <h1>Cart</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="index.html">Home </a></li>
                                <li> <span>//</span></li>
                                <li>  Cart </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumbs area end -->

        <!-- page wrapper start -->
        <div class="page_wrapper container mb-100">
            <c:choose>
                <c:when test="${cartDetails.size() > 0}">
                    <table class="cart-table cart-table-rouned table table-light table-hover mb-25 ">
                        <thead>
                            <tr class="">
                                <th scope="col">ID Product</th>
                                <th scope="col">Product Name</th>
                                <th scope="col">Price</th>
                                <th scope="col">Quantity</th>
                                <th scope="col">Total Price</th>
                                <th class="col-2" scope="col">
                                    <div class="text-center">
                                        Remove
                                    </div>
                                </th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${cartDetails}" var="item">
                                <tr>
                                    <th scope="row">${item.productID}</th>
                                    <td>${item.productName}</td>
                                    <td>${item.sellPrice}</td>

                                    <td class="text-center">
                                        <div class="row text-center">
                                            <div class="col-2 text-center ">
                                                <form  action="cart" method="post">
                                                    <button type="submit" class="btn btn-danger mr-2"><i class="fas fa-minus"></i>
                                                    </button>
                                                    <input hidden name="quantity" value="0">
                                                    <input hidden name="proID" value="${item.productID}">
                                                </form>   
                                            </div>
                                            <div class="col-6 text-center" style="padding-left: 28px;">
                                                ${item.quantity}
                                            </div>
                                            <div class="col-2 text-center">
                                                <form action="cart" method="post">
                                                    <button type="submit" class="btn btn-success"><i class="fas fa-plus"></i>
                                                    </button>
                                                    <input hidden name="quantity" value="1">
                                                    <input hidden name="proID" value="${item.productID}">
                                                </form>
                                            </div>
                                        </div>
                                    </td>
                                    <td>$${item.sellPrice*item.quantity}</td>
                                    <td class="text-center">
                                        <a href="#" class="" data-bs-toggle="modal" data-bs-target="#removeModal" data-id="${item.productID}">
                                            <i class="fas fa-times" style="color: red"></i>
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    <div class="col-12">
                        <div class="others_gane_btn text-center">
                            <a class="btn btn-link" href="checkout">Checkout </a>
                        </div>
                    </div>
                </c:when>
                <c:when test="${cartDetails.size() == 0}">
                    <div style="font-size: 200%; text-align: center">
                        <div style="margin-bottom: 20px">Sorry you don't have items in your cart :((</div>
                        <div>Please visit Game Page for more items <3</div>               
                    </div>
                </c:when>
            </c:choose>
        </div>

        <!-- page wrapper end -->


        <!-- Remove Modal -->     
        <div class="modal fade" id="removeModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" style="color: black" id="exampleModalLongTitle">Are you sure Remove?</h5>
                    </div>
                    <form method="post" action="cart">
                        <div class="modal-body">
                            <div class="container" style="color: black" >
                                Select "Remove" below if you are sure to remove this product.
                            </div>
                            <input type="hidden" name="id" id="id">
                        </div>
                        <div class="modal-footer">
                            <button class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-danger">Remove</button>
                        </div>
                    </form>

                </div>
            </div>
        </div>

        <%@include file="layout/footer.jsp" %>
        <!-- JS
============================================ -->
        <!--modernizr min js here-->
        <script src="assets/js/vendor/modernizr-3.7.1.min.js"></script>

        <!-- Vendor JS -->
        <script src="assets/js/vendor/jquery-3.6.0.min.js"></script>
        <script src="assets/js/vendor/jquery-migrate-3.3.2.min.js"></script>
        <script src="assets/js/vendor/popper.js"></script>
        <script src="assets/js/vendor/bootstrap.min.js"></script>
        <script src="assets/js/slick.min.js"></script>
        <script src="assets/js/wow.min.js"></script>
        <script src="assets/js/jquery.nice-select.js"></script>
        <script src="assets/js/jquery.magnific-popup.min.js"></script>
        <script src="assets/js/jquery.counterup.min.js"></script>
        <script src="assets/js/jquery-waypoints.js"></script>

        <!-- Main JS -->
        <script src="assets/js/main.js"></script>

        <script src="https://kit.fontawesome.com/228aa84c51.js" crossorigin="anonymous"></script>

        <script>
            $('#removeModal').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget); // Button that triggered the modal
                var id = button.data('id');
                console.log(id);
                var modal = $(this);
                modal.find('.modal-dialog .modal-content .modal-body #id').val(id);
            });
        </script>
        <script>
            $(document).ready(function () {
                $(".toast").toast("show");
            });
        </script>
        <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
    </body>
</html>
