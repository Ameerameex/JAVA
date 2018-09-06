package com.training.ui;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main5 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		
		Class loadedClass=com.training.example.business.Product.class;
		
		Constructor[] arr=loadedClass.getConstructors();
		Method method=loadedClass.getDeclaredMethod("toString");
		System.out.println(method);
		
		for (Constructor constructor : arr) {
			System.out.println(constructor);
		}
		
	}
	
}
