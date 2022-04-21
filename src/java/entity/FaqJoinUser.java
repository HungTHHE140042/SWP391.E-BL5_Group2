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
public class FaqJoinUser {
    private int ID;
    private String authorName;
    private String title;
    private String content;

    public FaqJoinUser() {
    }

    public FaqJoinUser(int ID, String authorName, String title, String content) {
        this.ID = ID;
        this.authorName = authorName;
        this.title = title;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
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

    @Override
    public String toString() {
        return "Faq{" + "ID=" + ID + ", authorName=" + authorName + ", title=" + title + ", content=" + content + '}';
    }

    
}
