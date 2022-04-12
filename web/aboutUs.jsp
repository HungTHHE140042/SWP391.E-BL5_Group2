<%-- 
    Document   : aboutUs
    Created on : Apr 12, 2022, 10:11:56 PM
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

        <!--offcanvas menu area start-->
        <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasMenu">
            <div class="offcanvas-header justify-content-end">
                <button type="button" class="btn-close text-reset" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
                <ul class="offcanvas_main_menu">
                    <li class="menu-item-has-children active">
                        <a href="index.html">Home</a>
                    </li>
                    <li class="menu-item-has-children"><a href="#">Match</a>
                        <ul class="sub-menu">
                            <li><a href="match.html">Match Page</a></li>
                            <li><a href="match-details.html">Match Details</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children"><a href="#">Pages</a>
                        <ul class="sub-menu">
                            <li><a href="about.html">About Us</a></li>
                            <li><a href="all-game.html">All Game</a></li>
                            <li><a href="game-details.html">Game Details</a></li>
                            <li><a href="faq.html">Faq Page</a></li>
                            <li><a href="players.html">Players</a></li>
                            <li><a href="player-details.html">Player Details</a></li>
                            <li><a href="registration.html">Sign Up</a></li>
                            <li><a href="login.html">Login</a></li>
                            <li><a href="404.html">Error 404</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children">
                        <a href="#">blog</a>
                        <ul class="sub-menu">
                            <li><a href="blog-left-sidebar.html">Blog Left Sidebar</a></li>
                            <li><a href="blog-right-sidebar.html">Blog Right Sidebar</a></li>
                            <li><a href="blog-without-sidebar.html">Blog Without Sidebar</a></li>
                            <li><a href="blog-grid-left-sidebar.html">Blog Grid Left Sidebar</a></li>
                            <li><a href="blog-grid-right-sidebar.html">Blog Grid Right Sidebar</a></li>
                            <li><a href="blog-grid-without-sidebar.html">Blog Grid Without Sidebar</a></li>
                            <li><a href="blog-details-left-sidebar.html">Blog Details Left Sidebar</a></li>
                            <li><a href="blog-details-right-sidebar.html">Blog Details Right Sidebar</a></li>
                            <li><a href="blog-details.html">Blog Details</a></li>
                        </ul>
                    </li>
                    <li class="menu-item-has-children"><a href="contact.html">Contact Us</a></li>
                </ul>
            </div>
        </div>
        <!--offcanvas menu area end-->

        <!-- breadcrumbs area start -->
        <div class="breadcrumbs_aree breadcrumbs_bg mb-140" data-bgimg="assets/img/bg/breadcrumbs-bg.webp">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="breadcrumbs_text text-center">
                            <h1>About Us</h1>
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
                    <div class="contact_info_area">
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <div class="contact_info_list left wow fadeInUp" data-bgimg="assets/img/others/gaming-world-bg1.webp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                    <div class="contact_info_thumb">
                                        <img width="115" height="115" src="assets/img/icon/email.webp" alt="">
                                    </div>
                                    <div class="contact_info_text">
                                        <h3>Email:</h3>
                                        <p>
                                            <a href="mailto:gamestudio@gmail.com">gamestudio@gmail.com</a>  <br>
                                            <a href="mailto:support24@gmail.com">support24@gmail.com</a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <div class="contact_info_list center wow fadeInUp" data-bgimg="assets/img/others/gaming-world-bg2.webp" data-wow-delay="0.2s" data-wow-duration="1.2s">
                                    <div class="contact_info_thumb">
                                        <img width="115" height="115" src="assets/img/icon/location.webp" alt="">
                                    </div>
                                    <div class="contact_info_text">
                                        <h3>Location:</h3>
                                        <p>100 N Aurora Ave #APT 19
                                            Oakland, Nebraska(NE), 68045</p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <div class="contact_info_list right wow fadeInUp" data-bgimg="assets/img/others/gaming-world-bg3.webp" data-wow-delay="0.3s" data-wow-duration="1.3s">
                                    <div class="contact_info_thumb">
                                        <img width="115" height="115" src="assets/img/icon/phone.webp" alt="">
                                    </div>
                                    <div class="contact_info_text">
                                        <h3>Phone:</h3>
                                        <p> 
                                            <a href="tel:(402)685-5964"> (402) 685-5964</a>
                                            <a href="tel:+88(00)4568457437"> +88 (00) 4568 457 437</a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>


                    <div class="contact_form_area">
                        <div class="section_title text-center mb-60">
                            <h2>GET IN TOUCH</h2>
                            <p>When unknown printer took type and scrambled it to make <br>
                                type specimen book centuries,</p>
                        </div>
                        <div class="contact_form_inner">
                            <form id="contact-form" action="assets/mail.php">
                                <div class="row">
                                    <div class="col-lg-6">
                                        <div class="form_input">
                                            <input name="con_name" placeholder="Name" type="text">
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form_input">
                                            <input name="con_email"  placeholder="E-Mail" type="text">
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form_input">
                                            <input name="con_phone"  placeholder="Phone" type="text">
                                        </div>
                                    </div>
                                    <div class="col-lg-6">
                                        <div class="form_input">
                                            <input name="con_address"  placeholder="Address" type="text">
                                        </div>
                                    </div>
                                </div>
                                <div class="form_textarea">
                                    <textarea name="con_message" placeholder="Write a review from here"></textarea>
                                </div>
                                <div class="form_input_btn text-center">
                                    <button type="submit" class="btn btn-link">SUBMIT NOW <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""></button>
                                </div>
                                <p class="form-message"></p>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
            <!-- contact section end -->

            <!--contact map start-->
            <div class="contact_map mt-70">
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d2484.6701389278105!2d-0.13442558407566274!3d51.48256882033922!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48760532743b90e1%3A0x790260718555a20c!2sU.S.%20Embassy%2C%20London!5e0!3m2!1sen!2sbd!4v1623927462716!5m2!1sen!2sbd"  style="border:0;" allowfullscreen="" loading="lazy"></iframe>
            </div>
            <!--contact map end-->

            <!-- gaming update section start -->
            <section class="gaming_update_section contact_gaming_update">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="gaming_update_inner d-flex justify-content-between align-items-center" data-bgimg="assets/img/bg/gaming-update.webp">
                                <div class="gaming_update_text">
                                    <h2>Connect with us <br>
                                        for gamING update.</h2>
                                </div>
                                <div class="gaming_update_btn">
                                    <a class="btn btn-link" href="#">CONNECT NOW <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- gaming update section end -->

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
