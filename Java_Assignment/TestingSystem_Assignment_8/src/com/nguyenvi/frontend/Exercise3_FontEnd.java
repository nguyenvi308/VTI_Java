package com.nguyenvi.frontend;

import com.nguyenvi.backend.Exercise3;
import com.nguyenvi.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3_FontEnd {

    public static void main(String[] args) {
        // Question 1
        StudentGeneric<Integer> s1 = new StudentGeneric<>(1,"Nguyen Vi");
        StudentGeneric<Float> s2 = new StudentGeneric<>(1.0F,"Nguyen Minh");
        StudentGeneric<Double> s3 = new StudentGeneric<>(1.0,"Cong Minh");
        // Question 2
        Exercise3 test = new Exercise3();
        test.printInfoT(s1);
        test.printInfoT(4);
        test.printInfoT(4.0);
        // Question 3
        List<Integer>  intList = Arrays.asList(1,2,3,4,5,6,7);
        test.genericArray(intList);
        List<Float>  floatList = new ArrayList<>();
        floatList.add(1.0f);
        floatList.add(2.2f);
        floatList.add(3.1f);
        test.genericArray(floatList);
        // Exercise 3 Question 4



        // Exercise 3 Question 5
        Employee<Integer> intEmp = new Employee<>(1,"Vi" , 100);
        Employee<Float> floatEmp = new Employee<>(2,"Van" , 100.0f);
        Employee<Double> doubleEmployee = new Employee<>(3,"Nguyen" , 100.0);

        System.out.println(intEmp);
        System.out.println(floatEmp);
        System.out.println(doubleEmployee);

        //  Exercise 3 - Question 6
        MyMap<Integer , String> s5 = new MyMap<>(1,"Nguyen Vi");
        MyMap<Integer , String> s6 = new MyMap<>(2,"Nguyen Van");
        System.out.println(s1);
        System.out.println(s2);
        //  Exercise 3 - Question 7
        // Value : Phone number
        // Key    : email
        Phone<String, Integer> emailPhone = new Phone<>("nguyenvi@gmail.com" , 102_123_341);
        // Value : Phone number
        // Key : so thu tu
        Phone<Integer, Integer> autoNumberPhone = new Phone<>(1, 102_123_341);
        // Value : Phone number
        // Key : ten nguoi su dung
        Phone<String, Integer> userEmail = new Phone<>("nguyen van vi" , 102_123_341);
        System.out.println(emailPhone);
        System.out.println(autoNumberPhone);
        System.out.println(userEmail);
        //  Exercise 3 - Question 8
        Staff<Integer, String> staff1 = new Staff<>(1, "Nguyen Vi");
        System.out.println(staff1);



    }




}
