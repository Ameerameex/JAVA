package com.training.business;

public class NumberPrintingTask  implements Runnable{

	@Override
	public void run() {

		for (int i = 0; i <=100; i++) {
			
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
