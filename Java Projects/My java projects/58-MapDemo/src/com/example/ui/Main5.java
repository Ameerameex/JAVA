package com.example.ui;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main5 {

	public static void main(String[] args) {

		Map<String,Integer> m;
		m=new TreeMap<>();
		m.put("Minimum", 12);

		m.put("Maximum",new Integer(218));
		m.put("Maximum", 315);
		m.put("Minimum", 12);
		Integer m1=m.get("Minimum");
		Integer m2=m.get("Maximum");

		System.out.println(m1);
		System.out.println(m2);

		System.out.println(m);
		
	Set<String> keys=	m.keySet();
	
	System.out.println(keys);
	Collection<Integer> values=	m.values();
	System.out.println(values);

	
	
	

	}

}
