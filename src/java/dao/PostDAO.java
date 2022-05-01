/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Post;
import entity.PostJoinUser;
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

    public List<Post> getTop4LastestPost() {
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

    public List<PostJoinUser> getAllPostJoinUser() {
        List<PostJoinUser> list = new ArrayList<>();
        String sql = "select * from post p, [user] u where p.authorID=u.userID";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new PostJoinUser(rs.getInt("ID"),
                        rs.getString("username"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("imageLinkDetail"),
                        rs.getDate("date"),
                        rs.getString("imageLinkThumbnail")));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    

    public PostJoinUser getPostJoinUserByPostId(int postId) {
        String sql = "select * from post p, [user] u where p.authorID=u.userID and p.ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, postId);
            rs = ps.executeQuery();
            while (rs.next()) {
                PostJoinUser p = new PostJoinUser(rs.getInt("ID"),
                        rs.getString("username"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("imageLinkDetail"),
                        rs.getDate("date"),
                        rs.getString("imageLinkThumbnail"));
                ps.close();
                rs.close();
                return p;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public List<PostJoinUser> getPostByAuthorUsername(String username) {
        List<PostJoinUser> list = new ArrayList<>();
        String sql = "select * from post p, [user] u where p.authorID=u.userID and u.username = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new PostJoinUser(rs.getInt("ID"),
                        rs.getString("username"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("imageLinkDetail"),
                        rs.getDate("date"),
                        rs.getString("imageLinkThumbnail")));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public boolean createPost(int authorId, String title, String urlThumbnail, String urlDetail, String content) {
        String sql = "insert into post(authorID, title, [content], imageLinkDetail, date, imageLinkThumbnail) values (?, ?, ?, ?, GETDATE(), ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, authorId);
            ps.setString(2, title);
            ps.setString(3, content);
            ps.setString(4, urlDetail);
            ps.setString(5, urlThumbnail);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean removePostByPostId(int postId) {
        String sql = "DELETE FROM post WHERE ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, postId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePost(int postId, String title, String urlThumbnail, String urlDetail, String content) {
        if (con == null) {
            createConnection();
        }
        String sql = "update post set title=?, [content]=?, imageLinkDetail=?, imageLinkThumbnail=? where ID=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, content);
            ps.setString(3, urlDetail);
            ps.setString(4, urlThumbnail);
            ps.setInt(5, postId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<PostJoinUser> paginationPost(int from, int step) {
        if (con == null) {
            createConnection();
        }
        List<PostJoinUser> list = new ArrayList<>();
        String sql = "select * from post p, [user] u where p.authorID=u.userID ORDER BY p.ID OFFSET (? * ?) ROWS FETCH NEXT ? ROWS ONLY";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, from);
            ps.setInt(2, step);
            ps.setInt(3, step);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new PostJoinUser(rs.getInt("ID"),
                        rs.getString("username"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("imageLinkDetail"),
                        rs.getDate("date"),
                        rs.getString("imageLinkThumbnail")));
            }
            ps.close();
            rs.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int countPost(){
        if (con == null) {
            createConnection();
        }
        int total = 0;
        String sql = "select count(*) from post";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt(1);
                ps.close();
                rs.close();
                return total;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }
    
    public int getNewestPost() {
        String sql = "select * post order by ID DESC";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("ID");
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        PostDAO postDAO = new PostDAO();
        List<Post> list = postDAO.getTop4LastestPost();

        for (Post post : list) {
            System.out.println(post);
        }
    }
}
