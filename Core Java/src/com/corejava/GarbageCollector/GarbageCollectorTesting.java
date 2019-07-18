package com.corejava.GarbageCollector;

public class GarbageCollectorTesting {

	public static void main(String[] args) {
		Customer[] cust = new Customer[100];
		for(int i=0;i<cust.length;i++)
		{
			if(i%2==0)
			{
				cust[i]=new Customer(i);
			}
			else
			{
				cust[i] = new Customer(i);
				cust[i]=null;
			}
		}
		System.gc();
		

	}

}

class Customer 
{
	int id;
	Customer(int id)
	{
		this.id=id;
		System.out.println("Customer id " + this.id);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id  :  " + id;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object " + id + "  is removed");
		super.finalize();
	}
}
