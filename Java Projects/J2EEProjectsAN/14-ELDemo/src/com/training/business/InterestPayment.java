package com.training.business;

import java.util.Date;

public class InterestPayment {

	Date paymentDate;
	double amount;
	public InterestPayment(Date paymentDate, double amount) {
		super();
		this.paymentDate = paymentDate;
		this.amount = amount;
	}
	public InterestPayment() {
		super();
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "\n InterestPayment [paymentDate=" + paymentDate + ", amount=" + amount + "]";
	}

	
}
