/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Notification {

    private int ID;
    private String title;
    private int status;
    private Date time;
    private String content;

    public Notification() {
    }

    public Notification(int ID, String title, int status, Date time, String content) {
        this.ID = ID;
        this.title = title;
        this.status = status;
        this.time = time;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Notification{" + "ID=" + ID + ", title=" + title + ", status=" + status + ", time=" + time + ", content=" + content + '}';
    }

}
