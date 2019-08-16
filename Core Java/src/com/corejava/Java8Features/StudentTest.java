package com.corejava.Java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Student> al = new ArrayList<Student>();
		
		
		System.out.print("\nHow Many student Details you want to Enter  :     ");
		int data = input.nextInt();
		
		for(int i=0;i<data;i++)
		{
			Student student = new Student();
			System.out.print("\nEnter Id  :   " );
			student.setSid(input.nextInt());
			System.out.print("\nEnter Name  :   " );
			student.setSname(input.next());
			System.out.print("\nEnter Mobile No  :   " );
			student.setSmobile_no(input.next());
			al.add(student);
		}
		
		System.out.print("\nEnter Id which you want to see details  :      ");
		int id = input.nextInt();
		
		/*for (Student student : al) {
			if(id==student.getSid())
			{
				System.out.println("Id  :  "  +student.getSid());
				System.out.println("Name  :  "  +student.getSname());
				System.out.println("Mobile No  :  "  +student.getSmobile_no());
			}
		}
		*/
		al.stream().filter(student -> student.getSid()==id).forEach(student -> 	
		{
			System.out.println("Id  :  "  +student.getSid());
			System.out.println("Name  :  "  +student.getSname());
			System.out.println("Mobile No  :  "  +student.getSmobile_no());
		});
		
		System.out.println("Thanks for Using");
		input.close();
		
	}

	
}

class Student
{
	private int sid;
	private String sname;
	private String smobile_no;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSmobile_no() {
		return smobile_no;
	}
	public void setSmobile_no(String smobile_no) {
		this.smobile_no = smobile_no;
	}
	
	@Override
	public String toString() {
		
		return sid+"\t"+sname+"\t"+smobile_no;
	}
	
}
