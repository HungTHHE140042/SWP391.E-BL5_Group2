/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class OrderDAO {

    public OrderDAO() {
        createConnection();
    }

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;

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

    public List<Order> getAllOrderByUserId(int userId) {
        if (con == null) {
            createConnection();
        }
        List<Order> list = new ArrayList<>();
        String query = "SELECT * FROM\n"
                + "(select * from [order] where [order].userID = ?) A \n"
                + "LEFT JOIN \n"
                + "promotion p\n"
                + "ON A.promotionID = p.ID";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt("ID"),
                        rs.getInt("userID"),
                        rs.getFloat("totalPrice"),
                        rs.getString("note"),
                        rs.getInt("status"),
                        rs.getDate("date"),
                        rs.getInt("promotionID"),
                        rs.getString("promotionCode")
                ));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean cancelOrder(int orderId){
        String sql = "UPDATE [order] SET [status] =  4 WHERE ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, orderId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public int getOrderStatusByOrderId(int orderId){
        String query = "select [status] from [order] o where o.ID = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, orderId);
            rs = ps.executeQuery();
            while (rs.next()) {
                int status = Integer.parseInt(rs.getString("status"));
                return status;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }
}
