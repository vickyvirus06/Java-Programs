package com.corejava.Method;

import java.util.Scanner;

public class GetAndSet {

	public static void main(String[] args) {
		GetAndSetDemo test = new GetAndSetDemo();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Name :  ");
		String name= input.next();
		System.out.print("\n Enter id : ");
		int id = input.nextInt();
		
		test.setId(id);
		test.setName(name);
		
		//or
		
		System.out.print("Enter Name :  ");
		test.setName(input.next());
		System.out.print("\n Enter id : ");
		test.setId(input.nextInt());
		input.close();
		
	}

}


class GetAndSetDemo
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}