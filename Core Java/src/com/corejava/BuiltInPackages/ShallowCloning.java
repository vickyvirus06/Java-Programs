package com.corejava.BuiltInPackages;

public class ShallowCloning {

	public static void main(String[] args) throws Exception{
		
		Customer1 cust1 = new Customer1(101,"vicky");
		Customer1 cust2 = cust1;
		
		System.out.println(cust1);
		System.out.println(cust2);
		System.out.println("----------Now changing values of cust1");
		cust1.id=104;
		cust1.name="vinod";
		
		System.out.println(cust1);
		System.out.println(cust2);
		
		System.out.println("------------Now using shallow cloning");
		
		Customer1 cust3 = (Customer1)cust1.clone();
		cust1.id=102;
		cust1.name="rahul";
		
		System.out.println("\n\n"+cust1);
		System.out.println(cust3);
		
	}

}

class Customer1 implements Cloneable
{
	int id;
	String name;
	
	public Customer1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	@Override
	public String toString() {
		
		return "id  :  "+id + "      name   :" + name ;
	}
}