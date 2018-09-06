package com.example.business;

import java.util.Date;
import java.util.Map;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double basicSalary;
	private char grade;
	private SalaryCalculator salaryCalculator;
	private Date dateOfJoin;
	private int did;

	public final int getDid() {
		return did;
	}

	public final void setDid(int did) {
		this.did = did;
	}

	public Employee( String name, double basicSalary, char grade, Date dateOfJoin,int did) {
		super();
		setId(id);
		setName(name);
		setBasicSalary(basicSalary);
		setGrade(grade);
		setDateOfJoin(dateOfJoin);
		setDid(did);
		
	}

	public final Date getDateOfJoin() {
		return dateOfJoin;
	}

	public final void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
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
		if (grade >= 97)
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
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		System.out.printf("%-15d%s%15s%s%15f%s%15s%s%15s%s%15d%s%15f%s", id,"\t\t",name,"\t\t", basicSalary,"\t\t",grade,"\t\t",dateOfJoin,"\t\t",did,"\t\t",getNetSalary(),"\t\t","\n");

		
		return "";
	}

	// inner class 1
	private class AGradeSalaryCalculator implements SalaryCalculator {

		@Override
		public double getDeductionAmount(double basicSalary) {
			Calculator calculator = new Calculator();
			return calculator.multiply(basicSalary, 0.17);
		}

		@Override
		public double getAllowanceAmount(double basicSalary) {
			Calculator calculator = new Calculator();
			return calculator.multiply(basicSalary, 0.26);

		}

	}

	// inner class 2
	private class BGradeSalaryCalculator implements SalaryCalculator {

		@Override
		public double getDeductionAmount(double basicSalary) {
			Calculator calculator = new Calculator();
			return calculator.multiply(basicSalary, 0.15);
		}

		@Override
		public double getAllowanceAmount(double basicSalary) {
			Calculator calculator = new Calculator();
			return calculator.multiply(basicSalary, 0.24);

		}

	}

	// inner class 3
	private class CGradeSalaryCalculator implements SalaryCalculator {

		@Override
		public double getDeductionAmount(double basicSalary) {
			Calculator calculator = new Calculator();
			return calculator.multiply(basicSalary, 0.10);
		}

		@Override
		public double getAllowanceAmount(double basicSalary) {
			Calculator calculator = new Calculator();
			return calculator.multiply(basicSalary, 0.20);

		}

	}

	// inner interface
	private interface SalaryCalculator {

		double getDeductionAmount(double basicSalary);

		double getAllowanceAmount(double basicSalary);

	}

	@Override
	public int compareTo(Employee o) {
		IdAscendingComparator ascendingComparator = new IdAscendingComparator();
		int r = ascendingComparator.compare(this, o);
		return r;
	}

}
