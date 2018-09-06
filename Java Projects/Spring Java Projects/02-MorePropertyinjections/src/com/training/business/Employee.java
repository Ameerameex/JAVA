package com.training.business;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double employeeBasicSalary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeBasicSalary() {
		return employeeBasicSalary;
	}
	public void setEmployeeBasicSalary(double employeeBasicSalary) {
		this.employeeBasicSalary = employeeBasicSalary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", employeeBasicSalary=" + employeeBasicSalary
				+ "]";
	}
	
	

}
