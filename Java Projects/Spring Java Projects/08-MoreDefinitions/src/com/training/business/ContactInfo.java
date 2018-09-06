package com.training.business;

public class ContactInfo {

	String emailID,phone;

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ContactInfo [emailID=" + emailID + ", phone=" + phone + "]";
	}
	
	
	
	
}
