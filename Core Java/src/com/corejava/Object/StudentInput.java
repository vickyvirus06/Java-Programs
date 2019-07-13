package com.corejava.Object;

import java.util.Scanner;

public class StudentInput {

	public static void main(String[] args) {
		System.out.println("This is student1--------------------");
		StudentInputDemo student1 = new StudentInputDemo();
		student1.show();
		
		System.out.println("This is student2--------------------");
		StudentInputDemo student2 = new StudentInputDemo();
		student2.show();
		
	}

}

class StudentInputDemo
{
	
	int id;
	String name;
	long number;
	
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Your Id   :  ");
		id = input.nextInt();
		System.out.print("\nEnter your Name  :  ");
		name = input.next();
		System.out.print("\nEnter your Number   :   ");
		number = input.nextLong();
	}
	
	
	void show()
	{
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Number : " + number);

	}
}