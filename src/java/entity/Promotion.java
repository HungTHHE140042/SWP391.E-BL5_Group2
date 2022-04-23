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
public class Promotion {
    private int id;
    private String promotionCode;
    private float salePercent;
    private int amount;

    public Promotion() {
    }

    public Promotion(int id, String promotionCode, float salePercent, int amount) {
        this.id = id;
        this.promotionCode = promotionCode;
        this.salePercent = salePercent;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public float getSalePercent() {
        return salePercent;
    }

    public void setSalePercent(float salePercent) {
        this.salePercent = salePercent;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Promotion{" + "id=" + id + ", promotionCode=" + promotionCode + ", salePercent=" + salePercent + ", amount=" + amount + '}';
    }
}
