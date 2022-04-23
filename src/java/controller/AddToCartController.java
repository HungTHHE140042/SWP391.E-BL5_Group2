/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CartDAO;
import dao.ProductDAO;
import entity.CartDetail;
import entity.Product;
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
        CartDAO CartDAO = new CartDAO();
        ProductDAO productDAO = new ProductDAO();
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        if (u != null) {
            int productID = Integer.parseInt(request.getParameter("productID"));
            Product product = productDAO.getProductByID(productID);
            if (CartDAO.checkProductCart(productID, u.getUserId())) {
                int amount = CartDAO.getAmountCart(productID, u.getUserId());
                if (product.getAmount() == 0) {
                    String checkAddCart = "0";
                    session.setAttribute("checkAddCart", checkAddCart);
                    response.sendRedirect("product");
                } else {
                    CartDAO.updateCart(productID, amount, u.getUserId());
                    String checkAddCart = "1";
                    session.setAttribute("checkAddCart", checkAddCart);
                    response.sendRedirect("product");
                }
            } else {
                if (product.getAmount() == 0) {
                    String checkAddCart = "0";
                    session.setAttribute("checkAddCart", checkAddCart);
                    response.sendRedirect("product");
                } else {
                    int quantity = 1;
                    CartDAO.createCart(productID, quantity, u.getUserId());
                    String checkAddCart = "1";
                    session.setAttribute("checkAddCart", checkAddCart);
                    response.sendRedirect("product");
                }
            }
        } else {
            response.sendRedirect("signin");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
