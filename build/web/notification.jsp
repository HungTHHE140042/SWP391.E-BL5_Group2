<%-- 
    Document   : notification
    Created on : Apr 15, 2022, 7:46:53 PM
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

        <link rel="stylesheet" href="assets/css/vendor/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/icofont.min.css">
        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/nice-select.css">
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <!-- Main Style CSS -->
        <link rel="stylesheet" href="assets/css/style.css">

    </head>
    <body class="body__bg" data-bgimg="assets/img/bg/body-bg.webp">
        <%@include file="layout/header.jsp" %>

        <!-- breadcrumbs area start -->
        <div class="breadcrumbs_aree breadcrumbs_bg mb-140" data-bgimg="assets/img/bg/breadcrumbs-bg.webp">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="breadcrumbs_text text-center">
                            <h1>Notifications</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="home">Home </a></li>
                                <li> <span>//</span></li>
                                <li>  Notifications</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumbs area end -->

        <!-- page wrapper start -->
        <div class="page_wrapper">

            <!-- faq page section start -->
            <section class="faq_page_section mb-140">
                <div class="container">
                    <div class="faq_page_inner mb-25">
                        <div class="accordion" id="accordionExample">
                            <div class="faq_question_list">
                                <div class="row" style="color: white">
                                    <div class="col-10">
                                        <h4 class="questions__title accordion-header" id="headingOne">
                                            <a class="" type="button" href="notification-detail">
                                                <img style="margin-right: 10px" width="15" height="15" src="assets/img/icon/blue-circle.png">
                                                <span style="font-weight: bold">We will sale-off all games in the next month.</span>
                                            </a>
                                        </h4>
                                    </div>
                                    <div class="col-2 text-center">
                                        April 15, 2022
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="faq_page_inner mb-25">
                        <div class="accordion" id="accordionExample">
                            <div class="faq_question_list">
                                <div class="row" style="color: gray">
                                    <div class="col-10">
                                        <h4 class="questions__title accordion-header" id="headingOne">
                                            <a class="" type="button" href="notification-detail">
                                                Your order #5815 had accepted.
                                            </a>
                                        </h4>
                                    </div>
                                    <div class="col-2 text-center">
                                        April 15, 2022
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
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
    </body>
</html>
