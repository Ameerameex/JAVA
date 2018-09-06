package com.ameex.training.business;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component
public class Product {
	
	private int id;
	private String name;
	private double price;
	
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private java.util.Date manufacturedDate;
	
	private char category;
	
	public Product() {
		super();
	}

	

	public Product(int id, String name, double price, Date manufacturedDate, char category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		this.category = category;
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



	public final java.util.Date getManufacturedDate() {
		return manufacturedDate;
	}



	public final void setManufacturedDate(java.util.Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}



	public final char getCategory() {
		return category;
	}



	public final void setCategory(char category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Product [getId()=" + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getDiscount()=" + getDiscount() + ", getManufacturedDate()=" + getManufacturedDate()
				+ ", getCategory()=" + getCategory() + "]";
	}

	
	
}
