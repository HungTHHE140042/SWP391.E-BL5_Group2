/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.LoginDAO;
import dao.UserDAO;
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
public class SignUpController extends HttpServlet {

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
        request.getRequestDispatcher("signUp.jsp").forward(request, response);
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
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String repassword = request.getParameter("repassword");

        LoginDAO dao = new LoginDAO();
        UserDAO uDAO = new UserDAO();

        if (!password.equals(repassword)) {
            request.setAttribute("error", "1");
            request.getRequestDispatcher("signUp.jsp").forward(request, response);
        } else {
            if (dao.isExistedUsername(username)) {
                request.setAttribute("error", "2");
                request.getRequestDispatcher("signUp.jsp").forward(request, response);
            } else if (dao.isExistedEmail(email)) {
                request.setAttribute("error", "3");
                request.getRequestDispatcher("signUp.jsp").forward(request, response);
            } else {
                if (dao.registerAccount(username, email, password)) {
                    int userId = (uDAO.getNewestUser()).getUserId();
                    try {
                        Email.sendEmail(email, "[!] Verify tai khoan #" + userId + " cua ban.", " Truoc khi Dang nhap, hay nhap vao <a href='http://localhost:8080/SWP391.E-BL5_Group2/verify?id=" + userId + "'>link...</a>");
                    } catch (Exception e) {
                        Logger.getLogger(ForgotPasswordController.class.getName()).log(Level.SEVERE, null, e);
                    }
                    request.setAttribute("error", "4");
                    request.getRequestDispatcher("signUp.jsp").forward(request, response);
                } else {
                    request.setAttribute("error", "5");
                    request.getRequestDispatcher("signUp.jsp").forward(request, response);
                }
            }
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
