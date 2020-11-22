package com.nguyenvi.TestingSystem_Assignment_1.entities;

import java.util.Date;


public class Group {
    private int groupID;
    private String groupName;
    private String creatorID;
    private Date createDate;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(String creatorID) {
        this.creatorID = creatorID;
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
                " GroupID=" + groupID +
                " ,  GroupName='" + groupName  +
                " ,  CreatorID='" + creatorID  +
                " ,  CreateDate=" + createDate ;
    }
}
