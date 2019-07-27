package com.corejava.Runtime;

import java.io.IOException;

public class RuntimeClass {

	public static void main(String[] args) throws IOException {
		Runtime run1 = Runtime.getRuntime();
		Runtime run2 = Runtime.getRuntime();
		Runtime run3 = Runtime.getRuntime();
		Runtime run4 = Runtime.getRuntime();
		
		System.out.println(run1);
		System.out.println(run2);
		System.out.println(run3);
		System.out.println(run4);
		
		System.out.println("---------------------");
		System.out.println("\n");
		
		System.out.println("Free Memory :  " + run1.freeMemory());
		System.out.println("Max Memory :  " + run1.maxMemory());
		System.out.println("Total Memory :  " + run1.totalMemory());
		
		System.out.println("-----------------------------");
		
		//run2.exec("firefox");
		
		String str[]= {"firefox","www.vickyvirus.tk"};
		run2.exec(str);
	}

}
