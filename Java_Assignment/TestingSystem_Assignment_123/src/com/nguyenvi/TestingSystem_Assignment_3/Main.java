package com.nguyenvi.TestingSystem_Assignment_3;

import com.nguyenvi.TestingSystem_Assignment_1.entities.Department;

public class Main {

    public static void main(String[] args) {
        Department[] departments = new Department[3];




        Department department = new Department();
        department.setDepartmentID(1);
        department.setDepartmentName("Sale");
        departments[0] = department;

        Department department1 = new Department();
        department1.setDepartmentName("Dev");
        department1.setDepartmentID(2);

        Department department2 = new Department();
        department2.setDepartmentID(3);
        department2.setDepartmentName("Finance");

        departments[0] = department;
        departments[1] = department1;
        departments[2] = department2;


       for (int i = 0 ; i < departments.length ; i++)
       {
           System.out.println(departments[i]);
       }

    }

}
