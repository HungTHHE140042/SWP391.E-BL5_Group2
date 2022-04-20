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
public class ReviewJoinUser {
    
    private int reviewId;
    private String username;
    private String roleName;
    private String reviewDetail;
    private Date date;

    public ReviewJoinUser() {
    }

    public ReviewJoinUser(int reviewId, String username, String roleName, String reviewDetail, Date date) {
        this.reviewId = reviewId;
        this.username = username;
        this.roleName = roleName;
        this.reviewDetail = reviewDetail;
        this.date = date;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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

    public String getReviewDetail() {
        return reviewDetail;
    }

    public void setReviewDetail(String reviewDetail) {
        this.reviewDetail = reviewDetail;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ReviewJoinUser{" + "reviewId=" + reviewId + ", username=" + username + ", roleName=" + roleName + ", reviewDetail=" + reviewDetail + ", date=" + date + '}';
    }
    
    

}
