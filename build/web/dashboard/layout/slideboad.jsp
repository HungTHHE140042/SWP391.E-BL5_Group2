<!-- Sidebar -->
<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

    <!-- Sidebar - Brand -->
    <a class="sidebar-brand d-flex align-items-center justify-content-center" href="cms" style="color: yellow">
        <c:if test="${numberClickDashBoard == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-fw fa-tachometer-alt"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                Dashboard
            </div>
        </c:if>
        <c:if test="${numberClickAccount == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-user"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                Accounts
            </div>
        </c:if>
        <c:if test="${numberClickProduct == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-gamepad"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                Products
            </div>
        </c:if>
        <c:if test="${numberPromotionClick == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-ticket-alt"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                Promotion
            </div>
        </c:if>
        <c:if test="${numberOrderClick == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-shopping-cart"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                Orders
            </div>
        </c:if>
        <c:if test="${numberPostClick == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-file"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                Posts
            </div>
        </c:if>
        <c:if test="${numberFAQClick == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-question-circle"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                FAQs
            </div>
        </c:if>
        <c:if test="${numberNotificationClick == 1}">
            <div class="sidebar-brand-icon rotate-n-15">
                <i class="fas fa-bell"></i>
            </div>
            <div class="sidebar-brand-text mx-3">
                Notifications
            </div>
        </c:if>
    </a>

    <!-- Divider -->
    <hr class="sidebar-divider my-0">

    <!-- Nav Item - Dashboard -->
    <li class="${numberClickDashBoard == 1 ? "nav-item active":"nav-item"}">
        <a class="nav-link" href="cms">
            <i class="fas fa-fw fa-tachometer-alt"></i>
            <span>Dashboard</span></a>
    </li>

    <!-- Divider -->
    <hr class="sidebar-divider">

    <!-- Heading -->
    <c:if test="${sessionScope.user.roleId == 1}">
        <div class="sidebar-heading">
            Admin
        </div>

        <li class="${numberClickAccount == 1 ? "nav-item active":"nav-item"}">
            <a class="nav-link" href="dashboard-account">
                <i class="fas fa-user"></i>
                <span>Accounts</span></a>
        </li>

        <!-- Divider -->
        <hr class="sidebar-divider">
    </c:if>
    <!-- Heading -->
    <c:if test="${(sessionScope.user.roleId == 1) or (sessionScope.user.roleId == 2)}">
        <div class="sidebar-heading">
            Seller
        </div>

        <li class="${numberClickProduct == 1 ? "nav-item active":"nav-item"}">
            <a class="nav-link" href="dashboard-product">
                <i class="fas fa-gamepad"></i>
                <span>Products</span></a>
        </li>

        <li class="${numberPromotionClick == 1 ? "nav-item active":"nav-item"}">
            <a class="nav-link" href="pomotionManager">
                <i class="fas fa-ticket-alt"></i>
                <span>Promotion</span></a>
        </li>

        <li class="${numberOrderClick == 1 ? "nav-item active":"nav-item"}">
            <a class="nav-link" href="dashboard-order">
                <i class="fas fa-shopping-cart"></i>
                <span>Orders</span></a>
        </li>
        <!-- Divider -->
        <hr class="sidebar-divider">
    </c:if>
    <c:if test="${(sessionScope.user.roleId == 1) or (sessionScope.user.roleId == 4)}">
        <!-- Heading -->
        <div class="sidebar-heading">
            Marketing
        </div>

        <li class="${numberPostClick == 1 ? "nav-item active":"nav-item"}">
            <a class="nav-link" href="dashboard-post">
                <i class="fas fa-file"></i>
                <span>Posts</span></a>
        </li>

        <li class="${numberFAQClick == 1 ? "nav-item active":"nav-item"}">
            <a class="nav-link" href="dashboard-faq">
                <i class="fas fa-question-circle"></i>
                <span>FAQs</span></a>
        </li>

        <li class="${numberNotificationClick == 1 ? "nav-item active":"nav-item"}">
            <a class="nav-link" href="dashboard-notification">
                <i class="fas fa-bell"></i>
                <span>Notifications</span></a>
        </li>
        <!-- Divider -->
        <hr class="sidebar-divider d-none d-md-block">
    </c:if>
    <!-- Sidebar Toggler (Sidebar) -->
    <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
    </div>


</ul>