package com.training.business;

public class Circle {

	int radius;

	
	public Circle() {
		super();
		System.out.println("\t\t [Circle Instance Created]");

	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
