package com.example.ui;

import java.text.DecimalFormat;

public class Main5 {

	public static void main(String[] args) {

		DecimalFormat decimalFormat=new DecimalFormat("##,##,###.##"); 
		double a=4670000.00;
		
		String s=decimalFormat.format(a);
		System.out.println(s);
	}

}
