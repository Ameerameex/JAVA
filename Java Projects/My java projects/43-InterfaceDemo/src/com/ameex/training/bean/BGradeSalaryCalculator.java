package com.ameex.training.bean;

public class BGradeSalaryCalculator implements SalaryCalculator {

	@Override
	public double getDeduction(double basicSalary) {
		
		
		return basicSalary*22.0/100;
	}

	@Override
	public double getAllowance(double basicSalary) {
		
		
		return basicSalary*25.0/100;
	}

	@Override
	public double getNetSalary(double basicSalary) {
		
		
		return basicSalary+getAllowance(basicSalary)-getDeduction(basicSalary);
	}
}
