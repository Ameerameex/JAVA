package com.training.example.business.implementations;

import com.training.example.business.interfaces.Shape;

 class Circle implements Shape {
	
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}

	@Override
	public void setSize(int size) {
		this.setRadius(size);
		
	}

	@Override
	public String toString() {
		return "Circle [getRadius()=" + getRadius() + ", getArea()=" + getArea() + "]";
	}

	

}
