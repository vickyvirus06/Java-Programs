package com.corejava.ArrayClass;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		int arr[]= {10,24,8,76,56};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.binarySearch(arr, 24));
		
		int arr1[]=Arrays.copyOf(arr, arr.length);
		System.out.println("New Array : "+Arrays.toString(arr1));

	}

}
