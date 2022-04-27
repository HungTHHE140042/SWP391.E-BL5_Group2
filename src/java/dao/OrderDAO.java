/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Order;
import entity.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh ======= import java.sql.Connection; import
 * java.sql.PreparedStatement; import java.sql.ResultSet;
 *
 *
 * /**
 *
 * @author MSI >>>>>>> Stashed changes
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
    
    public boolean updateNote(String note,int orderID) {
        String sql = "update [order] set note = '"+note+"' where ID = " + orderID + "";
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public Order getOrderByID(int orderID){
        String sql ="select * from [order] where ID = "+orderID+"";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Order order = new Order(
                        rs.getInt("ID"), 
                        rs.getInt("userID"), 
                        rs.getDouble("totalPrice"), 
                        rs.getString("note"), 
                        rs.getInt("status"), 
                        rs.getDate("date"), 
                        rs.getInt("promotionID"));
                return order;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<OrderDetail> getOrderDetailByOrderID(int orderID) {
        String sql = "select orderDetail.*,productKey.productKey from orderDetail inner join productKey on orderDetail.keyID = productKey.keyID where orderID = "+orderID+"";
        List<OrderDetail> list = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new OrderDetail(
                        rs.getInt("ID"), 
                        rs.getInt("orderID"), 
                        rs.getInt("productID"), 
                        rs.getString("productName"), 
                        rs.getInt("quantity"), 
                        rs.getDouble("productPrice"), 
                        rs.getInt("keyID"), 
                        rs.getString("productKey")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Order> getAllOrder() {
        String sql = "select * from [order]";
        List<Order> list = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Order(rs.getInt("ID"),
                        rs.getInt("userID"),
                        rs.getFloat("totalPrice"),
                        rs.getString("note"),
                        rs.getInt("status"),
                        rs.getDate("date"),
                        rs.getInt("promotionID")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
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

    public boolean cancelOrder(int orderId) {
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

    public int getOrderStatusByOrderId(int orderId) {
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

    public boolean insertOrderWithoutPro(int userID, double totalPrice) {
        String sql = "INSERT INTO [dbo].[order]\n"
                + "           ([userID]\n"
                + "           ,[totalPrice]\n"
                + "           ,[status]\n"
                + "           ,[date]\n"
                + "           )\n"
                + "     VALUES\n"
                + "           (?,?,?,getDate())";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setDouble(2, totalPrice);
            ps.setInt(3, 1);
            ps.executeUpdate();
            ps.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

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

    public int getLastOrderID() {
        String sql = "SELECT IDENT_CURRENT('order')";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                return id;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    public boolean updateStatusReject(int orderID) {
        String sql = "update [order] set status = 3 where ID = " + orderID + "";
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateStatus(int orderID) {
        String sql = "update [order] set status = 2 where ID = " + orderID + "";
        try {
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public int getPromotionIdByOrderID(int orderID){
        String sql = "select promotionID from [order] where ID = "+orderID+"";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                int count = rs.getInt(1);
                return count;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        OrderDAO orderDAO = new OrderDAO();
        System.out.println(orderDAO.getOrderByID(65));
    }

}
