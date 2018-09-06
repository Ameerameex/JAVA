package com.ameex.training.business;

public class Product {

	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		setId(id);
		setName(name);
		setPrice(price);
	}
	public Product() {
		super();

	}
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final double getPrice() {
		return price;
	}
	public final void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount(){
		return getPrice()*0.05;
	}
	@Override
	public String toString() {
		
		System.out.printf("%s%15d%15s%15.2f","\n",id,name,price);
	

		return "";
	}
	
	
}
