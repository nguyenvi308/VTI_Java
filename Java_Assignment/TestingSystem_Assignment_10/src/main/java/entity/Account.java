package entity;

import java.util.Date;

public class Account {

    private int id;
    private String email;
    private String fullName;
    private String AccountName;
    private Date createdDate;

    public Account(int id, String email, String fullName, String AccountName, Date createdDate) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.AccountName = AccountName;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAccountName() {
        return AccountName;
    }

    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return id + "   " + email + "   " + fullName + "   " + AccountName + "   " + createdDate ;
    }
}
