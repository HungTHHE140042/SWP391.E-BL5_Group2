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
 * @author trinh
 */
public class ManagementAccountEditController extends HttpServlet {

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
        int numberClickAccount = 1;
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        if (u != null) {
            if (u.getRoleId() == 1) {
                try {
                    int userId = Integer.parseInt(request.getParameter("id"));
                    UserDAO pDAO = new UserDAO();
                    User user = pDAO.getUserByUserId(userId);
                    request.setAttribute("user", user);
                    request.setAttribute("numberClickAccount", numberClickAccount);
                    request.getRequestDispatcher("dashboard/dashboardAccountEdit.jsp").forward(request, response);

                } catch (Exception e) {
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            } else {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
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
        if (u != null) {
            if (u.getRoleId() == 1) {
                try {
                    UserDAO pDAO = new UserDAO();
                    int userId = Integer.parseInt(request.getParameter("id"));
                    String username = request.getParameter("username");
                    String email = request.getParameter("email");
                    String password = pDAO.getUserByUserId(userId).getPassword();
                    int roleId = Integer.parseInt(request.getParameter("roleId"));
                    int statusId = Integer.parseInt(request.getParameter("statusId"));

                    if (pDAO.updateUser(userId, username, password, email, roleId, statusId)) {
                        response.sendRedirect("dashboard-account");
                    }
                } catch (Exception e) {
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            } else {
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
