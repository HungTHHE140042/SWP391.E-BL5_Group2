/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDAO;
import dao.OrderDetailDAO;
import entity.OrderDetail;
import entity.User;
import function.AES;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
public class OrderDetailController extends HttpServlet {

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
        String idDetail = request.getParameter("id");
        if (idDetail != null) {
            int id = Integer.parseInt(idDetail);
            OrderDetailDAO odDAO = new OrderDetailDAO();
            List<OrderDetail> listOrderDetail = new ArrayList<>();
            listOrderDetail = odDAO.getOrderDetailByOrderId(id);

            OrderDAO oDAO = new OrderDAO();
            int status = oDAO.getOrderStatusByOrderId(id);
            if (status == 2) {
                System.out.println(listOrderDetail + "..");
                for (OrderDetail orderDetail : listOrderDetail) {
                    String decryptProductKey = AES.decrypt(orderDetail.getProductKey(), "@SWP391_Group2");
                    orderDetail.setProductKey(decryptProductKey);
                }
            }

            request.setAttribute("orderStatus", status);
            request.setAttribute("orderId", id);
            request.setAttribute("orderDetail", listOrderDetail);
        }

        request.getRequestDispatcher("orderDetail.jsp").forward(request, response);
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
