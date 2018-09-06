package com.example.business;

public interface SalaryCalculator {

	double getDeductionAmount(double basicSalary);
	double getAllowanceAmount(double basicSalary);
	
}
