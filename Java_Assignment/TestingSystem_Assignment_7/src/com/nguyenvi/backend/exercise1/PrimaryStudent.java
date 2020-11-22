package com.nguyenvi.backend.exercise1;

public class PrimaryStudent extends Student {

	
	private static int countPrimaryStudent; 
	public PrimaryStudent(int id, String name) {
		
		
		super(id, name);
		// TODO Auto-generated constructor stub
		countPrimaryStudent++;
		
	}
	public static int getCountPrimaryStudent() {
		return countPrimaryStudent;
	}
	public static void setCountPrimaryStudent(int countPrimaryStudent) {
		PrimaryStudent.countPrimaryStudent = countPrimaryStudent;
	}
	
	
	
}
