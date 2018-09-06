package com.training.example.business;

public class BillItem {
	private String itemName;
	private double price;
	private int quantity;
	
	public BillItem(String itemName, double price, int quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		
		
	}
	
	

	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "BillItem [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
