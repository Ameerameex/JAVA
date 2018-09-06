package com.ameex.training.business;

import org.springframework.stereotype.Component;

@Component
public class Category {

	char code;
	String description;
	public char getCode() {
		return code;
	}
	public void setCode(char code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category(char code, String description) {
		super();
		this.code = code;
		this.description = description;
	}
	public Category() {
		super();

	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (code != other.code)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Category [code=" + code + ", description=" + description + "]";
	}
	
}
