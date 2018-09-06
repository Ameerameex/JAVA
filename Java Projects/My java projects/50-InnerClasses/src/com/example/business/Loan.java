package com.example.business;

public abstract class Loan {

	int duration;
	double loanAmount;
	
	public Loan(int duration, double loanAmount) {
		super();
		this.duration = duration;
		this.loanAmount = loanAmount;
	}

	public double getInterestAmount(){
		return loanAmount*duration*getInterestRate();
	}
	abstract public double getInterestRate();
	
	
}
