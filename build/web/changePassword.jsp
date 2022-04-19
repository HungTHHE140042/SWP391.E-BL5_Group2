<%-- 
    Document   : changePassword
    Created on : Apr 19, 2022, 10:23:08 PM
    Author     : QUANG HUNG
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="entity.User"%>
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

        <!--<link rel="stylesheet" href="assets/css/vendor/bootstrap.min.css">-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
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
                            <h1>Change Password</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="index.html">Home </a></li>
                                <li> <span>//</span></li>
                                <li>  Change Password</li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumbs area end -->

        <!-- page wrapper start -->
        <div class="page_wrapper">
            <div class="container mb-100">
                <div class="contact_form_inner">
                    <form id="contact-form" action="changePassword" method="post">
                        <div class="row" style="display: none">
                            <div class="col-lg-12">
                                <div class="form_input">
                                    <input name="userId" placeholder="Username" type="text" value=${sessionScope.user.userId}>
                                </div>
                            </div>
                        </div>
                        <div>
                            Current Password
                        </div> 
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="form_input">
                                    <input name="currentpassword" placeholder="" type="password" value="">
                                </div>
                            </div>
                        </div>
                        <!--.-->
                        <div>
                            New Password
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="form_input">
                                    <input name="newpassword" placeholder="" type="password"s value="">
                                </div>
                            </div>
                        </div>
                        <!--.-->
                        <div>
                            Re-type New Password
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="form_input">
                                    <input name="repeatpassword" placeholder="" type="password" value="">
                                </div>
                            </div>
                        </div>

                        <c:choose>
                            <c:when test="${requestScope.mess1Stt == true}">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="alert alert-success" role="alert">
                                            ${requestScope.mess1}
                                        </div>
                                    </div>
                                </div>
                            </c:when>
                            <c:when test="${requestScope.mess1Stt == false}">
                                <div class="row">
                                    <div class="col-lg-12">
                                        <div class="alert alert-danger" role="alert">
                                             ${requestScope.mess1}
                                        </div>
                                    </div>
                                </div>
                            </c:when>            
                        </c:choose>            

                        <div class="form_input_btn text-center">
                            <button type="submit" class="btn btn-link">SAVE</button>
                        </div>
                    </form>
                </div>


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
