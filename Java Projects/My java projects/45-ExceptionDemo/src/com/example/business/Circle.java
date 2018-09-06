package com.example.business;

public class Circle {

	private int radius;
	
	
	
	public int getRadius() {
		return radius;
	}



	public void setRadius(int radius) throws Exception {
		if(radius<0){
			
			Exception exception=new InvalidValueException("Radius","negative value encounted "+ radius);
			throw exception;
		}
		this.radius = radius;
	}



	public double getArea() {
		double result;
		result=radius*radius*3.14;
		return result;
	}
}
