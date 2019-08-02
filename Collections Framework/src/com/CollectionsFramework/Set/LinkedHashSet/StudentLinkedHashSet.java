package com.CollectionsFramework.Set.LinkedHashSet;

import java.util.*;
public class StudentLinkedHashSet {

	public static void main(String[] args) {
		
		TreeSet tree = new TreeSet(new StudentNameComparator());
		tree.add(new Student(101,"vicky"));
		tree.add(new Student(102,"sneha"));
		tree.add(new Student(104,"sneha"));
		tree.add(new Student(103,"nayana"));
		
		System.out.println(tree);
		
	}

}

class Student
{
	int sid;
	String sname;
	Student(int sid,String sname)
	{
		this.sid=sid;
		this.sname=sname;
	}
	
	@Override
	public String toString() {
	
		return "\n"+ sid+"\t"+sname;
	}
}

class StudentIdComparator implements Comparator
{

	

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student)o1;
		Student st2 =(Student)o2;
		return st1.sid-st2.sid;
	}
	
}

class StudentNameComparator implements Comparator
{
	
	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		return (st1.sname).compareTo(st2.sname);
	}
}