<%-- 
    Document   : blog
    Created on : Apr 12, 2022, 10:07:02 PM
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
                        <h1>BLOG PAGE</h1>
                        <ul class="d-flex justify-content-center">
                            <li><a href="index.html">Home </a></li>
                            <li> <span>//</span></li>
                            <li>  Blog Grid </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- breadcrumbs area end -->

    <!-- page wrapper start -->
    <div class="page_wrapper">

        <!-- blog page section start -->
        <section class="blog_page_section mb-140">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="blog_page_wrapper">
                                <div class="blog_page_inner">
                                    <div class="row">
                                        <div class="col-lg-4 col-sm-6 col-12 mb-50">
                                            <div class="single_blog_grid d-flex flex-column">
                                                <div class="blog_thumb">
                                                    <a href="blog-details.html"><img width="376" height="376" src="assets/img/blog/blog-grid-1.webp" alt=""></a>
                                                </div>
                                                <div class="blog_content">
                                                    <div class="blog_date">
                                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                                    </div>
                                                    <h3><a href="blog-details.html">It long established fact that reader
                                                        distracted the readable.</a></h3>
                                                    <a href="blog-details.html">READ MORE</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-4 col-sm-6 col-12 mb-50">
                                            <div class="single_blog_grid d-flex flex-column">
                                                <div class="blog_thumb">
                                                    <a href="blog-details.html"><img width="376" height="376" src="assets/img/blog/blog-grid-2.webp" alt=""></a>
                                                </div>
                                                <div class="blog_content">
                                                    <div class="blog_date">
                                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                                    </div>
                                                    <h3><a href="blog-details.html">THE READABLE CONTENT OF A PAGE WHEN LOOKING AT ITS LAYOUT.</a></h3>
                                                    <a href="blog-details.html">READ MORE</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-4 col-sm-6 col-12 mb-50">
                                            <div class="single_blog_grid d-flex flex-column">
                                                <div class="blog_thumb">
                                                    <a href="blog-details.html"><img width="376" height="376" src="assets/img/blog/blog-grid-3.webp" alt=""></a>
                                                </div>
                                                <div class="blog_content">
                                                    <div class="blog_date">
                                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                                    </div>
                                                    <h3><a href="blog-details.html">THE POINT OF USING LOREM IPSUM THAT MORE-OR-LESS NORMAL</a></h3>
                                                    <a href="blog-details.html">READ MORE</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-4 col-sm-6 col-12 mb-50">
                                            <div class="single_blog_grid d-flex flex-column">
                                                <div class="blog_thumb">
                                                    <a href="blog-details.html"><img width="376" height="376" src="assets/img/blog/blog-grid-4.webp" alt=""></a>
                                                </div>
                                                <div class="blog_content">
                                                    <div class="blog_date">
                                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                                    </div>
                                                    <h3><a href="blog-details.html">DISTRIBUTION OF LETTERS, AS OPPOSED USING CONTENT HERE</a></h3>
                                                    <a href="blog-details.html">READ MORE</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-4 col-sm-6 col-12 mb-50">
                                            <div class="single_blog_grid d-flex flex-column">
                                                <div class="blog_thumb">
                                                    <a href="blog-details.html"><img width="376" height="376" src="assets/img/blog/blog-grid-5.webp" alt=""></a>
                                                </div>
                                                <div class="blog_content">
                                                    <div class="blog_date">
                                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                                    </div>
                                                    <h3><a href="blog-details.html">IT LONG ESTABLISHED FACT THAT READER DISTRACTED THE READABLE.</a></h3>
                                                    <a href="blog-details.html">READ MORE</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-lg-4 col-sm-6 col-12 mb-50">
                                            <div class="single_blog_grid d-flex flex-column">
                                                <div class="blog_thumb">
                                                    <a href="blog-details.html"><img width="376" height="376" src="assets/img/blog/blog-grid-6.webp" alt=""></a>
                                                </div>
                                                <div class="blog_content">
                                                    <div class="blog_date">
                                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                                    </div>
                                                    <h3><a href="blog-details.html">THE READABLE CONTENT OF A PAGE WHEN LOOKING AT ITS LAYOUT.</a></h3>
                                                    <a href="blog-details.html">READ MORE</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="pagination pagination_pages">
                                    <ul>
                                        <li class="current"><span>1</span></li>
                                        <li><a href="#">2</a></li>
                                        <li><a href="#">3</a></li>
                                        <li><a href="#">4</a></li>
                                        <li class="next"><a href="#"><i class="icofont-rounded-double-right"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </section>
        <!-- blog page section end -->

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
