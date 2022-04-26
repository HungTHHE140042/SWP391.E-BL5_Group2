/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Email;
import entity.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUANG HUNG
 */
public class EmailDAO {

    public EmailDAO() {
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

    public List<Email> getAllEmail() {
        List<Email> list = new ArrayList<>();
        String sql = "select * from email";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Email(rs.getInt("ID"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("date"),
                        rs.getInt("status")));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean deleteEmailByEmailID(int emailID) {
        String sql1 = "DELETE FROM [emailReceiver] WHERE emailID=?";
        String sql2 = "DELETE FROM [email] WHERE email.ID=?";
        try {
            ps = con.prepareStatement(sql1);
            ps.setInt(1, emailID);
            ps.executeUpdate();
            
            ps = con.prepareStatement(sql2);
            ps.setInt(1, emailID);
            ps.executeUpdate();
            
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean createEmail(String title, String content) {
        String sql = "INSERT INTO [GameShop].[dbo].[email]([title],[content],[date],[status]) VALUES (?, ?, GETDATE(), ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.setInt(3, 0);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean createEmailReceiver(int emailID, int userID) {
        String sql = "INSERT INTO [GameShop].[dbo].[emailReceiver]([emailID],[userID]) VALUES (?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, emailID);
            ps.setInt(2, userID);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<User> getAllUserByRoleID(int roleID) {
        String sql = "select * from [user] where roleID = ?";
        List<User> userList = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, roleID);
            rs = ps.executeQuery();
            while (rs.next()) {
                userList.add(new User(rs.getInt("userId"),
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
        return userList;
    }
    
    public Email getNewestEmail(){
        String sql = "select * from [email] order by ID DESC";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Email email = new Email(rs.getInt("ID"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("date"),
                        rs.getInt("status"));
                ps.close();
                rs.close();
                return email;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public Email getEmailByEmailID(int emailID){
        String sql = "select * from [email] where ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, emailID);
            rs = ps.executeQuery();
            while (rs.next()) {
                Email email = new Email(rs.getInt("ID"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("date"),
                        rs.getInt("status"));
                ps.close();
                rs.close();
                return email;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public boolean updateEmailInformation(int emailID, String title, String content) {
        String sql = "Update [email] set title = ?, content = ? where email.ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.setInt(3, emailID);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(new EmailDAO().updateEmailInformation(8, "test", "test"));
    }

}
