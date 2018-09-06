package com.training.example.business.implementations;

import com.training.example.business.interfaces.Shape;

 class Rectangle implements Shape{
	
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

	@Override
	public void setSize(int size) {
		setHeight(size);
		setWidth(size*2);
		
	}

	@Override
	public double getArea() {
		return 0.0;
	}

	@Override
	public String toString() {
		return "Rectangle [getWidth()=" + getWidth() + ", getHeight()=" + getHeight() + ", getArea()=" + getArea()
				+ "]";
	}


	
	
}
