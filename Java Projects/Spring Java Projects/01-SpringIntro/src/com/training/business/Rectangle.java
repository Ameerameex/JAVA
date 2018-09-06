package com.training.business;

public class Rectangle implements Shape {
	
	private int width,height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea(){
		return width*height;
	}

	@Override
	public String toString() {
		return "Rectangle [getWidth()=" + getWidth() + ", getHeight()=" + getHeight() + ", getArea()=" + getArea()
				+ "]";
	}

	@Override
	public void setSize(int size) {

		setWidth(size);
		setHeight(size*2);
		
	}
	

}
