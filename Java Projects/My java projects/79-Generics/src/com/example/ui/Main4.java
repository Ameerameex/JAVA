package com.example.ui;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.TypeVariable;

public class Main4 {

	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("com.example.business.Test");
		TypeVariable<?>[] tv=c.getTypeParameters();
		for(TypeVariable t:tv) {
			System.out.println(t.getTypeName());
		}
		Method methods[] = c.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m);
			if(m.getParameterTypes().length>0) {
				Parameter[] params=m.getParameters();
				for(Parameter p: params) {
					System.out.println("---"+p.getParameterizedType());
				}
			}
			System.out.println(m.getGenericReturnType());
			
		}
	}

}
