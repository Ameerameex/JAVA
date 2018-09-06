package com.training.example.task;

import com.training.example.business.Account;

public class WithdrawTask implements Runnable {
	
	private Account account;
	
	

	public WithdrawTask(Account account) {
		super();
		this.account = account;
	}



	@Override
	public void run() {
		this.account.withdraw(2000);
	}

}
