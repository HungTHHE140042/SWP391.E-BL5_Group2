/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PostDAO;
import entity.PostJoinUser;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trson
 */
public class ManagementPostEditController extends HttpServlet {

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
        int numberPostClick = 1;
        try {
            int postId = Integer.parseInt(request.getParameter("id"));
            PostDAO pDAO = new PostDAO();
            PostJoinUser post = pDAO.getPostJoinUserByPostId(postId);
            request.setAttribute("post", post);
            request.setAttribute("error", null);
            request.setAttribute("numberPostClick", numberPostClick);
            request.getRequestDispatcher("dashboard/dashboardPostEdit.jsp").forward(request, response);

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
        int numberPostClick = 1;
        try {
            int postId = Integer.parseInt(request.getParameter("id"));
            String title = request.getParameter("title");
            String urlThumbnail = request.getParameter("urlThumbnail");
            String urlDetail = request.getParameter("urlDetail");
            String content = request.getParameter("content");

            PostDAO pDAO = new PostDAO();
            if (pDAO.updatePost(postId, title, urlThumbnail, urlDetail, content)) {
                request.setAttribute("numberPostClick", numberPostClick);
                response.sendRedirect("dashboard-post");
            } else {
                request.setAttribute("error", "1");
                PostJoinUser post = pDAO.getPostJoinUserByPostId(postId);
                request.setAttribute("post", post);
                request.setAttribute("numberPostClick", numberPostClick);
                request.getRequestDispatcher("dashboard/dashboardPostEdit.jsp").forward(request, response);
            }
        } catch (Exception e) {
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
