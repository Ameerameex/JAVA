package com.training.common.Reflection;

import java.util.Date;

public class BankAccount {

	private int id;
	private String customerName;
	double balance;
	protected boolean healthy;
	Date openingDate;
	public float interestRate;
	public String nomineeName;
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getCustomerName() {
		return customerName;
	}
	
	public final boolean isHealthy() {
		return healthy;
	}
	public final void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public final double getBalance() {
		return balance;
	}
	public final void setBalance(double balance) {
		this.balance = balance;
	}
	
	public final Date getOpeningDate() {
		return openingDate;
	}
	public final void setOpeningDate(Date oprningDate) {
		this.openingDate = oprningDate;
	}
	public final float getInterestRate() {
		return interestRate;
	}
	public final void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public final String getNomineeName() {
		return nomineeName;
	}
	public final void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", customerName=" + customerName + ", balance=" + balance + ", healthy="
				+ healthy + ", openingDate=" + openingDate + ", interestRate=" + interestRate + ", nomineeName="
				+ nomineeName + "]";
	}
	
	
	
	
	
}
