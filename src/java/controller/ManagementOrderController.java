/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDAO;
import dao.ProductDAO;
import dao.ProductKeyDAO;
import dao.PromotionDAO;
import entity.Order;
import entity.OrderDetail;
import entity.ProductKey;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        if (acceptID != null) {
            orderDAO.updateNote(note, Integer.parseInt(acceptID));
            orderDAO.updateStatus(Integer.parseInt(acceptID));
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
