/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author trinh
 */
public class UserDAO {
    public UserDAO() {
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

    
    public List<User> getAllUsers() {
        if (con == null) {
            createConnection();
        }
        List<User> list = new ArrayList<>();
        String query = "select * from [GameShop].[dbo].[user]";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(rs.getInt("userId"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email"),
                        rs.getInt("roleId"),
                        rs.getInt("statusId")
                        ));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    public boolean updateUserStatusId(int userId, int statusId){
        if (con == null) {
            createConnection();
        }
        sql = "update [user] set statusID=? where userID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, statusId);
            ps.setInt(2, userId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean updatePasswordByUserId(int userId, String password){
        if (con == null) {
            createConnection();
        }
        sql = "update [user] set password=? where userID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, password);
            ps.setInt(2, userId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public User getNewestUser(){
        sql = "select * from [user] order by userID DESC";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("userID"), rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleID"), rs.getInt("statusID"));
                ps.close();
                rs.close();
                return u;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public User getUserByEmail(String email){
        sql = "select * from [user] where email=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("userID"), rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleID"), rs.getInt("statusID"));
                ps.close();
                rs.close();
                return u;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public User getUserByUserId(int userId){
        sql = "select * from [user] where userID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("userID"), rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleID"), rs.getInt("statusID"));
                ps.close();
                rs.close();
                return u;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
        public boolean updateUser(int userId, String username, String password, String email, int roleID, int statusID) {
        if (con == null) {
            createConnection();
        }
        String sql = "UPDATE [GameShop].[dbo].[user] SET [username] = ? ,[password] = ? ,[email] = ? ,[roleID] = ? ,[statusID] = ? WHERE userID= ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setInt(4, roleID);
            ps.setInt(5, statusID);
            ps.setInt(6, userId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean removeUserByUserId(int userId) {
        String sql = "DELETE FROM [GameShop].[dbo].[user] WHERE userID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
        public boolean createUser(String username, String password, String email, int roleID, int statusID) {
        String sql = "INSERT INTO [GameShop].[dbo].[user]([username],[password],[email],[roleID],[statusID]) VALUES (?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.setInt(4, roleID);
            ps.setInt(5, statusID);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public String countUser(){
        String query = "select COUNT(userID) as NumberOfUser from [user]";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                String count = rs.getString("NumberOfUser");
                return count;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public User getUsersByID(int id) {
        sql = "select * from [user] where userID = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("userID"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("Email"),
                        rs.getInt("RoleID"),
                        rs.getInt("StatusID")
                );
                ps.close();
                rs.close();
                return u;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            return null;
        }
        return null;
    }
    
    public boolean updateUser(int id, String username) {

        sql = "UPDATE [user] SET username = ?\n"
                + "WHERE userID = ?;";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return false;
    }
    
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        List<User> count = userDAO.getAllUsers();
        System.out.println(count);
    }
}
