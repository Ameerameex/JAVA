package com.training.business;

import java.util.Date;
import java.util.Map;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	private SalaryCalculator salaryCalculator;
	private Date dateOfJoin;
	
//	public Employee(int id) {
//		super();
//		this.id = id;
//	}

	

//	public Employee(int id, String name, double basicSalary, char grade,Date dateOfJoin) {
//		super();
//		setId(id);
//		setName(name);
//		setBasicSalary(basicSalary);
//		setGrade(grade);
//		setDateOfJoin(dateOfJoin);
///*		this.id = id;
//		this.name = name;
//		this.basicSalary = basicSalary;
//		this.grade = grade;
//		this.dateOfJoin = dateOfJoin;
//*/	}
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, double basicSalary, char grade, Date dateOfJoin) {
	super();
	this.id = id;
	this.name = name;
	this.basicSalary = basicSalary;
	this.grade = grade;
	this.dateOfJoin = dateOfJoin;
}

	public final Date getDateOfJoin() {
		return dateOfJoin;
	}

	public final void setDateOfJoin(Date dateOfJoin) {
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
		if(grade>=97)
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
		case 'S':
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
		return "\n Employee [getId()=" + getId() + ", getName()=" + getName() + ", getBasicSalary()=" + getBasicSalary()
				+ ", getGrade()=" + getGrade() + ", getAllowance()=" + getAllowance() + ", getDeduction()="
				+ getDeduction() + ", getNetSalary()=" + getNetSalary() + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}


	// Inner Class 1
	private class AGradeSalaryCalculator implements SalaryCalculator{

		
		@Override
		public double getDeductionAmount(double basicSalary) {
			Calculator calculator=new Calculator();
			return calculator.multiply(basicSalary, 0.17);
		}

		@Override
		public double getAllowanceAmount(double basicSalary) {
			Calculator calculator=new Calculator();
			return calculator.multiply(basicSalary, 0.26);
			
		}

	}
	
	// Inner Class 2
	
	private class BGradeSalaryCalculator implements SalaryCalculator{

		@Override
		public double getDeductionAmount(double basicSalary) {
			Calculator calculator=new Calculator();
			return calculator.multiply(basicSalary, 0.15);
		}

		@Override
		public double getAllowanceAmount(double basicSalary) {
			Calculator calculator=new Calculator();
			return calculator.multiply(basicSalary, 0.24);
			
		}

	}
	
	// Inner Class 3
	
	private class CGradeSalaryCalculator implements SalaryCalculator{

		@Override
		public double getDeductionAmount(double basicSalary) {
			Calculator calculator=new Calculator();
			return calculator.multiply(basicSalary, 0.15);
		}

		@Override
		public double getAllowanceAmount(double basicSalary) {
			Calculator calculator=new Calculator();
			return calculator.multiply(basicSalary, 0.24);
			
		}

	}
	
	// Inner Interface
	
	private interface SalaryCalculator {

		double getDeductionAmount(double basicSalary);
		double getAllowanceAmount(double basicSalary);
		
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
