package com.example.ui;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		int[] arr1= {20,4,67,71,24,10,5};
		
		int[] arr2=new int[10];
	
			Arrays.fill(arr2, 1);
			Arrays.fill(arr2, 2);
		
		
		double[] arr3=new double[] {3.0,5.0,17.0,12.2, 11.4, 2.7, 3.22, 0.5};
		
		System.out.println(Arrays.toString(arr1));
		String text=Arrays.toString(arr2);
		System.out.println(text);
		String string=Arrays.toString(arr3);
		
		System.out.println(string);
		
		
		Arrays.sort(arr3);
		
		String string2=Arrays.toString(arr3);
		System.out.println(string2);
		int i=Arrays.binarySearch(arr3, 11.4);
		System.out.println(i);
		
		
		
		

	}

}
