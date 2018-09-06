package com.training.example.ui;

import com.training.example.business.Bill;
import com.training.example.task.BillCreationTask;
import com.training.example.task.BillPrintingTask;

public class Main2 {

	public static void main(String[] args) {

		Bill bill = new Bill();
		BillCreationTask billCreationTask = new BillCreationTask(bill);
		BillPrintingTask billPrintingTask = new BillPrintingTask(bill);
        Thread thread=new Thread(billCreationTask);
        thread.start();
        
        Thread thread2=new Thread(billPrintingTask);
        thread2.start();
        
	}
}
