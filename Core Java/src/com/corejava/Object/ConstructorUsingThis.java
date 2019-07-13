package com.corejava.Object;

public class ConstructorUsingThis {
		
	public static void main(String[] args) {
		
			ConstructorUsingThisTest test1 = new ConstructorUsingThisTest(103,"vicky",989898);

		}

	}
	class ConstructorUsingThisTest
	{
		int id;	
		String name;
		long number;
		
		
		
		ConstructorUsingThisTest(int id)
		{
			System.out.println("1 args constructor");
			this.id = id;
		}
		
		ConstructorUsingThisTest(int id,String name)
		{
			this(id);
			System.out.println("2 args constructor");
			
			this.name = name;
		}
		
		ConstructorUsingThisTest(int id,String name, long number)
		{
			this(id,name);
			this.number = number;
			System.out.println("3 args constructor");
		}
	}



