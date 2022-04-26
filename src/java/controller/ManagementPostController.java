/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.PostDAO;
import entity.PostJoinUser;
import entity.User;
import function.SendEmail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author trinh
 */
public class ManagementPostController extends HttpServlet {

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
        request.setAttribute("error", null);
        PostDAO pDAO = new PostDAO();
        try {
            int postId = Integer.parseInt(request.getParameter("idDelete"));
            if (pDAO.removePostByPostId(postId)) {
                List<PostJoinUser> listPost = new ArrayList<>();
                listPost = pDAO.getAllPostJoinUser();
                request.setAttribute("listPost", listPost);
                request.setAttribute("numberPostClick", numberPostClick);
                request.getRequestDispatcher("dashboard/dashboardPost.jsp").forward(request, response);
            }
        } catch (Exception e) {
            List<PostJoinUser> listPost = new ArrayList<>();
            listPost = pDAO.getAllPostJoinUser();
            request.setAttribute("listPost", listPost);
            request.setAttribute("numberPostClick", numberPostClick);
            request.getRequestDispatcher("dashboard/dashboardPost.jsp").forward(request, response);
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
        String title = ("".equals(request.getParameter("title"))) ? "" : request.getParameter("title");
        String urlThumbnail = ("".equals(request.getParameter("urlThumbnail"))) ? "" : request.getParameter("urlThumbnail");
        String urlDetail = ("".equals(request.getParameter("urlDetail"))) ? "" : request.getParameter("urlDetail");
        String content = ("".equals(request.getParameter("content"))) ? "" : request.getParameter("content");
        int numberPostClick = 1;
        PostDAO pDAO = new PostDAO();
        List<PostJoinUser> listPost = new ArrayList<>();

        if (!"".equals(title)) {
            HttpSession session = request.getSession();
            User u = (User) session.getAttribute("user");

            if (u != null) {
                if (pDAO.createPost(u.getUserId(), title, urlThumbnail, urlDetail, content)) {
                    listPost = pDAO.getAllPostJoinUser();
                    request.setAttribute("listPost", listPost);
                    request.setAttribute("error", "1");
                    request.setAttribute("numberPostClick", numberPostClick);
                    
                    try {
                        SendEmail.sendEmailToSubscriber("[^^] Let check new Post", "New Post: " + title + " [<a href='http://localhost:8080/SWP391.E-BL5_Group2/post'>more...</a>]");
                    } catch (MessagingException ex) {
                        Logger.getLogger(ManagementPostController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.getRequestDispatcher("dashboard/dashboardPost.jsp").forward(request, response);
                } else {
                    listPost = pDAO.getAllPostJoinUser();
                    request.setAttribute("listPost", listPost);
                    request.setAttribute("error", "2");
                    request.setAttribute("numberPostClick", numberPostClick);
                    request.getRequestDispatcher("dashboard/dashboardPost.jsp").forward(request, response);
                }
            } else {
                listPost = pDAO.getAllPostJoinUser();
                request.setAttribute("listPost", listPost);
                request.setAttribute("error", "2");
                request.setAttribute("numberPostClick", numberPostClick);
                request.getRequestDispatcher("dashboard/dashboardPost.jsp").forward(request, response);
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
