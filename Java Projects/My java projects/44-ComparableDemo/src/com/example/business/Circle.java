package com.example.business;

public class Circle implements Comparable {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		double result;
		result = radius * radius * 3.14;
		return result;
	}

	@Override
	public int compareTo(Object o) {
		Circle temp = (Circle) o;
		if (this.radius < temp.radius) {
			return -1;
		}
		if (this.radius == temp.radius)
			return 0;
		if (this.radius > temp.radius)
			return 1;
		return 0;
	}
}
