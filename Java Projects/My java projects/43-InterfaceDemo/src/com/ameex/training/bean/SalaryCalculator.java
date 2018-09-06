package com.ameex.training.bean;

public interface SalaryCalculator {

	double getAllowance(double basicSalary);

	double getDeduction(double basicSalary);

	double getNetSalary(double basicSalary);

}
