package com.example.ui;

import java.util.Calendar;

public class Main2 {

	public static void main(String[] args) {
		
		
		Calendar calendar=Calendar.getInstance();
		
System.out.println(calendar.get(1));
System.out.println(calendar.get(2));
System.out.println(calendar.get(5));

calendar.set(calendar.MONTH, 10);
calendar.set(calendar.YEAR, 2030);
System.out.println(calendar.getTime());


Calendar calendar2=Calendar.getInstance();
calendar2.set(2050, 0,26);
System.out.println(calendar2.getTime());

calendar2.set(1995, 11, 31, 10, 30, 22);

System.out.println(calendar2.getTime());





		
	}

}
