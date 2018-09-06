package com.training.example.business;

public class Account {

	private double balance = 5000.00;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public Account() {
		super();
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public synchronized void deposit(double depositAmount) {
		System.out.println("[ Depositing Money Started .....]");
		System.out.println("By the Thread  " + Thread.currentThread().getName());
		System.out.println("The Balance Before Deposit is:" + this.balance);
		for (int i = 0; i < depositAmount; i++) {
			
			this.balance++;

		}

		System.out.println("The Balance After Deposit is :" + this.balance);
		System.out.println("[ Depositing Completed] ");
		System.out.println("\n\n");
	}

	public synchronized void withdraw(double withdrawAmount) {
		System.out.println("[ Withrawing Money Started .....]");
		System.out.println("By the Thread  " + Thread.currentThread().getName());
		System.out.println("The Balance Before Withraw is:" + this.balance);
		for (int i = 0; i < withdrawAmount; i++) {
			
			this.balance--;

		}

		System.out.println("The Balance after withraw is :" + this.balance);
		System.out.println("[ Withrawing Completed] ");
		System.out.println("\n\n");
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}

}
