package com.training.ui;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.training.business.Circle;

public class Main1 {
	
	
  public static void main(String[] args) {
	
	  ApplicationContext appletContext=new FileSystemXmlApplicationContext("C:\\Users\\User\\Desktop\\beans.xml");
	  
	  Circle c1,c2;
	  c1=(Circle) appletContext.getBean("circleBean");
	  c2=(Circle) appletContext.getBean("circleBean");
	  System.out.println(c1);
	  System.out.println(c2);
	  c1.setRadius(10);
	 
	  System.out.println(c1);
	  System.out.println(c2);
	  c1=null;
	  System.gc();

	  
}
}
