package com.training.example.business.implementations;

import com.training.example.business.interfaces.Shape;

public class ShapeCreator {

	public static Shape getInstance(char type){
		if(type=='C'){
			return new Circle();
		}
		if(type=='R'){
			return new Rectangle();
		}
		if(type=='S'){
			
			return new Square();
		}
		if(type=='T'){
			
			return new Triangle();
		}
		return null;
	}

	
	
}
