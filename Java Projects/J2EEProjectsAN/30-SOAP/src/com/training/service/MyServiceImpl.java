package com.training.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.training.service.MyService")
public class MyServiceImpl implements MyService{

	@WebMethod
	@Override
	public int getSum(int x, int y) {

		System.out.println("\t\t [getSum() invocation ]");
		System.out.println("\t\t [ "+x+","+y+" ]");
		
		return x+y;
	}

	@WebMethod
	@Override
	public String sayHello(String name) {

		System.out.println("\t\t [sayHello() invocation ]");
		System.out.println("\t\t [ "+name+" ]");
		return "Hello "+name.toUpperCase();
	}

	@WebMethod
	@Override
	public double getLoanInterestRate(char ch) {

		System.out.println("\t\t [loanInterset() invocation ]");
		System.out.println("\t\t [ "+ch+" ]");
		double percentage=0.0;
		switch (ch) {
		case 'P':percentage=12.4;break;
			
		case 'C':percentage=22.4;break;
		case 'H':percentage=10.4;break;

		}
		
		return percentage;
	}
	
	

}
