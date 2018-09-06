package com.example.ui;

import java.text.NumberFormat;

public class Main4 {

	public static void main(String[] args) {

		
		double profit=156733316.88;
		NumberFormat format=NumberFormat.getCurrencyInstance();
		
		
		
		System.out.println(format.format(profit));

		
	}

}
