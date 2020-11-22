package com.nguyenvi.frontend;

import com.nguyenvi.entity.Student1;

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Exercise2_FrontEnd {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now().minusYears(1).minusDays(10).minusMonths(2);
        LocalDate d2 = LocalDate.now().minusYears(2).minusDays(1).minusMonths(2);
        LocalDate d3 = LocalDate.now().minusYears(3).minusDays(3).plusMonths(2);
        LocalDate d4 = LocalDate.now().minusYears(1).minusDays(4).plusMonths(2);
        LocalDate d5 = LocalDate.now().minusYears(3).minusDays(5).minusMonths(2);



        System.out.println(d1);
        Student1 s1 = new Student1(1,"Vi" ,d1, 7.6);
        Student1 s2 = new Student1(2,"Minh" ,d2,6.5);
        Student1 s3 = new Student1(3,"Cong Minh" ,d3,8.7);
        Student1 s6 = new Student1(6,"Cong Minh" ,d3,9);
        Student1 s4 = new Student1(4,"Van Tuan" ,d4,6.7);
        Student1 s5 = new Student1(5,"Mai Anh" ,d5,5.4);


        List<Student1> student1s = Arrays.asList(s1,s2,s3,s4,s5,s6);
        System.out.println("Before Sort : ");
        student1s.forEach(System.out::println);
        // Question 1
        Collections.sort(student1s);
        System.out.println("After Sort : ");
        student1s.forEach(System.out::println);
        // Question 2
        // name -> dateOfBird -> diem
        Comparator<Student1> student1Comparator = new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                if (o1.getName().equals(o2.getName()) )
                {
                    if (o1.getDateOfBirth() == o2.getDateOfBirth())
                    {
                        if (o1.getGrade() == o2.getGrade())
                        {
                            return  0;
                        }else
                        {
                            // Neu xep theo thu tu tang dan diem
                                // return  Double.valueOf(o1.getGrade()).compareTo(o2.getGrade());
                            // Neu xep theo thu tu giam dan
                            return  Double.valueOf(o2.getGrade()).compareTo(o1.getGrade());
                        }
                    }else
                    {
                        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
                    }
                }else
                {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        };
        System.out.println("Sort by Name -> Date of Birth -> Grade");
        Collections.sort(student1s,student1Comparator );
        student1s.forEach(System.out::println);







    }
}
