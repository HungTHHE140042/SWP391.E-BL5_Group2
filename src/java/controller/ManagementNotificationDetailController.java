/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.NotificationDAO;
import entity.NotificationDetail;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trinh
 */
public class ManagementNotificationDetailController extends HttpServlet {

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
        try {
            int notificationId = Integer.parseInt(request.getParameter("id"));
            NotificationDAO ndao = new NotificationDAO();
            List<NotificationDetail> list = ndao.getNotificationByNotificationId(notificationId);
            String temp = "";
            NotificationDetail detail = new NotificationDetail(list.get(0).getID(), list.get(0).getTitle(), list.get(0).getContent(),list.get(0).getUserID());
            
            for (NotificationDetail notificationDetail : list) {
                temp = temp + notificationDetail.getUserID() + ", ";
            }
            temp = temp.replaceAll(", $", "");
            System.out.println(temp);
            request.setAttribute("Noti_Detail", detail);
            request.setAttribute("userID", temp);
            request.getRequestDispatcher("dashboard/dashboardNotificationDetail.jsp").forward(request, response);

        } catch (Exception e) {
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
