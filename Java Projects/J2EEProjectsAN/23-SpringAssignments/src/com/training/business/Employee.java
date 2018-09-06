package com.training.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;



public class Employee {
	
	int id;
	String name;
	Date dateOfJoining;
	double basic;
	char grade;
	Address address;
	
	List<Attendance> attendances=new ArrayList<>();
	
	
	
	

	public Employee(int id, String name, Date dateOfJoining, double basic, char grade, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.basic = basic;
		this.grade = grade;
		this.address = address;
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

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@XmlElement
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@XmlElementWrapper(name="attendanceList")
	@XmlElement(name="attendance")
	public List<Attendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}
	
	public void addAttendance(Attendance attendance) {
		this.attendances.add(attendance);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfJoining=" + dateOfJoining + ", basic=" + basic
				+ ", grade=" + grade + ", address=" + address + ", attendances=" + attendances + "]";
	}

	
	
	
	

}
