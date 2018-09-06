package com.training.example.task;

import java.util.ArrayList;
import java.util.List;

import com.training.example.business.Bill;
import com.training.example.business.BillItem;

public class BillCreationTask implements Runnable{
	
		
	Bill bill;
	
		
		
	public BillCreationTask(Bill bill) {
		super();
		this.bill = bill;
	}



	
	public void run() {
		 
			BillItem billItem1=new BillItem("Sony TV", 16000.00, 2);
			BillItem billItem2=new BillItem("Lenova ", 34000.00, 2);
			BillItem billItem3=new BillItem("DELL", 41000.00, 2);
			BillItem billItem4=new BillItem("Voltas AC", 24000.00, 2);
			List<BillItem> items=new ArrayList<>();
			items.add(billItem1);
			items.add(billItem2);
			items.add(billItem3);
			items.add(billItem4);
		this.bill.addBillItems(items);
	}




	
		
	
}
