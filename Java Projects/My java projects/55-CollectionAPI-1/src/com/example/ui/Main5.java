package com.example.ui;

import java.util.ArrayList;
import java.util.List;

import com.example.business.Circle;

public class Main5 {

	public static void main(String[] args) {
		

		Circle c1=new Circle(4);
		Circle c2=new Circle(5);
		Circle c3=new Circle(6);
		Circle c4=new Circle(7);
		Circle c5=new Circle(8);
List<Circle> circles=new ArrayList<>();
System.out.println(circles.add(c1));
System.out.println(circles.add(c2));
System.out.println(circles.add(c3));
System.out.println(circles.add(c4));
System.out.println(circles.add(c5));
 circles.add(1, new Circle(25));
 System.out.println(circles);
 
 circles.remove(c3);
 System.out.println(circles);
System.out.println( circles.indexOf(new Circle(2000)));
System.out.println();

		
	}

}
