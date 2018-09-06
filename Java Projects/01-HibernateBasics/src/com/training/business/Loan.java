package com.training.business;

import java.util.Date;

public class Loan {

	int loanId;
	String customerName;
	Date dateOfLoan;
	double amount;
	public Loan(int loadId, String customerName, Date dateOfLoan, double amount) {
		super();
		this.loanId = loadId;
		this.customerName = customerName;
		this.dateOfLoan = dateOfLoan;
		this.amount = amount;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loadId) {
		this.loanId = loadId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDateOfLoan() {
		return dateOfLoan;
	}
	public void setDateOfLoan(Date dateOfLoan) {
		this.dateOfLoan = dateOfLoan;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + loanId;
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
		Loan other = (Loan) obj;
		if (loanId != other.loanId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nLoan [loanId=" + loanId + ", customerName=" + customerName + ", dateOfLoan=" + dateOfLoan + ", amount="
				+ amount + "]";
	}
	
}
