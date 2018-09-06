package com.training.example.ui;

public class NamePrintingThread extends Thread{


		
		
		
			@Override
			public void run() {
				for (int i = 0; i <=100; i++) {
					System.out.println("\t"+Thread.currentThread()+"\t\t"+"suriya"+".");
				}
			}
		

	

}
