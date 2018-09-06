package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Shape;

public class Main1 {

	public static void main(String[] args) {

ApplicationContext applicationContext;
		
		applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
		
		Shape shape=(Shape) applicationContext.getBean("myshapebean");
		
		System.out.println(shape.getArea());
		System.out.println(shape);
	}

}