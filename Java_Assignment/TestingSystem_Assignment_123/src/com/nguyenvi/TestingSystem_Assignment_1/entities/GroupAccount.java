package com.nguyenvi.TestingSystem_Assignment_1.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
GroupID: định danh của nhóm
 AccountID: định danh của User
 JoinDate: Ngày user tham gia vào nhóm
 */
public class GroupAccount {
    private Group groupID;
    private List<Account> account = new ArrayList<>();
    private Date joinDate;

    public Group getGroupID() {
        return groupID;
    }

    public void setGroupID(Group groupID) {
        this.groupID = groupID;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
}
