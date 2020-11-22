package com.nguyenvi.TestingSystem_Assignment_1.entities;

import java.util.Date;


public class Account {

    private Integer accountID;
    private String email;
    private String userName;
    private String fullName;
    private Position positionID;
    private Department departmentID;
    private Date createDate;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Position getPositionID() {
        return positionID;
    }

    public void setPositionID(Position positionID) {
        this.positionID = positionID;
    }

    public Department getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Department departmentID) {
        this.departmentID = departmentID;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return
                        "AccountID=" +     accountID +"\n" +
                        "Email='"    +     email +    "\n" +
                        "UserName='" +     userName + "\n" +
                        "FullName='" +     fullName +  "\n" +
                        "PositionID="   +  ((positionID == null) ? "No Position" : positionID.getPositionName()) + "\n" +
                        "DepartmentID=" +  ((departmentID == null) ? "No Department" : departmentID.getDepartmentName()) + "\n" +
                        "CreateDate="   +  createDate ;
    }
}
