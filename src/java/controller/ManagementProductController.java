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
import entity.User;
import function.AES;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
public class ManagementProductController extends HttpServlet {

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
        ProductDAO pDAO = new ProductDAO();

        request.setAttribute("stt", null);

        if (id != null) {
            int idDel = Integer.parseInt(id);
            if (pDAO.deleteProductByProductId(idDel)) {
                List<Product> listProduct = new ArrayList<>();
                listProduct = pDAO.getAllProductInformation();
                request.setAttribute("listProduct", listProduct);

                CategoryDAO cDAO = new CategoryDAO();
                List<Category> listCategory = new ArrayList<>();
                listCategory = cDAO.getAll();
                request.setAttribute("listCategory", listCategory);

                request.setAttribute("stt", "3");
                request.getRequestDispatcher("dashboard/dashboardProduct.jsp").forward(request, response);
            } else {
                CategoryDAO cDAO = new CategoryDAO();
                List<Category> listCategory = new ArrayList<>();
                listCategory = cDAO.getAll();
                request.setAttribute("listCategory", listCategory);

                request.setAttribute("stt", "4");
                request.getRequestDispatcher("dashboard/dashboardProduct.jsp").forward(request, response);
            }
        }

        List<Product> listProduct = new ArrayList<>();
        listProduct = pDAO.getAllProductInformation();
        request.setAttribute("listProduct", listProduct);

        CategoryDAO cDAO = new CategoryDAO();
        List<Category> listCategory = new ArrayList<>();
        listCategory = cDAO.getAll();
        request.setAttribute("listCategory", listCategory);

        request.getRequestDispatcher("dashboard/dashboardProduct.jsp").forward(request, response);
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
        String name = request.getParameter("name");
        Double price = Double.parseDouble(("".equals(request.getParameter("price")) ? "0" : request.getParameter("price")));
        int categoryId = Integer.parseInt(("".equals(request.getParameter("category")) ? "0" : request.getParameter("category")));
        String imgSqu = request.getParameter("imageSqu");
        String imgRec = request.getParameter("imageRec");
        String desc = request.getParameter("description");
        List<String> listProductKey = new ArrayList<>();

        //Up file to Upload folder
        Part uploadFilePart = request.getPart("product-key-file");
        String uploadFileName = Paths.get(uploadFilePart.getSubmittedFileName()).getFileName().toString();

        InputStream inputStream = uploadFilePart.getInputStream();

        String uploadFolderPath = getServletContext().getRealPath("/upload") + File.separator + uploadFileName;

        if (uploadFolderPath == null) {

        }

        try {
            byte[] byt = new byte[inputStream.available()];
            inputStream.read(byt);
            FileOutputStream fileOutputStream = new FileOutputStream(uploadFolderPath);
            fileOutputStream.write(byt);
            fileOutputStream.flush();
            fileOutputStream.close();

            //Read data from Uploaded file
            FileInputStream fileInputStream = new FileInputStream(uploadFolderPath);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            FormulaEvaluator formula = workbook.getCreationHelper().createFormulaEvaluator();
            for (Row row : sheet) {
                for (Cell cell : row) {
                    if (!cell.getStringCellValue().equals("")) {
                        listProductKey.add(cell.getStringCellValue());
                    }
                }
            }
            workbook.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Add new Product
        ProductDAO pDAO = new ProductDAO();

        HttpSession session = request.getSession();
        User u = (User) session.getAttribute("user");

        if (pDAO.createNewProduct(name, desc, price, categoryId, u.getUserId(), listProductKey.size())) {
            System.out.println(listProductKey.size() + "..");
            int newestId = pDAO.getNewestProductId();
            if (pDAO.insertProductImageSquare(newestId, imgSqu) && pDAO.insertProductImageRectangle(newestId, imgRec)) {
                for (String key : listProductKey) {
                    //Encrypt product key before insert to database
                    String encryptKey = AES.encrypt(key, "@ch40_4nh_3m_nh3");
                    pDAO.insertProductKey(newestId, encryptKey);
                }
                request.setAttribute("stt", "1");
            } else {
                CategoryDAO cDAO = new CategoryDAO();
                List<Category> listCategory = new ArrayList<>();
                listCategory = cDAO.getAll();
                request.setAttribute("listCategory", listCategory);

                request.setAttribute("stt", "2");
                request.getRequestDispatcher("dashboard/dashboardProduct.jsp").forward(request, response);
            }
        } else {
            CategoryDAO cDAO = new CategoryDAO();
            List<Category> listCategory = new ArrayList<>();
            listCategory = cDAO.getAll();
            request.setAttribute("listCategory", listCategory);

            request.setAttribute("stt", "2");
            request.getRequestDispatcher("dashboard/dashboardProduct.jsp").forward(request, response);
        }

        List<Product> listProduct = new ArrayList<>();
        listProduct = pDAO.getAllProductInformation();
        request.setAttribute("listProduct", listProduct);

        CategoryDAO cDAO = new CategoryDAO();
        List<Category> listCategory = new ArrayList<>();
        listCategory = cDAO.getAll();
        request.setAttribute("listCategory", listCategory);

        request.getRequestDispatcher("dashboard/dashboardProduct.jsp").forward(request, response);
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
