/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PromotionDAO;
import entity.Promotion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
public class ManagementPomotionController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        PromotionDAO promotionDAO = new PromotionDAO();
        List<Promotion> listGetAllPromotion = new ArrayList<>();
        int numberPromotionClick = 1;
        try {
            int id = Integer.parseInt(request.getParameter("idDeletePromotion"));
            if (promotionDAO.deletePromotion(id)) {
                listGetAllPromotion = promotionDAO.getAllPromotion();
                request.setAttribute("numberPromotionClick", numberPromotionClick);
                request.setAttribute("listGetAllPromotion", listGetAllPromotion);
                request.getRequestDispatcher("dashboard/dashboardPromotion.jsp").forward(request, response);
            }
        } catch (Exception e) {
            listGetAllPromotion = promotionDAO.getAllPromotion();
            request.setAttribute("numberPromotionClick", numberPromotionClick);
            request.setAttribute("listGetAllPromotion", listGetAllPromotion);
            request.getRequestDispatcher("dashboard/dashboardPromotion.jsp").forward(request, response);
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
        int numberPromotionClick = 1;
        try {
            String getPromotionCode = request.getParameter("protionCode");
            String getPrice = request.getParameter("salePercent");
            String getAmount = request.getParameter("amount");
            PromotionDAO promotionDAO = new PromotionDAO();
            if (promotionDAO.insertPromotion(getPromotionCode, getAmount, getAmount)) {
                request.setAttribute("numberPromotionClick", numberPromotionClick);
                response.sendRedirect("pomotionManager");
            }
        } catch (Exception e) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
