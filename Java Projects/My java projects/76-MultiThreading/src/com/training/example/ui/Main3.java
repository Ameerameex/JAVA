package com.training.example.ui;

public class Main3 {

	public static void main(String[] args) {

		Runnable runnable=new SquarePrintingTask();
		
		Thread thread;
		thread=new Thread(runnable);
		thread.start();
		Thread thread2=new Thread(runnable);
		thread2.start();
		Thread thread3=new Thread(runnable);
		thread3.start();

		
	}
}
