package com.example.business;

public class Circle implements Comparable<Circle>{

	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
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
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (radius != other.radius)
			return false;
		return true;
	}
	
	public double getArea() {
		return getRadius()*getRadius()*Math.PI;
	}


	

	@Override
	public int compareTo(Circle o) {
		
		if(this.radius<o.radius)
			return -1;
		if(this.radius>o.radius)
			return 1;
		return 0;
	}
	
	
}
