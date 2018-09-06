package com.ameex.training.bean;

public class SquareClient {

	
	public static void main(String[] args) {
		
		
		Square square=new Square(10);
		Square square2=new Square(20);
		
		System.out.println(square.getSize());
		System.out.println(square2.getSize());
	}
}
