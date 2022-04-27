/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Notification;
import entity.NotificationDetail;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NotificationDAO {

    public NotificationDAO() {
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

    public List<Notification> getAllNotification() {
        if (con == null) {
            createConnection();
        }
        List<Notification> list = new ArrayList<>();
        String query = "SELECT [ID],[title] ,[status] ,[time] ,[content] FROM [GameShop].[dbo].[notification] ";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Notification(rs.getInt("ID"),
                        rs.getString("title"),
                        rs.getInt("status"),
                        rs.getDate("time"),
                        rs.getString("content")
                ));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean removeNotificationDetailById(int Id) {
        String sql = "DELETE FROM [GameShop].[dbo].[notificationDetail] WHERE notificationID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Id);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeNotificationById(int Id) {
        if (removeNotificationDetailById(Id)) {
            String sql = "DELETE FROM [GameShop].[dbo].[notification] WHERE ID=?";
            try {
                ps = con.prepareStatement(sql);
                ps.setInt(1, Id);
                ps.executeUpdate();
                ps.close();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public List<NotificationDetail> getNotificationByNotificationId(int id) {
        if (con == null) {
            createConnection();
        }
        List<NotificationDetail> listNoti = new ArrayList<>();
        String query = "select gn.ID as ID ,gn.title as title ,gn.content as content  ,  gnd.userID as userID ,gnd.status from [GameShop].[dbo].[notification] "
                + "as gn join [GameShop].[dbo].[notificationDetail] as gnd on gn.ID = gnd.notificationID "
                + "where gnd.notificationID = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                listNoti.add(new NotificationDetail(rs.getInt("ID"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getInt("userID"),
                        rs.getInt("status"))
                );
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNoti;
    }

    public boolean createNotification(String title, String content) {
        String sql = "INSERT INTO [GameShop].[dbo].[notification]([title],[status],[time],[content]) VALUES(?, 0, GETDATE(), ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public int getNewestNotication() {
        String sql = "select * from [GameShop].[dbo].[notification] order by ID DESC";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Notification noti = new Notification(rs.getInt("ID"),
                        rs.getString("title"),
                        rs.getInt("status"),
                        rs.getDate("time"),
                        rs.getString("content"));
                ps.close();
                rs.close();
                return noti.getID();
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }

    public List<User> getUserByRoleID(int id) {
        String sql = "SELECT [userID] ,[username] ,[password],[email],[roleID] ,[statusID] "
                + "FROM [GameShop].[dbo].[user] where roleID = ?";
        List<User> us = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                us.add(new User(rs.getInt("userId"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getInt("roleId"),
                        rs.getInt("statusId")
                )
                );
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return us;
    }

    public boolean createNotificationDetail(int notificationID, int userID) {
        String sql = "INSERT INTO [GameShop].[dbo].[notificationDetail]([userID],[orderID],[notificationID], [status]) VALUES(?, null, ? ,1)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setInt(2, notificationID);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
   
    public boolean createNotificationOrder(String title, String content) {
        String sql = "INSERT INTO [GameShop].[dbo].[notification]([title],[status],[time],[content]) VALUES(?, 1, GETDATE(), ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
     public boolean createNotificationDetailOrder(int notificationID, int userID, int orderID) {
        String sql = "INSERT INTO [GameShop].[dbo].[notificationDetail]([userID],[orderID],[notificationID], [status]) VALUES(?, ?, ? ,1)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setInt(2, orderID);
            ps.setInt(3, notificationID);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    

    public static void main(String[] args) {
        NotificationDAO ndao = new NotificationDAO();
        List<User> list = ndao.getUserByRoleID(3);
        int notiID = ndao.getNewestNotication();
        for (User user : list) {
            System.out.println(ndao.createNotificationDetail(notiID, user.getUserId()));

        }
    }
}
