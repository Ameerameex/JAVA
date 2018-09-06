package com.example.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.business.Circle;

public class Main4 {

	public static void main(String[] args) {
		
		Circle[] arr= {
				new Circle(10),
				new Circle(5),
				new Circle(17),
				new Circle(3),
				new Circle(12)
		};
		List<Circle> allCircles;
		//allCircles=new ArrayList<>();
		allCircles=Arrays.asList(arr);
		System.out.println(allCircles);
		
		//allCircles.add(new Circle(10));
		//System.out.println(allCircles);
		
		
		

	}

}
