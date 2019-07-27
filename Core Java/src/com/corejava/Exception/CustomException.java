package com.corejava.Exception;

public class CustomException {

	public static void main(String[] args) {
		
		EmployeeTest emp = new EmployeeTest(1001,"vicky");
		
		try {
			emp.show(100);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

class EmployeeTest
{
	int id;
	String name;
	
	public EmployeeTest(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	void show(int id)
	{
		if(id==this.id)
		{
			System.out.println("Id    :  " + this.id);
			System.out.println("Name  :  " + this.name);
		}
		else
		{
			throw new EmployeeNotFoundException();
		}
	}
	
	
}

class EmployeeNotFoundException extends RuntimeException
{
	public EmployeeNotFoundException()
	{
		super("Employee Not Found");
	}
}
