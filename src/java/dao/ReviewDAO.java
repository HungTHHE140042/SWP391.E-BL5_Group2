/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.ReviewJoinUser;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author QUANG HUNG
 */
public class ReviewDAO {

    public ReviewDAO() {
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
    
    public List<ReviewJoinUser> getAllReviewJoinUserByProductId(int productId) {
        List<ReviewJoinUser> list = new ArrayList<>();
        String sql = "select rv.*, u.username, r.roleName from review rv "
                + "inner join [user] u on rv.userID=u.userID "
                + "inner join product p on rv.productID=p.productID "
                + "inner join role r on r.roleID=u.roleID  where p.productID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, productId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ReviewJoinUser(rs.getInt("ID"),
                        rs.getString("username"),
                        rs.getString("roleName").trim(),
                        rs.getString("reviewDetail"),
                        rs.getDate("date")));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean createReview(int userID, int productID, String reviewDetail) {
        String sql = "INSERT INTO review(userID,productID,reviewDetail,date) VALUES(?, ?, ?, GETDATE())";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, userID);
            ps.setInt(2, productID);
            ps.setString(3, reviewDetail);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
