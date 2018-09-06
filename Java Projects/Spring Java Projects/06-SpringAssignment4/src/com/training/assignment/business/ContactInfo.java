package com.training.assignment.business;

public class ContactInfo {
	
	String email,phone;
	Address address;
	public ContactInfo(String email, String phone, Address address) {
		super();
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ContactInfo [email=" + email + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	// No Setter/Getters
	// Only paramaterized constructor
	// toString()
	

}
