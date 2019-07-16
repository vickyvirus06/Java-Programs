package com.corejava.BuiltInPackages;

public class HashCodeAndToString {

	public static void main(String[] args) {
	Test test = new Test();
	System.out.println("\n------------------address of object");
	System.out.println(test);
	
	System.out.println("\n-------------------Printing hashcode");
	System.out.println(test.hashCode());
	
	System.out.println("\n-------------------Printing toString");
	System.out.println(test.toString());
	
	System.out.println("\n--------------Printing Qualified class name\n");
	System.out.println(test.getClass().getName());
	
	System.out.println("\n--------------Printing hex decimal of hashcode\n");
	System.out.println(Integer.toHexString(test.hashCode()));
	
	System.out.println("\nCreating custom toString\n");
	String cname = test.getClass().getName();
	String hex = Integer.toHexString(test.hashCode());
	System.out.println(cname + "@" + hex);
	}

}

class Test
{
	
}
