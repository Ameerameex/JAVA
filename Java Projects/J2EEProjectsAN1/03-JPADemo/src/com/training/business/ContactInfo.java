package com.training.business;

public class ContactInfo {
	
	int id;
	String email;
	String phone;
	SalesMan salesMan;
	
	public ContactInfo(int id, String email, String phone) {
		
		super();
		this.id=id;
		this.email = email;
		this.phone = phone;
	}
	
	
	public ContactInfo() {
		super();
	}
	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	public SalesMan getSalesMan() {
		return salesMan;
	}
	public void setSalesMan(SalesMan salesMan) {
		this.salesMan = salesMan;
	}
	@Override
	public String toString() {
		return "ContactInfo [email=" + email + ", phone=" + phone + "]";
	}

	
}
