package com.example.business;

import java.util.Date;

public class Employee {

	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	private Date dateOfJoin;
	private Gender gender;
	private SalaryCalculator salaryCalculator;

	

	
	
	public Employee(int id, String name, double basicSalary, char grade, Date dateOfJoin, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.grade = grade;
		this.dateOfJoin = dateOfJoin;
		this.gender = gender;
	}

	public Employee() {
		super();
	}


	public Gender getGender() {
		return gender;
	}



	public void setGender(Gender gender) {
		this.gender = gender;
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
		if (grade > 97)
			grade = (char) (grade - 32);
		this.grade = grade;
		switch (grade) {
		case 'A':
			salaryCalculator = new AGradeSalaryCalculator();
			break;
		case 'B':
			salaryCalculator = new BGradeSalaryCalculator();
			break;
		case 'C':
			salaryCalculator = new CGradeSalaryCalculator();
			break;
		}
	}

	
	
	public Date getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public double getAllowance() {
		return salaryCalculator.getAllowanceAmount(basicSalary);
	}

	public double getDeduction() {
		return salaryCalculator.getDeductionAmount(basicSalary);
	}

	public double getNetSalary() {
		return getBasicSalary() + getAllowance() - getDeduction();
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", basicSalary=" + basicSalary + ", grade=" + grade
				+ ", dateOfJoin=" + dateOfJoin + ", gender=" + gender + "]";
	}

	
}
