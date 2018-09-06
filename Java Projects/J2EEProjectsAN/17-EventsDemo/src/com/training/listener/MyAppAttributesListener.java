package com.training.listener;

import java.util.Date;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class MyAppAttributesListener implements ServletContextAttributeListener {

	public void attributeAdded(ServletContextAttributeEvent arg0) {
		System.out.println("\t\t [" + new Date() + "]\t\t" + "attribute adding to context...");

		System.out.println("\t\t [" + new Date() + "]" + arg0.getName() + "," + arg0.getValue());

	}

	public void attributeRemoved(ServletContextAttributeEvent arg0) {
		System.out.println("\t\t [" + new Date() + "]\t\t" + "attribute removing from context...");

		System.out.println("\t\t [" + new Date() + "]" + arg0.getName() + "," + arg0.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent arg0) {

		System.out.println("\t\t [" + new Date() + "]\t\t" + "attribute replacing in context...");

		System.out.println("\t\t [" + new Date() + "]" + arg0.getName() + "," + arg0.getValue());
	}

}
