package com.corejava.Object;

public class Student {

	public static void main(String[] args) {
		
		StudentDemo student = new StudentDemo();
		student.id=101;
		student.name= "vicky";
		student.number = 8286337928l;
		student.show();
		

	}

}

class StudentDemo
{
	
	int id;
	String name;
	long number;
	
	
	void show()
	{
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Number : " + number);
	}
}