package com.nguyenvi.frontend;

import com.nguyenvi.entity.*;

import java.util.ArrayList;
import java.util.List;


public class Exercise4_FrontEnd {

    public static void main(String[] args) {


        // Exercise 4 - Question 1
        Salary salary = new Salary(10000);
        System.out.println(salary);
        // Exercise 4 - Question 2
        // MyMap Class
        // Exercise 4 - Question 3
        Integer number = new Integer(10);
        System.out.println(number instanceof Number);
        System.out.println(max(10.0F,12.0f));

        // Exercise 4 - Question 4
        // Exercise 5 - Question 5
        List<Object> listWildcards = new ArrayList<>();
        listWildcards.add("Nguyen Van Vi");
        listWildcards.add(30);
        listWildcards.add("Ha Dong, Ha Noi");

//        var t = add(1,2);
//        System.out.println(t);

        // Test Exception
        float a = divide(10,0);

        System.out.println(a);
        System.out.println("It will be printed ! ");



        System.out.println(add(1.2,3.4));



    }
    public static float divide(int a , int b)
    {
        float res = 0;
        try {
            res = a/b;
        }catch(Exception  e)
        {
            System.err.println("Can not divide to 0");
        }
        return res;
    }


    // Question 3 Using Overload

      public static  <T extends Double> T max(T n1 , T n2)
      {

         if (n1.compareTo(n2) == 1)
         {
             return n1;
         }else
         {
             return n2;
         }
      }
    public static  <T extends Float> T max(T n1 , T n2)
    {

        if (n1.compareTo(n2) == 1)
        {
            return n1;
        }else
        {
            return n2;
        }
    }

    public static  <T extends Integer>T max(T n1 , T n2)
    {

        if (n1.compareTo(n2) == 1)
        {
            return n1;
        }else
        {
            return n2;
        }
    }


//    public static <T extends Integer> T add(T n1 , T n2)
//    {
//        T t = n1 + n2;
//        return t;
//    }
    public static <T extends Number> double add (T one, T two)
    {
        return one.doubleValue() + two.doubleValue();
    }


}
