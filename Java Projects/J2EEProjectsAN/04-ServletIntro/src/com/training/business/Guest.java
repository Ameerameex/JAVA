package com.training.business;

public class Guest {

	String name;
	int age;
	
	public Guest(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Guest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", age=" + age + "]";
	}
	
	
}
