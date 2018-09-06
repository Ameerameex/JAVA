package com.example.business;

import java.util.Date;
import java.util.Map;

public class Employee {
	
	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	private SalaryCalculator salaryCalculator;
	private Date dateOfJoin;
	
	

	public Employee(int id, String name, double basicSalary, char grade,Date dateOfJoin) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.grade = grade;
		this.dateOfJoin = dateOfJoin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		if(grade>97)
			grade=(char)(grade-32);
		this.grade = grade;
		switch(grade) {
		case 'A':
			salaryCalculator=new AGradeSalaryCalculator();
			break;
		case 'B':
			salaryCalculator=new BGradeSalaryCalculator();
			break;
		case 'C':
			salaryCalculator=new CGradeSalaryCalculator();
			break;
		}
		}
	
	
	public double getAllowance() {
		return salaryCalculator.getAllowanceAmount(basicSalary);
	}
	
	public double getDeduction() {
		return salaryCalculator.getDeductionAmount(basicSalary);
	}
	
	public double getNetSalary() {
		return getBasicSalary()+getAllowance()-getDeduction();
	}
	
	
	
	
}
