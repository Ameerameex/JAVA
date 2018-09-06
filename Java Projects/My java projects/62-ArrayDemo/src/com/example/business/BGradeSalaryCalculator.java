package com.example.business;

class BGradeSalaryCalculator implements SalaryCalculator{

	@Override
	public double getDeductionAmount(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.15);
	}

	@Override
	public double getAllowanceAmount(double basicSalary) {
		Calculator calculator=new Calculator();
		return calculator.multiply(basicSalary, 0.24);
		
	}

}
