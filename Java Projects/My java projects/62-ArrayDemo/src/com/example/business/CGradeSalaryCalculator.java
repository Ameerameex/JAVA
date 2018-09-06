package com.example.business;

class CGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double getDeductionAmount(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.10);
	}

	@Override
	public double getAllowanceAmount(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.20);
		
	}

}
