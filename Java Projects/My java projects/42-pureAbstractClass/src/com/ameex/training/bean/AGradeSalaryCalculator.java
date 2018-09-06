package com.ameex.training.bean;

public class AGradeSalaryCalculator extends SalaryCalculator {

	@Override
	public double getDeduction(double basicSalary) {
		
		
		return basicSalary*20.0/100;
	}

	@Override
	public double getAllowances(double basicSalary) {
		
		
		return basicSalary*31.0/100;
	}

	@Override
	public double getNetSalary(double basicSalary) {
		
		
		return basicSalary+getAllowances(basicSalary)-getDeduction(basicSalary);
	}

}
