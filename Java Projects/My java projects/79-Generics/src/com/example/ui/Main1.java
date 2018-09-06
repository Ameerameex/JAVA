package com.example.ui;

import java.util.ArrayList;
import java.util.List;

import com.example.business.Account;
import com.example.business.CurrentAccount;
import com.example.business.SavingAccount;

public class Main1 {

	public static void main(String[] args) {
		
	List list=new ArrayList();
	
	Account account=new CurrentAccount();
	
	List<? extends Account> accounts=new ArrayList<CurrentAccount>();
	
	accounts.get(0);
	List<Account> list2=new ArrayList<Account>();
	
	List<? super CurrentAccount> list3=new ArrayList<Account>();
	list3.get(0);
	
	
	List<?> list4=new ArrayList<Account>();
	
	List<?> list5=new ArrayList<Object>();
	
	
		
		

	}

}
