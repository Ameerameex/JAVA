package com.training.business;

public class SalaryComputor {
	
	private Calculator calculator;
	

	

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}


	public double getAllowance(double basic) {

		return calculator.multiply(basic, 0.18);
	}
	public double getDeduction(double basic) {

		return calculator.multiply(basic, 0.10);
	}
	public double getNetSalary(double basic) {
		double sum=calculator.add(basic, getAllowance(basic));
		sum=calculator.subtract(sum, getDeduction(basic));

		return sum;
	}
	

}
