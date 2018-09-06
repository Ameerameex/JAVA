package com.example.ui;

public class Client4 {

	public static void main(String[] args) {
		
		String string=new String("CHENNAI");
		
		String string2=new String("chennai");
		
		System.out.println(string.compareTo(string2));
		System.out.println(string.compareToIgnoreCase(string2));
		System.out.println(string.equalsIgnoreCase(string2));
	}

}
