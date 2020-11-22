package com.nguyenvi.entity;

/**
 * Project: ${PROJECT_NAME}
 * Package: ${PACKAGE_NAME}
 * <p>
 * User: Nguyen Vi
 * Date: ${DATE}
 * Time: ${TIME}
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

public class User {

    private int userID;
    private String fullName;
    private String email;
    private String password;


    public User(int userID, String fullName, String email, String password) {
        this.userID = userID;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
