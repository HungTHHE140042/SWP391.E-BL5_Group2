/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoryDAO;
import entity.Category;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author trinh
 */
public class ManagementCategoryController extends HttpServlet {

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

        CategoryDAO cDAO = new CategoryDAO();
        ArrayList<Category> listCateogry = new ArrayList<>();
        listCateogry = cDAO.getAll();

        request.setAttribute("msg", null);
        request.setAttribute("listCategory", listCateogry);

        request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);
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
        String idDelete = request.getParameter("idDelete");
        String idEdit = request.getParameter("idEdit");
        String categoryEdit = request.getParameter("categoryEdit");
        String categoryCreate = request.getParameter("categoryCreate");

        CategoryDAO cDAO = new CategoryDAO();

        if (categoryCreate != null) {
            if (cDAO.createCategory(categoryCreate)) {
                ArrayList<Category> listCateogry = new ArrayList<>();
                listCateogry = cDAO.getAll();
                request.setAttribute("listCategory", listCateogry);
                request.setAttribute("msg", "1");

                request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);
            } else {
                ArrayList<Category> listCateogry = new ArrayList<>();
                listCateogry = cDAO.getAll();
                request.setAttribute("listCategory", listCateogry);
                request.setAttribute("msg", "0");
                request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);

            }
        }
        if (idDelete != null) {
            int id = Integer.parseInt(idDelete);
            if (cDAO.deleteCategory(id)) {
                ArrayList<Category> listCateogry = new ArrayList<>();
                listCateogry = cDAO.getAll();
                request.setAttribute("listCategory", listCateogry);
                request.setAttribute("msg", "2");

                request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);
            } else {
                ArrayList<Category> listCateogry = new ArrayList<>();
                listCateogry = cDAO.getAll();
                request.setAttribute("listCategory", listCateogry);
                request.setAttribute("msg", "0");
                request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);
            }
        }
        if (idEdit != null) {
            int id = Integer.parseInt(idEdit);
            if (cDAO.editCategory(id, categoryEdit)) {
                ArrayList<Category> listCateogry = new ArrayList<>();
                listCateogry = cDAO.getAll();
                request.setAttribute("listCategory", listCateogry);

                request.setAttribute("msg", "3");

                request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);
            } else {
                ArrayList<Category> listCateogry = new ArrayList<>();
                listCateogry = cDAO.getAll();
                request.setAttribute("listCategory", listCateogry);
                request.setAttribute("msg", "0");
                request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);
            }
        }

        ArrayList<Category> listCateogry = new ArrayList<>();
        listCateogry = cDAO.getAll();

        request.setAttribute("listCategory", listCateogry);
        request.setAttribute("msg", null);
        request.getRequestDispatcher("dashboard/dashboardCategory.jsp").forward(request, response);
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
