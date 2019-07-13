package com.corejava.Object;

public class ThisKeyword {

	public static void main(String[] args) {
		ThisKeywordTest test1 = new ThisKeywordTest(101,8286337928l,"vicky");
		test1.show();

	}

}

class ThisKeywordTest
{
	
	int id ;
	long number;
	String name;
	
	ThisKeywordTest(int id,long number,String name)
	{
		this.id= id;
		this.number = number;
		this.name = name;
	}
	
	void show()
	{
		
		System.out.println("Id : "+id );
		System.out.println("Number : " + number);
		System.out.println("name : " + name);
	}
}
