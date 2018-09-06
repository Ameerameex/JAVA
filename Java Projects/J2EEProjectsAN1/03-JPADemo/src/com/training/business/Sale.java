package com.training.business;

import java.util.Date;

public class Sale {
	
	double amount;
	Date saleDate;
	String city;
	
	public Sale(double amount, Date saleDate, String city) {
		super();
		this.amount = amount;
		this.saleDate = saleDate;
		this.city = city;
	}

	public Sale() {
		super();
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Sale [amount=" + amount + ", saleDate=" + saleDate + ", city=" + city + "]";
	}
	
	

}
