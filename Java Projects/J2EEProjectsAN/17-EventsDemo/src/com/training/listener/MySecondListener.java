package com.training.listener;

import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MySecondListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { 

    	ServletContext context=arg0.getServletContext();
    	context.removeAttribute("appTitle");
    	System.out.println("\t\t ["+new Date()+"]\t\t"+"Title for this application is Removed");


    	
    	
    }

    public void contextInitialized(ServletContextEvent arg0)  { 

    	ServletContext context=arg0.getServletContext();
    	context.setAttribute("appTitle","Category Portal");
    	System.out.println("\t\t ["+new Date()+"]\t\t"+"Title for this application set as Category Poratl");
    }
	
}
