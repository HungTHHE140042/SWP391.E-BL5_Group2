/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AddToCartDAO;
import dao.ProductDAO;
import entity.Cart;
import entity.Item;
import entity.Product;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
//        int quantity = 1;
//        int productID;
//        if (request.getParameter("productID") != null) {
//            // HttpSession session = request.getSession();
//            productID = Integer.parseInt(request.getParameter("productID"));
//            System.out.println(productID);
//
//            ProductDAO productDao = new ProductDAO();
//            Product product = (Product) productDao.getProductByID(productID);
//            User u = (User) session.getAttribute("user");
//            if (u != null) {
//                if (product != null) {
//                    if (request.getParameter("quantity") != null) {
//                        quantity = Integer.parseInt(request.getParameter("quantity"));
//                    }
//                    if (session.getAttribute("cart") == null) {
//                        Cart cart = new Cart();
//                        List<Item> listItem = new ArrayList<Item>();
//                        Item item = new Item();
//                        item.setQuantity(quantity);
//                        item.setProduct(product);
//                        item.setPrice(product.getSellPrice());
//                        listItem.add(item);
//                        System.out.println("List Item: " + listItem);
//                        cart.setUserID(u.getUserId());
//                        cart.setItems(listItem);
//
//                        session.setAttribute("cart", cart);
//                        System.out.println(cart + " " + java.time.LocalDateTime.now());
//                    } else {
//                        Cart cart = (Cart) session.getAttribute("cart");
//                        List<Item> listItem = cart.getItems();
//                        Boolean check = false;
//                        for (Item item : listItem) {
//                            if (item.getProduct().getProductID() == product.getProductID()) {
//                                item.setQuantity(item.getQuantity() + quantity);
//                                check = true;
//                            }                          
//                        }
//                        if (check == false) {
//                            Item item = new Item();
//                            item.setQuantity(quantity);
//                            item.setProduct(product);
//                            item.setPrice(product.getSellPrice());
//                            listItem.add(item);
//                            request.getRequestDispatcher("cart.jsp").forward(request, response);
//                        }
//                        session.setAttribute("cart", cart);
//                        System.out.println(cart + " " + java.time.LocalDateTime.now());
//                    }
//                    request.getRequestDispatcher("cart.jsp").forward(request, response);
//                }
//            }else {
//                response.sendRedirect("signin");
//            }
//        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int quantity = 1;
        AddToCartDAO addToCartDAO = new AddToCartDAO();
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        if (u != null) {
            int productID = Integer.parseInt(request.getParameter("productID"));
            if(addToCartDAO.checkProductCart(productID, u.getUserId())){
                int amount = addToCartDAO.getAmountCart(productID, u.getUserId());
                addToCartDAO.updateCart(productID, amount, u.getUserId());
            }else {
                addToCartDAO.createCart(productID, quantity, u.getUserId());
            }         
                System.out.println("Create Cart ok!!!!");
        } else {
            response.sendRedirect("signin");
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
