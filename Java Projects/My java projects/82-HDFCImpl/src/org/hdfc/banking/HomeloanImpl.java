package org.hdfc.banking;

import com.training.example.business.interfaces.HomeLoan;

public class HomeloanImpl implements HomeLoan {
	int duration;
	Double loanAmount;
	String PropertyLocationCity;
	
	public final void setPropertyLocationCity(String propertyLocationCity) {
		PropertyLocationCity = propertyLocationCity;
	}
	public final int getDuration() {
		return duration;
	}
	public final void setDuration(int duration) {
		this.duration = duration;
	}
	public final double getLoanAmount() {
		return loanAmount;
	}
	public final void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public double getEMI() {
		return (this.getTotalRepayable()/this.getDuration())+25  ;
	}
	@Override
	public double getInterestAmount() {
		return this.duration*this.loanAmount*this.getInterestRate();
	}
	@Override
	public double getInterestRate() {
		return 0.11;
	}
	@Override
	public double getTotalRepayable() {
		
		return  this.loanAmount+this.getInterestAmount()+2000;
	}
	@Override
	public void setLoanAmount(double arg0) {
		
	}
	@Override
	public double getMaximumLoanLimit() {
		return 5000000;
	}
	@Override
	public double getMinimumLoanLimit() {
		return 100000;
	}
	@Override
	public String getPropertyLocationCity() {
		return this.PropertyLocationCity;
	}
	

}
