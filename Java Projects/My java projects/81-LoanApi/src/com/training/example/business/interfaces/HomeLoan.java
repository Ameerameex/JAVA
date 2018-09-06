package com.training.example.business.interfaces;

public interface HomeLoan extends Loan {
	
	double getMinimumLoanLimit();
	double getMaximumLoanLimit();
	String getPropertyLocationCity();

}
