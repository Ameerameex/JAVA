package com.ameex.training.business;

public class Rectangle implements Comparable {

	int width, height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public final int getWidth() {
		return width;
	}

	public final void setWidth(int width) {
		this.width = width;
	}

	public final int getHeight() {
		return height;
	}

	public final void setHeight(int height) {
		this.height = height;
	}
public int getArea(){
	
	return this.height*this.width;
}
	@Override
	public int compareTo(Object o) {
		Rectangle temp = (Rectangle) o;
		if(this.getArea()<temp.getArea())
		return -1;
		if(this.getArea()==temp.getArea())
			return 0;
		if(this.getArea()>temp.getArea())
			return 1;

		return 0;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

}
