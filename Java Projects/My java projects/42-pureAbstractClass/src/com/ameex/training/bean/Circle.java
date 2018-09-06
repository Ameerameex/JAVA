package com.ameex.training.bean;

public class Circle extends Shape {

	int radius;

	public final int getRadius() {
		return radius;
	}

	public final void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void setSize(int size) {

		setRadius(size);

	}

	@Override
	public double getArea() {
		
		

		return 3.14 * this.radius * this.radius;
	}

}
