package com.training.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {
	
	@XmlElement
	String emailId;
	@XmlElement
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
