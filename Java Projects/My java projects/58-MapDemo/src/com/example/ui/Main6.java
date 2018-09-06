package com.example.ui;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main6 {

	public static void main(String[] args) {

		Map<Integer, String> weekDays=new TreeMap<>();
		
		weekDays.put(1, "Monday");
		weekDays.put(2, "Tuesday");
		weekDays.put(3, "Wednesday");
		weekDays.put(4, "Thursday");
		weekDays.put(5, "Friday");
		weekDays.put(6, "Saturday");
		weekDays.put(7, "Sunday");
		
		Set<Integer> numbers=weekDays.keySet();
		
		for (Integer integer : numbers) {
			
			System.out.println(integer+" "+weekDays.get(integer));
			
		}

		
	}

}
