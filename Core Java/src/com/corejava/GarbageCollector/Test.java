package com.corejava.GarbageCollector;

public class Test {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1);
		
		System.out.println("\n----------Now Array of Employee class");
		
		Employee[] emp = new Employee[100000];
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=new Employee(i);
		}
		
		System.gc();
		System.out.println("-----------Now memory overflow \n");
		for(int i=0;true;i++)
		{
			emp[i]=new Employee(i);
		}
		

	}

}

class Employee
{
	int id;
	double [] d = new double[10100];
	Employee(int id)
	{
		this.id=id;
		System.out.println("Employee obj " + id);
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
	}
}