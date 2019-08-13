package com.corejava.Enum;

public class Enum {

	public static void main(String[] args) {
		MyDirection d = MyDirection.East;
		System.out.println(d);
		
		Direction d1 = Direction.East;
		d1.show();
		
	}

}

class MyDirection
{
	String name;
	
	public static MyDirection East = new MyDirection("East");
	public static MyDirection West = new MyDirection("West");
	public static MyDirection North = new MyDirection("North");
	public static MyDirection South = new MyDirection("South");
	
	private MyDirection(String name)
	{
		this.name=name;
		System.out.println("Direction is " + name);
	}
	
	@Override
	public String toString() {
	
		return name;
	}
}

enum Direction
{
	East{
		void show()
		{
			System.out.println("This is "+this.name());
		}
	},West{
		void show()
		{
			System.out.println("This is "+this.name());
		}
	};
	
	String name;
	
	Direction()
	{
		System.out.println("Def cons - Direction");
	}
	
	abstract void show();
}

