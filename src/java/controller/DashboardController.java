/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDetailDAO;
import entity.CategoryOrder;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trinh
 */
public class DashboardController extends HttpServlet {

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
        //Get total price in database
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        int month = orderDetailDAO.getMonth();
        String totalPrice = orderDetailDAO.totalPrice();
        int numberClick = 1;
        //Get total price per month now
        String totalPriceMonth1 = orderDetailDAO.totalPricePerMonth(1);
        String totalPriceMonth2 = orderDetailDAO.totalPricePerMonth(2);
        String totalPriceMonth3 = orderDetailDAO.totalPricePerMonth(3);
        String totalPricePerMonthNow = orderDetailDAO.totalPricePerMonth(month);
        //Get total order success
        String totalOrderSuccess = orderDetailDAO.totalOrderSuccess();
        //Get total order processing
        String totalOrderProcessing = orderDetailDAO.totalOrderProcessing();
        //Get total count category in order detail
        CategoryOrder categoryOrder1 = orderDetailDAO.getTotalCategoryOrderByID(1);
        CategoryOrder categoryOrder2 = orderDetailDAO.getTotalCategoryOrderByID(2);
        CategoryOrder categoryOrder3 = orderDetailDAO.getTotalCategoryOrderByID(3);
        CategoryOrder categoryOrder4 = orderDetailDAO.getTotalCategoryOrderByID(4);
        CategoryOrder categoryOrder5 = orderDetailDAO.getTotalCategoryOrderByID(5);
        //Set data to jsp\
        request.setAttribute("numberClickDashBoard", numberClick);
        request.setAttribute("totalPrice", totalPrice);
        request.setAttribute("totalPriceMonth1", totalPriceMonth1);
        request.setAttribute("totalPriceMonth2", totalPriceMonth2);
        request.setAttribute("totalPriceMonth3", totalPriceMonth3);
        request.setAttribute("categoryOrder1", categoryOrder1);
        request.setAttribute("categoryOrder2", categoryOrder2);
        request.setAttribute("categoryOrder3", categoryOrder3);
        request.setAttribute("categoryOrder4", categoryOrder4);
        request.setAttribute("categoryOrder5", categoryOrder5);
        request.setAttribute("totalPricePerMonthNow", totalPricePerMonthNow);
        request.setAttribute("totalOrderSuccess", totalOrderSuccess);
        request.setAttribute("totalOrderProcessing", totalOrderProcessing);
        request.getRequestDispatcher("dashboard/cms.jsp").forward(request, response);
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
