package com.training.business;

import java.util.Date;

import com.training.annotations.Id;
import com.training.annotations.Table;
import com.training.annotations.Column;
@Table(name = "STUDENT1")
public class Student1 {

	//@Column(columnName = "SID",columnType="INT",CoumnWidth=5)
	int rollNumber;
	//@Column(columnName = "SNAME",columnType="VARCHAR",CoumnWidth=10)
	String name;
	//@Column(columnName = "SAVERAGE",columnType="DOUBLE",CoumnWidth=10,decimalwidth=2)

	double average;
	//@Column(columnName = "SGRADE",columnType="CHAR",CoumnWidth=1)
	char grade;
	//@Column(columnName = "SDATEOFJOINIG",columnType="DATE",CoumnWidth=10)

	Date dateOfJoining;
	
	@Id(columnName = "SID", columnType = "INT",generatedStrategy="ASSIGNED")
	@Column(columnName = "SID",columnType="INT",CoumnWidth=5)
	public final int getRollNumber() {
		return rollNumber;
	}
	public final void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	@Column(columnName = "SNAME",columnType="VARCHAR",CoumnWidth=10)
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	
	@Column(columnName = "SAVERAGE",columnType="DOUBLE",CoumnWidth=5,decimalwidth=2)
	public final double getAverage() {
		return average;
	}
	public final void setAverage(double average) {
		this.average = average;
	}
	
	@Column(columnName = "SGRADE",columnType="CHAR",CoumnWidth=1)
	public final char getGrade() {
		return grade;
	}
	public final void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Column(columnName = "SDATEOFJOINIG",columnType="DATE",CoumnWidth=12)
	public final Date getDateOfJoining() {
		return dateOfJoining;
	}
	public final void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNumber;
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
		Student1 other = (Student1) obj;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}
	public Student1(int rollNumber, String name, double average, char grade, Date dateOfJoining) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.average = average;
		this.grade = grade;
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", average=" + average + ", grade=" + grade
				+ ", dateOfJoining=" + dateOfJoining + "]";
	}
	public Student1() {
		super();
	}
	
	
}
