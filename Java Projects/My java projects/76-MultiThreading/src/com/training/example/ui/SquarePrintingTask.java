package com.training.example.ui;

public class SquarePrintingTask implements Runnable{

	@Override
	public void run() {

     for (int i = 1; i <=50; i++) {
		
    	 System.out.println("\t\t"+(i*i));
	}
		
	}

}
