package com.example.ui;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main1 {

	public static void main(String[] args) {
		
		String s1="Country Name";
		String s2="Capital City";
		String s3="Republic Date";
		String s4="Independence Date";
		
		String s5="INDIA";
		String s6="NEW DELHI";
		
		
		Calendar calendar1=Calendar.getInstance();
		calendar1.set(1947, 7, 15);
		Date d1=calendar1.getTime();
		
		Calendar calendar2=Calendar.getInstance();
		calendar2.set(1950, 0, 26);
		Date d2=calendar2.getTime();
		
		
		System.out.println(d1);
		System.out.println(d2);
		Map m=new TreeMap<>();
		
		m.put(s1, s5);
		m.put(s2, s6);
		m.put(s3, d1);
		m.put(s4, d2);
		System.out.println(m);

	}

}
