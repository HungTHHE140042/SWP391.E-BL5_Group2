<%-- 
    Document   : blogDetails
    Created on : Apr 12, 2022, 10:08:46 PM
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
                        <h1>Post DETAIL</h1>
                        <ul class="d-flex justify-content-center">
                            <li><a href="home">Home </a></li>
                            <li> <span>//</span></li>
                            <li><a href="post">Post </a></li>
                            <li> <span>//</span></li>
                            <li> Detail</li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- breadcrumbs area end -->
    
    <!-- page wrapper start -->
    <div class="page_wrapper">

        <!--blog body area start-->
        <section class="blog_details_section mb-130">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="blog_details_inner">
                            <div class="blog_details_header text-center">
                                <div class="blog__meta_date">
                                    <ul class="d-flex justify-content-center">
                                        <li><span>By</span> Harold Leonard   </li>
                                        <li> 03 April, 21  </li>
                                    </ul>
                                </div>
                                <div class="blog_details_title">
                                    <h2>How to Start a Video Game from
                                        mobile & computer.</h2>
                                </div>
                            </div>
                            <div class="blog_sticky_thumb">
                                <img width="1170px" height="550px" src="assets/img/blog/blog-sticky.webp" alt="">
                            </div>
                            <div class="blog_details_content ">
                                <div class="blog_details_content_step">
                                    <h3 class="title_margin">Make your store stand out from the others by converting more
                                        shoppers into buyers!</h3>
                                    <div class="blog_details_desc">   
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry has been industry standard dummy text ever since the
                                            a galley of type and scrambe make type specimen book has survived not only five centuries text of the printing and typesetin indust
                                            standard dummy text ever since the 1500s, when an unknown printer.</p> 
                                        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy
                                            ever since the 1500s, when an unknown printer took a galley of type and scirambled it to make a type specimen book. It has survived
                                            only five centuries, but also the leap into electronic typesetting, remaining the essentially unchanged. It was popularised in the 1960s
                                            the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing crambled it to make
                                            specimen book. It has survived nots only five centuries, but also the leap into.</p>  
                                    </div> 
                                </div>
                                
                                <div class="post__social d-flex justify-content-between align-items-center">
                                    <h3>Share this article:</h3>
                                    <ul class="d-flex">
                                        <li><a href="https://www.facebook.com"><i class="icofont-facebook"></i></a></li>
                                        <li><a href="https://www.skype.com"><i class="icofont-skype"></i></a></li>
                                        <li><a href="https://twitter.com"><i class="icofont-twitter"></i></a></li>
                                        <li><a href="https://www.linkedin.com"><i class="icofont-linkedin"></i></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="blog_like_area" data-bgimg="assets/img/blog/blog-like-bg.webp">
                <div class="container">
                    <div class="blog_like_title">
                        <h2>You may also like</h2>
                    </div>
                    <div class="blog_like_inner slick__activation2" data-slick='{
                        "slidesToShow": 2,
                        "slidesToScroll": 1,
                        "arrows": true,
                        "dots": false,
                        "autoplay": false,
                        "speed": 300,
                        "infinite": true ,  
                        "responsive":[  
                        {"breakpoint":992, "settings": { "slidesToShow": 1 } },  
                        {"breakpoint":576, "settings": { "slidesToShow": 1 } }  
                        ]                                                     
                    }'>
                        <div class="blog_like_list">
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200" height="200" src="assets/img/blog/blog1.webp" alt=""></a>
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
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200" height="200" src="assets/img/blog/blog3.webp" alt=""></a>
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
                        <div class="blog_like_list">
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200" height="200" src="assets/img/blog/blog2.webp" alt=""></a>
                                </div>
                                <div class="blog_content">
                                    <div class="blog_date">
                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                    </div>
                                    <h3><a href="blog-details.html">Lorem ipsum dolor sit amet, adipisicing elit.</a></h3>
                                    <a href="blog-details.html">READ MORE</a>
                                </div>
                            </div>
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
                        <div class="blog_like_list">
                            <div class="single_blog d-flex align-items-center wow fadeInUp" data-wow-delay="0.1s" data-wow-duration="1.1s">
                                <div class="blog_thumb">
                                    <a href="blog-details.html"><img width="200" height="200" src="assets/img/blog/blog2.webp" alt=""></a>
                                </div>
                                <div class="blog_content">
                                    <div class="blog_date">
                                        <span><i class="icofont-calendar"></i>  20 January 2021</span>
                                    </div>
                                    <h3><a href="blog-details.html">Lorem ipsum dolor sit amet, adipisicing elit.</a></h3>
                                    <a href="blog-details.html">READ MORE</a>
                                </div>
                            </div>
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
            </div>
        </section>
        <!--blog section area end-->

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
