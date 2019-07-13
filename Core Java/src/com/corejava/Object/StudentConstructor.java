package com.corejava.Object;

public class StudentConstructor {

	public static void main(String[] args) {
		StudentConstructorTest student1 = new StudentConstructorTest();
		StudentConstructorTest student2 = new StudentConstructorTest(101);
		StudentConstructorTest student3 = new StudentConstructorTest(102,"rahul");
		StudentConstructorTest student4 = new StudentConstructorTest(103,"vicky",989898);

	}

}
class StudentConstructorTest
{
	int sid;
	String sname;
	long snumber;
	
	StudentConstructorTest()
	{
		System.out.println("no args constructor");
	}
	
	StudentConstructorTest(int id)
	{
		System.out.println("1 args constructor");
		id = sid;
	}
	
	StudentConstructorTest(int id,String name)
	{
		System.out.println("2 args constructor");
		id = sid;
		sname = name;
	}
	
	StudentConstructorTest(int id,String name, long number)
	{
		System.out.println("3 args constructor");
		id = sid;
		sname = name;
		snumber = number;
	}
}
