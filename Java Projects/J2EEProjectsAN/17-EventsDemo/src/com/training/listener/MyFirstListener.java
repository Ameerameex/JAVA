package com.training.listener;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.training.business.Category;

public class MyFirstListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {

		System.out.println("\t\t["+new Date()+"]\t\t"+"The Web Application Stopped.......");

		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("\t\t["+new Date()+"]\t\t"+"The Web Application Started.......");

		Category category=new Category(65,"Air Conditioner");
		Category category2=new Category('T',"Television");
		Category category3=new Category('L',"Laptop");
		Category category4=new Category('M',"Mobile");
		
		List<Category> categories=new ArrayList<>();
		categories.add(category);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		
		ServletContext context=arg0.getServletContext();
		context.setAttribute("categories", categories);

		System.out.println("\t\t["+new Date()+"]\t\t"+"Category Objects Loaded.......");

 	}

	
}
