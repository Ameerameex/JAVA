package com.training.business;

public class SalesExecutive {

	
	String name,salesArea,emailID,phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalesArea() {
		return salesArea;
	}

	public void setSalesArea(String salesArea) {
		this.salesArea = salesArea;
	}

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
		return "SalesExecutive [name=" + name + ", salesArea=" + salesArea + ", emailID=" + emailID + ", phone=" + phone
				+ "]";
	}
	
	
}
