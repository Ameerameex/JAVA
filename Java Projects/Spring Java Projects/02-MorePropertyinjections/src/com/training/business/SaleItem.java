package com.training.business;

import java.util.Arrays;

public class SaleItem {

	int quantity;
	
	double[] discounts;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double[] getDiscounts() {
		return discounts;
	}

	public void setDiscounts(double[] discounts) {
		this.discounts = discounts;
	}

	@Override
	public String toString() {
		return "SaleItem [quantity=" + quantity + ", discounts=" + Arrays.toString(discounts) + "]";
	}
	
	
	
	
}
