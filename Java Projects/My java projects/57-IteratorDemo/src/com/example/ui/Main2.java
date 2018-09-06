package com.example.ui;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.example.business.Circle;

public class Main2 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(20);
		Circle c2=new Circle(56);
		Circle c3=new Circle(17);
		Circle c4=new Circle(8);
		Circle c5=new Circle(21);
		
		Set<Circle> circles=new HashSet<>();
		
		circles.add(c1);
		circles.add(c2);
		circles.add(c3);
		circles.add(c4);
		circles.add(c5);

System.out.println(circles);

Iterator<Circle> iterator=circles.iterator();

while(iterator.hasNext()){
	
	Circle circle=iterator.next();
	if(circle.getRadius()>10){
		iterator.remove();
	}
	
	System.out.println(circle);
	
	
}
System.out.println(circles);


	}

}
