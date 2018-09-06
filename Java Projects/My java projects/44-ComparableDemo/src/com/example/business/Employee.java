package com.example.business;

public class Employee implements Comparable {
	
	private int id;
	private double basicSalary;
	
	
	
	public Employee(int id, double basicSalary) {
		super();
		this.id = id;
		this.basicSalary = basicSalary;
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



	public double getBasicSalary() {
		return basicSalary;
	}



	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}



	public double getAllowanceAmount() {
		double percentage=0.18;
		double amount;
		amount=basicSalary*percentage;
		return amount;
		
	}
	
	public double getTaxAmount() {
		double percentage=0.10;
		double amount;
		amount=basicSalary*percentage;
		return amount;
		
	}
	
	public double getNetSalary() {
		return this.getBasicSalary()+this.getAllowanceAmount()-this.getTaxAmount();
	}



	@Override
	public int compareTo(Object o) {
    Employee temp=(Employee)o;
    if(this.basicSalary<temp.basicSalary)
    	return -1;
    if(this.basicSalary==temp.basicSalary)
    	return 0;
    if(this.basicSalary>temp.basicSalary)
    	return 1;
		return 0;
	}


}
