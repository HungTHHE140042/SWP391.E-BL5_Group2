<%-- 
    Document   : signin
    Created on : Apr 12, 2022, 9:28:04 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String error = (String)request.getAttribute("error");
%>
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
                            <h1>Login</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="home">Home </a></li>
                                <li> <span>//</span></li>
                                <li>  Login</li>
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
                            <img width="550px" height="550px" src="assets/img/others/undraw_welcome_cats.png" style="border-radius: 10px">
                        </div>
                        <div class="col-lg-5 col-md-8 col-12 mx-auto mb-50">
                            <form method="post" action="signin">
                                <div class="section_title text-center mb-60">
                                    <h2>Login</h2>
                                </div>
                                <div class="form_input">
                                    <input name="email" placeholder="Email" type="email">
                                </div>
                                <div class="form_input">
                                    <input name="password" placeholder="Password" type="password">
                                </div>
                                <c:choose>
                                    <c:when test="${error.equals('1')}">
                                        <div class="alert alert-danger" role="alert">
                                            Username or Password incorrect! <b><a href="forgot">Forgot password?</a></b>
                                        </div> 
                                    </c:when>
                                    <c:when test="${error.equals('2')}">
                                        <div class="alert alert-danger" role="alert">
                                            Your account are not active! <b>Please check your mail!</b>
                                        </div> 
                                    </c:when>
                                    <c:when test="${error.equals('3')}">
                                        <div class="alert alert-danger" role="alert">
                                            Your account had banned <b>So sorry!</b>
                                        </div> 
                                    </c:when>
                                    <c:otherwise>
                                        
                                    </c:otherwise>
                                </c:choose>
                                <div class="form_input_btn text-center mb-40">
                                    <button type="submit" class="btn btn-link">Login<img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""></button>
                                </div>
                                <p class="text-center">Don't have any account, <a href="${pageContext.request.contextPath}/signup">Signup here</a></p>
                            </form>
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
