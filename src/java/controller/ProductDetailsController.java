/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
import dao.ReviewDAO;
import entity.Product;
import entity.ReviewJoinUser;
import entity.ReviewReplyJoinUser;
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
 * @author trinh
 */
public class ProductDetailsController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            //int categoryID = Integer.parseInt("".equals(request.getParameter("categoryID")) ? "0" : request.getParameter("categoryID"));
            int productID = Integer.parseInt(request.getParameter("productID"));
            System.out.println(productID);
            ProductDAO productDAO = new ProductDAO();
            Product product = productDAO.getProductByID(productID);
            request.setAttribute("product", product);
            //
            ReviewDAO reviewDAO = new ReviewDAO();
            List<ReviewJoinUser> review = reviewDAO.getAllReviewJoinUserByProductId(productID);
            request.setAttribute("review", review);
            
            List<ReviewReplyJoinUser> reviewReplyList = new ArrayList<>();
            
            for (ReviewJoinUser reviewJoinUser : review) {
                int reviewID = reviewJoinUser.getReviewId();
                ReviewReplyJoinUser reviewReply = reviewDAO.getReviewReplyJoinUserByReviewId(reviewID);
                reviewReplyList.add(reviewReply);
            }
            request.setAttribute("reviewReply", reviewReplyList);
            //
//            int reviewID = Integer.parseInt(request.getAttribute("reviewID").toString());
//            List<ReviewReplyJoinUser> reviewReply = reviewDAO.getAllReviewReplyJoinUserByReviewId(reviewID);
//            request.setAttribute("reviewReply", reviewReply);
            request.getRequestDispatcher("productDetails.jsp").forward(request, response);
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
