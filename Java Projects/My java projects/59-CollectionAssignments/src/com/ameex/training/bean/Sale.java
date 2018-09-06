package com.ameex.training.bean;

public class Sale {

	private String salesManName;
	private String salesCity;
	private String productName;
	private int quantity;
	private double  price;
	public Sale(String salesManName, String salesCity, String productName, int quantity, double price) {
		super();
		this.salesManName = salesManName;
		this.salesCity = salesCity;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public final String getSalesManName() {
		return salesManName;
	}
	public final void setSalesManName(String salesManName) {
		this.salesManName = salesManName;
	}
	public final String getSalesCity() {
		return salesCity;
	}
	public final void setSalesCity(String salesCity) {
		this.salesCity = salesCity;
	}
	public final String getProductName() {
		return productName;
	}
	public final void setProductName(String productName) {
		this.productName = productName;
	}
	public final int getQuantity() {
		return quantity;
	}
	public final void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public final double getPrice() {
		return price;
	}
	public final void setPrice(double price) {
		this.price = price;
	}
	
public double getAmount()
{
	return price*quantity;
}
@Override
public String toString() {
	return "\n Sale [getSalesManName()=" + getSalesManName() + ", getSalesCity()=" + getSalesCity() + ", getProductName()="
			+ getProductName() + ", getQuantity()=" + getQuantity() + ", getPrice()=" + getPrice() + ", getAmount()="
			+ getAmount() + "]";
}
	
}


