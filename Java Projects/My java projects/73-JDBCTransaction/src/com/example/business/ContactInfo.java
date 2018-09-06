package com.example.business;

public class ContactInfo {
	
	private String emailId,PhoneNumber;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "ContactInfo [emailId=" + emailId + ", PhoneNumber=" + PhoneNumber + "]";
	}
	
	

}
