package com.training.business;

public class Contact {

	String email,phone;

	public Contact(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}

	public Contact() {
		super();
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
		return "Contact [email=" + email + ", phone=" + phone + "]";
	};
	
	
	
}
