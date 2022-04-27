/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CartDAO;
import dao.OrderDAO;
import dao.OrderDetailDAO;
import dao.ProductDAO;
import dao.ProductKeyDAO;
import dao.PromotionDAO;
import entity.CartDetail;
import entity.OrderDetail;
import entity.Product;
import entity.ProductKey;
import entity.Promotion;
import entity.User;
import java.io.IOException;
import java.time.LocalDate;
import java.time.ZoneId;
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
 * @author trinh
 */
public class CheckoutController extends HttpServlet {

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
        Date date = new Date();
        HttpSession session = request.getSession();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        CartDAO addToCartDAO = new CartDAO();
        User u = (User) session.getAttribute("user");

        Double total = 0.0;
        ArrayList<CartDetail> cartDetails = addToCartDAO.getCartByUser(u.getUserId());
        for (CartDetail cartDetail : cartDetails) {
            total += cartDetail.getQuantity() * cartDetail.getSellPrice();
        }

        request.setAttribute("total", total);
        session.setAttribute("cartDetails", cartDetails);
        session.setAttribute("localDate", localDate);
        request.getRequestDispatcher("checkout.jsp").forward(request, response);
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
        OrderDAO orderDAO = new OrderDAO();
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        PromotionDAO promotionDAO = new PromotionDAO();
        CartDAO cartDAO = new CartDAO();
        ProductKeyDAO productKeyDAO = new ProductKeyDAO();
        ProductDAO productDAO = new ProductDAO();
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");

        ArrayList<CartDetail> cartDetails = (ArrayList<CartDetail>) session.getAttribute("cartDetails");
        for (CartDetail cartDetail : cartDetails) {
            Product product = productDAO.getProductByID(cartDetail.getProductID());
            if (cartDetail.getQuantity() > product.getAmount()) {
                String outOfStock = "1";
                String check = "1";
                session.setAttribute("outOfStock", outOfStock);
                session.setAttribute("check", check);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        }

        int index = Integer.parseInt(request.getParameter("index"));

        String check;
        if (session.getAttribute("check") == null) {
            check = "";
        } else {
            check = (String) session.getAttribute("check");
        }
        if (index == 1 && !check.equals("1")) {
            session.removeAttribute("check");
            Promotion p = promotionDAO.checkPromotion(request.getParameter("promotionCode"));
            if (p != null) {
                Double total = 0.0;
                List<CartDetail> cartDetail = (ArrayList<CartDetail>) session.getAttribute("cartDetails");
                for (CartDetail cartDetail1 : cartDetail) {
                    total += cartDetail1.getQuantity() * cartDetail1.getSellPrice();
                }
                total = total - (total / 100) * p.getSalePercent();
                total = (double) Math.round(total * 100) / 100;

                session.setAttribute("promotion", p);
                request.setAttribute("total", total);
                request.getRequestDispatcher("checkout.jsp").forward(request, response);
            } else {
                String checkPromotion = "1";
                session.setAttribute("checkPromotion", checkPromotion);
                response.sendRedirect("checkout");
            }
        } else if (!check.equals("1")) {
            Promotion p = (Promotion) session.getAttribute("promotion");
            if (session.getAttribute("promotion") != null) {
                orderDAO.insertOrder(u.getUserId(), Double.parseDouble(request.getParameter("total")), p.getId());
                promotionDAO.updateAmountPromotion(p.getId());
            } else {
                orderDAO.insertOrderWithoutPro(u.getUserId(), Double.parseDouble(request.getParameter("total")));
            }
            int orderID = orderDAO.getLastOrderID();
            if (cartDetails != null) {
                for (CartDetail c : cartDetails) {
                    if (c.getQuantity() > 1) {
                        for (int i = 1; i <= c.getQuantity(); i++) {
                            OrderDetail detail = new OrderDetail();
                            detail.setOrderID(orderID);
                            detail.setProductID(c.getProductID());
                            detail.setProductName(c.getProductName());
                            detail.setProductPrice(c.getSellPrice());
                            detail.setQuantity(1);

                            ProductKey productKey = productKeyDAO.getProducKey(c.getProductID());
                            detail.setKeyID(productKey.getKeyID());
                            productKeyDAO.updateStatusKey(productKey.getKeyID());
                            int count = productKeyDAO.countProductKey(c.getProductID());
                            productDAO.updateAmountProduct(c.getProductID(), count);

                            if (orderDetailDAO.insertOrderDetail(detail)) {
                                cartDAO.deleteCart(u.getUserId());
                                session.removeAttribute("cartDetails");
                            }
                        }
                    } else {
                        OrderDetail detail = new OrderDetail();
                        detail.setOrderID(orderID);
                        detail.setProductID(c.getProductID());
                        detail.setProductName(c.getProductName());
                        detail.setProductPrice(c.getSellPrice());
                        detail.setQuantity(c.getQuantity());

                        ProductKey productKey = productKeyDAO.getProducKey(c.getProductID());
                        detail.setKeyID(productKey.getKeyID());
                        productKeyDAO.updateStatusKey(productKey.getKeyID());
                        int count = productKeyDAO.countProductKey(c.getProductID());
                        productDAO.updateAmountProduct(c.getProductID(), count);

                        if (orderDetailDAO.insertOrderDetail(detail)) {
                            cartDAO.deleteCart(u.getUserId());
                            session.removeAttribute("cartDetails");
                        }
                    }
                }

            }
            session.removeAttribute("promotion");
            response.sendRedirect("payment");          
        }else{
            session.removeAttribute("promotion");
            response.sendRedirect("home");
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
