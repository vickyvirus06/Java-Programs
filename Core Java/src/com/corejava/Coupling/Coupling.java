package com.corejava.Coupling;

import java.util.Scanner;

public class Coupling {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		Vehicle vehicle=null;
		
		Journey journey = new Journey();
		
		System.out.println("Which Vehicle you are taking with You  : ");
		System.out.println("1 Car");
		System.out.println("2 Bike");
		System.out.print("\n\nEnter your choice :  ");
		int choice = input.nextInt();
		
		if(choice==1)
		{
			vehicle=new Car();
			journey.startJourney(vehicle);
		}
		else if(choice==2)
		{
			vehicle=new Bike();
			journey.startJourney(vehicle);
		}
		else
			System.out.println("Wrong choice");
		
		

	}

}

interface Vehicle
{
	void move();
}

class Car implements Vehicle
{
	public void move()
	{
		System.out.println("Car is Moving");
	}
}

class Bike implements Vehicle
{
	public void move()
	{
		System.out.println("Bike is Moving");
	}
}

class Journey
{
	public void startJourney(Vehicle v)
	{
		v.move();
	}
}