<%-- 
    Document   : resetPassword
    Created on : Apr 14, 2022, 3:56:39 PM
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
                            <h1>Reset Password</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="index.html">Home </a></li>
                                <li> <span>//</span></li>
                                <li>  PAGES</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumbs area end -->
        <!-- page wrapper start -->
        <div class="page_wrapper">

            <!-- contact section start -->
            <section class="contact_page_section mb-140">
                <div class="container">
                    <div class="row justify-content-between align-items-center mb-n50">
                        <div class="col-lg-6 col-md-8 col-12 mx-auto mb-50">
                            <img width="550" height="550" src="assets/img/others/about-thumb.webp" alt="">
                        </div>
                        <div class="col-lg-5 col-md-8 col-12 mx-auto mb-50">
                            <div class="section_title text-center mb-60">
                                <h2>Reset password</h2>
                            </div>
                            <div class="form_input">
                                <input name="login_email" placeholder="Email" type="email" value="admin@gmail.com" disabled="true">
                            </div>
                            <div class="form_input">
                                <input name="login_password" placeholder="New password" type="password">
                            </div>
                            <div class="form_input">
                                <input name="login_password" placeholder="Retype new password" type="password">
                            </div>
                            
                            <div class="form_input_btn text-center mb-40">
                                <button type="submit" class="btn btn-link">Change<img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""></button>
                            </div>
                            <p class="text-center">Remembered password, <a href="${pageContext.request.contextPath}/signin">Login here</a></p>
                        </div>
                    </div>
                </div>
            </section>
            <!-- contact section end -->

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