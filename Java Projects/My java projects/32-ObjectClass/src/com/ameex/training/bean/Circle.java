package com.ameex.training.bean;

public class Circle {

	private int radius;

	Circle(int radius) {
		super();
		this.radius = radius;
	}

	int getRadius() {
		return radius;
	}

	void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Circle [radius="
				+ "" + this.radius+"]";
		
	}

}
