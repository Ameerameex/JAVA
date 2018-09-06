package com.example.ui;

import java.util.Calendar;

public class Main3 {
	
	public static void main(String[] args) {
		
	
	
	Calendar calendar=Calendar.getInstance();
	
	System.out.println(calendar.getFirstDayOfWeek());
	System.out.println(calendar.DAY_OF_MONTH);
	System.out.println(calendar.WEEK_OF_YEAR);
calendar.add(calendar.DATE, -5);
System.out.println(calendar.getTime());
calendar.add(calendar.MONTH, 2);
System.out.println(calendar.getTime());

}
}