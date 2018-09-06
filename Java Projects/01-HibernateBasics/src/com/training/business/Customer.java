package com.training.business;

import java.util.Date;

public class Customer {

	int id;
	String name;
	Date dateOfBirth;
	char gender;
	boolean NRICustomer;
	double annualIncome;
	ContactInfo contactInfo;
	

	public Customer(int id, String name, Date dateOfBirth, char gender, boolean nRICustomer, double annualIncome,
			ContactInfo contactInfo) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		NRICustomer = nRICustomer;
		this.annualIncome = annualIncome;
		this.contactInfo = contactInfo;
	}

	public Customer(String name, Date dateOfBirth, char gender, boolean nRICustomer, double annualIncome,
			ContactInfo contactInfo) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		NRICustomer = nRICustomer;
		this.annualIncome = annualIncome;
		this.contactInfo = contactInfo;
	}

	public Customer() {
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isNRICustomer() {
		return NRICustomer;
	}
	public void setNRICustomer(boolean nRICustomer) {
		NRICustomer = nRICustomer;
	}
	public double getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
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
		Customer other = (Customer) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender
				+ ", NRICustomer=" + NRICustomer + ", annualIncome=" + annualIncome + ", contactInfo=" + contactInfo
				+ "]";
	}
	
	
	
}
