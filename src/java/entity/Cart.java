/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author MSI
 */
public class Cart {

    private int ID;
    private int productID;
    private int amount;
    private int userID;

    public Cart() {
    }

    public Cart(int ID, int productID, int amount, int userID) {
        this.ID = ID;
        this.productID = productID;
        this.amount = amount;
        this.userID = userID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Cart{" + "ID=" + ID + ", productID=" + productID + ", amount=" + amount + ", userID=" + userID + '}';
    }

}
