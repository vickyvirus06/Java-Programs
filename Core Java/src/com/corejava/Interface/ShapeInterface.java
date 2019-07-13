package com.corejava.Interface;

public interface ShapeInterface {

	int a = 99;
	
	
	void draw();
}

class CircleInterface implements ShapeInterface
{

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}
	
}

class TriangleInterface implements ShapeInterface
{

	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
		
	}
	
}

