<%-- 
    Document   : homepage
    Created on : Apr 12, 2022, 8:33:15 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

        <c:choose>
            <c:when test="${u != null}">
                <%@include file="layout/headerLoged.jsp" %>
            </c:when>
            <c:otherwise>
                <%@include file="layout/header.jsp" %>
            </c:otherwise>
        </c:choose>


        <!-- page wrapper start -->
        <div class="page_wrapper">

            <!--slide banner section start-->
            <section class="hero_banner_section d-flex align-items-center mb-130" data-bgimg="">
                <div class="container">
                    <div class="hero_banner_inner">
                        <div class="row align-items-center">
                            <div class="col-12">
                                <div class="hero_content">
                                    <h1 class="wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">Newest Game <br>
                                        Selling Today.</h1>
                                    <p class="wow fadeInUp" data-wow-delay="0.2s" data-wow-duration="1.2s">Simply text of the printing and typesetting industry.</p>
                                    <a class="btn btn-link wow fadeInUp" data-wow-delay="0.3s" data-wow-duration="1.3s" href="product-details">Buy now <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                </div>
                            </div>
                        </div>
                    </div>    
                </div>
                <div class="hero_position_img">
                    <img width="926" height="772" src="assets/img/player/list/player-1.webp" alt="">
                </div>
            </section>
            <!--slider area end-->
            <section>
                <div class="container">
                    <div class="row">
                        <div class="col-11">
                            <div class="form_input">
                                <input placeholder="Search your Game" type="text">
                            </div>
                        </div>
                        <div class="col-1">
                            <button class="btn btn-primary" style="height: 62px">SEARCH</button>
                        </div>
                    </div>
                </div>
            </section>
            <!-- gaming  world section start -->
            <section class="gaming_world_section mb-140">
                <div class="container">
                    <div class="section_title text-center wow fadeInUp mb-60" data-wow-delay="0.1s" data-wow-duration="1.1s">
                        <h2>Top Discount game</h2>
                    </div>
                    <div class="gaming_world_inner">
                        <div class="row">
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <div class="single_gaming_world wow fadeInUp" data-bgimg="assets/img/others/gaming-world-bg1.webp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                    <div class="gaming_world_thumb">
                                        <img width="156px" height="156px" src="assets/img/others/gaming-world1.webp" alt="">
                                    </div>
                                    <div class="gaming_world_text">
                                        <div style="height: 100px">
                                            <h3><a href="#">PlayerUnknown's Battlegrounds</a></h3>
                                        </div>
                                        <div class="row">
                                            <div class="col-6" style="font-size:20px; color:gray; text-decoration-line:line-through;">$100</div>
                                            <div class="col-6 btn-danger">-70%</div>
                                        </div>
                                        <p>
                                        <div class="btn-success" style="font-size: 25px">$25</div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <div class="single_gaming_world wow fadeInUp" data-bgimg="assets/img/others/gaming-world-bg2.webp" data-wow-delay="0.2s" data-wow-duration="1.2s">
                                    <div class="gaming_world_thumb">
                                        <img width="156px" height="156px" src="assets/img/others/gaming-world2.webp" alt="">
                                    </div>
                                    <div class="gaming_world_text">
                                        <div style="height: 100px">
                                            <h3><a href="#">League of Legends</a></h3>
                                        </div>
                                        <div class="row">
                                            <div class="col-6" style="font-size:20px; color:gray; text-decoration-line:line-through;">$300</div>
                                            <div class="col-6 btn-danger">-50%</div>
                                        </div>
                                        <p>
                                        <div class="btn-success" style="font-size: 25px">$115</div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-4 col-sm-6">
                                <div class="single_gaming_world wow fadeInUp" data-bgimg="assets/img/others/gaming-world-bg3.webp" data-wow-delay="0.3s" data-wow-duration="1.3s">
                                    <div class="gaming_world_thumb">
                                        <img width="156px" height="156px" src="assets/img/others/gaming-world3.webp" alt="">
                                    </div>
                                    <div class="gaming_world_text">
                                        <div style="height: 100px">
                                            <h3><a href="#">Counter-Strike: Global Offensive</a></h3>
                                        </div>
                                        <div class="row">
                                            <div class="col-6" style="font-size:20px; color:gray; text-decoration-line:line-through;">$200</div>
                                            <div class="col-6 btn-danger">-50%</div>
                                        </div>
                                        <p>
                                        <div class="btn-success" style="font-size: 25px">$100</div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- gaming  world section end -->

            <!-- counterup section start -->
            <section class="counterup_section mb-115 wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="counterup_inner d-flex justify-content-center">
                                <div class="single_counterup one">
                                    <div class="counterup_text">
                                        <h2 class="counterup color1">8697</h2>
                                        <span>CUSTOMER</span>
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
                                        <span>SOLD</span>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- counterup section end -->

            <!-- popular gaming  section start -->
            <section class="popular_gaming_section mb-140">
                <div class="container">
                    <div class="section_title text-center wow fadeInUp mb-60" data-wow-delay="0.1s" data-wow-duration="1.1s">
                        <h2>Popular GAME</h2>
                        <p>When unknown printer took type and scrambled it to make <br>
                            type specimen book centuries,</p>
                    </div>
                    <div class="popular_gaming_inner wow fadeInUp" data-wow-delay="0.2s" data-wow-duration="1.2s">
                        <div class="row">
                            <div class="col-lg-6 col-md-6">
                                <div class="popular_gaming_thumb">
                                    <a href="#"><img width="570px" height="330px" src="assets/img/others/popular-game-thumb1.webp" alt=""></a>
                                    <div class="gaming_details_btn">
                                        <a class="btn btn-link" href="game-details.html">Game Details <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6">
                                <div class="popular_gaming_thumb">
                                    <a href="#"><img width="570px" height="330px" src="assets/img/others/popular-game-thumb2.webp" alt=""></a>
                                    <div class="gaming_details_btn">
                                        <a class="btn btn-link" href="game-details.html">Game Details <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6">
                                <div class="popular_gaming_thumb">
                                    <a href="#"><img width="570px" height="330px" src="assets/img/others/popular-game-thumb3.webp" alt=""></a>
                                    <div class="gaming_details_btn">
                                        <a class="btn btn-link" href="game-details.html">Game Details <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-6 col-md-6">
                                <div class="popular_gaming_thumb">
                                    <a href="#"><img width="570px" height="330px" src="assets/img/others/popular-game-thumb4.webp" alt=""></a>
                                    <div class="gaming_details_btn">
                                        <a class="btn btn-link" href="game-details.html">Game Details <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- popular gaming section end -->

            <!-- testimonial section start -->
            <section class="testimonial_section wow fadeInUp" data-bgimg="assets/img/others/testimonial-bg-fullwidth.webp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="section_title mb-60">
                                <h2>What people’s say <br>
                                    ABOUT <span>game studio.</span></h2>
                            </div>
                            <div class="testimonial_inner slick__activation slick_navigation" data-slick='{
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
                                 }' data-bgimg="assets/img/others/testimonial-bg.webp">
                                <div class="testimonial_list d-flex align-items-center">
                                    <div class="testimonial_thumb">
                                        <img width="270" height="319" src="assets/img/others/testimonial-thumb.webp" alt="">
                                    </div>
                                    <div class="testimonial_content">
                                        <div class="testimonial_desc">
                                            <p>It is a long established fact that a reader will be distracted the
                                                readable content of page when looking at it layout the point using
                                                lorem Ipsum is that it has a more-or-less normal distribution lette
                                                as opposed to using making it look like readable english,
                                                many desktop publishing packages and web page now editors.</p>
                                        </div>
                                        <div class="testimonial_author">
                                            <h3>Randolph Frazier</h3>
                                            <span>Top Rated Gamer</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="testimonial_list d-flex align-items-center">
                                    <div class="testimonial_thumb">
                                        <img width="270" height="319" src="assets/img/others/testimonial-thumb.webp" alt="">
                                    </div>
                                    <div class="testimonial_content">
                                        <div class="testimonial_desc">
                                            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Natus quos consectetur amet blanditiis, facilis esse illo unde saepe facere dolore porro asperiores ducimus, inventore voluptate doloribus odio fugit magnam voluptatum perferendis? Sit quisquam labore adipisci doloremque! Aperiam voluptate modi quasi are nobis.</p>
                                        </div>
                                        <div class="testimonial_author">
                                            <h3>Roar Spring</h3>
                                            <span>Top Rated Gamer</span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- testimonial section end -->

            <!-- blog section start -->
            <section class="blog_section mb-90">
                <div class="container">
                    <div class="section_title text-center wow fadeInUp mb-70" data-wow-delay="0.1s" data-wow-duration="1.1s">
                        <h2>Latest Post</h2>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod <br> tempor incididunt ut labore et dolore magna</p>
                    </div>
                    <div class="row blog_inner">
                        <div class="col-lg-6">
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200px" height="200px" src="assets/img/blog/blog1.webp" alt=""></a>
                                </div>
                                <div class="blog_content">
                                    <div class="blog_date">
                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                    </div>
                                    <h3><a href="blog-details.html">if you have seen Apple's
                                            recent jabs.</a></h3>
                                    <a href="blog-details.html">READ MORE</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200px" height="200px" src="assets/img/blog/blog2.webp" alt=""></a>
                                </div>
                                <div class="blog_content">
                                    <div class="blog_date">
                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                    </div>
                                    <h3><a href="blog-details.html">Lorem ipsum dolor sit amet, adipisicing elit.</a></h3>
                                    <a href="blog-details.html">READ MORE</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200px" height="200px" src="assets/img/blog/blog3.webp" alt=""></a>
                                </div>
                                <div class="blog_content">
                                    <div class="blog_date">
                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                    </div>
                                    <h3><a href="blog-details.html"> Perferendis hic sint are rem, incidunt vitae.</a></h3>
                                    <a href="blog-details.html">READ MORE</a>
                                </div>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200" height="200" src="assets/img/blog/blog4.webp" alt=""></a>
                                </div>
                                <div class="blog_content">
                                    <div class="blog_date">
                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                    </div>
                                    <h3><a href="blog-details.html">if you have seen Apple's
                                            recent jabs.</a></h3>
                                    <a href="blog-details.html">READ MORE</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- blog section end -->

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
