package com.training.example.task;

import com.training.example.business.Bill;

public class BillPrintingTask implements Runnable {

	
	Bill bill;
	
	public BillPrintingTask(Bill bill) {
		super();
		this.bill = bill;
	}

	@Override
	public void run() {

		bill.printSummary();
		
	}

	
	
}
