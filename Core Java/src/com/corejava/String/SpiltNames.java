package com.corejava.String;

public class SpiltNames {

	public static void main(String[] args) {
		
		String name = "sangeeta Bheem raj Siddu Ajay Vijay";
		
		String[] names=name.split(" ");
		
		String name1 ="Bheem";
		System.out.println(name1.compareTo("sangeeta"));
		
        for(int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if (names[i].compareTo(names[j]) < 0) {
                    String temp = names[j];
                    names[j] = names[i];
                    names[i] = temp;
                }
            }
            
        }
        
        for (int  i= 0;i  < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}
}
