package com.nguyenvi.entity;
/**
 * Generate By CMT
 * Project: Add Here
 * Package: Add Here
 * <p>
 * User: Nguyen Vi
 * Date: Add Here
 * Time: Add Here
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

public class Manager extends User {
    private int ExpInYear;


    public Manager(int userID, String fullName, String email, String password, int expInYear) {
        super(userID, fullName, email, password);
        ExpInYear = expInYear;
    }

    public int getExpInYear() {
        return ExpInYear;
    }

    public void setExpInYear(int expInYear) {
        ExpInYear = expInYear;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "ExpInYear=" + ExpInYear +
                '}';
    }
}
