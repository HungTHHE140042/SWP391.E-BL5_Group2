/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
<<<<<<< Updated upstream
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
=======
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author MSI
>>>>>>> Stashed changes
 */
public class OrderDAO {

    public OrderDAO() {
        createConnection();
    }

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
<<<<<<< Updated upstream
    String sql = null;
=======
>>>>>>> Stashed changes

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

<<<<<<< Updated upstream
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
=======
    public boolean insertOrder(int userID, double totalPrice, int promotionID) {
        String sql = "INSERT INTO [dbo].[order]\n"
                + "           ([userID]\n"
                + "           ,[totalPrice]\n"
                + "           ,[status]\n"
                + "           ,[date]\n"
                + "           ,[promotionID])\n"
                + "     VALUES\n"
                + "           (?,?,?,getDate(),?)"; 
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setDouble(2, totalPrice);
            ps.setInt(3, 1);
            ps.setInt(4, promotionID);
            ps.executeUpdate();
            ps.close();
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int getLastOrderID(){
        String sql = "SELECT IDENT_CURRENT('order')";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                return id;
>>>>>>> Stashed changes
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
<<<<<<< Updated upstream
            return 0;
        }
        return 0;
    }
=======
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        OrderDAO orderDAO = new OrderDAO();
        System.out.println(orderDAO.getLastOrderID());
    }

>>>>>>> Stashed changes
}
