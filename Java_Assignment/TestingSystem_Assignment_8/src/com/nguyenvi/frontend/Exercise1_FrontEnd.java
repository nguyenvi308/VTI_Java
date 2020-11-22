package com.nguyenvi.frontend;

import com.nguyenvi.backend.Exercise1;

import java.util.*;

public class Exercise1_FrontEnd {

    public static final Exercise1 exercise1 = new Exercise1();
    public static void main(String[] args) {
        // Question 1 List
        /*

        List<Student> students = new ArrayList<>();

        Student  s1 =  new Student(1,"Vi");
        Student  s2 =  new Student(2,"Mai Anh");
        Student  s3 =  new Student(3,"Cong Minh");
        Student  s4 =  new Student(4,"Nguyen Duc");
        Student  s5 =  new Student(5,"Nguyen Vi");
        Student  s6 =  new Student(6,"Nguyen Vi");
        Student  s7 =  new Student(6,"Nguyen Duc");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);

        // Question 1 a
        System.out.println("Size list : " + students.size());

        // Last and first element
        // Question 1 b
        System.out.println("The student at 4 is  : " + students.get(4));

        // Question 1 c
        System.out.println(students.get(0));

        // Question 1 d
        // Add a element at the last
        int lastIndex  = students.size();
         students.add(lastIndex, new Student(11, "Rachel"));

        // Question 1 e
        // Add a element at the front
        students.add(0, new Student(10 ,"Someone"));

        // Question 1 f
        // Reverse array
        Collections.reverse(students);


        // Question 1 g
        // Find by ID
        int id = 1;
        System.out.println("Find student with id : " + id);
        System.out.println(findByID(students, id));

        // Question 1 h
        // Find by Name
        String name = "Cong Minh";
        System.out.println("Find student by name : " + name);
        System.out.println(findByName(students, name));

        // Question 1 i
        // Find duplicate account
        System.out.println("Duplicate Name List : ");
        System.out.println(findDuplicateNameS1(students));
*/
        // Question 2 Stack Queue
        /*
        exercise1.question2_stack();
        exercise1.question2_queue();
        // Question 3 Set optional
        // Question 4 Set optional
        // Question 5 Set optional
        // Question 6 Map
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Nguyen Vi");
        students.put(2,"Nguyen Minh");
        students.put(3,"Cong Minh");
        System.out.println(students);
        // Question 7
        Set<Integer> keys = students.keySet();
        System.out.println(keys);
        Collection<String> studentNamesView =  students.values();
        List<String> studentList = new ArrayList<>(studentNamesView);
        System.out.println(studentList);
        studentList.add("Holla");
        System.out.println("After add Holla : ");
        System.out.println(studentList);
        studentList.set(0, "Nguyen Van");
        System.out.println(studentList);

*/


    }
}
