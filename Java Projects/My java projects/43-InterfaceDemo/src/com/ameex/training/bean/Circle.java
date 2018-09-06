package com.ameex.training.bean;

public class Circle implements Shape {

	
	int radius;

	public final int getRadius() {
		return radius;
	}

	public final void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return pi*radius*radius;
	}

	@Override
	public void setSize(int size) {
setRadius(6);		

	}
	
}
