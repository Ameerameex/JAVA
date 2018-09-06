package com.ameex.training.bean;

abstract public class SalaryCalculator {
	abstract public double getDeduction(double basicSalary);
	abstract public double getAllowances(double basicSalary);
	abstract public double getNetSalary(double basicSalary);
}
