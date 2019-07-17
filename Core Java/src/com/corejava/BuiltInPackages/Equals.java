package com.corejava.BuiltInPackages;

public class Equals {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(101,"vicky");
		Customer customer2 = new Customer(102,"karan");
		Customer customer3 = new Customer(101,"raj");
		Customer customer4 = new Customer(102,"karan");
		System.out.println(customer2==customer1);
		System.out.println(customer2==customer3);
		System.out.println(customer2==customer4);
		
		System.out.println("---------Using Equals");
		System.out.println(customer2.equals(customer1));
		System.out.println(customer2.equals(customer3));
		System.out.println(customer2.equals(customer4));
		
		System.out.println("Now comparing to String");
		
		String name = new String("vicky");
		String second_name = new String("vicky");
		
		System.out.println(name.equals(second_name));
	}

}


class Customer
{
	int id;
	String name;
	
	public Customer(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer cust = (Customer)obj;
		return this.id==cust.id && this.name.equals(cust.name);
	}
}