package com.training.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Circle;

public class Main4 {
	
	
  public static void main(String[] args) {
	
	  ApplicationContext appletContext=new ClassPathXmlApplicationContext("beans3.xml");
	  
	 
System.out.println(appletContext.getBean("bankManagerBean"));
System.out.println(appletContext.getBean("salesExecutiveBean"));
	  
}
}
