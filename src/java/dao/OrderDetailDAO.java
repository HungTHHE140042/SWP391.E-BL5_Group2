/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class OrderDetailDAO {
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

    public OrderDetailDAO() {
        createConnection();
    }
    
    public String countOrderDetail(){
        String query = "select COUNT(ID) as NumberOfOrderDetail from orderDetail";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                String count = rs.getString("NumberOfOrderDetail");
                return count;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
    
    public static void main(String[] args) {
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        String countOrderDetail = orderDetailDAO.countOrderDetail();
        System.out.println(countOrderDetail);
    }
}
