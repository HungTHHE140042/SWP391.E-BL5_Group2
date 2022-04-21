<%-- 
    Document   : headerLoged
    Created on : Apr 12, 2022, 8:55:14 PM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header class="header_section header_transparent sticky-header">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="main_header d-flex justify-content-between align-items-center">
                    <div class="header_logo">
                        <a class="sticky_none" href="home"><img aria-label="logo" width="215" height="79" src="assets/img/logo/logo.webp" alt=""></a>
                    </div>
                    <!--main menu start-->
                    <div class="main_menu d-none d-lg-block"> 
                        <nav>  
                            <ul class="d-flex">
                                <li><a href="${pageContext.request.contextPath}/home">Home</a></li> 
                                <li><a href="${pageContext.request.contextPath}/product">Game</a></li>
                                <li><a href="${pageContext.request.contextPath}/post">Post</a></li>
                                <li><a href="${pageContext.request.contextPath}/faq">Faq</a></li>
<!--                                <li><a href="${pageContext.request.contextPath}/general"> General </a></li>-->
                                <li><a href="profile"><img width="15" height="15" src="assets/img/icon/user.png" style="position: absolute; left: -20px; top: 6px; margin-right: 2px;" alt="">Profile</a>
                                    <ul class="sub_menu">
                                        <li><a href="profile"><img width="15" height="15" src="assets/img/icon/settings_violet.png"> Profile</a></li>
                                        <li><a href="order-history"><img width="15" height="15" src="assets/img/icon/refresh_violet.png"> Order History</a></li>
                                        <li><a href="#"><img width="15" height="15" src="assets/img/icon/logout_violet.png"> Logout</a></li>
                                    </ul>
                                </li>
                                <li><a href="${pageContext.request.contextPath}/cms"><img width="15" height="15" src="assets/img/icon/crown.png" style="position: absolute; left: -20px; top: 6px; margin-right: 2px;" alt=""> <span style="color: yellow">Dashboard</span> </a></li>
                                <!--                                <li><a><img width="15" height="15" src="assets/img/icon/bell.png" alt=""></a>-->
                                <li><a><img width="15" height="15" src="assets/img/icon/bell_noti.png" alt=""></a>
                                    <ul class="sub_menu">
                                        <li>
                                            <a class="dropdown-item d-flex align-items-center" href="notification-detail">
                                                <div>
                                                    <div class="small text-gray-500">April 12, 2022</div>
                                                    <span class="font-weight-bold">We will sale-off all products in next month.</span>
                                                </div>
                                            </a>
                                        </li>
                                        <li>
                                            <a class="dropdown-item d-flex align-items-center" href="notification-detail">
                                                <div>
                                                    <div class="small text-gray-500">April 12, 2022</div>
                                                    Your order #5946221 had accepted.
                                                </div>
                                            </a>
                                        </li>
                                        <div class="text-center btn-secondary">
                                            <a href="notifications" style="color: white; font-size: 10px" >Show all Notifications</a>
                                        </div>
                                    </ul>
                                </li>
                            </ul>  
                        </nav>
                    </div>
                    <!--main menu end-->
                    <div class="header_right_sidebar d-flex align-items-center">
                        <div class="cart_btn">
                            <a class="btn btn-link" href="addtocart">Cart <img width="15" height="15" src="assets/img/icon/shopping-cart.png" alt=""> </a>
                        </div>
                        <div class="canvas_open">
                            <button type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasMenu"><i class="icofont-navigation-menu"></i></button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>
