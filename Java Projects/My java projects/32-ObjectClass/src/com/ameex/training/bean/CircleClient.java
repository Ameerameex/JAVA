package com.ameex.training.bean;

public class CircleClient {

	public static void main(String[] args) {

		Circle c1= new Circle(5);
		Circle c2= new Circle(5);	
		Circle c3= new Circle(10);
		
		Circle c4= null;

		System.out.println(c1.equals(c4));
		System.out.println(c1.equals(c1));
		
		Student s = new Student();
		s.rollNumber=300;
		System.out.println(c1.equals(s));
		
		System.out.println(c1.toString());
		System.out.println(c1);
		
		}

}
