package com.CollectionsFramework.Set.TreeSet;

import java.util.*;
public class EmployeeTreeSet {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet();
		tree.add(new Employee(101,"vicky"));
		tree.add(new Employee(102,"rakesh"));
		tree.add(new Employee(105,"nayana"));
		tree.add(new Employee(103,"sneha"));
		tree.add(new Employee(105,"sameer"));
		
		System.out.println(tree);
		

	}

}

class Employee implements Comparable
{
	int eid;
	String ename;
	
	Employee(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee)o;
		return emp.eid-this.eid;
	}
	
	@Override
	public String toString() {
	
		return "\n"+eid+"\t"+ename;
	}
	
}