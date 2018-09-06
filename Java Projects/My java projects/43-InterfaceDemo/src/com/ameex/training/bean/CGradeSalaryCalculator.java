package com.ameex.training.bean;

public class CGradeSalaryCalculator implements SalaryCalculator {

	
	@Override
	public double getDeduction(double basicSalary) {
		
		
		return basicSalary*23.0/100;
	}

	@Override
	public double getAllowance(double basicSalary) {
		
		
		return basicSalary*23.0/100;
	}

	@Override
	public double getNetSalary(double basicSalary) {
		
		
		return basicSalary+getAllowance(basicSalary)-getDeduction(basicSalary);
	}
}
