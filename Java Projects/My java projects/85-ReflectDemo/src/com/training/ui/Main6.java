package com.training.ui;

import java.lang.reflect.Method;

public class Main6 {

	public static void main(String[] args) throws Exception {

		Class loadedClass = Class.forName("com.training.business.A");

		Object object = loadedClass.newInstance();

		Method method = loadedClass.getDeclaredMethod("setData", int.class, int.class);
		method.invoke(object, new Integer(5), new Integer(6));

		Method method2 = loadedClass.getDeclaredMethod("getSum",null);
		method2.setAccessible(true);
		Object rValue = method2.invoke(object,null);

		System.out.println(rValue);

	}

}
