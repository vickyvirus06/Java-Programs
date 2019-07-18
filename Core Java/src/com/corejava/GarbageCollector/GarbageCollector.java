package com.corejava.GarbageCollector;

public class GarbageCollector {

	public static void main(String[] args) {
		
		Student student1 = new Student(1);
		new Student(2);
		Student student3 = new Student(3);
		Student student4 = new Student(4);
		student4 = student3;
		new Student(5);
		new Student(6).doSomething();
		System.gc();
		
		System.out.println("\nSeond way to call gc");
		//Runtime.getRuntime().gc();
	}

}

class Student
{
	int id;
	boolean flag=false;
	
	Student(int id)
	{
		this.id=id;
		System.out.println("Student object " + id);
	}
	
	void doSomething()
	{
		flag = true;
	}
	
	@Override
	protected void finalize() throws Throwable {
		if(flag)
		{
			System.out.println("\nObj "+ this.id + "  will not be collected by gc");
		}
		else
		{
			System.out.println("\nObject " +this.id+"  will be removed");
		}
		super.finalize();
	}
}
