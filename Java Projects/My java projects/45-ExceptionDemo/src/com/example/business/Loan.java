package com.example.business;

public class Loan {
	
	private double loanAmount,interestRate;
	private int duration;
	
	
	
	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getInterestAmount() {
		return loanAmount*duration*interestRate;
	}
	
	public double getTotalPayable() {
		return getLoanAmount()+getInterestAmount();
	}
	
	public double getEMI() {
		return getTotalPayable()/getDuration();
	}

}
