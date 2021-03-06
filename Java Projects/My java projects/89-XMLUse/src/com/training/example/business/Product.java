package com.training.example.business;

import java.util.Date;

public class Product {
	
	private int id;
	private String name;
	private double price;
	private Date manufacturedDate;
	private char category;
	
	public Product(int id, String name, double price, Date manufacturedDate, char category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		this.category = category;
	}

	public Product() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public char getCategory() {
		return category;
	}

	public void setCategory(char category) {
		this.category = category;
	}

	@Override
	public String toString() {
		System.out.printf("%s%15d%15s%15.2f\t%25s%15c","\n",id,name,price,manufacturedDate,category);
		
		return "";
	}
		

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;
	}

	}
	


