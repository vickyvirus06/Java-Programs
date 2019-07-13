package com.corejava.Interface;

public class InterfaceTest {

	public static void main(String[] args) {
		ShapeInterface shape = new CircleInterface();
		System.out.println(ShapeInterface.a);
		shape.draw();
		
		System.out.println("----------------------");
		
		ShapeInterface shape1 = new TriangleInterface();
		System.out.println(ShapeInterface.a);
		shape1.draw();

	}

}
