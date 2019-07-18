package com.corejava.BuiltInPackages;

public class DeepCloningWithoutConstructor{

	public static void main(String[] args) throws CloneNotSupportedException {
	
		Consumer consumer1 = new Consumer();
		consumer1.id=101;
		consumer1.name="vicky";
		
		Consumer consumer2 = (Consumer) consumer1.clone();
		
		System.out.println(consumer1);
		System.out.println(consumer2);
		
		Consumer consumer3 = (Consumer)consumer2.clone();
		System.out.println(consumer3);
		
		System.out.println("\n\n------------Now modifying ");
		consumer1.id=102;
		consumer2.id=103;
		
		System.out.println(consumer1);
		System.out.println(consumer2);
		System.out.println(consumer3);

	}

}

class Consumer implements Cloneable
{
	int id;
	String name;
	Address add;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Consumer consumer = new Consumer();
		consumer.id=this.id;
		consumer.name=this.name;
		return consumer;
		
	}
	
	@Override
	public String toString() {
		
		return "id  :  " + id + "      name :  " +name;
	}
}

class Address1
{
	String add;
	
	public Address1(String add)
	{
		this.add=add;
	}
}