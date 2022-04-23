/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class CategoryDAO {

    public ArrayList<Category> getAll() {

        DBContext u = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        ArrayList<Category> listCategory = new ArrayList<>();
        String sql = "Select * from category";

        try {
            con = u.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category categories = new Category(
                        rs.getInt("categoryID"),
                        rs.getString("categoryName"));
                listCategory.add(categories);
            }
            return listCategory;
        } catch (SQLException e) {
            System.out.println("Get all Category error!!!");
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Category getCategoryByCategoryId(int categoryId) {
        DBContext u = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "Select * from category where categoryID = ?";

        try {
            con = u.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, categoryId);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category categories = new Category(
                        rs.getInt("categoryID"),
                        rs.getString("categoryName"));
                ps.close();
                rs.close();
                return categories;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Get all Category error!!!");
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean createCategory(String categoryName) {
        DBContext u = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "insert into category(categoryName) values (?)";
        try {
            con = u.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoryName);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean editCategory(int categoryId, String categoryName) {
        DBContext u = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "update category set categoryName=? where categoryID=?";
        try {
            con = u.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoryName);
            ps.setInt(2, categoryId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteCategory(int categoryId) {
        DBContext u = new DBContext();
        Connection con = null;
        PreparedStatement ps = null;

        String sql = "delete from category where categoryID = ?";
        try {
            con = u.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
