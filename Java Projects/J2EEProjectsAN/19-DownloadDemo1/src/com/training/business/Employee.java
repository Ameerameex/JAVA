package com.training.business;

import java.util.Date;

public class Employee {

	int id;
	String name;
	double salary;
	Date dateOfJoin;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	public Employee(int id, String name, double salary, Date dateOfJoin) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dateOfJoin = dateOfJoin;
	}
	public Employee() {
		super();
	}
	
	
	
}
