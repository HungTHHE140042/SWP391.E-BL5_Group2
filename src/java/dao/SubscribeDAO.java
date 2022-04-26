/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Subscribe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author trinh
 */
public class SubscribeDAO {

    public SubscribeDAO() {
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

    public boolean insertSubscribe(int userId, String email) {
        String sql = "insert into [subscribe] (userID, email) values (?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setString(2, email);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean isSubscribe(int userId) {
        String sql = "select * from [subscribe] where userID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
            rs.close();
            ps.close();
            return false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteSubscribe(int userId) {
        String sql = "delete from [subscribe] where userID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Subscribe> getAllSubscribe(){
        List<Subscribe> list = new ArrayList<>();
        String sql = "select * from [subscribe]";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                list.add(new Subscribe(rs.getInt("ID"), rs.getInt("userID"), rs.getString("email")));
            }
            ps.close();
            rs.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
