package com.ameex.training.bean;

public class AGradeSalaryCalculator implements SalaryCalculator {

	@Override
	public double getDeduction(double basicSalary) {
		
		
		return basicSalary*20.0/100;
	}

	@Override
	public double getAllowance(double basicSalary) {
		
		
		return basicSalary*31.0/100;
	}

	@Override
	public double getNetSalary(double basicSalary) {
		
		
		return basicSalary+getAllowance(basicSalary)-getDeduction(basicSalary);
	}
}
