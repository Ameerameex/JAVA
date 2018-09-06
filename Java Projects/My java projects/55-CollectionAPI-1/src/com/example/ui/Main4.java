package com.example.ui;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		
		
		List<Double> values=new ArrayList<Double>();
		values.add(new Double(100.00));
		values.add(new Double(110.00));
		values.add(new Double(120.00));
		values.add(new Double(130.00));
		values.add(new Double(140.00));
		values.add(new Double(150.00));
		values.add(new Double(160.00));
		values.add(new Double(170.00));
		values.add(new Double(180.00));
		values.add(new Double(190.00));
		values.add(new Double(200.00));
		System.out.println(values.add(210.00));
		List<Double> duplicate=new ArrayList();

		System.out.println(duplicate.size());
		
		duplicate.addAll(values);
		
		
		System.out.println(duplicate.size());
		
		List<Double> subList =new ArrayList();

		subList.add(new Double(120.00));
		subList.add(new Double(130.00));
		subList.add(new Double(140.00));
		subList.add(new Double(150.00));
		subList.add(new Double(160.00));

		
		//values.removeAll(subList);
		values.retainAll(subList);
		System.out.println(values);
		


	}

}
