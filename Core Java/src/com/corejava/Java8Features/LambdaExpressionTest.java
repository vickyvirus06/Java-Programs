package com.corejava.Java8Features;

import java.util.ArrayList;

public class LambdaExpressionTest {
	
	public static void main(String[] args) {
		Func f = new Func() {

			
			public void show() {
				System.out.println("Hello How are you");
				
			}		
		};
		
		Func f1 = ()->
		{
			
				System.out.println("Hello How are you");
				
			
			
			
		};
		
		f1.show();
		
		System.out.println("===================================");
		
		FuncInput fi = (i)->
		{
			System.out.println("Value Passed is " + i);
		};
		
		fi.show(9);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(101);
		al.add(102);
		al.add(103);
		al.add(104);
		
		
		al.forEach(a -> 
		{
			if(a%2==0)
			System.out.println(a);
		});
	}

		
	
	
}


@FunctionalInterface
interface Func
{
	void show();
	
}

@FunctionalInterface
interface FuncInput
{
	void show(int i);
}
