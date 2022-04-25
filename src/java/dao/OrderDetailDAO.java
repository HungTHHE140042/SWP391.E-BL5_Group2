/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.CategoryOrder;
import entity.Month;
import entity.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class OrderDetailDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private String query = "";

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

    public String countOrderDetail() {
        query = "select COUNT(ID) as NumberOfOrderDetail from orderDetail";
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

    public String totalPrice() {
        query = "select SUM(od.productPrice) as totalPrice from [order] o , orderDetail od, orderStatus os\n"
                + "where o.ID = od.orderID and o.status = os.ID";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String totalPrice = rs.getString("totalPrice");
                return totalPrice;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public String totalPricePerMonth(int month) {
        query = "select totalPrice from \n"
                + "(select MONTH(date) as SalesMonth,\n"
                + "SUM(od.productPrice) as totalPrice\n"
                + "from [order] o , orderDetail od\n"
                + "where o.ID = od.orderID\n"
                + "GROUP BY MONTH(date)) as t where t.SalesMonth = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, month);
            rs = ps.executeQuery();
            while (rs.next()) {
                String totalPrice = rs.getString("totalPrice");
                return totalPrice;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public List<Month> totalPricePerMonth1() {
        List<Month> list = new ArrayList<>(11);
        query = "select MONTH(date) as SalesMonth,\n"
                + "SUM(od.productPrice) as totalPrice\n"
                + "from [order] o , orderDetail od\n"
                + "where o.ID = od.orderID\n"
                + "GROUP BY MONTH(date)";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Month(rs.getString("SalesMonth"), rs.getString("totalPrice")));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public List<String> totalPricePerMonth() {
        List<String> list = new ArrayList<>(11);
        query = "select totalPrice from \n"
                + "(select MONTH(date) as SalesMonth,\n"
                + "SUM(od.productPrice) as totalPrice\n"
                + "from [order] o , orderDetail od\n"
                + "where o.ID = od.orderID\n"
                + "GROUP BY MONTH(date)) as t";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("totalPrice"));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return list;
    }

    public String totalOrderSuccess() {
        query = "select COUNT(od.ID) as totalOrderSuccess from [order] o, orderDetail od, orderStatus os\n"
                + "where o.ID = od.orderID and o.status = os.ID and o.status = 2";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String totalPrice = rs.getString("totalOrderSuccess");
                return totalPrice;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public String totalOrderProcessing() {
        query = "select COUNT(od.ID) as totalOrderSuccess from [order] o, orderDetail od, orderStatus os\n"
                + "where o.ID = od.orderID and o.status = os.ID and o.status = 1";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String totalPrice = rs.getString("totalOrderSuccess");
                return totalPrice;
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public int getMonth() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        return month;
    }

    public CategoryOrder getTotalCategoryOrderByID(int ID) {
        query = "select t.* from \n"
                + "(select c.categoryID, c.categoryName, COUNT(p.categoryID) as totalCategoryOrder from orderDetail od, product p, category c\n"
                + "where p.productID = od.productID and p.categoryID = c.categoryID\n"
                + "GROUP BY c.categoryID, c.categoryName) as t \n"
                + "where t.categoryID = ?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new CategoryOrder(rs.getInt("categoryID"),
                        rs.getString("categoryName"),
                        rs.getInt("totalCategoryOrder"));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public List<OrderDetail> getOrderDetailByOrderId(int orderId) {
        List<OrderDetail> list = new ArrayList<>();
        query = "select * from\n"
                + "(select A.*, pk.productKey from\n"
                + "	(select od.productID, od.productName, od.productPrice, od.keyID from [order] o, orderDetail od where o.ID = od.orderID and o.ID = ?) as A\n"
                + "JOIN\n"
                + "	productKey pk\n"
                + "ON A.keyID = pk.keyID) AS B\n"
                + "JOIN\n"
                + "productImg p\n"
                + "ON B.productID = p.productID WHERE p.[type] = 1";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, orderId);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new OrderDetail(rs.getInt("ID"), rs.getString("productName"), rs.getFloat("productPrice"), rs.getString("productKey"), rs.getString("productImgURL")));
            }
            ps.close();
            rs.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        int month = orderDetailDAO.getMonth();
        String countOrderDetail = orderDetailDAO.countOrderDetail();
        String totalPrice = orderDetailDAO.totalPrice();
        String totalPricePerMonthNow = orderDetailDAO.totalPricePerMonth(month);
        String totalPricePerMonth3 = orderDetailDAO.totalPricePerMonth(3);
        String totalOrderSuccess = orderDetailDAO.totalOrderSuccess();
        String totalOrderProcessing = orderDetailDAO.totalOrderProcessing();

        CategoryOrder categoryOrder = orderDetailDAO.getTotalCategoryOrderByID(3);
        List<Month> listTotalPrice = orderDetailDAO.totalPricePerMonth1();
        String list = orderDetailDAO.totalPricePerMonth().toString();
    
        System.out.println(countOrderDetail);
        System.out.println(totalPrice);
        System.out.println(totalOrderSuccess);
        System.out.println(totalOrderProcessing);
        System.out.println(totalPricePerMonthNow);
        System.out.println(totalPricePerMonth3);
        System.out.println(categoryOrder);
        System.out.println(listTotalPrice);
        System.out.println(listTotalPrice.size());
        System.out.println(list);
    }
}
