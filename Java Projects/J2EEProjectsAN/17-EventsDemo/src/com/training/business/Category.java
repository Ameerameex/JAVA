package com.training.business;

public class Category {

	int code;
	String description;
	public Category(int code, String description) {
		super();
		this.code = code;
		this.description = description;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Category [code=" + code + ", description=" + description + "]";
	}
	
}
