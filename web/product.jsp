<%-- 
    Document   : product
    Created on : Apr 12, 2022, 9:35:04 PM
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
                            <h1>All bonx game</h1>
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

            <!-- popular gaming  section start -->
            <div class="gaming_page_section mb-125">
                <div class="container">
                    <div class="gaming_page_header mb-70">
                        <form action="#">
                            <div class="gaming_header_inner d-flex justify-content-between">
                                <div class="gaming_form_left d-flex">
                                    <div class="gaming_form_list">
                                        <select>
                                            <option selected value="1">Category</option>
                                            <option value="2">Category2</option>
                                            <option value="3">Category3</option>
                                            <option value="4">Category4</option>
                                        </select>
                                    </div>
                                    <div class="gaming_form_list">
                                        <select>
                                            <option selected value="1">All Platform</option>
                                            <option value="2">Platform2</option>
                                            <option value="3">Platform3</option>
                                            <option value="4">Platform4</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="gaming_form_search">
                                    <input placeholder="Search here" type="text">
                                    <button><i class="icofont-search-1"></i></button>
                                </div>
                            </div>
                        </form>
                    </div>
                    <!-- player list section start -->
                    <section class="player_list_section mb-125">
                        <div class="container">
                            <div class="row mb-n50">
                                <div class="col-lg-4 col-md-6 col-12 mb-50">
                                    <!--  Single Player List Start-->
                                    <div class="player_list_single_item wow fadeInLeft" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                        <div class="top">
                                            <a class="image" href=""><img src="assets/img/player/list/player-1.webp" alt=""></a>
                                            <div class="overlay">
                                                <div class="social-link">
                                                    <a class="btn btn-link" href="game-details.html">Add to Cart <img width="20" height="20" src="assets/img/icon/shopping-cart.png" alt=""> </a>
                                                    <!--                                                    <a href="https://www.twitch.tv" target="_blank" rel="noopener noreferrer"><i class="icofont-twitch"></i></a> 
                                                                                                        <a href="https://www.youtube.com/" target="_blank" rel="noopener noreferrer"><i class="icofont-youtube-play"></i></a> 
                                                                                                        <a href="https://twitter.com/" target="_blank" rel="noopener noreferrer"><i class="icofont-twitter"></i></a> 
                                                                                                        <a href="https://www.facebook.com/" target="_blank" rel="noopener noreferrer"><i class="icofont-facebook"></i></a> -->
                                                </div>
                                            </div>
                                        </div>
                                        <div class="content">
                                            <h4 class="title"><a href="player-details.html">PUBG</a></h4>
                                            <h5 class="level-text">100$</h5>

                                            <div class="content-shape-img">
                                                <img width="351" height="126" src="assets/img/others/tam-text-shape.webp" alt="">
                                                <img width="351" height="126" src="assets/img/others/tam-text-shape2.webp" alt="">
                                            </div>
                                        </div>

                                    </div>
                                    <!--  Single Player List End-->
                                </div>
                            </div>
                        </div>
                    </section>
                    <!-- player list section end -->
                    <div class="pagination pagination_pages pagination_margin justify-content-center">
                        <ul class="justify-content-center">
                            <li class="current"><span>1</span></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li class="next"><a href="#"><i class="icofont-rounded-double-right"></i></a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <!-- popular gaming section end -->

            <!-- counterup section start -->
            <section class="counterup_section wow fadeInUp mb-130" data-wow-delay="0.1s" data-wow-duration="1.1s">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="counterup_inner d-flex justify-content-center">
                                <div class="single_counterup one">
                                    <div class="counterup_text">
                                        <h2 class="counterup color1">8697</h2>
                                        <span>TWITCH STREAMS</span>
                                    </div>
                                </div>
                                <div class="single_counterup two">
                                    <div class="counterup_text">
                                        <h2 class="counterup color2">428</h2>
                                        <span>TOTAL GAMES</span>
                                    </div>
                                </div>
                                <div class="single_counterup three">
                                    <div class="counterup_text">
                                        <h2 class="counterup color3">5367</h2>
                                        <span>YOUTUBE STREAMS</span>
                                    </div>
                                </div>
                                <div class="single_counterup four">
                                    <div class="counterup_text">
                                        <h2 class="counterup color4">249</h2>
                                        <span>PRO TEAM</span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- counterup section end -->

            <!-- gaming update section start -->
            <section class="gaming_update_section">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="gaming_update_inner d-flex justify-content-between align-items-center" data-bgimg="assets/img/bg/gaming-update.webp">
                                <div class="gaming_update_text">
                                    <h2>Connect with us <br>
                                        for gamING update.</h2>
                                </div>
                                <div class="gaming_update_btn">
                                    <a class="btn btn-link" href="contact.html">CONNECT NOW <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
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
