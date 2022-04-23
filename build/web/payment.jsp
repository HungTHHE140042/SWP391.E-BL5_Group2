<%-- 
    Document   : payment
    Created on : Apr 17, 2022, 6:45:06 PM
    Author     : trinh
--%>

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

        <%@include file="layout/header.jsp" %>

        <!-- breadcrumbs area start -->
        <div class="breadcrumbs_aree breadcrumbs_bg" data-bgimg="assets/img/bg/breadcrumbs-bg.webp">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="breadcrumbs_text text-center">
                            <h1>Payment</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="home">Home </a></li>
                                <li> <span>//</span></li>
                                <li>  Payment </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumbs area end -->

        <!-- page wrapper start -->
        <div class="page_wrapper container mb-100">
            <section class="h-200 h-custom mb-25">
                <div class="container py-5 h-100">
                    <div class="row d-flex justify-content-center align-items-center h-100">
                        <div class="col-lg-8 col-xl-6">
                            <div class="card border-top border-bottom border-3" style="border-color: #B053EF !important;">
                                <div class="card-body p-5">

                                    <p class="lead fw-bold mb-5" style="color: #B053EF;">Payment Information</p>

                                    <div class="row">
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Order ID:</p>
                                            <p style="color: black">#541</p>
                                        </div>
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">User ID:</p>
                                            <p style="color: black">#12</p>
                                        </div>
                                    </div>
                                    
                                    <div class="row">
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Bank:</p>
                                            <p style="color: #B053EF"><img width="40px" height="40px" src="https://lh3.googleusercontent.com/0E2CHhIwC6iCHoWU2h-Bfff7CFUsVm5XCrfEFM1VYrC8ZZGQ85KtoFYVdwSc6XjWpcs"> <span style="font-size: 20px"><b>TP</b>Bank - Ngân hàng Tiên Phong</span></p>
                                        </div>
                                    </div>
                                    
                                    <div class="row">
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Name:</p>
                                            <p style="color: black">Games Shop</p>
                                        </div>
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Number:</p>
                                            <p style="color: black" class="form-control">593417123913236</p>
                                        </div>
                                    </div>
                                    
                                    <div class="row">
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Content:</p>
                                            <p style="color: black" class="form-control">541</p>
                                        </div>
                                    </div>
                                    
                                    <div class="row">
                                        <div class="col mb-3">
                                            <p class="small text-muted mb-1">Money to be paid:</p>
                                            <p style="color: black" class="form-control">$262.99</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <div class="col-12">
                <div class="others_gane_btn text-center">
                    <a class="btn btn-link" href="order-history">Done </a>
                </div>
            </div>
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
    </body>
</html>
