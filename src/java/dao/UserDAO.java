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
}
