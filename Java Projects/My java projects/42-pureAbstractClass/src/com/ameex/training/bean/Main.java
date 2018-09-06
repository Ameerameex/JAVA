package com.ameex.training.bean;

public class Main {

	public static void main(String[] args) {


		SalaryCalculator calculator;
		calculator=new AGradeSalaryCalculator();
		System.out.println(calculator.getAllowances(10000));
		System.out.println(calculator.getDeduction(10000));
		System.out.println(calculator.getNetSalary(10000));
		
		calculator=new BGradeSalaryCalculator();
		System.out.println(calculator.getAllowances(10000));
		System.out.println(calculator.getDeduction(10000));
		System.out.println(calculator.getNetSalary(10000));
		
		calculator=new CGradeSalaryCalculator();
		System.out.println(calculator.getAllowances(10000));
		System.out.println(calculator.getDeduction(10000));
		System.out.println(calculator.getNetSalary(10000));
	}

}
