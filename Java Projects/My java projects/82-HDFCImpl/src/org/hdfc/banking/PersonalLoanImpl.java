package org.hdfc.banking;

import com.training.example.business.interfaces.PersonalLoan;

public class PersonalLoanImpl implements PersonalLoan {

	
	int duration ;
	
	double loanAmount;

	public final int getDuration() {
		return duration;
	}

	public final void setDuration(int duration) {
		this.duration = duration;
	}

	public final double getLoanAmount() {
		return loanAmount;
	}

	public final void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	@Override
	public double getEMI() {
		
		return (getTotalRepayable()/this.duration)+25;
	}

	@Override
	public double getInterestAmount() {
		
	double d=	this.duration*this.loanAmount*this.getInterestRate();
		return d;
	}

	@Override
	public double getInterestRate() {
		
		
		return 0.12;
	}

	@Override
	public double getTotalRepayable() {
		
		
		return this.loanAmount+this.getInterestAmount()+2000;
	}

	@Override
	public double getMaximumLoanLimit() {
		return 2000000;
	}

	@Override
	public double getMinimumLoanLimit() {
		return 50000;
	}
	
	
}
