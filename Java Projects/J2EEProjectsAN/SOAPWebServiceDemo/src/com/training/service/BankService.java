package com.training.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService

public interface BankService {

	int getSum(int x,int y);
	String sayHello(String name);
	//double getLoanInterestRate(char ch);
	
}
