/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ReviewDAO;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author QUANG HUNG
 */
public class ReviewReplyAddController extends HttpServlet {

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
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        
        int productID = Integer.parseInt(request.getParameter("productID"));
        int reviewID = Integer.parseInt(request.getParameter("reviewID"));
        String replyDetail = request.getParameter("replyDetail");
        
        ReviewDAO reviewDAO = new ReviewDAO();

        if (u != null) {
            if (!replyDetail.trim().equals("")) {
                if (reviewDAO.createReviewReply(u.getUserId(), reviewID, replyDetail)) {
                    response.sendRedirect("productDetails?productID=" + productID);
                } else {

                }
            } else {
                session.setAttribute("notifiReply", false);
                //request.setAttribute("notifiStt", false);
                //request.getRequestDispatcher("productDetails.jsp").forward(request, response);
                response.sendRedirect("productDetails?productID=" + productID);
                System.out.println("thongba0 " + request.getParameter("notifiReply"));
            }
        } else {
            response.sendRedirect("signin");
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
