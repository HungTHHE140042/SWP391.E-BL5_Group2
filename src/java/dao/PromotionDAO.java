/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Promotion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PromotionDAO {

    public PromotionDAO() {
        createConnection();
    }

    DBContext u = new DBContext();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private String query;

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

    public List<Promotion> getAllPromotion() {
        List<Promotion> list = new ArrayList<>();
        query = "select * from promotion";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Promotion(rs.getInt("id"),
                        rs.getString("promotionCode"),
                        rs.getFloat("salePercent"),
                        rs.getInt("amount")));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public boolean deletePromotion(int id) {
        query = "DELETE FROM promotion where id = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertPromotion(String promotionCode, String salePercent, String amount) {
        query = "insert into promotion(promotionCode, salePercent, amount) VALUES(?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, promotionCode);
            ps.setString(2, salePercent);
            ps.setString(3, amount);
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updatePromotion(String promotionCode, String salePercent, String amount, String id) {
        query = "update promotion\n"
                + "set promotionCode = ?,\n"
                + "salePercent = ?,\n"
                + "amount = ?\n"
                + "where ID = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, promotionCode);
            ps.setString(2, salePercent);
            ps.setString(3, amount);
            ps.setString(4, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public Promotion getPromotionByID(String id) {
        query = "select * from promotion where ID = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Promotion(rs.getInt("id"),
                        rs.getString("promotionCode"),
                        rs.getFloat("salePercent"),
                        rs.getInt("amount"));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    public boolean updateAmountPromotion(int ID){
        query = "update [promotion] set amount = 0 where ID = "+ID+"";
        
        try {
            ps = con.prepareStatement(query);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Promotion checkPromotion(String promotion) {
        query = "select * from promotion where promotionCode = '" + promotion + "' and amount > 0";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                Promotion p = new Promotion();
                p.setId(rs.getInt("ID"));
                p.setPromotionCode(rs.getString("promotionCode"));
                p.setSalePercent(rs.getInt("salePercent"));
                p.setAmount(rs.getInt("amount"));
                return p;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        PromotionDAO promotionDAO = new PromotionDAO();       
        System.out.println(promotionDAO.checkPromotion("SangDepTrai"));

    }
}
