package org.hdfc.banking;

import com.training.example.business.interfaces.BusinessLoan;

public class BusinessLoanImpl implements BusinessLoan {

	int duration;
	double loanAmount;
	String businessIndustry;

	public final String getBusinessIndustry() {
		return businessIndustry;
	}

	public final void setBusinessIndustry(String businessIndustry) {
		this.businessIndustry = businessIndustry;
	}

	public final int getDuration() {
		return duration;
	}

	@Override
	public double getEMI() {
		return (this.getTotalRepayable()/this.getDuration())+25 ;
	}

	public  double getLoanAmount() {
		return loanAmount;
	}

	@Override
	public double getInterestAmount() {

		
		return this.duration*this.loanAmount*this.getInterestRate();
	}

	@Override
	public double getInterestRate() {
		
		return 0.10;
	}

	

	@Override
	public double getTotalRepayable() {
		
		return this.loanAmount+this.getInterestAmount()+2000;
	}

	@Override
	public final void setDuration(int arg0) {
		
	}

	@Override
	public void setLoanAmount(double arg0) {
		
	}

	

	@Override
	public double getMinimumLoanLimit() {

		return 100000;
	}

	
	
	
	
}
