package com.ameex.training.bean;

public class BGradeSalaryCalculator extends SalaryCalculator {
	

	@Override
	public double getDeduction(double basicSalary) {
		
		
		return basicSalary*17.0/100;
	}

	@Override
	public double getAllowances(double basicSalary) {
		
		
		return basicSalary*27.0/100;
	}

	@Override
	public double getNetSalary(double basicSalary) {
		
		
		return basicSalary+getAllowances(basicSalary)-getDeduction(basicSalary);
	}


}
