package com.training.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style =Style.RPC)  
public interface MyService {

	int getSum(int x,int y);
	String sayHello(String name);
	double getLoanInterestRate(char ch);
	
}
