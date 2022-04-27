/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDAO;
import entity.OrderDetail;
import entity.User;
import function.AES;
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
public class ManagementOrderDetailController extends HttpServlet {

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
                int numberOrderClick = 1;
                request.setAttribute("numberOrderClick", numberOrderClick);
                int orderID = Integer.parseInt(request.getParameter("orderID"));
                OrderDAO orderDAO = new OrderDAO();
                List<OrderDetail> orderDetails = orderDAO.getOrderDetailByOrderID(orderID);

                request.setAttribute("status", orderDAO.getOrderStatusByOrderId(orderID));
                OrderDAO oDAO = new OrderDAO();
                
                int status = oDAO.getOrderStatusByOrderId(orderID);
                if(status == 2){
                    for (OrderDetail orderDetail : orderDetails) {
                        String decryptProductKey = AES.decrypt(orderDetail.getProductKey(), "@SWP391_Group2");
                        orderDetail.setProductKey(decryptProductKey);
                    }
                }                              
                request.setAttribute("orderDetails", orderDetails);
                request.getRequestDispatcher("dashboard/dashboardOrderDetail.jsp").forward(request, response);
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
