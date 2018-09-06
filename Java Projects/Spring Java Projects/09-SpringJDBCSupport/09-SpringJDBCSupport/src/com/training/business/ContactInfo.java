package com.training.business;

public class ContactInfo {

	int id;
	String email,phone;
	int cId;
	


	

	public ContactInfo(String email, String phone, int cId) {
		super();
		this.email = email;
		this.phone = phone;
		this.cId = cId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
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

	@Override
	public String toString() {
		return "ContactInfo [email=" + email + ", phone=" + phone + "]";
	}

	public ContactInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
