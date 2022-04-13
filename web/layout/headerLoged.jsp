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
                        <a class="sticky_none" href="index.html"><img aria-label="logo" width="215" height="79" src="assets/img/logo/logo.webp" alt=""></a>
                    </div>
                    <!--main menu start-->
                    <div class="main_menu d-none d-lg-block"> 
                        <nav>  
                            <ul class="d-flex">
                                <li><a href="${pageContext.request.contextPath}/home">Home</a></li> 
                                <li><a href="${pageContext.request.contextPath}/product">Game</a></li>
                                <li><a href="${pageContext.request.contextPath}/blog">Blog</a></li>
                                <li><a href="${pageContext.request.contextPath}/faq">Faq</a></li>
                                <li><a href="${pageContext.request.contextPath}/general"> General </a></li>
                                <li><a href="${pageContext.request.contextPath}/cms"><img width="15" height="15" src="assets/img/icon/crown.png" style="position: absolute; left: -20px; top: 6px; margin-right: 2px;" alt=""> <span style="color: yellow">Dashboard</span> </a></li>
                            </ul>  
                        </nav>
                    </div>
                    <!--main menu end-->
                    <div class="header_right_sidebar d-flex align-items-center">
                        <div class="cart_btn">
                            <a class="btn btn-link" href="${pageContext.request.contextPath}/cart">Cart <img width="15" height="15" src="assets/img/icon/shopping-cart.png" alt=""> </a>
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
