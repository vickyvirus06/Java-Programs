package com.CollectionsFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Employee emp1 = new Employee(101,"vicky");
		Employee emp2 = new Employee(102,"ambi");
		Employee emp3 = new Employee(103,"hidayath");
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		Iterator it = al.iterator();
		
		for (int i = 0; i < al.size(); i++) {
			if(((Employee) al.get(i)).eid==102)
				System.out.println(al.get(i));
		}

	}

}

class Employee
{
	int eid;
	String name;
	
	Employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return eid+"\t"+name;
	}
}