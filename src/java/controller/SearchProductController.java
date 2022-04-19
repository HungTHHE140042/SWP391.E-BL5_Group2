/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProductDAO;
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
 * @author Admin
 */
public class SearchProductController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("categoryID = " + request.getParameter("categoryID"));
        int categoryID = Integer.parseInt("".equals(request.getParameter("categoryID")) ? "0" : request.getParameter("categoryID"));
        //int categoryID = 0;
        System.out.println(request.getParameter("txtSearch"));
        String txtSearch = "".equals(request.getParameter("txtSearch")) ? "" : request.getParameter("txtSearch");     
        int price = Integer.parseInt("".equals(request.getParameter("price")) ? "0" : request.getParameter("price"));
        //int price = 0 ;

        ProductDAO productDAO = new ProductDAO();
        String indexPage = request.getParameter("index");
        if (indexPage == null) {
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);
        List<Product> listProduct1 = productDAO.searchProduct1(index, txtSearch, categoryID, price);
        List<Product> listProduct = productDAO.searchProduct(index, txtSearch, categoryID, price);
        int countSearch = listProduct1.size();
        int endPage = countSearch / 3;
        if (countSearch % 3 != 0) {
            endPage++;
        }

        request.setAttribute("txtSearch", txtSearch);
        request.setAttribute("price", price);
        request.setAttribute("categoryID", categoryID);
        request.setAttribute("countSearch", countSearch);
        request.setAttribute("listProduct", listProduct);
        request.setAttribute("endPage", endPage);
        request.getRequestDispatcher("product.jsp").forward(request, response);
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
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
