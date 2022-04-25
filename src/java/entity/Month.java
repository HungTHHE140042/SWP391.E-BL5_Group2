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
public class Month {
    private String month;
    private String totalPrice;

    public Month() {
    }

    public Month(String month, String totalPrice) {
        this.month = month;
        this.totalPrice = totalPrice;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Month{" + "month=" + month + ", totalPrice=" + totalPrice + '}';
    }
}
