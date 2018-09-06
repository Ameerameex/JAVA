package com.training.example.business.implementations;

import com.training.example.business.interfaces.Shape;

 class Square implements Shape{

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public double getArea() {
		return size*size;
	}

	@Override
	public String toString() {
		return "Square [getSize()=" + getSize() + ", getArea()=" + getArea() + "]";
	}
	
	
	
	
}
