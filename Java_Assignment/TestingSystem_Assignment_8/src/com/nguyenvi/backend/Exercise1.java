package com.nguyenvi.backend;

import com.nguyenvi.entity.Student;


import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise1 {

    // Question 1
                public  Student findByName(List<Student> students , String name)
                {
                    Optional<Student> s1 = students.stream().filter((x) -> x.getName().equals(name)).findFirst();
                    if (s1.isPresent())
                    {
                        Student s = s1.get();
                        return s;
                    }else {
                        return null;
                    }
                }
                public  Student findByID(List<Student> students , int id)
                {
                    Optional<Student> s1 = students.stream().filter((x) -> x.getId() == id).findFirst();
                    if (s1.isPresent())
                    {
                        Student s = s1.get();
                        return s;
                    }else {
                        return null;
                    }
                }
                // Find duplicate name
                // Solution 1
                public  List<String> findDuplicateNameS1(List<Student> students )
                {
                    // List contain duplicate name
                    List<String> duplicateList = new ArrayList<>();
                    // Find the duplicate name and add to duplicateList
                    Set<String> setStudent = new HashSet<>();
                    // List contain all name of student
                    List<String> studentNameList = new ArrayList<>();
                    for (Student s1 :students)
                    {
                        studentNameList.add(s1.getName());
                    }

                      for (String studentName : studentNameList)
                      {
                          if (setStudent.add(studentName) == false)
                          {
                                duplicateList.add(studentName);
                          }
                      }
                      return duplicateList;
                }
                // Solution 2
                public  List<String> findDuplicateNameS2(List<Student> students)
                {
                    List<String> duplicateStudent = new ArrayList<>();
                    // List contain all name of student
                    List<String> studentNameList = new ArrayList<>();
                    for (Student s1 :students)
                    {
                        studentNameList.add(s1.getName());
                    }
                    // Get frequencies of each element
                    Map<String, Long> frequencies = studentNameList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
                    // The filter only the input which have frequency > 1
                    frequencies.entrySet().stream().filter(entry -> entry.getValue() >1).forEach(entry -> duplicateStudent.add(entry.getKey()));
                    return duplicateStudent;

                }
                public  void deleteByID(List<Student> students , int id)
                {
                    students.removeIf((x) -> x.getId() ==id);

                }
    // Question 2

                public  void question2_stack()
                {
                    Student s1 = new Student(1, "Nguyen Vi");
                    Student s2 = new Student(2 , "Nguyen Hoang Minh");
                    Student s3 = new Student(3,"Nguyen Cong Minh");
                    Stack<Student> studentStack = new Stack<>();

                    studentStack.push(s1);
                    studentStack.push(s2);
                    studentStack.push(s3);

                    System.out.println("Using Stack : ");
                    while (!studentStack.isEmpty())
                    {
                        System.out.println(studentStack.pop());
                    }


                }
                public  void question2_queue()
                {
                    Student s1 = new Student(1, "Nguyen Vi");
                    Student s2 = new Student(2 , "Nguyen Hoang Minh");
                    Student s3 = new Student(3,"Nguyen Cong Minh");

                    Queue<Student> studentQueue = new ArrayDeque<>();
                    studentQueue.offer(s1);
                    studentQueue.offer(s2);
                    studentQueue.offer(s3);

                    System.out.println("Using Queue : ");
                    while (!studentQueue.isEmpty())
                    {
                        System.out.println(studentQueue.poll());
                    }

                }

}

