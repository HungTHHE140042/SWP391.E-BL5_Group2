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
public class NotificationDetail {
    private int ID;
    private String title;
    private String content;
    private int userID;
    private int status;
    public NotificationDetail() {
    }

    public NotificationDetail(int ID, String title, String content, int userID, int status) {
        this.ID = ID;
        this.title = title;
        this.content = content;
        this.userID = userID;
        this.status = status;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NotificationDetail{" + "ID=" + ID + ", title=" + title + ", content=" + content + ", userID=" + userID + ", status=" + status + '}';
    }

    
    
}
