package com.corejava.Abstract;

public class AbstractTest {

	public static void main(String[] args) {
		Person p1 = new NewStudent();
		p1.jobstatus();
		
		System.out.println("-------------------------");
		
		p1= new OldStudent();
		p1.jobstatus();

	}

}
