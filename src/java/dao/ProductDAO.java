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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ProductDAO {

    public ProductDAO() {
        createConnection();
    }

    DBContext u = new DBContext();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private String query;

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
    
    //get All san pham
    public ArrayList<Product> getAll(){
        ArrayList<Product> listProduct = new ArrayList<>();
        //String sql = "select product.productID,product.productName,product.description,product.originalPrice,product.sellPrice,product.salePercent,product.categoryID,product.sellerID,product.amount,product.statusID,product.createdDate, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID where productImg.type = 1 ;";
        query="select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID where productImg.type = 1";
        
        try {
            con = u.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Product product = new Product(
                        rs.getInt("productID"), 
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
                        rs.getString("productImgURL").trim());
                            
                listProduct.add(product);
            }
              
             return listProduct;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;      
    }
    
    public int getTotalProduct(){           
        query = "select count(*) from product";
        
        try {
            con = u.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    public Product getProductByID(int id){
        query = "select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID Where productImg.type = 1 AND product.productID = ?";
        try {
            con = u.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                Product product = new Product(
                        rs.getInt("productID"), 
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
                        rs.getString("productImgURL").trim());
                            
                return product;               
            }
        } catch (Exception e) {
        }
        
        return null;
    }
    
    public ArrayList<Product> searchProduct(int index, String txtSearch, int categoryId,int price){
        
        ArrayList<Product> listProductSearch = new ArrayList<>();                          
        try {
            int count = 1;
            query = "select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID Where productImg.type = 1";
            if(txtSearch != null){
                query += " AND productName LIKE '%"+txtSearch+"%'";
            }
            if(categoryId != 0){
                query += " AND categoryID = "+categoryId+"";
            }
            switch (price) {
                case 1:
                    break;
                case 2:
                    query += " AND product.sellPrice <= 20 ";
                    break;
                case 3:
                    query += " AND product.sellPrice > 20 AND product.sellPrice <= 40 ";
                    break;
                case 4:
                    query += " AND product.sellPrice > 40 AND product.sellPrice <= 60 ";
                    break;              
            }
            query += " ORDER BY productID OFFSET "+(index-1)*3+" ROWS FETCH NEXT 3 ROWS ONLY";           
            con = u.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Product product = new Product(
                        rs.getInt("productID"), 
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
                        rs.getString("productImgURL").trim());
                            
                listProductSearch.add(product);
            }
            return listProductSearch;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProductSearch;
    }
    
    public ArrayList<Product> searchProduct1(int index, String txtSearch, int categoryId,int price){
        
        ArrayList<Product> listProductSearch = new ArrayList<>();                          
        try {
            int count = 1;
            query = "select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID Where productImg.type = 1";
            if(txtSearch != null){
                query += " AND productName LIKE '%"+txtSearch+"%'";
            }
            if(categoryId != 0){
                query += " AND categoryID = "+categoryId+"";
            }
            switch (price) {
                case 1:
                    break;
                case 2:
                    query += " AND product.sellPrice <= 20 ";
                    break;
                case 3:
                    query += " AND product.sellPrice > 20 AND product.sellPrice <= 40 ";
                    break;
                case 4:
                    query += " AND product.sellPrice > 40 AND product.sellPrice <= 60 ";
                    break;              
            }           
            con = u.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Product product = new Product(
                        rs.getInt("productID"), 
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
                        rs.getString("productImgURL").trim());
                            
                listProductSearch.add(product);
            }
            return listProductSearch;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listProductSearch;
    }

    public List<Product> getAllProductTypeSquare() {
        List<Product> list = new ArrayList<>();
        query = "select p.*,pI.productImgURL  from product p \n"
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
        query = "select p.*,pI.productImgURL  from product p \n"
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
        query = "select top 3 p.*,pI.productImgURL  from product p \n"
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
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return list;
    }

    public Product getLastProduct() {
        List<Product> list = new ArrayList<>();
        query = "select top 1 p.*,pI.productImgURL  from product p \n"
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
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public String countProduct() {
        query = "select COUNT(productID) as NumberOfProduct from product";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String number = rs.getString("NumberOfProduct");
                return number;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public List<Product> getTop4PupularProduct() {
        List<Product> list = new ArrayList<>();
        query = "select TOP 4 p.*, pI.productImgURL from product p, orderDetail od, productImg pI \n"
                + "where p.productID = od.productID and p.productID = pI.productID and pI.type = 1\n"
                + "group by p.productID, p. productName, \n"
                + "p.description, p.originalPrice, p.sellPrice, p.salePercent, \n"
                + "p.categoryID, p.sellerID, p.amount, p.statusID, p.createdDate, pI.productImgURL\n"
                + "order by COUNT(od.orderID) desc";

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
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        List<Product> listProductSquare = productDAO.getAllProductTypeSquare();
        List<Product> listProductRectangle = productDAO.getAllProductTypeRectangle();
        List<Product> listProductSale = productDAO.getTop3SaleProduct();
        List<Product> listProductPupular = productDAO.getTop4PupularProduct();
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
        System.out.println("-------------------------------------------------------");
        for (Product product : listProductPupular) {
            System.out.println(product);
        }
    }
}
