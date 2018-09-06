package com.ameex.training.business;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


@XmlRootElement
@XmlType(propOrder={"id","name","price","manufacturedDate"})
public class Product implements Serializable{
	
	private int id;
	private String name;
	private double price;
	
	private java.util.Date manufacturedDate;
	
	private char category;
	
	public Product() {
		super();
	}

	

	public Product(int id, String name, double price, Date manufacturedDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturedDate = manufacturedDate;
		
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



	@XmlJavaTypeAdapter(DateAdapter.class)
	public final void setManufacturedDate(java.util.Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}



	



	@Override
	public String toString() {
		return "Product [getId()=" + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getDiscount()=" + getDiscount() + ", getManufacturedDate()=" + getManufacturedDate()
				 + "]";
	}

	
	
}
