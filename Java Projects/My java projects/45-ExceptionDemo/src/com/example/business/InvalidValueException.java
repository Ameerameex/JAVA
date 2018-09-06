package com.example.business;

public class InvalidValueException extends Exception{

	private String fieldName;

	InvalidValueException(String message, String fieldName) {
		super(message);
		this.fieldName = fieldName;
	}

	@Override
	public String toString() {
		return "InvalidValueException [fieldName=" + fieldName + ", getMessage()=" + getMessage() + "]";
	}
	
	
	

}
