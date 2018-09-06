package com.training.example.ui;

public class GreetCsk implements Runnable {

	@Override
	public synchronized void run() {

		System.out.println(1);
		System.out.println(2);
		try {
			wait(2000,2000);
			notify();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		System.out.println(3);
		System.out.println(4);
		
	}

	
	
	
}
