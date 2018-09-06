package com.training.listener;

import java.util.Date;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SesisionMonitor implements HttpSessionListener {

    
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println("\t\t [" + new Date() + "]"+arg0.getSession().getId()+"Session Starting...");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  { 

    	System.out.println("\t\t [" + new Date() + "]"+arg0.getSession().getId()+"Session Ending...");
    }
	
}
