/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class ProductDAO {

    public ProductDAO() {
        createConnection();
    }

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void createConnection() {
        DBContext u = new DBContext();
        try {
            con = u.getConnection();
            System.out.println("Connect database Success");
        } catch (Exception e) {
            System.out.println("Connect database Fail");
            e.printStackTrace();
        }
    }

    public List<Product> getAllProductTypeSquare() {
        List<Product> list = new ArrayList<>();
        String query = "select p.*,pI.productImgURL  from product p \n"
                + "inner join productImg pI\n"
                + "ON p.productID = pI.productID where pI.type = 1";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("productID"),
                        rs.getString("productName"),
                        rs.getString("description"),
                        rs.getDouble("originalPrice"),
                        rs.getDouble("sellPrice"),
                        rs.getDouble("salePercent"),
                        rs.getInt("categoryID"),
                        rs.getInt("sellerID"),
                        rs.getInt("amount"),
                        rs.getInt("statusID"),
                        rs.getDate("createdDate"),
                        rs.getString("productImgURL")));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> getAllProductTypeRectangle() {
        List<Product> list = new ArrayList<>();
        String query = "select p.*,pI.productImgURL  from product p \n"
                + "inner join productImg pI\n"
                + "ON p.productID = pI.productID where pI.type = 2";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("productID"),
                        rs.getString("productName"),
                        rs.getString("description"),
                        rs.getDouble("originalPrice"),
                        rs.getDouble("sellPrice"),
                        rs.getDouble("salePercent"),
                        rs.getInt("categoryID"),
                        rs.getInt("sellerID"),
                        rs.getInt("amount"),
                        rs.getInt("statusID"),
                        rs.getDate("createdDate"),
                        rs.getString("productImgURL")));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public List<Product> getTop3SaleProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select top 3 p.*,pI.productImgURL  from product p \n"
                + "inner join productImg pI\n"
                + "ON p.productID = pI.productID where pI.type = 1\n"
                + "order by salePercent desc";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt("productID"),
                        rs.getString("productName"),
                        rs.getString("description"),
                        rs.getDouble("originalPrice"),
                        rs.getDouble("sellPrice"),
                        rs.getDouble("salePercent"),
                        rs.getInt("categoryID"),
                        rs.getInt("sellerID"),
                        rs.getInt("amount"),
                        rs.getInt("statusID"),
                        rs.getDate("createdDate"),
                        rs.getString("productImgURL")));
            }
        } catch (Exception e) {
        }

        return list;
    }

    public Product getLastProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select top 1 p.*,pI.productImgURL  from product p \n"
                + "inner join productImg pI\n"
                + "ON p.productID = pI.productID where pI.type = 1\n"
                + "order by P.productID desc";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt("productID"),
                        rs.getString("productName"),
                        rs.getString("description"),
                        rs.getDouble("originalPrice"),
                        rs.getDouble("sellPrice"),
                        rs.getDouble("salePercent"),
                        rs.getInt("categoryID"),
                        rs.getInt("sellerID"),
                        rs.getInt("amount"),
                        rs.getInt("statusID"),
                        rs.getDate("createdDate"),
                        rs.getString("productImgURL"));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public String countProduct() {
        String query = "select COUNT(productID) as NumberOfProduct from product";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String number = rs.getString("NumberOfProduct");
                return number;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        List<Product> listProductSquare = productDAO.getAllProductTypeSquare();
        List<Product> listProductRectangle = productDAO.getAllProductTypeRectangle();
        List<Product> listProductSale = productDAO.getTop3SaleProduct();
        
        Product lastProduct = productDAO.getLastProduct();
        
        String count = productDAO.countProduct();
        
        for (Product product : listProductSquare) {
            System.out.println(product);
        }
        System.out.println("-------------------------------------------------------");
        for (Product product : listProductRectangle) {
            System.out.println(product);
        }
        System.out.println("-------------------------------------------------------");
        for (Product product : listProductSale) {
            System.out.println(product);
        }
        System.out.println("-------------------------------------------------------");
        System.out.println(lastProduct);
        System.out.println("-------------------------------------------------------");
        System.out.println(count);
    }
}
