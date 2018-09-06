package com.ameex.training.business;

public class Circle implements Comparable {

	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public final int getRadius() {
		return radius;
	}

	public final void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public int compareTo(Object o) {
		Circle temp = (Circle) o;

		if (this.radius < temp.radius)
			return -1;
		if (this.radius == temp.radius)
			return 0;
		if (this.radius > temp.radius)
			return 1;

		return 0;
	}

}
