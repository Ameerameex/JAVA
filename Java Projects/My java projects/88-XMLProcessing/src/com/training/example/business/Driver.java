package com.training.example.business;

public class Driver {
	
	private String name;
	int age;
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getAge() {
		return age;
	}
	public final void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Driver [name=" + name + ", age=" + age + "\n]";
	}
	
	

}
