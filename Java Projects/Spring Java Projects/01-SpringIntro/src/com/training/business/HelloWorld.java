package com.training.business;

public class HelloWorld {

	
	private String message="Welcome to Spring";

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloWorld [message=" + message + "]";
	}
	
	
	
}
