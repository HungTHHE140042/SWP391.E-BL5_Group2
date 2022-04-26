/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class OrderDetail {

    private int ID;
    private int orderID;
    private int productID;
    private String productName;
    private Double productPrice;
    private int quantity;
    private double productPrice;
    private int keyID;
    private String productKey;
    private String productImgUrl;

    public OrderDetail() {
    }

    public OrderDetail(int ID, int orderID, int productID, String productName, int quantity, int keyID) {
        this.ID = ID;
        this.orderID = orderID;
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.keyID = keyID;
    }

<<<<<<< Updated upstream
    public OrderDetail(int ID, String productName, double productPrice, String productKey, String productImgUrl) {
        this.ID = ID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productKey = productKey;
        this.productImgUrl = productImgUrl;
    }

    

=======
    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
    
>>>>>>> Stashed changes
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getKeyID() {
        return keyID;
    }

    public void setKeyID(int keyID) {
        this.keyID = keyID;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImgUrl() {
        return productImgUrl;
    }

    public void setProductImgUrl(String productImgUrl) {
        this.productImgUrl = productImgUrl;
    }
    
    
    
    

    @Override
    public String toString() {
        return "OrderDetail{" + "ID=" + ID + ", orderID=" + orderID + ", productID=" + productID + ", productName=" + productName + ", quantity=" + quantity + ", keyID=" + keyID + '}';
    }
}
