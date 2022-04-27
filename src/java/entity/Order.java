/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * <<<<<<< Updated upstream @author trinh
 *
 */
public class Order {

    private int id;
    private int userId;
    private double total;
    private String note;
    private int status;
    private Date date;
    private int promotionId;
    private String promotionCode;

    public Order(int id, int userId, double total, String note, int status, Date date, int promotionId) {
        this.id = id;
        this.userId = userId;
        this.total = total;
        this.note = note;
        this.status = status;
        this.date = date;
        this.promotionId = promotionId;
    }

    public Order(int id, int userId, double total, String note, int status, Date date, int promotionId, String promotionCode) {
        this.id = id;
        this.userId = userId;
        this.total = total;
        this.note = note;
        this.status = status;
        this.date = date;
        this.promotionId = promotionId;
        this.promotionCode = promotionCode;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(int promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", userId=" + userId + ", total=" + total + ", note=" + note + ", status=" + status + ", date=" + date + ", promotionId=" + promotionId + ", promotionCode=" + promotionCode + '}';
    }

}
