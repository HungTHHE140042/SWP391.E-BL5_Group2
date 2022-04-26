/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author QUANG HUNG
 */
public class EmailReceiverJoinUser {
    
    private int emailReceiverID;
    private int emailID;
    private String userEmail;

    public EmailReceiverJoinUser() {
    }

    public EmailReceiverJoinUser(int emailReceiverID, int emailID, String userEmail) {
        this.emailReceiverID = emailReceiverID;
        this.emailID = emailID;
        this.userEmail = userEmail;
    }

    public int getEmailReceiverID() {
        return emailReceiverID;
    }

    public void setEmailReceiverID(int emailReceiverID) {
        this.emailReceiverID = emailReceiverID;
    }

    public int getEmailID() {
        return emailID;
    }

    public void setEmailID(int emailID) {
        this.emailID = emailID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "EmailReceiverJoinUser{" + "emailReceiverID=" + emailReceiverID + ", emailID=" + emailID + ", userEmail=" + userEmail + '}';
    }
    
    
    
}
