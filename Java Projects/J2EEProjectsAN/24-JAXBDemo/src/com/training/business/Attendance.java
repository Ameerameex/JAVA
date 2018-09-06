package com.training.business;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(propOrder={"monthName","days"})
public class Attendance {
	String monthName;
	int days;
	
	public Attendance(String monthName, int days) {
		super();
		this.monthName = monthName;
		this.days = days;
	}
	public Attendance() {
		super();
	}
	public String getMonthName() {
		return monthName;
	}
	public void setMonthName(String monthName) {
		this.monthName = monthName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "\n\t Attendance [monthName=" + monthName + ", days=" + days + "]";
	}
	
	

}
