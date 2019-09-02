package com.corejava.BuiltInPackages;

public class ModifyObjectMethod {

	public static void main(String[] args) {
		Employee emp = new Employee(1067,"vicky");
		
		String name = emp.getClass().getSuperclass().getName();
		System.out.println(name);
	
	}

}

class Employee
{
	int id;
	String name;
	int n=1;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	
	
	
	
}
