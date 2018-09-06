package com.training.service;

public class Main {

	public static void main(String[] args) {

		CalcImplService calcImplService = new CalcImplService();
		CalcImpl calcImpl = calcImplService.getCalcImpl();
		System.out.println(calcImpl.add(20, 300));

	}

}
