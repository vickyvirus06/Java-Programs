package com.CollectionsFramework.Set.HashSet;

import java.util.*;

public class EmployeeHashSet {

	public static void main(String[] args) {
		Employee emp1= new Employee(101,"vicky");
		Employee emp2= new Employee(102,"kunal");
		Employee emp3= new Employee(103,"rakesh");
		Employee emp4 = new Employee(103,"sameer");
		
		LinkedHashSet hash = new LinkedHashSet();
		hash.add(emp1);
		hash.add(emp2);
		hash.add(emp3);
		hash.add(emp4);
		
		System.out.println(hash);

	}

}

class Employee
{
	int eid;
	String ename;
	
	Employee(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Hash code " + super.hashCode());
		return eid;
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		return this.eid==emp.eid;
	}
	@Override
	public String toString() {
		
		return eid+"\t"+ename;
	}
}
