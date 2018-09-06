package com.example.business;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	private transient SalaryCalculator salaryCalculator;
	
	public Employee(int id, String name, double basicSalary, char grade) {
		super();
		setId(id);
		setName(name);
		setBasicSalary(basicSalary);
		setGrade(grade);
		
	}
	

	public Employee() {
		super();
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade
				+ ", salaryCalculator=" + salaryCalculator + "]";
	}
	
	
	
}
