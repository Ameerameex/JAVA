package com.training.business;

public class Circle {

	int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
public void init(){
	this.radius=1000;
}
public void f2(){
	System.out.println("object is Destroyed");
}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	
}
