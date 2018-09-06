package com.training.example.business;

import java.util.List;

public class Bill {

	List<BillItem> billItems;
    boolean noItems=true;
    int count;
	public Bill() {
		super();
	}

	public synchronized void addBillItems(List<BillItem> billItems) {
		
		this.billItems = billItems;
		noItems=false;
		notify();
	}

	public synchronized void printItems() {
		if(noItems){
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}
		
		if(noItems==false) {
			System.out.printf("%20s %10s %12s %14s \n", "Item Name", "Quantity", "Price", "Amount");
			System.out.println("-----------------------------------------------------------------");
			for (BillItem billItem : billItems) {
				count=count+billItem.getQuantity();
				System.out.printf("%-20s %10d %10.2f %12.2f \n", billItem.getItemName(), billItem.getQuantity(),
						billItem.getPrice(), billItem.getQuantity() * billItem.getPrice());
				
			}
			System.out.println("-----------------------------------------------------------------");
		}
	}

	public int getTotalItems() {
		
		if(noItems==false)
		return count;
		
		
		return 0;
	}

	public double getTotalAmount() {
		
		if(noItems==false){
		double amt = 0;
		for (BillItem billItem : billItems) {
			amt = amt + billItem.getPrice() + billItem.getPrice();
		}
		return amt;
		}
		return 0.0;
	}

	public void printSummary() {
		printItems();
		 
			System.out.printf("Total Item Count : %10d   \n ", getTotalItems());
			System.out.printf("Total Amount     : %12.2f \n" , getTotalAmount());
		
	}

}
