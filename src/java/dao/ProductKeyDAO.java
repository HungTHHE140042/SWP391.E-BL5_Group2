/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.ProductKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MSI
 */
public class ProductKeyDAO {

    public ProductKeyDAO() {
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

    public ProductKey getProducKey(int productID) {
        String sql = "select * from productKey where productID = " + productID + " and status = 1";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductKey productKey = new ProductKey();
                productKey.setKeyID(rs.getInt("keyID"));
                productKey.setProductID(rs.getInt("productID"));
                productKey.setProductKey(rs.getString("productKey").trim());
                productKey.setStatus(rs.getInt("status"));
                ps.close();
                rs.close();
                return productKey;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateStatusKey(int keyID) {

        String sql = "update [productKey] set status = 0 where keyID = " + keyID + "";

        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int countProductKey(int productID) {

        String sql = "select count(*) from productKey where productID = " + productID + " and status = 1";

        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int count = rs.getInt(1);
            return count;
            }         
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static void main(String[] args) {
        ProductKeyDAO productKeyDAO = new ProductKeyDAO();
        System.out.println(productKeyDAO.countProductKey(1));;
    }
}
