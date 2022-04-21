<%-- 
    Document   : productDetails
    Created on : Apr 12, 2022, 10:03:52 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String notifiStt = request.getParameter("notifiStt");
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
                            <h1>Game details</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="home">Home </a></li>
                                <li> <span>//</span></li>
                                <li><a href="product">Game </a></li>
                                <li> <span>//</span></li>
                                <li>  Game Detail</li>
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
                                    <h2 class="game_details_title">${product.productName}</h2>
                                </div>
                                <div class="game_details_thumb">
                                    <img width="1170" height="540" src="${product.productImgURL}" alt="">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-6">
                                    Price:
                                    <span class="" style="font-size:15px; color:gray; text-decoration-line:line-through;">$${product.originalPrice}</span>
                                    <div class="btn btn-danger">-${product.salePercent}%</div>
                                    <div class="btn btn-success" style="text-align: left; font-size: 30px">$${product.sellPrice}</div>
                                </div>
                                <div class="col-6">
                                    <div style="text-align: right;">
                                        <a class="btn btn-link" href="addtocart?productID=${product.productID}">Add to Cart <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </a>
                                    </div>
                                </div>

                            </div>

                            <div class="game_details_content bottom">
                                <div class="game_details_content_step">
                                    <h2>Description:</h2>
                                    <div class="game_details_desc">
                                        <p>${product.description}</p>      
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="blog_comment_wrapper match_details_comment mt-3">
                            <div class="comments_box">
                                <div class="comments_title">
                                    <h2>Review:</h2>
                                </div>
                                <c:forEach items="${review}" var="r">
                                    <div class="comment_list d-flex">
                                        <div class="comment_content">
                                            <h3>${r.username}</h3>
                                            <div class="game__review d-flex align-items-center">
                                                <span>${r.date}</span>
                                            </div>
                                            <p>${r.reviewDetail}</p>
                                            <input type="text" hidden name="reviewID" value=${r.reviewId}>
                                            <%-- Review Reply--%>
                                            <c:choose>
                                                <c:when test="${reviewReply != null}">
                                                    <%
                                                        int count = 0;
                                                        request.setAttribute("count", count);
                                                    %>
                                                    <c:forEach items="${reviewReply}" var="reply">
                                                        <c:choose>
                                                            <c:when test="${reply.reviewId == r.reviewId}">
                                                                <%
                                                                    count = count + 1;
                                                                    request.setAttribute("count", count);
                                                                %>
                                                                <div class="comment_list d-flex" style="background-color: #535788">
                                                                    <div class="comment_content">
                                                                        <h3>${reply.username}(${reply.roleName})</h3>
                                                                        <div class="game__review d-flex align-items-center">
                                                                            <span>${reply.date}</span>
                                                                        </div>
                                                                        <p>${reply.reviewReplyDetail}</p>
                                                                    </div>
                                                                </div>
                                                            </c:when>
                                                        </c:choose>
                                                    </c:forEach>
                                                    <c:choose>
                                                        <c:when test="${count == 0}">
                                                            <c:choose>
                                                                <c:when test="${sessionScope.user.roleId == 2 || sessionScope.user.roleId == 4}">
                                                                    <form action="addReviewReply" method="post">
                                                                        <div class="comments_form_input" >
                                                                            <input type="hidden" name="reviewID" value=${r.reviewId}>
                                                                            <input type="hidden" name="productID" value=${product.productID}>
                                                                            <textarea style="height: 100px" name="replyDetail" placeholder="Write a reply from here"></textarea>
                                                                        </div>
                                                                        <c:choose>
                                                                            <c:when test="${sessionScope.notifiReply == false}">
                                                                                <div class="row">
                                                                                    <div class="col-lg-12">
                                                                                        <div class="alert alert-danger" role="alert">
                                                                                            Please Input Your Reply!
                                                                                        </div>
                                                                                    </div>
                                                                                </div>
                                                                            </c:when>            
                                                                        </c:choose>
                                                                        <div class="comments_submit_btn text-center">
                                                                            <button class="btn btn-success" type="submit">Reply <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </button>
                                                                        </div>
                                                                    </form>
                                                                </c:when>
                                                                <c:otherwise>
                                                                </c:otherwise>
                                                            </c:choose>
                                                        </c:when>
                                                    </c:choose>
                                                </c:when>
                                            </c:choose>
                                        </div>
                                    </div>
                                </c:forEach>
                                <div class="comment_list d-flex">
                                    <div class="comment_content">
                                        <h3>S1mple</h3>
                                        <div class="game__review d-flex align-items-center">
                                            <span> 20 Apr, 2022</span>
                                        </div>
                                        <p>I love this game! Thank for purchased!...<br>It is simply dummy text of the printing and typesetting industry. Lorem sum has been 
                                            unknown printer took a galley of type and scrambled it to make a type specimen book. It has surv
                                            with desktop publishing software like including versions.</p>
                                    </div>
                                </div>
                            </div>
                            <div class="comments_form">
                                <div class="comments_form_inner">
                                    <form action="addReview" method="post">
                                        <div class="row">
                                            <div class="col-12">
                                                <div class="comments_form_input">
                                                    <input type="hidden" name="productID" value=${product.productID}>
                                                    <textarea style="height: 150px" name="reviewDetail" placeholder="Write a review from here"></textarea>
                                                </div>
                                            </div> 
                                        </div>
                                        <c:choose>
                                            <c:when test="${sessionScope.notifiStt == false}">
                                                <div class="row">
                                                    <div class="col-lg-12">
                                                        <div class="alert alert-danger" role="alert">
                                                            Please Input Your Review!
                                                        </div>
                                                    </div>
                                                </div>
                                            </c:when>            
                                        </c:choose>
                                        <div class="comments_submit_btn text-center">
                                            <button class="btn btn-link" type="submit">Comment <img width="20" height="20" src="assets/img/icon/arrrow-icon.webp" alt=""> </button>
                                        </div>
                                    </form> 
                                </div>  
                            </div>   
                        </div> 

                    </div>
                </div>
            </section>
        </div>

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
