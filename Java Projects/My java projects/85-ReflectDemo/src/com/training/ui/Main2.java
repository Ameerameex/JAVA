package com.training.ui;

import java.lang.reflect.Field;

import com.training.example.business.Circle;
import com.training.example.business.Product;
import com.training.example.business.Rectangle;

public class Main2 {

	static void printDetails(Object obj){
		
		Class loadedClass=obj.getClass();

		Field[] arr=loadedClass.getDeclaredFields();
		
		for (Field field : arr) {
			System.out.println(field.getName());
			System.out.println(field.getModifiers());
		}
		
	}
	
	public static void main(String[] args) {

		printDetails(new Product());
		
	}

}
