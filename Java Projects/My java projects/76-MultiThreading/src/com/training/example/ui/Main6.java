package com.training.example.ui;

public class Main6 {

	public static void main(String[] args) {

		System.out.println("begins");
		
		Runnable r=new Runnable() {
			
			@Override
			public void run() {

				System.out.println("chennai");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
				
				}
				System.out.println("chennai");
			}
		};
		Thread t=new Thread(r);
		t.start();
		
		System.out.println("Ends");
	}

}
