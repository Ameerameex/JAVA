package com.training.example.ui;

public class Main1 {

	public static void main(String[] args) throws Exception {
		
		Thread thread;
		
		thread=Thread.currentThread();
		System.out.println(thread.getName());
		thread.setName("Number Printing Process");
		System.out.println(thread.getName());

		System.out.println("Program Begins");
		
		
		
		for (int i = 0; i <=10; i++) {
			
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		
		System.out.println("Program Ends");

		
	}

}
