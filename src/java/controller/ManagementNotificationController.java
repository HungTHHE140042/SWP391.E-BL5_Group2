/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NotificationDAO;
import entity.Notification;
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
 * @author trinh
 */
public class ManagementNotificationController extends HttpServlet {

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

                NotificationDAO ndao = new NotificationDAO();
                List<Notification> notifications = new ArrayList<>();
                try {
                    int Id = Integer.parseInt(request.getParameter("idDelete"));
                    if (ndao.removeNotificationById(Id)) {
                        notifications = ndao.getAllNotification();
                        request.setAttribute("List_Noti", notifications);
                        request.getRequestDispatcher("dashboard/dashboardNotification.jsp").forward(request, response);
                    }
                } catch (Exception e) {
                    notifications = ndao.getAllNotification();
                    request.setAttribute("List_Noti", notifications);
                    request.getRequestDispatcher("dashboard/dashboardNotification.jsp").forward(request, response);
                }

                int numberNotificationClick = 1;
                request.setAttribute("numberNotificationClick", numberNotificationClick);
                request.getRequestDispatcher("dashboard/dashboardNotification.jsp").forward(request, response);
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
        String cus = request.getParameter("cus");
        String sell = request.getParameter("sell");
        String market = request.getParameter("market");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        List<Notification> notifications = new ArrayList<>();
        NotificationDAO aO = new NotificationDAO();
        if (aO.createNotification(title, content)) {
            int notiID = aO.getNewestNotication();
            if (cus != null) {
                List<User> u = aO.getUserByRoleID(3);
                for (User user : u) {
                    aO.createNotificationDetail(notiID, user.getUserId());
                }
            }
            if (sell != null) {
                List<User> u = aO.getUserByRoleID(2);
                for (User user : u) {
                    aO.createNotificationDetail(notiID, user.getUserId());
                }
            }
            if (market != null) {
                List<User> u = aO.getUserByRoleID(4);
                for (User user : u) {
                    aO.createNotificationDetail(notiID, user.getUserId());
                }
            }
            notifications = aO.getAllNotification();
            request.setAttribute("List_Noti", notifications);
            request.getRequestDispatcher("dashboard/dashboardNotification.jsp").forward(request, response);
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
