<%-- 
    Document   : header
    Created on : Apr 12, 2022, 8:30:33 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                                    <c:if test="${(sessionScope.user == null)}">              
                                    <li><a href="${pageContext.request.contextPath}/aboutus">About us</a></li>
                                    </c:if>
                                    <c:if test="${sessionScope.user != null}">
                                    <li><a href="profile"><img width="15" height="15" src="assets/img/icon/user.png" style="position: absolute; left: -20px; top: 6px; margin-right: 2px;" alt="">Profile</a>
                                        <ul class="sub_menu">
                                            <li><a href="profile"><img width="15" height="15" src="assets/img/icon/settings_violet.png"> Profile</a></li>
                                            <li><a href="changePassword"><img width="15" height="15" src="assets/img/icon/change-password.png"> Change Password</a></li>
                                            <li><a href="order-history"><img width="15" height="15" src="assets/img/icon/refresh_violet.png"> Order History</a></li>
                                            <li><a href="#" class="" data-bs-toggle="modal" data-bs-target="#logoutModal"><img width="15" height="15" src="assets/img/icon/logout_violet.png"> Logout</a></li>
                                        </ul>
                                    </li>
                                </c:if>
                                <c:if test="${(sessionScope.user != null) and (sessionScope.user.roleId != 3)}">              
                                    <li><a href="${pageContext.request.contextPath}/cms"><img width="15" height="15" src="assets/img/icon/crown.png" style="position: absolute; left: -20px; top: 6px; margin-right: 2px;" alt=""> <span style="color: yellow">Dashboard</span> </a></li>
                                        </c:if>
                                        <c:if test="${sessionScope.user != null}">
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
                                </c:if>                               
                            </ul>  
                        </nav>
                    </div>
                    <!--main menu end-->
                    <div class="header_right_sidebar d-flex align-items-center">
                        <c:if test="${sessionScope.user == null}">
                            <div class="sing_up_btn">
                                <a class="btn btn-link" href="${pageContext.request.contextPath}/signin">SIGN IN <img width="15" height="15" src="assets/img/icon/arrrow-icon2.webp" alt=""> </a>
                            </div>
                            <div class="canvas_open">
                                <button type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasMenu"><i class="icofont-navigation-menu"></i></button>
                            </div>
                        </c:if>
                        <c:if test="${sessionScope.user != null}">
                            <div class="cart_btn">
                                <a class="btn btn-link" href="${pageContext.request.contextPath}/cart">Cart <img width="15" height="15" src="assets/img/icon/shopping-cart.png" alt=""> </a>
                            </div>
                            <div class="canvas_open">
                                <button type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasMenu"><i class="icofont-navigation-menu"></i></button>
                            </div>
                        </c:if>
                    </div>
                </div>
            </div>
        </div>
    </div>

</header>
<!-- Logout Modal -->
<div class="modal fade" id="logoutModal" tabindex="-10" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" style="color: black" id="exampleModalLongTitle">Are you sure Logout?</h5>
            </div>
            <div class="modal-body">
                <div class="container" style="color: black" >
                    Select "Logout" below if you are sure to logout this account.
                </div>
            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                <a href="logout" class="btn btn-danger">Logout</a>
            </div>
        </div>
    </div>
</div>
