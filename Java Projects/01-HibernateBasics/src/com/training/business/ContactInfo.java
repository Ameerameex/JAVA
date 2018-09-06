package com.training.business;

public class ContactInfo {

	String emailId,phoneNumber;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ContactInfo(String emailId, String phoneNumber) {
		super();
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
