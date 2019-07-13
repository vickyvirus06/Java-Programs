package com.corejava.Object;

public class StudentBlocks {

	public static void main(String[] args) {
		
		StudentBlocksDemo st = new StudentBlocksDemo();
		st.show();
		

	}

}

class StudentBlocksDemo
{
	int id;
	String name;
	long number;
	
	{
		id=101;
		name="vicky";
		number=89898;
	}
	
	
	void show()
	{
		System.out.println("Student Id : " + id);
		System.out.println("Student Name : " + name);
		System.out.println("Student Number : " + number);
	}
}