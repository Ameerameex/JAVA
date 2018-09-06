package com.training.example.business;

public class Contact {
	
	private String name;
	private String phone;
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPhone() {
		return phone;
	}
	public final void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phone=" + phone + "]";
	}
	
	
}
