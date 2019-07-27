package com.corejava.Exception;

public class ThrowsException {

	public static void main(String[] args){
		
		Employee emp = new Employee();
		try {
			emp.m1();
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			e.getCause();
			e.getMessage();
		}
	}

}

class Employee
{
	int eid;
	String name;
	
	void m1() throws ClassNotFoundException
	{
		m2();
	}
	
	void m2() throws ClassNotFoundException
	{
		m3();
	}
	
	void m3() throws ClassNotFoundException
	{
		Class.forName("Employee");
	}
}
