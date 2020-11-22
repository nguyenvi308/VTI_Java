package com.nguyenvi.TestingSystem_Assignment_3;

import com.nguyenvi.TestingSystem_Assignment_1.entities.Department;

import java.util.List;

public class Exercise5 {
    /*
    Question 1:
In ra thông tin của phòng ban thứ 1 (sử dụng toString())
*/
    public static void main(String[] args) {
        Department sale = new Department();
        sale.setDepartmentID(1);
        sale.setDepartmentName("Sale");

        Department finance = new Department();
        finance.setDepartmentID(2);
        finance.setDepartmentName("Finance");


        Department marketing = new Department();
        marketing.setDepartmentID(3);
        marketing.setDepartmentName("Marketing");

        Department[] departments = new Department[3];
        departments[0] = sale;
        departments[1] = finance;
        departments[2] = marketing;


        System.out.println("Before Sort : ");
        for (Department department : departments)
        {
            System.out.println(department
            );
        }
        System.out.println("After Sort : ");
        question6v2(departments);
        for (Department department : departments)
        {
            System.out.println(department
            );
        }



    }

    public  static void question1(List<Department> departmentList)
    {

            System.out.println(departmentList.get(0));

    }
    public  static void question2(List<Department> departmentList)
    {
        for (Department department: departmentList)
        {
            System.out.println(department);
        }
    }



    // Using Merge Sort to sort
    // Recursive in sort method
    // Another Sort ()
        // Selection Sort
        // Insert Sort
        // Bubble Sort
        // ....

    // Selection Sort
    public static void question6v2(Department arr[])
    {
        for (int i = 0 ; i < arr.length ; i++)
        {

            for (int j = 0; j < arr.length-1; j++)
            {
                if (arr[j].getDepartmentName().charAt(0) > arr[j+1].getDepartmentName().charAt(0))
                {
                   Department department = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = department;
                }
            }
        }
    }

    public static void merge(Department arr[], int l, int m, int r)
    {
        // Find sizes of two sub arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create tempt arrays */
        Department L[] = new Department[n1];
        Department R[] = new Department[n2];

        /*Copy data to tempt arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the tempt arrays */

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub arry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].getDepartmentName().charAt(0) <= R[j].getDepartmentName().charAt(0)) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any is left  */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any is left */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts  using
    // merge()
    public static void sort(Department arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }


    public static void question6(Department[] departments)
    {

        sort(departments , 0 , departments.length -1);
    }


}
