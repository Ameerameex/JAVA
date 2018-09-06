package com.example.business;

public enum Gender {
	MALE('M'),FEMALE('F');
	
	private char value;
	
	

	private Gender(char value) {
		this.value = value;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}
	
	
}
