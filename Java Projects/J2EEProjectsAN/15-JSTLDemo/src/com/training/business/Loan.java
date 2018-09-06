package com.training.business;

import java.util.Date;

public class Loan {
	int  id;
	double loanAmount;
	String loanType;
	String customerName;
	int duration;
	Date loanSanctionedDate;
	
	public Loan(int id, double loanAmount, String loanType, String customerName, int duration,
			Date loanSanctionedDate) {
		super();
		this.id = id;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.customerName = customerName;
		this.duration = duration;
		this.loanSanctionedDate = loanSanctionedDate;
	}
	
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Date getLoanSanctionedDate() {
		return loanSanctionedDate;
	}
	public void setLoanSanctionedDate(Date loanSanctionedDate) {
		this.loanSanctionedDate = loanSanctionedDate;
	}
	
	@Override
	public String toString() {
		return "Loan [id=" + id + ", loanAmount=" + loanAmount + ", loanType=" + loanType + ", customerName="
				+ customerName + ", duration=" + duration + ", loanSanctionedDate=" + loanSanctionedDate + "]";
	}
	
	public double getInterestRate() {
		if(loanType.equalsIgnoreCase("PL"))
			return 0.12;
		if(loanType.equalsIgnoreCase("HL"))
			return 0.12;
		if(loanType.equalsIgnoreCase("BL"))
			return 0.12;
		return 0.0;
	}
	
	public double getInterestPayabale() {
		return loanAmount*getInterestRate();
	}
	
	public double getTotalPayabale() {
		return loanAmount+getInterestPayabale();
	}
	
	public double getEMI() {
		return getTotalPayabale()/getDuration();
	}

}
