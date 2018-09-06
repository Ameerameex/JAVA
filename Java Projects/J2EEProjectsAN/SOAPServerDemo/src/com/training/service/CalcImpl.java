package com.training.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.training.service.Calc")
public class CalcImpl implements Calc {

	@WebMethod
	@Override
	public double add(int x, int y) {

		System.out.println("\t\t [Add Function ] ");
		System.out.println("\t\t ["+x+","+y+" ]");
		
		
		return x+y;
	}

}
