/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author trinh
 */
public class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private int roleId;
    private int statusId;

    public User(int userId, String username, String password, String email, int roleId, int statusId) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.roleId = roleId;
        this.statusId = statusId;
    }

    public User() {
    }
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email + ", roleId=" + roleId + ", statusId=" + statusId + '}';
    }
    
    
}
