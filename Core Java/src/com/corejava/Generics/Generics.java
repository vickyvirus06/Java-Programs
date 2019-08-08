package com.corejava.Generics;

import java.util.*;

public class Generics {

	public static void main(String[] args) {
		Hello h1 = new Hello();
		ArrayList<String> al = new ArrayList<String>();
		al.add("vicky");
		al.add("ambi");
		al.add("shiva");
		//al.add(129);
		
		Iterator<String> it = al.iterator();
		
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
			
		}
		
		h1.m1(al);
		System.out.println("===========");
		
		ArrayList<Number> al1 = new ArrayList<Number>();
		al1.add(123);
		al1.add(432);
		al1.add(128);
		al1.add(102.45);
		
		h1.m2(al1);
		
		System.out.println("======================");
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(123);
		al2.add(432);
		al2.add(128);
		
		
		h1.m3(al2);
		
		System.out.println("===============");
		
		Hai<String> hai = new Hai<String>("vicky");
		
		h1.show(hai);
	}

}

class Hello
{
	void m1(ArrayList<String> al)
	{
		for (String name : al) {
			System.out.println(name);
		}
	}
	
	void m2(ArrayList<Number> al)
	{
		for (Number num : al) {
			System.out.println(num);
		}
	}
	
	void m3(ArrayList<? extends Number> al)
	{
		for (Number num : al) {
			System.out.println(num);
		}
	}
	
	void show(Hai<String> hai)
	{
		System.out.println(hai.t);
	}
}

class Hai<T>
{
	T t;
	
	Hai(T t)
	{
		this.t = t;
	}
	
	void display()
	{
		System.out.println("t  :" +t);
	}
}