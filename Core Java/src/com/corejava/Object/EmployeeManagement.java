package com.corejava.Object;

public class EmployeeManagement {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.eid=101;
		emp1.ename="vicky";
		emp1.email="poojarivicky3@gmail.com";
		emp1.number=8286337928l;
		
		Employee emp2 = new Employee();
		emp2.eid=102;
		emp2.ename="rahul";
		emp2.email="matharerahul@gmail.com";
		emp2.number=8898169249l;
		
		emp1.show();
		
		System.out.println();
		emp2.show();
		

	}

}
																																																

class Employee
{
	
	int eid;
	String ename;
	long number;
	String email;
	
	
	void show()
	{
		System.out.println("Employee id " + eid);
		System.out.println("Employee name " + ename);
		System.out.println("Employee email " + email);
		System.out.println("Employee number " + number);
	}
}