package com.CollectionsFramework.Map.TreeMap;
import java.util.*;

public class StudentTreeMap {

	public static void main(String[] args) {
		
		Student st1 = new Student(101,"vicky");
		Student st2 = new Student(102,"shiva");
		Student st3 = new Student(103,"ambi");
		TreeMap tree = new TreeMap();
		tree.put("st1", st1);
		tree.put("st2", st2);
		tree.put("st3", st3);
		
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
		return sid+"\t"+sname;
	}
}



class StudentIdCompare implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		return st1.sid-st2.sid;
	}
	
}