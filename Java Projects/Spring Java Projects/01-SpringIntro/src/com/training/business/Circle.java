package com.training.business;

public class Circle implements Shape{

private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double getArea(){
	
	return radius*radius*3.14;
}

@Override
public String toString() {
	return "Circle [getRadius()=" + getRadius() + ", getArea()=" + getArea() + "]";
}

public void setSize(int size) {
	setRadius(size);
	
}



	
	
}
