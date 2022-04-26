/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.EmailDAO;
import dao.SubscribeDAO;
import dao.UserDAO;
import entity.Email;
import entity.Subscribe;
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
 * @author QUANG HUNG
 */
public class ManagementEmailController extends HttpServlet {

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
                int numberEmailClick = 1;
                request.setAttribute("stt", null);
                String id = request.getParameter("idDelete");
                EmailDAO emailDAO = new EmailDAO();
                if (id != null) {
                    int emailID = Integer.parseInt(request.getParameter("idDelete"));
                    if (emailDAO.deleteEmailByEmailID(emailID)) {
                        List<Email> listEmail = new ArrayList<>();
                        listEmail = emailDAO.getAllEmail();
                        request.setAttribute("listEmail", listEmail);
                        request.setAttribute("numberEmailClick", numberEmailClick);
                        request.setAttribute("stt", "3");
                        request.getRequestDispatcher("dashboard/dashboardEmail.jsp").forward(request, response);
                    } else {
                        List<Email> listEmail = new ArrayList<>();
                        listEmail = emailDAO.getAllEmail();
                        request.setAttribute("listEmail", listEmail);
                        request.setAttribute("numberEmailClick", numberEmailClick);
                        request.setAttribute("stt", "4");
                        request.getRequestDispatcher("dashboard/dashboardEmail.jsp").forward(request, response);
                    }
                } else {
                    List<Email> listEmail = new ArrayList<>();
                    listEmail = emailDAO.getAllEmail();
                    request.setAttribute("listEmail", listEmail);
                    request.setAttribute("numberEmailClick", numberEmailClick);
                    request.getRequestDispatcher("dashboard/dashboardEmail.jsp").forward(request, response);
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
            if (u.getRoleId() == 1 || u.getRoleId() == 4) {
                int numberEmailClick = 1;
                try {
                    String title = ("".equals(request.getParameter("title"))) ? "" : request.getParameter("title");
                    String content = ("".equals(request.getParameter("content"))) ? "" : request.getParameter("content");
                    int whoID = Integer.parseInt(("".equals(request.getParameter("whoID"))) ? "" : request.getParameter("whoID"));
                    EmailDAO emailDAO = new EmailDAO();
                    if (whoID == 3) {
                        List<User> receiverList = emailDAO.getAllUserByRoleID(whoID);
                        if (emailDAO.createEmail(title, content)) {
                            Email newestEmail = emailDAO.getNewestEmail();
                            for (User receiver : receiverList) {
                                if (emailDAO.createEmailReceiver(newestEmail.getEmailID(), receiver.getUserId())) {
                                    //
                                }
                            }
                            List<Email> listEmail = new ArrayList<>();
                            listEmail = emailDAO.getAllEmail();
                            request.setAttribute("listEmail", listEmail);
                            request.setAttribute("numberEmailClick", numberEmailClick);
                            request.setAttribute("stt", "1");
                            request.getRequestDispatcher("dashboard/dashboardEmail.jsp").forward(request, response);
                        } else {
                            List<Email> listEmail = new ArrayList<>();
                            listEmail = emailDAO.getAllEmail();
                            request.setAttribute("listEmail", listEmail);
                            request.setAttribute("numberEmailClick", numberEmailClick);
                            request.setAttribute("stt", "2");
                            request.getRequestDispatcher("dashboard/dashboardEmail.jsp").forward(request, response);
                        }
                    } else if (whoID == 5) {
                        SubscribeDAO subscribeDAO = new SubscribeDAO();
                        List<Subscribe> subsList = subscribeDAO.getAllSubscribe();
                        if (emailDAO.createEmail(title, content)) {
                            Email newestEmail = emailDAO.getNewestEmail();
                            for (Subscribe subscriber : subsList) {
                                if (emailDAO.createEmailReceiver(newestEmail.getEmailID(), subscriber.getUserId())) {
                                    //
                                }
                            }
                            List<Email> listEmail = new ArrayList<>();
                            listEmail = emailDAO.getAllEmail();
                            request.setAttribute("listEmail", listEmail);
                            request.setAttribute("numberEmailClick", numberEmailClick);
                            request.setAttribute("stt", "1");
                            request.getRequestDispatcher("dashboard/dashboardEmail.jsp").forward(request, response);
                        } else {
                            List<Email> listEmail = new ArrayList<>();
                            listEmail = emailDAO.getAllEmail();
                            request.setAttribute("listEmail", listEmail);
                            request.setAttribute("numberEmailClick", numberEmailClick);
                            request.setAttribute("stt", "2");
                            request.getRequestDispatcher("dashboard/dashboardEmail.jsp").forward(request, response);
                        }
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
