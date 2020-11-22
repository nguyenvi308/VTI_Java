package frontend;

import entity.Student;

public class Exercise2 {

    public static void main(String[] args) {
        Student s1 = new Student("Vi");
        Student s2 = new Student("nguye");

        Student s3 = new Student("Someone");

        System.out.println(s1.getId() + "  " + s1.getName());

        System.out.println(s2.getId() + "  " + s2.getName());


        System.out.println(s3.getId() + "  " + s3.getName());

    }
}
