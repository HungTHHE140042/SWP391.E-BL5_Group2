/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.OrderDetailDAO;
import dao.PostDAO;
import dao.ProductDAO;
import dao.UserDAO;
import entity.Post;
import entity.Product;
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
public class HomeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //get data in database
        //get the data of 3 products with the highest discounts
        ProductDAO productDAO = new ProductDAO();
        List<Product> listTop3ProductSale = productDAO.getTop3SaleProduct();
        //get the latest product data
        Product lastProduct = productDAO.getLastProduct();
        String countProduct = productDAO.countProduct();
        //get the latest 4 posts' data
        PostDAO postDAO = new PostDAO();
        List<Post> listTop4LastestPost = postDAO.getTop4LastestPost();
        //get the number of registered users
        UserDAO userDAO = new UserDAO();
        String countUser = userDAO.countUser();
        //get the number of products sold
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        String countOrderDetail = orderDetailDAO.countOrderDetail();
        //get the list pupular product data
        List<Product> listTop4Pupular = productDAO.getTop4PupularProduct();
        
        //set data in database to jsp
        request.setAttribute("listTop4Pupular", listTop4Pupular);
        request.setAttribute("countOrderDetail", countOrderDetail);
        request.setAttribute("countUser", countUser);
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
