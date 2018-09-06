package com.training.example.ui;

public class Main4 {

	public static void main(String[] args) {

		Thread thread = new Thread("ONE") {
			@Override
			public void run() {
				System.out.println("This is One Thread");

			}
		};
		thread.start();
		
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
			System.out.println(Thread.currentThread().getName()+"This is A Task");
				
			}
		};
	Thread thread2=new Thread(runnable);
	thread2.start();
	Thread thread3=new Thread(runnable,"IPL");
	thread3.start();
	
	Thread thread4=new Thread(new Runnable() {
		
		@Override
		public void run() {
			
			System.out.println("This is other thread");
		}
	});
	thread4.start();
	}
}