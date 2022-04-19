/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PostDAO;
import dao.ProductDAO;
import entity.Post;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trinh
 */
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        ProductDAO productDAO = new ProductDAO();
        List<Product> listTop3ProductSale = productDAO.getTop3SaleProduct();
        Product lastProduct = productDAO.getLastProduct();
        String countProduct = productDAO.countProduct();
        PostDAO postDAO = new PostDAO();
        List<Post> listTop4LastestPost = postDAO.getTop4LastestPost();
        
        request.setAttribute("listTop4LastestPost", listTop4LastestPost);
        request.setAttribute("countProduct", countProduct);
        request.setAttribute("lastProduct", lastProduct);
        request.setAttribute("listTop3ProductSale", listTop3ProductSale);
        request.getRequestDispatcher("homePage.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
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
