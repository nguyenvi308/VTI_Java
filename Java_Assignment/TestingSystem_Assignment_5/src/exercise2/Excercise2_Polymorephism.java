package exercise2;
import java.util.*;

import exercise2.student.Student;
public class Excercise2_Polymorephism {

	public static void main(String[] args) {
		
		// Question 1 
				List<Student> students = new ArrayList<>(); 
				
				Student s1 = new Student(1, "Nguyen Vi",1);
				Student s2 = new Student(2, "Mai Anh",1);
				Student s3 = new Student(3, "Hoang Minh",1);
				Student s4 = new Student(4, "Trung Nam",2);
				Student s5 = new Student(5, "Thuy Tien",2);
				Student s6 = new Student(6, "Trinh Van",2);
				Student s7 = new Student(7, "Hoang Thanh",3);
				Student s8 = new Student(8, "Hoang Nam",3);
				Student s9 = new Student(9, "Lung Linh",3);
				Student s10 = new Student(10, "Nhu Hoai",3);
				students.add(s1); 
				students.add(s2); 
				students.add(s3); 
				students.add(s4); 
				students.add(s5); 
				students.add(s6); 
				students.add(s7); 
				students.add(s8); 
				students.add(s9); 
				students.add(s10); 
				
				// Diem Danh
				students.forEach((s) -> s.diemdanh());
				// Nhom 1 di hoc bai
				
				students.stream().filter((x) -> x.getGroup() == 1).forEach((x) -> x.hocbai());
				
				// Nhom 2 di don ve sinh 
				
				students.stream().filter((x) ->x.getGroup() ==2).forEach((x) -> x.didonvesinh());
			
				// Question 2 
		
	}
}
