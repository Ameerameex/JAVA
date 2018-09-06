package com.ameex.training.bean;

public class Circle {

	private final  int radius;

	Circle(int radius) {
		super();
		this.radius = radius;
	}

	 public final int getRadius() {
		return radius;
	}
	 Circle enLarge(int size){
		 
		 Circle c1= new Circle(this.radius+size);
		 return c1;
	 }

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + "]";
	}
	
	
	
}
