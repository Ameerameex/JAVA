package com.training.business;

import com.training.annotations.Id;
import com.training.annotations.Table;
import com.training.annotations.Column;

@Table(name = "EMP")
public class Employee {

	@Column(columnName = "EID", columnType = "INT")
	@Id(columnName = "EID", columnType = "INT", generatedStrategy = "ASSIGNED")
	int empid;
	@Column(columnName = "ENAME", columnType = "STRING")
	String name;
	@Column(columnName = "EBASIC", columnType = "DOUBLE", CoumnWidth = 10, decimalwidth = 2)
	double basicSalary;
	@Column(columnName = "EAGE", columnType = "INT")
	int age;

	public final int getEmpid() {
		return empid;
	}

	public final void setEmpid(int empid) {
		this.empid = empid;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final double getBasicSalary() {
		return basicSalary;
	}

	public final void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public final int getAge() {
		return age;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String name, double basicSalary, int age) {
		super();
		this.empid = empid;
		this.name = name;
		this.basicSalary = basicSalary;
		this.age = age;
	}

	@Override
	public String toString() {
System.out.printf("%s%15d%15s%s%15.2f%15d","\n",empid,name,"\t",basicSalary,age);
		
		return "";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
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
		if (empid != other.empid)
			return false;
		return true;
	}

}
