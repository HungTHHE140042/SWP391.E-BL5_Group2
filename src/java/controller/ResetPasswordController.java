/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.UserDAO;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trinh
 */
public class ResetPasswordController extends HttpServlet {

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
        request.setAttribute("error", null);
        int userId = Integer.parseInt("".equals(request.getParameter("id")) ? "0" : request.getParameter("id"));
        UserDAO uDAO = new UserDAO();
        User u = new User();
        u = uDAO.getUserByUserId(userId);
        if (u != null) {
            if (u.getStatusId() == 2) {
                request.setAttribute("user", u);
                request.getRequestDispatcher("resetPassword.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        request.getRequestDispatcher("error.jsp").forward(request, response);
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
        int userId = Integer.parseInt(request.getParameter("id"));
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");

        if (password.equals(repassword)) {
            UserDAO uDAO = new UserDAO();
            User u = new User();
            if (uDAO.updatePasswordByUserId(userId, password)) {
                boolean updateStatus = uDAO.updateUserStatusId(userId, 1);
                response.sendRedirect("signin");
            } else {
                request.setAttribute("error", "2");
                request.getRequestDispatcher("resetPassword.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("error", "1");
            request.getRequestDispatcher("resetPassword.jsp").forward(request, response);
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
