/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.FaqDAO;
import entity.FaqJoinUser;
import entity.User;
import function.SendEmail;
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
public class ManagementFaqController extends HttpServlet {

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
            if (u.getRoleId() == 1 || u.getRoleId() == 4) {
                FaqDAO faqDAO = new FaqDAO();
                List<FaqJoinUser> listFAQ = new ArrayList<>();
                int numberFAQClick = 1;
                try {
                    int Id = Integer.parseInt(request.getParameter("idDelete"));
                    if (faqDAO.removeFaqById(Id)) {
                        listFAQ = faqDAO.getAllFAQs();
                        request.setAttribute("numberFAQClick", numberFAQClick);
                        request.setAttribute("List_FAQ", listFAQ);
                        request.getRequestDispatcher("dashboard/dashboardFAQ.jsp").forward(request, response);
                    }
                } catch (Exception e) {
                    listFAQ = faqDAO.getAllFAQs();
                    request.setAttribute("numberFAQClick", numberFAQClick);
                    request.setAttribute("List_FAQ", listFAQ);
                    request.getRequestDispatcher("dashboard/dashboardFAQ.jsp").forward(request, response);
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
                try {
                    String ID = request.getParameter("idEdit");
                    String title = request.getParameter("title");
                    String content = request.getParameter("content");
                    FaqDAO faqDAO = new FaqDAO();
                    List<FaqJoinUser> listFAQ = new ArrayList<>();
                    int numberFAQClick = 1;
                    System.out.println("user " + u);
                    if (ID != null) {
                        int Id = Integer.parseInt(ID);
                        if (faqDAO.updateFAQ(Id, title, content)) {
                            listFAQ = faqDAO.getAllFAQs();
                            request.setAttribute("numberFAQClick", numberFAQClick);
                            request.setAttribute("List_FAQ", listFAQ);
                            request.getRequestDispatcher("dashboard/dashboardFAQ.jsp").forward(request, response);
                        }
                    }
                    String titleCreate = request.getParameter("titleCreate");
                    String contentCreate = request.getParameter("contentCreate");
                    if (!(titleCreate.isEmpty() && contentCreate.isEmpty())) {
                        if (faqDAO.createFAQ(u.getUserId(), titleCreate, contentCreate)) {
                            listFAQ = faqDAO.getAllFAQs();
                            request.setAttribute("numberFAQClick", numberFAQClick);
                            request.setAttribute("List_FAQ", listFAQ);

                            SendEmail.sendEmailToSubscriber("[^^] Let check new FAQ", "New FAQ: " + titleCreate + " [<a href='http://localhost:8080/SWP391.E-BL5_Group2/faq'>more...</a>]");
                            request.getRequestDispatcher("dashboard/dashboardFAQ.jsp").forward(request, response);
                        }
                    }
                } catch (Exception e) {
                    System.out.println("e " + e);
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
