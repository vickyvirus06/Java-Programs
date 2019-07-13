package com.corejava.Inheritance;

import java.util.Scanner;

public class InheritanceTest {

	public static void main(String[] args) {
		
	Student student = new Student("vicky","mumbai",101);
	Employee emp = new Employee("rakesh","bengaluru",11);
	student.eating();
	emp.eating();
		

	}

}
class Person
{
	int id;
	String name;
	String city;
	
	void eating()
	{
		System.out.println(name + " is eating");
	}
	
	
}

class Student extends Person
{
	int fees;
	
	Student(String name,String city,int id)
	{
		this.name=name;
		this.city=city;
		this.id = id;
	}
	void studying()
	{
		System.out.println(name + " is studying");
	}
}
class  Employee extends Person
{
	float salary;
	
	Employee(String name,String city,int id)
	{
		super.name=name;
		super.city=city;
		super.id = id;
	}
	void working()
	{
		System.out.println(name + " is working on java " );
	}
}
