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
import javax.servlet.http.HttpSession;

/**
 *
 * @author QUANG HUNG
 */
public class ChangePasswordController extends HttpServlet {

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
         response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        request.getRequestDispatcher("profile.jsp").forward(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        int id = u.getUserId();
        String oldPassword = u.getPassword().trim();
        String currentPassword = request.getParameter("currentpassword");
        String newPassword = request.getParameter("newpassword");
        String repeatNewPassword = request.getParameter("repeatpassword");
        request.setAttribute("mess1Stt", false);
        request.setAttribute("mess1", oldPassword + "//" + currentPassword + "//" + newPassword + "//" + repeatNewPassword);
        if (!newPassword.equals(repeatNewPassword)) {
            request.setAttribute("mess1", "New Password and Repeat Password not matched!");
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        }
        if (!oldPassword.equals(currentPassword)) {
            request.setAttribute("mess1", "Current password incorrect!");
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        }
        
        if (currentPassword.equals(newPassword)) {
            request.setAttribute("mess1", "New Password must be different from Current Password!");
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        }

        UserDAO dao = new UserDAO();
        if (dao.updatePasswordByUserId(id,newPassword)) {
            request.setAttribute("mess1", "Password updated!");
            request.setAttribute("mess1Stt", true);
        } else {
            request.setAttribute("mess1", "Password change failed!");
        }
        request.getRequestDispatcher("profile.jsp").forward(request, response);
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
