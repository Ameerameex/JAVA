package com.training.example.ui;

public class NumberPrintingThread extends Thread{

	@Override
	public void run() {
		for (int i = 200; i>= 0; i--) {
			System.out.println("\t\t"+Thread.currentThread()+"\t\t"+i);
		}
	}
	
}
