package com.training.sales.business;

import java.util.Date;

public class SalesDetail {
private String salesManName;
private Date salesDate;
private double salesAmount;
private String salesProductName;
public SalesDetail(String salesManName, Date salesDate, double salesAmount, String salesProductName) {
	super();
	this.salesManName = salesManName;
	this.salesDate = salesDate;
	this.salesAmount = salesAmount;
	this.salesProductName = salesProductName;
}
public SalesDetail() {
	super();
	// TODO Auto-generated constructor stub
}
public final String getSalesManName() {
	return salesManName;
}
public final void setSalesManName(String salesManName) {
	this.salesManName = salesManName;
}
public final Date getSalesDate() {
	return salesDate;
}
public final void setSalesDate(Date salesDate) {
	this.salesDate = salesDate;
}
public final double getSalesAmount() {
	return salesAmount;
}
public final void setSalesAmount(double salesAmount) {
	this.salesAmount = salesAmount;
}
public final String getSalesProductName() {
	return salesProductName;
}
public final void setSalesProductName(String salesProductName) {
	this.salesProductName = salesProductName;
}
@Override
public String toString() {
	return "\n"+"SalesDetails [salesManName=" + salesManName + ", salesDate=" + salesDate + ", salesAmount=" + salesAmount
			+ ", salesProductName=" + salesProductName + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((salesManName == null) ? 0 : salesManName.hashCode());
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
	SalesDetail other = (SalesDetail) obj;
	if (salesManName == null) {
		if (other.salesManName != null)
			return false;
	} else if (!salesManName.equals(other.salesManName))
		return false;
	return true;
}

	
	
}
