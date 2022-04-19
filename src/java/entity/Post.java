/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Post {

    private int ID;
    private int authorID;
    private String title;
    private String content;
    private String imageLinkDetail;
    private Date date;
    private String imageLinkThumbnail;

    public Post() {
    }

    public Post(int ID, int authorID, String title, String content, String imageLinkDetail, Date date, String imageLinkThumbnail) {
        this.ID = ID;
        this.authorID = authorID;
        this.title = title;
        this.content = content;
        this.imageLinkDetail = imageLinkDetail;
        this.date = date;
        this.imageLinkThumbnail = imageLinkThumbnail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImageLinkDetail() {
        return imageLinkDetail;
    }

    public void setImageLinkDetail(String imageLinkDetail) {
        this.imageLinkDetail = imageLinkDetail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getImageLinkThumbnail() {
        return imageLinkThumbnail;
    }

    public void setImageLinkThumbnail(String imageLinkThumbnail) {
        this.imageLinkThumbnail = imageLinkThumbnail;
    }

    @Override
    public String toString() {
        return "Post{" + "ID=" + ID + ", authorID=" + authorID + ", title=" + title + ", content=" + content + ", imageLinkDetail=" + imageLinkDetail + ", date=" + date + ", imageLinkThumbnail=" + imageLinkThumbnail + '}';
    }
}
