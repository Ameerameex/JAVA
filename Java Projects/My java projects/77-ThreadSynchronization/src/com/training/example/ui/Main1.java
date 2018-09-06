package com.training.example.ui;

import com.training.example.business.Account;
import com.training.example.task.DepositingTask;
import com.training.example.task.WithdrawTask;

public class Main1 {

	public static void main(String[] args) {
	
		Account account=new Account();
		
		DepositingTask depositingTask=new DepositingTask(account);
		WithdrawTask withdrawTask=new WithdrawTask(account);
		
		
		Thread thread=new Thread(depositingTask, "DepositerThread");
		thread.start();
		
		Thread thread2=new Thread(withdrawTask,"WithrawalThread");
		thread2.start();
		
		
	}

}
