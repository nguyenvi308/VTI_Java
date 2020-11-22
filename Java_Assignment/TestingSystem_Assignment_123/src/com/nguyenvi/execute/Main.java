package com.nguyenvi.execute;

import com.nguyenvi.TestingSystem_Assignment_1.entities.Account;
import com.nguyenvi.TestingSystem_Assignment_1.entities.Department;
import com.nguyenvi.TestingSystem_Assignment_1.entities.Group;

// Test git on bash 
public class Main {
    public static void main(String[] args) {

        Department department1 = new Department();
            department1.setDepartmentID(1);
            department1.setDepartmentName("Sale");
            System.out.println("Department ID: " + department1.getDepartmentID());
            System.out.println("Department Name: " + department1.getDepartmentName());

        Account account1 = new Account();

        Group  group1 = new Group();


    }
}
