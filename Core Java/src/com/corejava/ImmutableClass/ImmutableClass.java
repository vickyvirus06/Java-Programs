package com.corejava.ImmutableClass;

public class ImmutableClass {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"vicky");
		System.out.println(emp.getEid());
		System.out.println(emp.getName());

	}

}

final class Employee
{
	private int eid;
	private String name;
	
	public Employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}

	public int getEid() {
		return eid;
	}

	public String getName() {
		return name;
	}
	
	
}
