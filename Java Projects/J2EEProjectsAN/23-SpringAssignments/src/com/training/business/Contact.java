package com.training.business;

import javax.xml.bind.annotation.XmlRootElement;


public class Contact {
	
	String emailId;
	String phoneNumber;
	
	
	
	public Contact(String emailId, String phoneNumber) {
		super();
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	
	
	public Contact() {
		super();
	}


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


	@Override
	public String toString() {
		return "Contact [emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	

}
