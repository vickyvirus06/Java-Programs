package com.corejava.Abstract;

abstract class Person {
	public void sleeping()
	{
		System.out.println("Happy Sleeping ");
		
	}
	abstract void jobstatus(); 
	
}


abstract class Student extends Person
{
	public void details()
	{
		System.out.println("Love Coding");
	}
}


class NewStudent extends Student
{
	void jobstatus()
	{
		System.out.println("Still Preparing");
	}
}


class OldStudent extends Student 
{
	void jobstatus()
	{
		System.out.println("Working in MNC");
	}
}