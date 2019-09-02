package com.corejava.BuiltInPackages;

public class ClassDetails {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.getClass1().getName();
		Person person1 = new Person();
		getDetails(person1);
	}
	
	static void getDetails(Object obj)
	{
		
		System.out.println(obj.getClass().getName());
		System.out.println(obj.getClass().getSuperclass());
	}

}

class Person
{
	public Student1 getClass1()
	{
		return new Student1();
	}
}

class Student1
{
	public void getName()
	{
		System.out.println("Hello");
	}
}