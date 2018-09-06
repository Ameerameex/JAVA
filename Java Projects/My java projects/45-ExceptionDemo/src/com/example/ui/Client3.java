package com.example.ui;

public class Client3 {

	public static void main(String[] args) {
		
		System.out.println("\n\t\t Program Beginning......");

		try{
		int[] arr;
		int countOfElements=-2;
		arr=new int[countOfElements];
		
		arr[0]=1; arr[1]=2; arr[2]=3; arr[3]=4;
		
		for(int i=0;i< arr.length; i++)
			System.out.println(arr[i]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(Throwable e){
			
			//System.out.println("The size of the array is negative");
			System.out.println("Something wrong in your code");
		}
		
		
		
		
		System.out.println("\n\t\t Program Completed......");

	}

}
