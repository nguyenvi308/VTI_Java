package com.nguyenvi.TestingSystem_Assignment_1.entities;

public class Department {
    private  int departmentID;
    private String departmentName;


    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return
                "DepartmentID : " + departmentID + "\n" +
                "DepartmentName : " + departmentName ;
    }
}
