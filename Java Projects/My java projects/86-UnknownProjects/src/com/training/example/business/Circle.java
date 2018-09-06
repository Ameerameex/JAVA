package com.training.example.business;

public class Circle {
	
	private int radius;
	public static final double PI=3.14;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*getRadius()*getRadius();
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
