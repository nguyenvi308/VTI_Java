package com.nguyenvi.backend;

import com.nguyenvi.entity.Department;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Exercise2 {
    public static void main(String[] args)  {

        // Question1
        try {
            float result = divide(7,0);
        }catch (Exception e)
        {
            System.out.println("Can not divide by 0");
        }finally {
        // Question2
            System.out.println("Divide is completed !");
        }
        // question3
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[10]);
        }catch (Exception e)
        {
            System.out.println("Not valid index !");
        }
        // Question 4
        List<Department> departmentList = Arrays.asList(
                new Department(1, "Sale"),
                new Department(2, "Research"),
                new Department(3 ,"Finance")
        );
        try {
            System.out.println(departmentList.get(10));
        }catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
        // Question 5
        System.out.println(inputAgeVer1());
        // Question 6
        // Question 7
        // Question 8
        // Question 9
        ScannerUtils scannerUtils = new ScannerUtils();
        try {
            scannerUtils.inputInt();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        try {
            Department department = new Department();
        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    public static float divide(int a, int b) {
        return a / b;
    }


    // question 5
    // Version1
    /*
    -?       :this part identifies if the given number is negative,
              the dash “–” searches for dash literally and the question mark “?” marks its presence as an optional one
    \d+-     :this searches for one or more digits
    (\.\d+)? :this part of regex is to identify float numbers.
              Here we're searching for one or more digits followed by a period.
              The question mark, in the end, signifies that this complete group is optional
     */
    public static int inputAge() {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age :");

        while (true) {
            String str = scanner.nextLine();
            if (pattern.matcher(str).matches()) {
                if (Integer.valueOf(str) > 0) {
                    return Integer.valueOf(str);

                } else {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                }
            } else {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }
        }
    }

    // question 5 version 1

    public static int inputAgeVer1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age :");
        while (true) {
            String str = scanner.nextLine();

            if (str == null) {
                System.out.println(" Enter Again : ");
            }
            try {
                int age = Integer.parseInt(str);
                if (age > 0) {
                    return age;
                }else
                {
                    System.out.println("Wrong inputing! The age must be greater than 0, please input again.");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }
        }
    }




}
