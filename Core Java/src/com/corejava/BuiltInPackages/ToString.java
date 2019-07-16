package com.corejava.BuiltInPackages;

public class ToString {

	public static void main(String[] args) {
		StudentNew student = new StudentNew(101,"vicky");
		System.out.println(student);
		
		System.out.println("----------------------Using To String");
		System.out.println(student);
		
		StudentNew student_change = new StudentNew(101,"karan") {
			public String toString()
			{
				System.out.println("\n\nOveriding method Using Anonymous Class");
				return "id  : " + id;
			
			}
		};
		System.out.println(student_change);
		
	}

}

class StudentNew
{
	int id;
	String name;
	int n=1;
	public StudentNew(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	/* Overiding toString method
	@Override
	public String toString() {
		System.out.println("Overiding method to String");
		return "id  : " + id + " name :  " +name;
	}*/
	
}