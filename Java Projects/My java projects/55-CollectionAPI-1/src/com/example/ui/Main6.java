package com.example.ui;

import java.util.HashSet;
import java.util.Set;

public class Main6 {

	public static void main(String[] args) {
		
		
		Set<Integer> myNumbers=new HashSet<>();
		
		System.out.println(myNumbers.add(new Integer(10)));
		System.out.println(myNumbers.add(new Integer(20)));
		System.out.println(myNumbers.add(new Integer(30)));
		System.out.println(myNumbers.add(new Integer(40)));
		System.out.println(myNumbers.add(new Integer(50)));
		
		
		System.out.println(myNumbers.add(new Integer(30)));
        System.out.println(myNumbers);
        Set<String> myName=new HashSet<>();
        
        System.out.println(myName.add("Suriya"));
        System.out.println(myName.add("kumar"));
        System.out.println(myName.add("Ameer"));
        System.out.println(myName.add("dhoni"));
        System.out.println(myName.add("vijay"));
        System.out.println(myName);
        System.out.println(myName);

        System.out.println(myName.size());
        System.out.println(myName.contains("Suriya"));
        for (String string : myName) {
			
        	System.out.println(string);
		}
        
        myName.clear();
        System.out.println(myName.isEmpty());
        
        

	}

}
