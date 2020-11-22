package com.nguyenvi.backend.exercise1;

public class Student {
	private int id; 
	private String name; 
	public static String college = "Dai Hoc Bach Khoa";
	// Question2 Money Group
	public static double moneyGroup; 
	public static int count; 
	
	private static Student student;
	
	
	public Student(int id , String name)
	{
		this.id = id; 
		this.name = name; 
		count++; 
	}
	
	public static Student getStudentInstantce(int id, String name) {
		
		if(count <= 7)
		{
			student = new Student(id, name); 
		
		}
		return student; 
		
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "		Id : " + id + "\n" +
				" 		Name : " + name + "\n" +
				"		College : "	+ college ;
	}
	public static double getMoneyGroup() {
		return moneyGroup;
	}
	public static void setMoneyGroup(double moneyGroup) {
		Student.moneyGroup = moneyGroup;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}


}
