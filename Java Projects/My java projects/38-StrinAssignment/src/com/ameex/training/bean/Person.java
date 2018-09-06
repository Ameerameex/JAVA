package com.ameex.training.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	
	private String name;
	private Date dataOfBirth;
	public Person(String name, Date dataOfBirth) {
		super();
		this.name = name;
		this.dataOfBirth = dataOfBirth;
	}
	
	public int getDaysCount(){
		Date date=new Date();
		long l=(date.getTime()-dataOfBirth.getTime())/(24*60*60*1000);
		int i=(int)l;
		
		return i;
	}

}
