/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Cart;
import entity.CartDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class CartDAO {

    public CartDAO() {
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
    
    public boolean deleteCart(int userID){
        String sql = "DELETE FROM cart WHERE userID = "+userID+"";
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean createCart(int productID, int amount, int userID) {
        String sql = "Insert into cart(productID,amount,userID) values(?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, productID);
            ps.setInt(2, amount);
            ps.setInt(3, userID);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkProductCart(int productID, int userID) {
        String sql = "Select * from Cart Where productID = " + productID + " and userID = " + userID + "";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cart cart = new Cart(rs.getInt("ID"), rs.getInt("productID"), rs.getInt("amount"), rs.getInt("userID"));
                ps.close();
                rs.close();
                if (cart != null) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateCart(int productID, int amount, int userID) {
        if (con == null) {
            createConnection();
        }
        amount += 1;
        String sql = "update [cart] set amount = " + amount + " where productID = " + productID + " AND  userID = " + userID + " ";
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int getAmountCart(int productID, int userID) {
        if (con == null) {
            createConnection();
        }
        String sql = "select amount from cart where productID = " + productID + " AND userID = " + userID + "";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int amount = rs.getInt("amount");

                return amount;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public ArrayList<CartDetail> getCartByUser(int userID) {
        if (con == null) {
            createConnection();
        }
        ArrayList<CartDetail> cartDetails = new ArrayList<>();
        String sql = "Select product.productID, product.productName, product.sellPrice, cart.amount, cart.userID from product "
                + "Inner join cart on product.productID = cart.productID where userID = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            while (rs.next()) {
                CartDetail cartDetail = new CartDetail(
                        rs.getInt("productID"),
                        rs.getString("productName"),
                        rs.getDouble("sellPrice"),
                        rs.getInt("amount"));

                cartDetails.add(cartDetail);             
            }
            return cartDetails;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public Boolean removeFromCart(int productID, int userID){
        if (con == null) {
            createConnection();
        }
        String sql ="delete from cart where productID = "+productID+" AND userID =  "+userID+"";
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        CartDAO addToCartDAO = new CartDAO();
        System.out.println(addToCartDAO.removeFromCart(1, 4));
    }
}
