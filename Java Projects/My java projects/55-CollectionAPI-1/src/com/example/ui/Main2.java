package com.example.ui;

import java.util.LinkedList;
import java.util.List;

import com.example.business.Circle;

public class Main2 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(20);
		Circle c2=new Circle(56);
		Circle c3=new Circle(17);
		Circle c4=new Circle(8);
		Circle c5=new Circle(21);
		
		List<Circle> allCircles=new LinkedList<>();
		allCircles.add(c1);
		allCircles.add(c2);
		allCircles.add(c3);
		allCircles.add(c4);
		allCircles.add(c5);
	

		System.out.println(allCircles);
		

		for(Circle c : allCircles){
			
			System.out.println(c);
		}

	}

}
