package com.corejava.Interface;

public class ShapeTest {

	public static void main(String[] args) {
		ShapeChooser shape_choose = new ShapeChooser();
		Shape shape = shape_choose.choose();
		shape.draw();

	
} 


}
