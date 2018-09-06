package com.training.assignment.business;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	
	String name;
	Date dateOfBirth;
	ContactInfo contactInfo;
	public Customer(String name, Date dateOfBirth, ContactInfo contactInfo) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.contactInfo = contactInfo;
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		String date=dateFormat.format(dateOfBirth);
		return "Customer [name=" + name + ", dateOfBirth=" + date + ", contactInfo=" + contactInfo + "]";
	}
	
	
	
	// No Setter/Getters
	// Only paramaterized constructor
	// toString()

}
