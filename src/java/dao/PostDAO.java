/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Post;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PostDAO {

    public PostDAO() {
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
    
    public List<Post> getTop4LastestPost(){
        List<Post> list = new ArrayList<>();
        String query = "select top 4 * from post order by ID desc";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new Post(rs.getInt("ID"), 
                        rs.getInt("authorID"),
                        rs.getString("title"),
                        rs.getString("content"), 
                        rs.getString("imageLinkDetail"), 
                        rs.getDate("date"), 
                        rs.getString("imageLinkThumbnail")));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public static void main(String[] args) {
        PostDAO postDAO = new PostDAO();
        List<Post> list = postDAO.getTop4LastestPost();
        
        for (Post post : list) {
            System.out.println(post);
        }
    }
}
