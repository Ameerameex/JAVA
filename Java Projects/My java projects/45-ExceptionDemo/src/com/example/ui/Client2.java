package com.example.ui;

public class Client2 {

	public static void main(String[] args) {
		
		System.out.println("\n\t\t Program Beginning......");
        
		
		try {
			String str="";
			System.out.println("\n\n\t\t "+str.charAt(0));
			System.out.println("\n\n\t\t "+str.charAt(str.length()-1));
		} catch (StringIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		
		System.out.println("\n\t\t Program Completed......");

	}

}
