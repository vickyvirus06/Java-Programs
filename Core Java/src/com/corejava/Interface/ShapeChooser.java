package com.corejava.Interface;

import java.util.Scanner;

public class ShapeChooser {
	
	
	public Shape choose()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("1 Circle ");
		System.out.println("2 Triangle ");
		System.out.println("3 Rectangle ");
		
		System.out.print("\n\nEnter Your Choice :    ");
		int choice = input.nextInt();
		
		if(choice == 1)
		{
			Circle circle = new Circle();
			return circle;
		}
		else if(choice == 2)
		{
			Triangle triangle = new Triangle();
			return triangle;
		}
		else if(choice == 3)
		{
			Rectangle rectangle = new Rectangle();
			return rectangle;
		}
		else
		{
			System.out.println("Sorry Wrong Input");
		}
		return null;
		
				
	}
}
