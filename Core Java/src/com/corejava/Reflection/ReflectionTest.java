package com.corejava.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		int arr[] = {11,22,33};
		Class c1 = Class.forName("com.corejava.Reflection.Hello");
		System.out.println(c1.getName());
		System.out.println(c1.isEnum());
		System.out.println(c1.isInterface());
		System.out.println(c1.isAnnotation());
		System.out.println(c1.getSuperclass().getName());
		
		Hello h1 = new Hello();
		Class c2 = Hello.class;
		Field f = c1.getDeclaredField("a");
		System.out.println("Value of a : " +f.get(h1));
		
		Field farr[] = c2.getDeclaredFields();
		
		for (int i = 0; i < farr.length; i++) {
			System.out.println("Variable name :  " +farr[i].getName());
		}
		
		Field f1 = c2.getDeclaredField("c");
		f1.setAccessible(true);
		System.out.println("Accessed Private Variable c  :  " +f1.get(h1));
		
		Method m[] = c2.getDeclaredMethods();
		
		for (int i = 0; i < m.length; i++) {
			System.out.println("Methods of Class :  " +m[i].getName());
		}
		
		Constructor c[] = c2.getDeclaredConstructors();
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("Constructor of Class : " + c[i].getName()+"Parameter Count : " + c[i].getParameterCount());
		}
		
		System.out.println("=================================");
		Hello h2 = new Hello();
		System.out.println("=================================");
		Class c3 = h2.getClass();
		Hello hello_new = (Hello)c3.newInstance();
		
		System.out.println(hello_new);
		System.out.println("==========================");
		Constructor con = c3.getDeclaredConstructor(new Class[] {int.class,int.class,String.class});
		Hello hello_const = (Hello)con.newInstance(76,22,"vicky");
		System.out.println(hello_const);
		
		
	}

}


class Hello
{
	int a =10;
	static int b =20;
	private int c =30;
	String name = "Vicky";
	
	Hello()
	{
		System.out.println("Default Constructor");
	}
	
	Hello(int a ,int b,String name)
	{
		System.out.println("Parameterized Constructor");
	}
	
	void show()
	{
		System.out.println("Show()-------");
	}
	
	public void display()
	{
		System.out.println("Display()----------");
	}
	
	@Override
	public String toString() {
		return this.a +"\t"+this.b+"\t"+this.c+"\t"+this.name;
	}
}