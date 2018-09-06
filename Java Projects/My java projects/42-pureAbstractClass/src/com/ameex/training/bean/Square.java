package com.ameex.training.bean;

public class Square extends Shape{

	int size;

	public final int getSize() {
		return size;
	}

	public final void setSize(int size) {
		this.size = size;
	}

	@Override
	public double  getArea() {
		
		return this.size*this.size;
	}
	
	
}
