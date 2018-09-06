package com.training.ui;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date createDate(int year,int month,int date){
		
		Calendar calendar=Calendar.getInstance();
		
		calendar.set(Calendar.YEAR,year);
		calendar.set(Calendar.MONTH,month);
		calendar.set(Calendar.DATE,date);
		Date date1=calendar.getTime();
		
		return date1;
	}
}
