package com.example.ui;

import java.util.ArrayList;
import java.util.List;

import com.example.business.Account;
import com.example.business.CurrentAccount;
import com.example.business.SavingAccount;

public class Main2 {

	static void print(List list){
		System.out.println(list.get(0));
	}
	
	static void test(List<Account> accounts)
	{
		System.out.println(accounts.get(0));
	}
	static void print1(List<? super CurrentAccount> list){
	
	System.out.println(list.get(0));	
	}
	
	public static void main(String[] args) {
		
		List<Account> accounts=new ArrayList<>();
		print(accounts);
		test(accounts);
		print1(accounts);
	}

}
