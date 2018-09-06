package com.training.business;

import java.util.Date;

public class HomeLoan extends Loan{

	String propertyLocation;
	double propertyValue;
	
	public String getPropertyLocation() {
		return propertyLocation;
	}
	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}
	public double getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(double propertyValue) {
		this.propertyValue = propertyValue;
	}
	public HomeLoan(int loadId, String customerName, Date dateOfLoan, double amount, String propertyLocation,
			double propertyValue) {
		super(loadId, customerName, dateOfLoan, amount);
		this.propertyLocation = propertyLocation;
		this.propertyValue = propertyValue;
	}
	public HomeLoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "\nHomeLoan [propertyLocation=" + propertyLocation + ", propertyValue=" + propertyValue + ", loadId="
				+ loanId + ", customerName=" + customerName + ", dateOfLoan=" + dateOfLoan + ", amount=" + amount + "]";
	}
	
}
