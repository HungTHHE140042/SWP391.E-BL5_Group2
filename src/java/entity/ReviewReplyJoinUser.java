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
public class ReviewReplyJoinUser {
    private int reviewReplyId;
    private String username;
    private String roleName;
    private int reviewId;
    private String reviewReplyDetail;
    private Date date;

    public ReviewReplyJoinUser() {
    }

    public ReviewReplyJoinUser(int reviewReplyId, String username, String roleName, int reviewId, String reviewReplyDetail, Date date) {
        this.reviewReplyId = reviewReplyId;
        this.username = username;
        this.roleName = roleName;
        this.reviewId = reviewId;
        this.reviewReplyDetail = reviewReplyDetail;
        this.date = date;
    }

    public int getReviewReplyId() {
        return reviewReplyId;
    }

    public void setReviewReplyId(int reviewReplyId) {
        this.reviewReplyId = reviewReplyId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
    
    

    public String getReviewReplyDetail() {
        return reviewReplyDetail;
    }

    public void setReviewReplyDetail(String reviewReplyDetail) {
        this.reviewReplyDetail = reviewReplyDetail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReviewReplyJoinUser{" + "reviewReplyId=" + reviewReplyId + ", username=" + username + ", roleName=" + roleName + ", reviewReplyDetail=" + reviewReplyDetail + ", date=" + date + '}';
    }
    
    
}
