package com.example.ui;

import com.example.business.Circle;

public class Client1 {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setRadius(4);
		Circle circle2 = new Circle();
		circle2.setRadius(12);
		
		int r=circle.compareTo(circle2);
		if(r<0){
			
			System.out.println("circle is less");
		}
if(r==0){
			
			System.out.println("circle is equal to circle2");
		}
if(r>0){
	
	System.out.println("circle is greater than circle2");
}
	}

}
