package com.training.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Circle;

public class Main3 {

	public static void main(String[] args) {
	
		ApplicationContext appletContext=new ClassPathXmlApplicationContext("beans2.xml");

        System.out.println(appletContext.getBean("customerBean"));
	  
}
}
