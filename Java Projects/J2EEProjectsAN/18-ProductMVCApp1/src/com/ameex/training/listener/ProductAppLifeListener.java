package com.ameex.training.listener;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.ameex.training.business.Category;


public class ProductAppLifeListener implements ServletContextListener {

  
    public void contextDestroyed(ServletContextEvent arg0)  { 

    	ServletContext context=arg0.getServletContext();
		context.removeAttribute("categories");
		System.out.println("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		System.out.println("\t\t [ Category Objects removed....");
		
		context.log("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		context.log("\t\t [ Category Objects removed....");
    }


    public void contextInitialized(ServletContextEvent arg0)  { 

    	Category category=new Category('L',"LAPTOP");
		Category category2=new Category('M',"MOBILE");
		Category category3=new Category('T',"TELEVISION");
		Category category4=new Category('A',"AIR CONDITIONER");
		
		List<Category> categories=new ArrayList<>();
		categories.add(category);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		ServletContext context=arg0.getServletContext();
		context.setAttribute("categories",categories);
		System.out.println("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		System.out.println("\t\t [ Category Objects Loaded....");
		
		context.log("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		context.log("\t\t [ Category Objects Loaded....");

    }
	
}
