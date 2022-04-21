/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MSI
 */
public class CartDetail {
    private int productID;
    private String productName;
    private double sellPrice;
    private int quantity;

    public CartDetail() {
    }

    public CartDetail(int productID, String productName, double sellPrice, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.sellPrice = sellPrice;
        this.quantity = quantity;
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

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartDetail{" + "productID=" + productID + ", productName=" + productName + ", sellPrice=" + sellPrice + ", quantity=" + quantity + '}';
    }
 
}
