package com.corejava.Interface;

interface Shape {

	void draw();
}

class Circle implements Shape
{
	public void draw()
	{
		
	}
}

class Triangle implements Shape
{
	public void draw()
	{
		System.out.println("\n\n");
		for (int i=0; i<5; i++) 
	    { 

			System.out.print("\t");
	        for (int j=5-i; j>1; j--) 
	        { 
	           
	            System.out.print(" "); 
	        } 

	         
	        for (int j=0; j<=i; j++ ) 
	        { 
	           
	            System.out.print("* "); 
	        } 

	         
	        System.out.println(); 
	    }
		System.out.println("\n\n\tTriangle Drawn");
	}
}

class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("\n\n");
		for(int i=1;i<=5;i++)
		{
			System.out.print("\t");
			for(int j=1;j<=14;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n\n\tRectangle Drawn");
	}
}
