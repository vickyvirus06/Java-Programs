package com.corejava.BuiltInPackages;

public class HashCode {
	
	public static void main(String[] args) {
		System.out.println("-----------------------------Printing normal hashcode");
		
		Student student1 = new Student(101,"vicky");
		Student student2 = new Student(103,"raj");
		Student student3 = new Student(101,"vicky");
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student3.hashCode());
		
		Student student_change = new Student(104,"xyz") {
			@Override
			public int hashCode() {
				System.out.println("This is Student Class");
				return id;
			}
		};
		Student student_change1 = new Student(105,"virus") {
			@Override
			public int hashCode() {
				System.out.println("This is Student Class");
				return id;
			}
		};
		
		System.out.println(student_change.hashCode());
		System.out.println(student_change1.hashCode());
		
	}

}

class Student
{
	int id;
	String name;
	int n=1;
	public Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	/* If you want to explicitly change the hash code
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}
	*/
	
}