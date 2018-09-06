package com.training.ui;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.training.service.BankServiceImpl;
import com.training.service.BankServiceImplService;


public class Main {

	public static void main(String[] args) throws MalformedURLException {

		BankServiceImplService myServiceImplService = new BankServiceImplService();
		BankServiceImpl myServiceImpl = myServiceImplService.getBankServiceImpl();

		System.out.println(myServiceImpl.getSum(400, 600));
		System.out.println(myServiceImpl.sayHello("Ameex"));
		System.out.println(myServiceImpl.getLoanInterestRate('C'));
		
	        
	}

}
