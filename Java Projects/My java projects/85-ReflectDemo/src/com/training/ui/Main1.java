package com.training.ui;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main1 {

	public static void main(String[] args) throws Exception {

	Class loadedClass=Class.forName("com.training.business.A");
        
		Field field=loadedClass.getDeclaredField("num1");
		System.out.println(field);
	
	Field[] arr=loadedClass.getDeclaredFields();
	
	for (Field field1 : arr) {
		System.out.println(field1.getName());
		System.out.println(field1.getModifiers());
	}
		Method[] arr2=loadedClass.getDeclaredMethods();
		
		for (Method method : arr2) {
			System.out.println(method.getName());
		}
		
	}

}
