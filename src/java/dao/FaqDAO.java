/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.FaqJoinUser;
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
public class FaqDAO {

    public FaqDAO() {
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

    public List<FaqJoinUser> getAllFAQs() {
        if (con == null) {
            createConnection();
        }
        List<FaqJoinUser> list = new ArrayList<>();
        String query = "SELECT [ID] ,u.username as authorName,[title] ,[content] FROM [GameShop].[dbo].[FAQs] as faq Join [GameShop].[dbo].[user] as u on u.userID = faq.authorID ";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new FaqJoinUser(rs.getInt("ID"),
                        rs.getString("authorName"),
                        rs.getString("title"),
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

    public boolean updateFAQ(int ID, String title, String content) {
        if (con == null) {
            createConnection();
        }
        String sql = "UPDATE [GameShop].[dbo].[FAQs] SET [title] =  ? ,[content] = ? WHERE ID = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.setInt(3, ID);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
        public boolean createFAQ(int authorID, String title, String content) {
        String sql = "INSERT INTO [GameShop].[dbo].[FAQs]([authorID],[title],[content]) VALUES(?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, authorID);
            ps.setString(2, title);
            ps.setString(3, content);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        FaqDAO faqDAO = new FaqDAO();
        boolean count = faqDAO.updateFAQ(4, "1234", "bbbbbbb");
        System.out.println(count);
    }

}
