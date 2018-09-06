package com.example.ui;

public class Client1 {

	public static void main(String[] args) {
		
		System.out.println("\n\t\t Program Beginning......");

		int first=20;
		int second=0;
		try {
			int result=first/second;
			System.out.println(result);
		} catch (Exception e) {
System.out.println(e.getMessage());
		}
		finally{
			System.out.println("done");
		}
		
		
		System.out.println("\n\t\t Program Completed......");
	}

}
