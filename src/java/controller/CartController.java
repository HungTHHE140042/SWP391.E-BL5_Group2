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
public class CartController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     *
     *
     * //
     * <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
     * /**
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

            HttpSession session = request.getSession();
            User u = (User) session.getAttribute("user");
            System.out.println(u.getUserId());
            if (u != null) {
                AddToCartDAO addToCartDAO = new AddToCartDAO();
                ArrayList<CartDetail> cartDetails = addToCartDAO.getCartByUser(u.getUserId());
                request.setAttribute("cartDetails", cartDetails);
                request.getRequestDispatcher("cart.jsp").forward(request, response);
            } else {
                response.sendRedirect("signin");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        AddToCartDAO addToCartDAO = new AddToCartDAO();
        User u = (User) session.getAttribute("user");
        if (request.getParameter("id") != null) {
            int productID = Integer.parseInt(request.getParameter("id"));
            if (addToCartDAO.removeFromCart(productID, u.getUserId())) {
                System.out.println("xoa thanh cong " + productID);
            }
        } else {
            int quantity = Integer.parseInt(request.getParameter("quantity"));

            if (quantity == 1) {
                int productID = Integer.parseInt(request.getParameter("proID"));
                int amount = addToCartDAO.getAmountCart(productID, u.getUserId());
                addToCartDAO.updateCart(productID, amount, u.getUserId());
            } else {
                int productID = Integer.parseInt(request.getParameter("proID"));
                int amount = addToCartDAO.getAmountCart(productID, u.getUserId());
                if (amount == 1) {
                    addToCartDAO.removeFromCart(productID, u.getUserId());
                } else {
                    addToCartDAO.updateCart(productID, amount - 2, u.getUserId());
                }
            }
        }
        response.sendRedirect("cart");
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
