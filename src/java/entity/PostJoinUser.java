/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author trinh
 */
public class PostJoinUser {
    private int postId;
    private String username;
    private String title;
    private String content;
    private String imageLinkDetail;
    private Date date;
    private String imageLinkThumbnail;

    public PostJoinUser() {
    }

    public PostJoinUser(int postId, String username, String title, String content, String imageLinkDetail, Date date, String imageLinkThumbnail) {
        this.postId = postId;
        this.username = username;
        this.title = title;
        this.content = content;
        this.imageLinkDetail = imageLinkDetail;
        this.date = date;
        this.imageLinkThumbnail = imageLinkThumbnail;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        return "PostJoinUser{" + "postId=" + postId + ", username=" + username + ", title=" + title + ", content=" + content + ", imageLinkDetail=" + imageLinkDetail + ", date=" + date + ", imageLinkThumbnail=" + imageLinkThumbnail + '}';
    }
    
    
}
