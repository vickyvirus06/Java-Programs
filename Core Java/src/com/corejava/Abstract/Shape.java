package com.corejava.Abstract;

abstract class Shape {

	abstract void draw();
}


class Circle extends Shape
{
	void draw()
	{
		System.out.println("Drawing Circle");
	}
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing triange");
	}
}