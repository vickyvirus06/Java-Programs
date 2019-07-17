package com.corejava.BuiltInPackages;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address add = new Address("Rajajinagar");
		Student2 student = new Student2(101,"vicky",add);
		
		Student2 student1 = (Student2)student.clone();
		
		System.out.println(student);
		System.out.println(student1);
		System.out.println("\n----------Now modifying values");
		
		student1.name="rahul";
		student1.add = new Address("Majestic");
		
		System.out.println(student);
		System.out.println(student1);
		System.out.println("\n\n---------------new Way");
		
		Address add1 = new Address("Vijayanagar");
		Student2 student2 = new Student2(105,add1) {
			
			
			@Override
			protected Object clone() throws CloneNotSupportedException {
				Address add = new Address(this.add.add);
				Student2 student = new Student2(this.id,this.add);
				return student;
			}
		};
		System.out.println(student2);
		
		
		Student2 student3 = (Student2)student2.clone();
		
		System.out.println(student3);
		
		Address add2 = new Address("Race Course");
		Student2 student4 = new Student2(add2) {
			
			
			@Override
			protected Object clone() throws CloneNotSupportedException {
				
				Student2 student = new Student2(new Address(this.add.add));
				return student;
			}
		};
		
		
		
		Student2 student5 = (Student2)student4.clone();
		System.out.println(student4);
		System.out.println(student5);
	}

}

class Student2 implements Cloneable
{
	int id;
	String name;
	Address add;
	
	public Student2(Address add)
	{
		this.add=add;
	}
	public Student2(int id,Address add)
	{
		this.add=add;
		this.id=id;
	}
	public Student2(int id,String name,Address add)
	{
		this.id = id ;
		this.name=name;
		this.add=add;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Address add = new Address(this.add.add);
		Student2 student = new Student2(this.id,this.name,this.add);
		return student;
	}
	
	@Override
	public String toString() {
		
		return  id +"\t" + name + "\t" +add;
	}
	
}

class Address
{
	
	String add;
	public Address(String add)
	{
		this.add= add;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return add;
	}
	
}

