package com.training.example.business.interfaces;

public interface Loan {
	void setLoanAmount(double loanAmount);
	double getLoanAmount();
	
	void setDuration(int noOfMonths);
	int getDuration();
	
	double getEMI();
	double getTotalRepayable();
	double getInterestRate();
	double getInterestAmount();
}
