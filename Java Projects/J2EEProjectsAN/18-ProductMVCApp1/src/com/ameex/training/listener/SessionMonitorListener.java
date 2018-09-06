package com.ameex.training.listener;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionMonitorListener implements HttpSessionAttributeListener, HttpSessionListener {

    public void sessionCreated(HttpSessionEvent arg0)  { 

    	HttpSession httpSession=arg0.getSession();
    	ServletContext context=arg0.getSession().getServletContext();
    	
		System.out.println("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		context.log("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		System.out.println("\t\t[" + httpSession.getId()+"started...");
		context.log("\t\t[" + httpSession.getId()+"started...");


    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	HttpSession httpSession=arg0.getSession();
    	ServletContext context=arg0.getSession().getServletContext();

    	System.out.println("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		context.log("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		System.out.println("\t\t[" + httpSession.getId()+"Destroyed...");
		context.log("\t\t[" + httpSession.getId()+"Destroyed...");

    }

	
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 

    	HttpSession httpSession=arg0.getSession();
    	ServletContext context=arg0.getSession().getServletContext();

    	System.out.println("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		context.log("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		System.out.println("\t\t["+arg0.getValue()+"Added");
		context.log("\t\t["+arg0.getValue()+"Added");

    }

	
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 

    	HttpSession httpSession=arg0.getSession();
    	ServletContext context=arg0.getSession().getServletContext();

    	System.out.println("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		context.log("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		System.out.println("\t\t["+arg0.getValue()+"Removed");
		context.log("\t\t["+arg0.getValue()+"Removed");

    }

	
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 

    	HttpSession httpSession=arg0.getSession();
    	ServletContext context=arg0.getSession().getServletContext();

    	System.out.println("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		context.log("\t\t ["+new SimpleDateFormat("dd-MM-yyyy hh:mm:ss").format(new Date()));
		System.out.println("\t\t["+arg0.getValue()+"Replaced");
		context.log("\t\t["+arg0.getValue()+"Replaced");
    }
	
}
