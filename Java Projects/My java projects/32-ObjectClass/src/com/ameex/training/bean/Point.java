package com.ameex.training.bean;

public class Point {

	private int x,y;

	Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}

	void setX(int x) {
		this.x = x;
	}

	int getY() {
		return y;
	}

	void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Point))
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", getX()=" + getX() + ", getY()=" + getY() + ", hashCode()=" + hashCode()
				+ "]";
	}

	@Override
	public void finalize() throws Throwable {
		
		System.out.println("Point object "+x+","+y+" is removed from memory");
	}
	
	
}
