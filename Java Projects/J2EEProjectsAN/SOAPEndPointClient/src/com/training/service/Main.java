package com.training.service;

public class Main {

	public static void main(String[] args) {

		CalcServiceService calcServiceService=new CalcServiceService();
		
		CalcService calcService=calcServiceService.getCalcServicePort();
		
		System.out.println(calcService.add(5, 5));
		System.out.println(calcService.sub(5, 5));
		System.out.println(calcService.mul(5, 5));
		System.out.println(calcService.div(5, 5));

	}

}
