package com.example.ui;

import java.text.NumberFormat;

public class Main3 {

	public static void main(String[] args) {

double a=0.05;
NumberFormat format=NumberFormat.getPercentInstance();
String s= format.format(a);

System.out.println(s);
}

}
