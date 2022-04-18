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
public class LoginDAO {

    public LoginDAO() {
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

    public User checkLogin(String email, String password) {
        if (con == null) {
            createConnection();
        }
        sql = "select * from [user] where email=? AND password=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, password);
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

    public boolean isExistedUsername(String username) {
        if (con == null) {
            createConnection();
        }
        sql = "select * from [user] where username=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("userID"), rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleID"), rs.getInt("statusID"));
                ps.close();
                rs.close();
                if (u != null) {
                    return true;
                }
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isExistedEmail(String email) {
        if (con == null) {
            createConnection();
        }
        sql = "select * from [user] where email=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("userID"), rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("roleID"), rs.getInt("statusID"));
                ps.close();
                rs.close();
                if (u != null) {
                    return true;
                }
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean registerAccount(String username, String email, String password) {
        sql = "insert into [user](username, password, email, roleID, statusID) values (?, ?, ?, 3, 2)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, email);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
