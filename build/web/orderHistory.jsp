<%-- 
    Document   : orderHistory
    Created on : Apr 14, 2022, 8:10:47 PM
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

        <!--        <link rel="stylesheet" href="assets/css/vendor/bootstrap.min.css">-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/icofont.min.css">
        <link rel="stylesheet" href="assets/css/animate.css">
        <link rel="stylesheet" href="assets/css/nice-select.css">
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <!-- Main Style CSS -->
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/table.css">

    </head>
    <body class="body__bg" data-bgimg="assets/img/bg/body-bg.webp">

        <%@include file="layout/header.jsp" %>

        <!-- breadcrumbs area start -->
        <div class="breadcrumbs_aree breadcrumbs_bg mb-140" data-bgimg="assets/img/bg/breadcrumbs-bg.webp">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="breadcrumbs_text text-center">
                            <h1>Order history</h1>
                            <ul class="d-flex justify-content-center">
                                <li><a href="home">Home </a></li>
                                <li> <span>//</span></li>
                                <li>  Order History </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- breadcrumbs area end -->

        <!-- page wrapper start -->
        <div class="page_wrapper container mb-100">
            <table class="cart-table cart-table-rouned table table-light table-hover mb-25 ">
                <thead>
                    <tr class="">
                        <th scope="col">#</th>
                        <th scope="col">Date</th>
                        <th scope="col">Total</th>
                        <th scope="col">Promotion Code</th>
                        <th scope="col">Note</th>
                        <th class="" scope="col">
                            <div class="text-center">
                                Status
                            </div>
                        </th>
                        <th class="col-2" scope="col">
                            <div class="text-center">
                                Action
                            </div>
                        </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listOrder}" var="order">
                        <tr>
                            <th scope="row">${order.id}</th>
                            <td>${order.date}</td>
                            <td>${order.total}</td>
                            <td>${order.promotionCode}</td>
                            <td>${order.note}</td>
                            <td class="text-center">
                                <c:if test="${order.status == 1}">
                                    <div class="btn btn-secondary">Pending</div>
                                </c:if>
                                <c:if test="${order.status == 2}">
                                    <div class="btn btn-success">Accepted</div>
                                </c:if>
                                <c:if test="${order.status == 3}">
                                    <div class="btn btn-danger">Rejected</div>
                                </c:if>
                                <c:if test="${order.status == 4}">
                                    <div class="btn btn-warning">Canceled</div>
                                </c:if>
                            </td>
                            <td class="text-center">
                                <a href="order-detail?id=${order.id}" type="button" class="btn btn-outline-primary">Detail</a>
                                <c:if test="${order.status == 1}">
                                    <a href="#" type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#cancelModal" data-id="${order.id}">Cancel</a>
                                </c:if>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>

        <!-- Cancel Modal -->
        <div class="modal fade" id="cancelModal" tabindex="-10" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" style="color: black" id="exampleModalLongTitle">Are you sure Cancel?</h5>
                    </div>
                    <form method="post" action="">
                        <div class="modal-body">
                            <div class="container" style="color: black" >
                                Select "Cancel" below if you are sure to cancel this order.
                            </div>
                            <input type="hidden" name="idCancel" id="idCancel">
                        </div>
                        <div class="modal-footer">
                            <a class="btn btn-secondary" data-bs-dismiss="modal">Close</a>
                            <button type="submit" class="btn btn-danger">Cancel</button>
                        </div>
                    </form>
                </div>
            </div>
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

        <script src="https://kit.fontawesome.com/228aa84c51.js" crossorigin="anonymous"></script>
        <script>
            $('#cancelModal').on('show.bs.modal', function (event) {
                var button = $(event.relatedTarget); // Button that triggered the modal
                var id = button.data('id');
                var modal = $(this);
                modal.find('.modal-dialog .modal-content .modal-body #idCancel').val(id);
            });
        </script>
    </body>
</html>
