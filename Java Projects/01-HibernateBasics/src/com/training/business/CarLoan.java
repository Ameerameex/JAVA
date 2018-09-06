package com.training.business;

import java.util.Date;

public class CarLoan extends Loan{

	String registrationNo;
	int registrationYear;
	public CarLoan(int loadId, String customerName, Date dateOfLoan, double amount, String registrationNo,
			int registrationYear) {
		super(loadId, customerName, dateOfLoan, amount);
		this.registrationNo = registrationNo;
		this.registrationYear = registrationYear;
	}
	public CarLoan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public int getRegistrationYear() {
		return registrationYear;
	}
	public void setRegistrationYear(int registrationYear) {
		this.registrationYear = registrationYear;
	}
	@Override
	public String toString() {
		return "\nCarLoan [registrationNo=" + registrationNo + ", registrationYear=" + registrationYear + ", loadId="
				+ loanId + ", customerName=" + customerName + ", dateOfLoan=" + dateOfLoan + ", amount=" + amount + "]";
	}
	
	
}
