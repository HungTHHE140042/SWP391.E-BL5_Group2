/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EmailDAO;
import entity.Email;
import entity.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author QUANG HUNG
 */
@WebServlet(name = "ManagementEmailEditController", urlPatterns = {"/dashboard-email-edit"})
public class ManagementEmailEditController extends HttpServlet {

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
        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");
        if (u != null) {
            if (u.getRoleId() == 1 || u.getRoleId() == 4) {
                String id = request.getParameter("id");
                int numberEmailClick = 1;
                if (id != null) {
                    int emailID = Integer.parseInt(id);
                    EmailDAO emailDAO = new EmailDAO();
                    Email email = emailDAO.getEmailByEmailID(emailID);
                    request.setAttribute("email", email);
                    request.setAttribute("numberEmailClick", numberEmailClick);
                    request.getRequestDispatcher("dashboard/dashboardEmailEdit.jsp").forward(request, response);
                } else {
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
                request.setAttribute("numberEmailClick", numberEmailClick);
                request.getRequestDispatcher("dashboard/dashboardEmailEdit.jsp").forward(request, response);
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
            if (u.getRoleId() == 1 || u.getRoleId() == 4) {
                int numberEmailClick = 1;
                try {
                    int id = Integer.parseInt(request.getParameter("idEdit"));
                    String title = request.getParameter("title");
                    String content = request.getParameter("content");

                    EmailDAO emailDAO = new EmailDAO();
                    if (emailDAO.updateEmailInformation(id, title, content, emailDAO.datetoSQL(), 0)) {
                        System.out.println("update_success");
                    } else {
                        System.out.println("update_fail");
                    }
                    request.setAttribute("numberEmailClick", numberEmailClick);
                    response.sendRedirect("dashboard-email");
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
