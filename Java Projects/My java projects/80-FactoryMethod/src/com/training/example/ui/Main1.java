package com.training.example.ui;
import java.util.Scanner;

import com.training.example.business.implementations.ShapeCreator;
import com.training.example.business.interfaces.Shape;

public class Main1 {

	public static void main(String[] args) {
		
	/*
	 Scanner scanner=new Scanner(System.in);
	 
	char shapeType;
	int shapeSize;
	
	System.out.println("\t\t Enter Shape Type(C-Circle, S-Square, R-Rectangle, T- Triangle : ");
	shapeType=scanner.next().charAt(0);
	
	System.out.println("\t\t Enter Shape Size : ");
	shapeSize=scanner.nextInt();
	*/
		
	Shape shape=ShapeCreator.getInstance('C');
	
	System.out.println(shape);
	shape.setSize(5);
	System.out.println(shape.getArea());
	Shape shape1=ShapeCreator.getInstance('S');
	shape1.setSize(5);
	System.out.println(shape1.getArea());


		
	}

}
