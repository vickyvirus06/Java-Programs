package com.corejava.Polymorphism;

public class MethodOveriding {

	public static void main(String[] args) {
		System.out.println("\nObject of Parent");
		Parent parent = new Parent();
		parent.property();
		parent.marry();
		
		System.out.println("\n\nObject of Child reference of Parent ");
		Parent parent1 = new Child();
		parent.property();
		parent.marry();
		
		System.out.println("\n\nObject of child");
		Child child = new Child();
		child.Property();
		child.marry();
		

	}

}
