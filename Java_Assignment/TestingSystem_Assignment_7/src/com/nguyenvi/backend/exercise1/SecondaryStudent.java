package com.nguyenvi.backend.exercise1;

public class SecondaryStudent extends Student {

	public static int countSecondaryStudent; 
	public SecondaryStudent(int id, String name) {
			super(id, name);
			// TODO Auto-generated constructor stub
			countSecondaryStudent++;	
	
		 
	}
	public static int getCountSecondaryStudent() {
		return countSecondaryStudent;
	}
	public static void setCountSecondaryStudent(int countSecondaryStudent) {
		SecondaryStudent.countSecondaryStudent = countSecondaryStudent;
	}
	
	

}
