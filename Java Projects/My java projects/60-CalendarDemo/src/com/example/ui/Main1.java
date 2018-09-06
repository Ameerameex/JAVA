package com.example.ui;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main1 {

	public static void main(String[] args) {
		

		Calendar calendar;
		calendar=new GregorianCalendar();
		System.out.println(calendar.getTime());
		
		Calendar calendar2=Calendar.getInstance();
		
		System.out.println(calendar2.getTime());
		
		System.out.println(calendar2.getTimeInMillis());
		
		
	}

}
