package com.training.example.business;

import java.util.Date;

public class Product {

	int id;
	String name;
	Date manufacturedDate;
	double price;
	public Product(int id, String name, Date manufacturedDate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturedDate = manufacturedDate;
		this.price = price;
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
	public final Date getManufacturedDate() {
		return manufacturedDate;
	}
	public final void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	public final double getPrice() {
		return price;
	}
	public final void setPrice(double price) {
		this.price = price;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufacturedDate=" + manufacturedDate + ", price=" + price
				+ "]";
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
