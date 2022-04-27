/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NotificationDAO;
import dao.OrderDAO;
import dao.ProductDAO;
import dao.ProductKeyDAO;
import dao.PromotionDAO;
import dao.UserDAO;
import entity.Order;
import entity.OrderDetail;
import entity.ProductKey;
import entity.User;
import function.SendEmail;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import smtp.Email;

/**
 *
 * @author trinh
 */
public class ManagementOrderController extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        if (u != null) {
            if (u.getRoleId() == 1 || u.getRoleId() == 2) {

                OrderDAO orderDAO = new OrderDAO();
                List<Order> orders = orderDAO.getAllOrder();

                request.setAttribute("orders", orders);

                int numberOrderClick = 1;
                request.setAttribute("numberOrderClick", numberOrderClick);
                request.getRequestDispatcher("dashboard/dashboardOrder.jsp").forward(request, response);

            } else {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceptID = request.getParameter("acceptID");
        String rejectID = request.getParameter("rejectID");
        String note = request.getParameter("note");
        OrderDAO orderDAO = new OrderDAO();
        ProductDAO productDAO = new ProductDAO();
        ProductKeyDAO productKeyDAO = new ProductKeyDAO();
        PromotionDAO promotionDAO = new PromotionDAO();
        NotificationDAO notificationDAO = new NotificationDAO();
        if (acceptID != null) {
            
            orderDAO.updateNote(note, Integer.parseInt(acceptID));
            orderDAO.updateStatus(Integer.parseInt(acceptID));
            
            notificationDAO.createNotificationOrder("Your order #"+orderDAO.getLastOrderID()+" had accepted." , 
                    "Your order "+orderDAO.getLastOrderID()+" had accepted. Let check your key at Order Detail or [<a href='order-detail?id="+orderDAO.getLastOrderID()+"'> here... </a>]");
            int userID = orderDAO.getOrderByID(Integer.parseInt(acceptID)).getUserId();
            notificationDAO.createNotificationDetailOrder(notificationDAO.getNewestNotication(), userID, Integer.parseInt(acceptID));
            
            try {
                UserDAO udao = new UserDAO();
                User u = udao.getUserByUserId(userID);
                Email.sendEmail(u.getEmail(), "Your order #"+orderDAO.getLastOrderID()+" had accepted.", "Your order "+orderDAO.getLastOrderID()+" had accepted. Let check your key at Order Detail or [<a href='order-detail?id="+orderDAO.getLastOrderID()+"'> here... </a>]");
            } catch (MessagingException ex) {
                Logger.getLogger(ManagementOrderController.class.getName()).log(Level.SEVERE, null, ex);
            }
            response.sendRedirect("dashboard-order");
        } else if (rejectID != null) {
            List<OrderDetail> orderDetails = orderDAO.getOrderDetailByOrderID(Integer.parseInt(rejectID));
            for (OrderDetail orderDetail : orderDetails) {
                int amount = productDAO.getAmountProduct(orderDetail.getProductID());
                productDAO.updateAmountProduct(orderDetail.getProductID(), amount + 1);
                productKeyDAO.updateStatusKeyReject(orderDetail.getKeyID());
                int getPromotionID = orderDAO.getPromotionIdByOrderID(orderDetail.getOrderID());
                if (getPromotionID > 0 || String.valueOf(getPromotionID) == null) {
                    promotionDAO.updateAmountPromotionReject(getPromotionID);
                }
                orderDAO.updateStatusReject(orderDetail.getOrderID());
                List<Order> orders = orderDAO.getAllOrder();
                orderDAO.updateNote(note, Integer.parseInt(rejectID));
                request.setAttribute("orders", orders);
            } 
            
            
            notificationDAO.createNotificationOrder("Your order #"+orderDAO.getLastOrderID()+" had rejected." , 
                    "Your order "+orderDAO.getLastOrderID()+" had rejected. Let check at Order Detail or [<a href='order-detail?id="+orderDAO.getLastOrderID()+"'> here... </a>]");
            int userID = orderDAO.getOrderByID(Integer.parseInt(acceptID)).getUserId();
            notificationDAO.createNotificationDetailOrder(notificationDAO.getNewestNotication(), userID, Integer.parseInt(acceptID));
            
            try {
                UserDAO udao = new UserDAO();
                User u = udao.getUserByUserId(userID);
                Email.sendEmail(u.getEmail(), "Your order #"+orderDAO.getLastOrderID()+" had rejected.", "Your order "+orderDAO.getLastOrderID()+" had rejected. Let check at Order Detail or [<a href='order-detail?id="+orderDAO.getLastOrderID()+"'> here... </a>]");
            } catch (MessagingException ex) {
                Logger.getLogger(ManagementOrderController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            request.getRequestDispatcher("dashboard/dashboardOrder.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
