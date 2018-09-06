package com.training.listener;

import java.util.Date;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class SessionDataMonitor implements HttpSessionAttributeListener {


    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	
    	System.out.println("\t\t [" + new Date() + "]"+arg0.getSession().getId());
    	System.out.println("\t\t [" + new Date() + "]"+arg0.getName()+","+arg0.getValue()+"Added to Session");

    }


    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
 
    	System.out.println("\t\t [" + new Date() + "]"+arg0.getSession().getId());
    	System.out.println("\t\t [" + new Date() + "]"+arg0.getName()+","+arg0.getValue()+"Removed from Session");

    
    }

                 
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
    }
	
}
