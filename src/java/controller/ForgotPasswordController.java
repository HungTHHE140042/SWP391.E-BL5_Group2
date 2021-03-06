/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LoginDAO;
import dao.UserDAO;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import smtp.Email;

/**
 *
 * @author trinh
 */
public class ForgotPasswordController extends HttpServlet {

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
        request.getRequestDispatcher("forgot.jsp").forward(request, response);
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
        String email = request.getParameter("email");
        LoginDAO dao = new LoginDAO();
        UserDAO uDao = new UserDAO();
        if (dao.isExistedEmail(email)) {
            try {
                User u = new User();
                u = uDao.getUserByEmail(email);
                int userId = u.getUserId();
                Email.sendEmail(email, "[?] Request Reset Password #" + userId, "To change your password, click link <a href=\"http://localhost:8080/SWP391.E-BL5_Group2/reset-password?id=" + userId +"\">here...</a>");
                boolean updateStatus = uDao.updateUserStatusId(userId, 2);
                request.setAttribute("error", "3");
                request.getRequestDispatcher("forgot.jsp").forward(request, response);
            } catch (Exception e) {
                Logger.getLogger(ForgotPasswordController.class.getName()).log(Level.SEVERE, null, e);
                request.setAttribute("error", "2");
                request.getRequestDispatcher("forgot.jsp").forward(request, response);
            }

        } else {
            request.setAttribute("error", "1");
            request.getRequestDispatcher("forgot.jsp").forward(request, response);
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
