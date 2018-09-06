package com.example.business;

class AGradeSalaryCalculator implements SalaryCalculator{

	
	@Override
	public double getDeductionAmount(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.17);
	}

	@Override
	public double getAllowanceAmount(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.26);
		
	}

}
