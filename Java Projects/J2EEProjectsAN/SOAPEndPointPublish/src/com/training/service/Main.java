package com.training.service;

import javax.xml.ws.Endpoint;

public class Main {
	public static void main(String[] args) {
		
		
		CalcService calcService=new CalcService();
		
		Endpoint endpoint=Endpoint.publish("http://localhost:7777/cs", calcService);
		
		System.out.println("Calculator Service Started");
		
	}

}
