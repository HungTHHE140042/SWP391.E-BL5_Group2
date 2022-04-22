/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.CategoryDAO;
import dao.ProductDAO;
import entity.Category;
import entity.Product;
import function.AES;
import function.Calculate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author trinh
 */
@MultipartConfig
public class ManagementProductEditController extends HttpServlet {

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
        String id = request.getParameter("id");

        if (id != null) {
            int productId = Integer.parseInt(id);
            ProductDAO pDAO = new ProductDAO();
            Product p = pDAO.getProductInformationByProductId(productId);
            request.setAttribute("product", p);

            CategoryDAO cDAO = new CategoryDAO();
            List<Category> listCategory = new ArrayList<>();
            listCategory = cDAO.getAll();
            request.setAttribute("listCategory", listCategory);

            request.getRequestDispatcher("dashboard/dashboardProductEdit.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        request.getRequestDispatcher("dashboard/dashboardProductEdit.jsp").forward(request, response);
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
        try {
            int id = Integer.parseInt(request.getParameter("idEdit"));
            String name = request.getParameter("name");
            String imgSqu = request.getParameter("imageSquare");
            String imgRec = request.getParameter("imageRectangle");
            double originalPrice = Double.parseDouble("".equals(request.getParameter("originalPrice")) ? "0" : request.getParameter("originalPrice"));
            double salePercent = Double.parseDouble("".equals(request.getParameter("salePercent")) ? "0" : request.getParameter("salePercent"));
            int catId = Integer.parseInt(request.getParameter("categoryId"));
            int statusId = Integer.parseInt(request.getParameter("statusId"));
            String desc = request.getParameter("description");
            int amount = Integer.parseInt(request.getParameter("amount"));

            ProductDAO pDAO = new ProductDAO();

            //Upload product key file
            Part uploadKeyFilePart = request.getPart("product-key-file");
            String uploadFileName = Paths.get(uploadKeyFilePart.getSubmittedFileName()).getFileName().toString();
            if (!uploadFileName.equals("")) {
                String uploadFolderPath = getServletContext().getRealPath("/upload") + File.separator + uploadFileName;
                InputStream inputStream = uploadKeyFilePart.getInputStream();

                try {
                    byte[] byt = new byte[inputStream.available()];
                    inputStream.read(byt);
                    FileOutputStream fileOutputStream = new FileOutputStream(uploadFolderPath);
                    fileOutputStream.write(byt);
                    fileOutputStream.flush();
                    fileOutputStream.close();

                    //Read upload file
                    FileInputStream fileInputStream = new FileInputStream(uploadFolderPath);
                    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    FormulaEvaluator formula = workbook.getCreationHelper().createFormulaEvaluator();

                    List<String> keyList = new ArrayList<>();
                    for (Row row : sheet) {
                        for (Cell cell : row) {
                            if (!cell.getStringCellValue().equals("")) {
                                keyList.add(cell.getStringCellValue());
                            }
                        }
                    }
                    for (String key : keyList) {
                        String encryptKey = AES.encrypt(key, "@ch40_4nh_3m_nh3");
                        pDAO.insertProductKey(id, encryptKey);
                    }
                    amount = amount + keyList.size();
                } catch (Exception e) {
                        System.out.println(e);
                }

            }

            double sellPrice = Calculate.calculateSellPrice(originalPrice, salePercent);

            if (pDAO.updateProductInformation(id, name, desc, originalPrice, sellPrice, salePercent, catId, amount, statusId, imgSqu, imgRec)) {
                System.out.println("update_success");
            } else {
                System.out.println("update_fail");
            }

            response.sendRedirect("dashboard-product");

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
