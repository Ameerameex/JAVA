package com.ameex.training.bean;

public class CircleClient {

	
	public static void main(String[] args) {
		Circle circle=new Circle(5);
		
		System.out.println(circle);
		
		Circle circle2=circle.enLarge(20);
		
		System.out.println(circle2);
		
		System.out.println(circle2.enLarge(50));
		
		Circle circle3=circle2.enLarge(30);
		
		System.out.println(circle3);
		
		
	}
}
