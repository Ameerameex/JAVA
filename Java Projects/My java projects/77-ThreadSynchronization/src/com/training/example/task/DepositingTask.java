package com.training.example.task;

import com.training.example.business.Account;

public class DepositingTask implements Runnable{

	private Account account;

	public DepositingTask(Account account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		this.account.deposit(9000.00);
		
		
	}

}
