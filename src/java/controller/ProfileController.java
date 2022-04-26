/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SubscribeDAO;
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
public class ProfileController extends HttpServlet {

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
            SubscribeDAO sDAO = new SubscribeDAO();
            boolean sub = sDAO.isSubscribe(u.getUserId());
            request.setAttribute("subs", sub);
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        } else {
            response.sendRedirect("signin");
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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();

        int id = Integer.parseInt(request.getParameter("userId"));
        String userName = request.getParameter("username").trim();
        String email = request.getParameter("email");
        String subscribe = request.getParameter("subscribe");

        SubscribeDAO sDAO = new SubscribeDAO();
        if (subscribe != null) {
            if (sDAO.insertSubscribe(id, email)) {
                request.setAttribute("subs", true);
                request.setAttribute("msgUpdate", true);
            } else {
                request.setAttribute("msgUpdate", false);
            }
        } else {
            if (sDAO.isSubscribe(id)) {
                if (sDAO.deleteSubscribe(id)) {
                    request.setAttribute("subs", false);
                    request.setAttribute("msgUpdate", true);
                } else {
                    request.setAttribute("msgUpdate", false);
                }
            } else {
                request.setAttribute("msgUpdate", false);
            }
        }
        request.setAttribute("msgUpdate", false);

        if (!userName.equals("")) {
            UserDAO dao = new UserDAO();
            if (dao.updateUser(id, userName)) {
                User u = dao.getUsersByID(id);
                session.setAttribute("user", u);
                request.setAttribute("msgUpdate", true);
            }
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
