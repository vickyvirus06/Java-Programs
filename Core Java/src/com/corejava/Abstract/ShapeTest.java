package com.corejava.Abstract;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape = new Circle();
		shape.draw();
		System.out.println("-------------");
		shape = new Triangle();
		shape.draw();

	}

}
