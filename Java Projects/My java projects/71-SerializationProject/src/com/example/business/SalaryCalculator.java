package com.example.business;

import java.io.Serializable;

public interface SalaryCalculator extends Serializable {

	double getDeductionAmount(double basicSalary);
	double getAllowanceAmount(double basicSalary);
	
}
