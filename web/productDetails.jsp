<%-- 
    Document   : productDetails
    Created on : Apr 12, 2022, 10:03:52 PM
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
                        <h1>Game details</h1>
                        <ul class="d-flex justify-content-center">
                            <li><a href="index.html">Home </a></li>
                            <li> <span>//</span></li>
                            <li>  Game</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- breadcrumbs area end -->
    
    <!-- page wrapper start -->
    <div class="page_wrapper">

        <!--game details section area start-->
        <section class="game_details_section mb-125">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="game_details_inner">
                            <div class="game_details_content top">
                                <span>BONX Digital Game Studio</span>
                                <h2 class="game_details_title">din saurs - Hunter Sniper Shooter</h2>
                                <div class="game_details_desc">
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                        when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                        typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more
                                        recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                        when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                        recently with desktop publishing software like including versions.</p>
                                </div>
                            </div>
                            <div class="game_details_thumb_inner slick__activation slick_navigation" data-slick='{
                                "slidesToShow": 1,
                                "slidesToScroll": 1,
                                "arrows": true,
                                "dots": false,
                                "autoplay": false,
                                "speed": 300,
                                "infinite": true ,  
                                "responsive":[  
                                {"breakpoint":576, "settings": { "slidesToShow": 1 } }  
                                ]                                                     
                            }'>
                                <div class="game_details_thumb">
                                    <img width="1170" height="540" src="assets/img/others/game-details-thumb.webp" alt="">
                                </div>
                                <div class="game_details_thumb">
                                    <img width="1170" height="540" src="assets/img/others/game-details-thumb.webp" alt="">
                                </div>
                            </div>
                            <div class="start_now_btn">
                                <a class="btn btn-link" href="game-details.html">START NOW <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                            </div>

                            <div class="game_details_content bottom">
                                <div class="game_details_content_step">
                                    <h2>Description:</h2>
                                    <div class="game_details_desc">
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more
                                            recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more
                                            recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            recently with desktop publishing software like including versions.</p>       
                                    </div>
                                </div>
                                <div class="game_details_content_step">
                                    <h2>features:</h2>
                                    <div class="game_details_desc">
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more
                                            recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more
                                            recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>     
                                    </div>
                                </div>
                                <div class="game_details_content_step">
                                    <h2 class="color2">what’s new!</h2>
                                    <div class="game_details_desc">
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more
                                            recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                                        <p class="game_details_desc_style2">Lorem Ipsum is simply dummy text of the printing and typesetting industry has been the
                                            industry's standard dummy text ever since the 1500 printer took galley of type scrambled
                                            it to make a type specimen book.</p>   
                                    </div>
                                </div>
                                <div class="gam_additional_information">
                                    <h3 class="additional_information_title">Additional Information:</h3>
                                    <div class="gam_additional_inner d-flex ">
                                        <div class="additional_information_text">
                                            <h4>Updated:</h4>
                                            <span>February 25, 2021</span>
                                        </div>
                                        <div class="additional_information_text">
                                            <h4>Size:</h4>
                                            <span>98MB</span>
                                        </div>
                                        <div class="additional_information_text">
                                            <h4>Installs:</h4>
                                            <span>80,000,000+</span>
                                        </div>
                                        <div class="additional_information_text">
                                            <h4>Current version:</h4>
                                            <span>03.00.28.00.00</span>
                                        </div>
                                        <div class="additional_information_text">
                                            <h4>In-app products</h4>
                                            <span>$0.85 - $985.00</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="game_details_content_step">
                                    <div class="game_details_desc">
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more
                                            recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</p>
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500
                                            when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap electro
                                            recently with desktop publishing software like including versions.</p>   
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="blog_comment_wrapper match_details_comment">
                            <div class="comments_box">
                                <div class="comments_title">
                                    <h2>Review:</h2>
                                </div>
                                <div class="comment_list d-flex">
                                    <div class="comment_thumb">
                                        <img width="100" height="100" src="assets/img/blog/post-comment1.webp" alt="">
                                    </div>
                                    <div class="comment_content">
                                        <a href="#"> <img width="50" height="50" src="assets/img/others/dot-button.webp" alt=""> </a>
                                        <h3>Randolph Frazier</h3>
                                        <div class="game__review d-flex align-items-center">
                                            <ul class="d-flex">
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                            </ul>
                                            <span> 28 January, 2021</span>
                                        </div>
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem sum has been 
                                            unknown printer took a galley of type and scrambled it to make a type specimen book. It has surv
                                            with desktop publishing software like including versions.</p>
                                    </div>
                                </div>
                                <div class="comment_list d-flex">
                                    <div class="comment_thumb">
                                        <img width="100" height="100" src="assets/img/blog/post-comment2.webp" alt="">
                                    </div>
                                    <div class="comment_content">
                                        <a href="#"> <img width="50" height="50" src="assets/img/others/dot-button.webp" alt=""> </a>
                                        <h3>Kenia Bumgarner</h3>
                                        <div class="game__review d-flex align-items-center">
                                            <ul class="d-flex">
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                                <li><a href="#"><i class="icofont-star"></i></a></li>
                                            </ul>
                                            <span> 28 January, 2021</span>
                                        </div>
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem sum has been 
                                            unknown printer took a galley of type and scrambled it to make a type specimen book. It has surv
                                            with desktop publishing software like including versions.</p>
                                    </div>
                                </div>
                            </div>
                            <div class="comments_form">
                                <div class="comments_title">
                                    <h2>Place your review:</h2>
                                </div>
                                <div class="comments_form_inner">
                                    <form action="#">
                                        <div class="row">
                                            <div class="col-lg-6 col-md-6">
                                                <div class="comments_form_input">
                                                    <input placeholder="Name *" type="text">
                                                </div>
                                            </div> 
                                            <div class="col-lg-6 col-md-6">
                                                <div class="comments_form_input">
                                                    <input placeholder="Email *" type="text">
                                                </div>
                                            </div>
                                            <div class="col-lg-6 col-md-6">
                                                <div class="comments_form_input">
                                                    <input placeholder="Address *" type="text">
                                                </div>
                                            </div>
                                            <div class="col-lg-6 col-md-6">
                                                <div class="comments_form_input">
                                                    <input placeholder="Review" type="text">
                                                </div>
                                            </div>
                                            <div class="col-12">
                                                <div class="comments_form_input">
                                                    <textarea placeholder="Write a review from here"></textarea>
                                                </div>
                                            </div> 
                                        </div>
                                        <div class="comments_submit_btn text-center">
                                            <a class="btn btn-link" href="#">SUBMIT NOW <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                        </div>
                                    </form> 
                                </div>  
                            </div>   
                        </div> 

                    </div>
                </div>
            </div>
        </section>
        <!--game details section area end-->

        <!-- counterup section start -->
        <section class="counterup_section mb-130">
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
