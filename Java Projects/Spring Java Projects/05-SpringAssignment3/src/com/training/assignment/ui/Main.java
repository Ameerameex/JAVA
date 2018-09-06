package com.training.assignment.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println(applicationContext.getBean("companyBean"));
	}

}
