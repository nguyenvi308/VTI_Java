package com.nguyenvi.frontend.exercise1;

import com.nguyenvi.backend.exercise1.MyClass;
import com.nguyenvi.backend.exercise1.PrimaryStudent;
import com.nguyenvi.backend.exercise1.SecondaryStudent;
import com.nguyenvi.backend.exercise1.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {


        // Question 1
                List<Student> students = new ArrayList<>();
                Student vi = new Student(1, "Nguyen Vi");
                Student anh = new Student(2,"Mai Anh");
                Student minh = new Student(3,"Nguyen Minh");
                students.add(vi);
                students.add(anh);
                students.add(minh);
                students.forEach(System.out::println);
                Student.setCollege("Dai Hoc Kinh Te Quoc Danh");

		// Question 2

                for(Student st : students) {
                    Student.setMoneyGroup(Student.getMoneyGroup() + 100);

                }
                System.out.println("Money of Group " + Student.getMoneyGroup());
                // S1 lay 50k
                Student.setMoneyGroup(Student.getMoneyGroup() - 50);
                System.out.println(Student.getMoneyGroup() + " đi mua bim bim, kẹo về liên hoan");
                // S2 lay 20k
                Student.setMoneyGroup(Student.getMoneyGroup() - 20);
                System.out.println(Student.getMoneyGroup() + " đi mua bánh mì");
                // S3 lay 150K
                Student.setMoneyGroup(Student.getMoneyGroup() - 150);
                System.out.println(Student.getMoneyGroup() + " đi mua đồ dùng học tập cho nhóm");
                System.out.println("Con lai la " + Student.getMoneyGroup());
                for(Student st : students)
                {
                    Student.setMoneyGroup(Student.getMoneyGroup() + 50);

                }
                System.out.println("Tong Tien Sau Dong Quy " + Student.getMoneyGroup());
        // Question 3:
                int[] arr = {1,2323,4,531,143,142};
                System.out.println("Sum is " + MyClass.sum(arr));
                System.out.println("Min is " + MyClass.min(arr));
        // Question 4:
                // Dung setCollege
        // Question 5:
                System.out.println("Total Student " + Student.getCount());
        // Question 6:
                Student s1 = Student.getStudentInstantce(1, "Vi");
                Student s2 = Student.getStudentInstantce(2, "Hoang Minh");
                Student s3 = Student.getStudentInstantce(3, "Cong Minh");
                Student s4 = Student.getStudentInstantce(4, "Nguyen Tuan");
                Student s5 = Student.getStudentInstantce(5, "Mai Anh");
                Student s6 = Student.getStudentInstantce(6, "Anh Duc");
                System.out.println("Total of primary student : " + PrimaryStudent.getCountPrimaryStudent());
                System.out.println("Total of secondary student : " + SecondaryStudent.getCountSecondaryStudent());
        // Question 7:
        // Question 8:
        // Question 9:



    }




}
