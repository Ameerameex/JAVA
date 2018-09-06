package com.training.db;

public class DateConversion {

	public static java.sql.Date convertToSQLDate(java.util.Date date){
		
		long ms=date.getTime();
		java.sql.Date sqlDate=new java.sql.Date(ms);
		return sqlDate;
	}
	public static java.util.Date convertToUtilDate(java.sql.Date date){
		

		long ms=date.getTime();
		java.util.Date utilDate=new java.util.Date(ms);
		return utilDate;
	}
	
}
