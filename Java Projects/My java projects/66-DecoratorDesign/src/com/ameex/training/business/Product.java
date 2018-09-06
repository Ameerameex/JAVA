package com.ameex.training.business;

public abstract class Product {

	int id;
	String name;
	double price;
	Product product;
	
	
	public Product(Product product) {
		super();
		this.product = product;
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
	public abstract double getPrice() ;
	public abstract double getDiscount();
	public final void setPrice(double price) {
		this.price = price;
	}
	
	
}
