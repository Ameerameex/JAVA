package com.training.business;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
public class Product {

	int id;
	String name;
	double price;
	Date manufacturedDate;
	char category;
	
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
	@XmlTransient
	public void setCategory(char category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", manufacturedDate=" + manufacturedDate
				+ ", category=" + category + "]";
	}
	
}
