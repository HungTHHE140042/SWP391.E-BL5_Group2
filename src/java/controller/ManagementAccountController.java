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
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author long
 */
public class ManagementAccountController extends HttpServlet {

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
        User u = (User) session.getAttribute("user");
        if (u != null) {
            if (u.getRoleId() == 1) {
                UserDAO userDAO = new UserDAO();
            int numberClickAccount = 1;
            List<User> listAccount = new ArrayList<>();
            try {
                int userId = Integer.parseInt(request.getParameter("idDelete"));
                if (userDAO.removeUserByUserId(userId)) {
                    listAccount = userDAO.getAllUsers();
                    //Set data to JSP
                    request.setAttribute("numberClickAccount", numberClickAccount);
                    request.setAttribute("LIST_User", listAccount);
                    request.getRequestDispatcher("dashboard/dashboardAccount.jsp").forward(request, response);
                }
            } catch (Exception e) {
                listAccount = userDAO.getAllUsers();
                //Set data to JSP
                request.setAttribute("numberClickAccount", numberClickAccount);
                request.setAttribute("LIST_User", listAccount);
                request.getRequestDispatcher("dashboard/dashboardAccount.jsp").forward(request, response);
            }
            }
            else {
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
        int numberClickAccount = 1;
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        if (u != null) {
            if (u.getRoleId() == 1) {
                try {
                    String username = ("".equals(request.getParameter("username"))) ? "" : request.getParameter("username");
                    String email = ("".equals(request.getParameter("email"))) ? "" : request.getParameter("email");
                    String password = ("".equals(request.getParameter("password"))) ? "" : request.getParameter("password");
                    int roleId = Integer.parseInt(("".equals(request.getParameter("roleId"))) ? "" : request.getParameter("roleId"));
                    UserDAO uDAO = new UserDAO();
                    if (uDAO.createUser(username, password, email, roleId, 1)) {
                        request.setAttribute("numberClickAccount", numberClickAccount);
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
