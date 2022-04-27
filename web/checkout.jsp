<%-- 
    Document   : orderDetail
    Created on : Apr 15, 2022, 9:55:46 AM
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
        <link rel="stylesheet" href="assets/css/orderDetails.css">

    </head>
    <body class="body__bg" data-bgimg="assets/img/bg/body-bg.webp">

        <c:if test="${sessionScope.checkPromotion.equals('1')}">
            <div class="position-fixed bottom-0 end-0 p-3" style="z-index: 11">
                <div class="toast align-items-center text-white border-0" role="alert" aria-live="assertive" aria-atomic="true" style="background-color: #851e3e" >
                    <div class="d-flex">
                        <div class="toast-body">
                            This discount code has been used or does not exist !!!
                        </div>
                        <button type="button" class="btn-close btn-close-white me-2 m-auto" data-bs-dismiss="toast" aria-label="Close"></button>
                    </div>
                </div>
            </div>
            <% session.removeAttribute("checkPromotion");%>
        </c:if>


        <%@include file="layout/header.jsp" %>

        <!-- breadcrumbs area start -->
        <div class="breadcrumbs_aree breadcrumbs_bg" data-bgimg="assets/img/bg/breadcrumbs-bg.webp">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="breadcrumbs_text text-center">
                            <h1>Checkout</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="home">Home </a></li>
                                <li> <span>//</span></li>
                                <li><a href="cart">Cart </a></li>
                                <li> <span>//</span></li>
                                <li>  Checkout </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumbs area end -->

        <!-- page wrapper start -->
        <div class="page_wrapper container mb-100">
            <section class="mb-50">
                <div class="container py-5 h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-lg-8 col-xl-6">
                            <div class="card border-top border-bottom border-3" style="border-color: #B053EF !important;">
                                <div class="card-body p-5">

                                    <p class="lead fw-bold mb-5" style="color: #B053EF;">Purchase Reciept</p>

                                    <div class="row">
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Date</p>
                                            <p style="color: black">${sessionScope.localDate}</p>
                                        </div>
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Email</p>
                                            <p style="color: black">${sessionScope.user.email}</p>
                                        </div>
                                    </div>

                                    <table class="cart-table cart-table-rouned table table-light table-hover mb-25 ">
                                        <thead>
                                            <tr class="">
                                                <th scope="col">ID Product</th>
                                                <th scope="col">Product Name</th>
                                                <th scope="col">Price</th>
                                                <th scope="col">Quantity</th>
                                                <th class="col-2" scope="col">
                                                    <div class="text-center">
                                                        Total
                                                    </div>
                                                </th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${sessionScope.cartDetails}" var="item">
                                                <tr>
                                                    <th scope="row">${item.productID}</th>
                                                    <td>${item.productName}</td>
                                                    <td>${item.sellPrice}</td>
                                                    <td>${item.quantity}</td>
                                                    <td>${item.sellPrice*item.quantity}</td>
                                                </tr>
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                    <hr>
                                    <form method="post" action="checkout">
                                        <div class="row">
                                            <div class="col-10">
                                                <input type="hidden" name="index" value="1">
                                                <c:if test="${checkPromotion != 0}">
                                                    <input class="form-control" type="text" name="promotionCode" placeholder="Promotion Code" value="${promotion.promotionCode}">
                                                </c:if>
                                                <c:if test="${checkPromotion == 0}">
                                                    <input readonly class="form-control" type="text" name="promotionCode" placeholder="Promotion Code" value="${promotion.promotionCode}">
                                                </c:if>
                                            </div>
                                            <div class="col-1">
                                                <button type="submit" class="btn btn-info">USE</button>
                                            </div>
                                        </div>
                                    </form>
                                    <hr>
                                    <p class="placeholder-wave">
                                        <span class="placeholder col-12 bg-secondary"></span>
                                    </p>
                                    <div class="row my-4">
                                        <div class="col-md-4 offset-md-8 col-lg-4 offset-lg-9">
                                            <div class="btn btn-success">                                                 
                                                <p class="lead fw-bold mb-0" style="color: white;">$${total}</p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <form action="checkout" method="post">
                <input type="hidden" name="index" value="0">
                <input name="total" type="text" value="${total}" hidden>
                <div class="col-12">
                    <div class="others_gane_btn text-center">
                        <button type="submit" class="btn btn-link" >Payment </button>
                    </div>
                </div>
            </form>
        </div>

        <!-- page wrapper end -->

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
            $(document).ready(function () {
                $(".toast").toast("show");
            });
        </script>
    </body>
</html>
