package com.example.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1  {

	public static void main(String[] args) {
		
		Integer obj1=new Integer(75);
		Integer obj2=new Integer(45);
		Integer obj3=new Integer(85);
		Integer obj4=new Integer(35);
		Integer obj5=new Integer(48);
		
		List<Integer> values=new ArrayList<>();
		
		values.add(obj1);
		values.add(obj2);
		values.add(obj3);
		values.add(obj4);
		values.add(obj5);
		System.out.println(values);

		for (Integer integer : values) {
			
			System.out.println(integer);
			
		}
		System.out.println();
		Iterator<Integer> iterator;
		iterator=values.iterator();
		while(iterator.hasNext()){
			
			Integer i=iterator.next();
			if(i==100){
				iterator.remove();
			}
			System.out.println(i);
		}

	}

}
