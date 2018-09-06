package com.example.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.example.business.Circle;

public class Main1 {

	public static void main(String[] args) {
		//Collection<Circle> c1;
		
		
		Integer obj1=new Integer(75);
		Integer obj2=new Integer(45);
		Integer obj3=new Integer(85);
		Integer obj4=new Integer(35);
		Integer obj5=new Integer(48);
		
		List<Integer> c1=new ArrayList<>();
		
		c1.add(obj1);
		c1.add(obj2);
		c1.add(obj3);
		c1.add(obj4);
		c1.add(obj5);
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
	

		//c1.clear();
		System.out.println(c1.isEmpty());
		System.out.println(c1.size());
		
		Integer searchObject=new Integer(85);
		
		System.out.println(c1.contains(searchObject));	
		System.out.println(c1.contains(1000));
		//c1.remove(obj4);
		System.out.println(c1.size());
		System.out.println(c1.contains(35));
		
		
		System.out.println(c1.get(0));
		System.out.println(c1.get(2));
		System.out.println(c1.indexOf(new Integer(85)));
		c1.set(0, 1000);
		System.out.println(c1);
		

	}

}
