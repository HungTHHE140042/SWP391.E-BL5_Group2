/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class Product {

    private int productID;
    private String productName;
    private String description;
    private double originalPrice;
    private double sellPrice;
    private double salePercent;
    private int categoryID;
    private int sellerID;
    private int amount;
    private int statusID;
    private Date createdDate;
    private String productImgURL;

    public Product() {
    }

    public Product(int productID, String productName, double sellPrice) {
        this.productID = productID;
        this.productName = productName;
        this.sellPrice = sellPrice;
    }

    
    
    public Product(int productID, String productName, String description, double originalPrice, double sellPrice, double salePercent, int categoryID, int sellerID, int amount, int statusID, Date createdDate, String productImgURL) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        this.originalPrice = originalPrice;
        this.sellPrice = sellPrice;
        this.salePercent = salePercent;
        this.categoryID = categoryID;
        this.sellerID = sellerID;
        this.amount = amount;
        this.statusID = statusID;
        this.createdDate = createdDate;
        this.productImgURL = productImgURL;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(double salePercent) {
        this.salePercent = salePercent;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getProductImgURL() {
        return productImgURL;
    }

    public void setProductImgURL(String productImgURL) {
        this.productImgURL = productImgURL;
    }

    @Override
    public String toString() {
        return "product{" + "productID=" + productID + ", productName=" + productName + ", description=" + description + ", originalPrice=" + originalPrice + ", sellPrice=" + sellPrice + ", salePercent=" + salePercent + ", categoryID=" + categoryID + ", sellerID=" + sellerID + ", amount=" + amount + ", statusID=" + statusID + ", createdDate=" + createdDate + ", productImgURL=" + productImgURL + '}';
    }
}
