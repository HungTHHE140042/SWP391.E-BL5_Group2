/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AddToCartDAO;
import entity.CartDetail;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MSI
 */
public class AddToCartController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        AddToCartDAO addToCartDAO = new AddToCartDAO();
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        if (u != null) {
            int productID = Integer.parseInt(request.getParameter("productID"));
            if (addToCartDAO.checkProductCart(productID, u.getUserId())) {
                int amount = addToCartDAO.getAmountCart(productID, u.getUserId());
                addToCartDAO.updateCart(productID, amount, u.getUserId());
            } else {
                int quantity = 1;
                addToCartDAO.createCart(productID, quantity, u.getUserId());
                System.out.println("Create Cart ok!!!!");
            }           
            response.sendRedirect("cart");
        } else {
            response.sendRedirect("signin");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
