package com.training.medicine.business;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Medicine {

	int batchNo;
	String name;
	int stockQty;
	double price;
	Date expiryDate;
	public Medicine(int batchNo, String name, int stockQty, double price, Date expiryDate) {
		super();
		this.batchNo = batchNo;
		this.name = name;
		this.stockQty = stockQty;
		this.price = price;
		this.expiryDate = expiryDate;
	}
	
	public Medicine() {
		super();
	}

	public int getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStockQty() {
		return stockQty;
	}
	public void setStockQty(int stockQty) {
		this.stockQty = stockQty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + batchNo;
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
		Medicine other = (Medicine) obj;
		if (batchNo != other.batchNo)
			return false;
		return true;
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		String date=dateFormat.format(expiryDate);
		System.out.printf("%s%15d%15s%15d%s%15.3f%s%15s","\n",batchNo,name,stockQty,"\t\t",price,"\t",date);
		
		return "";
	}
	
	
	
}
