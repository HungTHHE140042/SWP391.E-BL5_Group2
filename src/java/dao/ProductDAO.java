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
    
    public boolean updateAmountProduct(int productID, int amount){
        String sql = "update [product] set amount = "+amount+" where productID ="+productID+"";
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    //get All san pham
    public ArrayList<Product> getAll() {
        ArrayList<Product> listProduct = new ArrayList<>();
        //String sql = "select product.productID,product.productName,product.description,product.originalPrice,product.sellPrice,product.salePercent,product.categoryID,product.sellerID,product.amount,product.statusID,product.createdDate, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID where productImg.type = 1 ;";
        query = "select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID where productImg.type = 1";

        try {
            con = u.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
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

    public int getTotalProduct() {
        query = "select count(*) from product";

        try {
            con = u.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public Product getProductByID(int id) {
        query = "select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID Where productImg.type = 2 AND product.productID = ?";
        try {
            con = u.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
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

    public ArrayList<Product> searchProduct(int index, String txtSearch, int categoryId, int price) {

        ArrayList<Product> listProductSearch = new ArrayList<>();
        try {
            int count = 1;
            query = "select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID Where productImg.type = 1";
            if (txtSearch != null) {
                query += " AND productName LIKE '%" + txtSearch + "%'";
            }
            if (categoryId != 0) {
                query += " AND categoryID = " + categoryId + "";
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
            query += " ORDER BY productID OFFSET " + (index - 1) * 3 + " ROWS FETCH NEXT 3 ROWS ONLY";
            System.out.println(query);
            con = u.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
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

    public ArrayList<Product> searchProduct1(int index, String txtSearch, int categoryId, int price) {

        ArrayList<Product> listProductSearch = new ArrayList<>();
        try {
            int count = 1;
            query = "select product.*, productImg.productImgURL from product inner join productImg On product.productID = productImg.productID Where productImg.type = 1";
            if (txtSearch != null) {
                query += " AND productName LIKE '%" + txtSearch + "%'";
            }
            if (categoryId != 0) {
                query += " AND categoryID = " + categoryId + "";
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
            while (rs.next()) {
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
                list.add(new Product(
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

    public List<Product> getAllProductInformation() {
        List<Product> list = new ArrayList<>();
        query = "select D.*, [user].username\n"
                + "from\n"
                + "	(select C.*, category.categoryName \n"
                + "	from\n"
                + "		(select A.productID, A.productName, A.[description], A.originalPrice, A.sellPrice, A.salePercent, A.categoryID, A.sellerID, A.amount, A.statusID, A.createdDate, A.ImageSqu, B.ImageRec\n"
                + "		from \n"
                + "		(select product.*, (productImg.productImgURL) AS 'ImageSqu' from product, productImg where product.productID = productImg.productID AND productImg.type = 1) AS A\n"
                + "		JOIN\n"
                + "		(select product.*, (productImg.productImgURL) AS 'ImageRec' from product, productImg where product.productID = productImg.productID AND productImg.type = 2) AS B\n"
                + "		ON A.productID = B.productID) AS C\n"
                + "	JOIN \n"
                + "	category\n"
                + "	ON C.categoryID = category.categoryID) AS D\n"
                + "JOIN [user] ON D.sellerID = [user].userID";

        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
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
                        rs.getString("ImageSqu"),
                        rs.getString("ImageRec"),
                        rs.getString("categoryName"),
                        rs.getString("username"))
                );
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public Product getProductInformationByProductId(int productId) {
        query = "select D.*, [user].username\n"
                + "from\n"
                + "	(select C.*, category.categoryName \n"
                + "	from\n"
                + "		(select A.productID, A.productName, A.[description], A.originalPrice, A.sellPrice, A.salePercent, A.categoryID, A.sellerID, A.amount, A.statusID, A.createdDate, A.ImageSqu, B.ImageRec\n"
                + "		from \n"
                + "		(select product.*, (productImg.productImgURL) AS 'ImageSqu' from product, productImg where product.productID = productImg.productID AND productImg.type = 1) AS A\n"
                + "		JOIN\n"
                + "		(select product.*, (productImg.productImgURL) AS 'ImageRec' from product, productImg where product.productID = productImg.productID AND productImg.type = 2) AS B\n"
                + "		ON A.productID = B.productID) AS C\n"
                + "	JOIN \n"
                + "	category\n"
                + "	ON C.categoryID = category.categoryID) AS D\n"
                + "JOIN [user] ON D.sellerID = [user].userID WHERE D.productID = ?";

        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, productId);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt("productID"),
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
                        rs.getString("ImageSqu"),
                        rs.getString("ImageRec"),
                        rs.getString("categoryName"),
                        rs.getString("username"));
                ps.close();
                rs.close();
                return p;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public boolean createNewProduct(String name, String desc, double price, int catId, int sellerId, int amount) {
        String sql = "insert into product(productName, description, originalPrice, sellPrice, salePercent, categoryID, sellerID, amount, statusID, createdDate) values (?, ?, ?, ?, 0, ?, ?, ?, ?, GETDATE())";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, desc);
            ps.setDouble(3, price);
            ps.setDouble(4, price);
            ps.setInt(5, catId);
            ps.setInt(6, sellerId);
            ps.setInt(7, amount);
            ps.setInt(8, 2);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertProductImageSquare(int productId, String imgSqu) {
        String sql = "insert into productImg (productID, productImgUrl, type) values (?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
            ps.setString(2, imgSqu);
            ps.setInt(3, 1);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insertProductImageRectangle(int productId, String imgRec) {
        String sql = "insert into productImg (productID, productImgUrl, type) values (?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
            ps.setString(2, imgRec);
            ps.setInt(3, 2);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void insertProductKey(int productId, String productKey) {
        String sql = "insert into productKey (productID, productKey, status) values (?, ?, 1)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
            ps.setString(2, productKey);
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getNewestProductId() {
        String sql = "select * from product order by productID DESC";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("productID");
                ps.close();
                rs.close();
                return id;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }

    public boolean deleteProductByProductId(int productId) {
        String sql1 = "DELETE FROM productKey WHERE productID=?";
        String sql2 = "DELETE FROM productImg WHERE productID=?";
        String sql3 = "DELETE FROM product WHERE productID=?";
        try {
            ps = con.prepareStatement(sql1);
            ps.setInt(1, productId);
            ps.executeUpdate();

            ps = con.prepareStatement(sql2);
            ps.setInt(1, productId);
            ps.executeUpdate();

            ps = con.prepareStatement(sql3);
            ps.setInt(1, productId);
            ps.executeUpdate();

            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateProductInformation(int productId, String name, String desc, double originalPrice, double sellPrice, double salePercent, int catId, int amount, int statusId, String imgSqu, String imgRec) {
        if (con == null) {
            createConnection();
        }
        String sql1 = "update product set productName = ?, description = ?, originalPrice = ?, "
                + "sellPrice = ?, salePercent = ?, categoryID = ?, amount = ?, statusID = ? "
                + "where productID = ?";
        String sql2 = "update productImg set productImgURL = ? "
                + "where productID = ? and type=1";
        String sql3 = "update productImg set productImgURL = ? "
                + "where productID = ? and type=2";
        try {
            ps = con.prepareStatement(sql1);
            ps.setString(1, name);
            ps.setString(2, desc);
            ps.setDouble(3, originalPrice);
            ps.setDouble(4, sellPrice);
            ps.setDouble(5, salePercent);
            ps.setInt(6, catId);
            ps.setInt(7, amount);
            ps.setInt(8, statusId);
            ps.setInt(9, productId);
            ps.executeUpdate();

            ps = con.prepareStatement(sql2);
            ps.setString(1, imgSqu);
            ps.setInt(2, productId);
            ps.executeUpdate();

            ps = con.prepareStatement(sql3);
            ps.setString(1, imgRec);
            ps.setInt(2, productId);
            ps.executeUpdate();

            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
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
