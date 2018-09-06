  
package com.training.ui;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.training.example.business.Circle;

public class Main4 {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		
		Class loadedClass=com.training.example.business.Circle.class;
		
		Object target=loadedClass.newInstance();
		Method method=loadedClass.getMethod("getArea");
		Class class1=method.getReturnType();
		System.out.println(class1.getSimpleName());
		
		Parameter[] parameters=method.getParameters();
		
		System.out.println(parameters.length);
		
		Object rValue;
		
		
		rValue=method.invoke(target);
		System.out.println(rValue);
		Method method2=loadedClass.getMethod("setRadius",int.class);
Parameter[] parameters1=method.getParameters();
		
		System.out.println(parameters1.length);

		method2.invoke(target,new Integer(25));
		
System.out.println(method.invoke(target));
System.out.println(target);
		
	}
	
}
