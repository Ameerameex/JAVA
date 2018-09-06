package com.ameex.training.bean;

public class Main2 {

	public static void main(String[] args) {

		Shape shape;
		shape=new Circle();
		
		shape.setSize(6);
		System.out.println(shape.getArea());
		
shape=new Square();
shape.setSize(7);
System.out.println(shape.getArea());

	}

}
