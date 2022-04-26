/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author QUANG HUNG
 */
public class Email {
    private int emailID;
    private String title;
    private String content;
    private String date;
    private int status;

    public Email() {
    }

    public Email(int emailID, String title, String content, String date, int status) {
        this.emailID = emailID;
        this.title = title;
        this.content = content;
        this.date = date;
        this.status = status;
    }

    public int getEmailID() {
        return emailID;
    }

    public void setEmailID(int emailID) {
        this.emailID = emailID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Email{" + "emailID=" + emailID + ", title=" + title + ", content=" + content + ", date=" + date + ", status=" + status + '}';
    }
    
    
}
