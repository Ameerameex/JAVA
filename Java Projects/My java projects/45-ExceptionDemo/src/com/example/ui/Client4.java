package com.example.ui;

public class Client4 {

	public static void main(String[] args) {
		
		System.out.println("\n\t\t Program Beginning......");

		try{
		String str="44 5";
		int num=Integer.parseInt(str);
		System.out.println(++num);
		}
		catch(Throwable e){
			System.out.println(e.getMessage());
			System.out.println("Input is wrong");
			
		}
		System.out.println("\n\t\t Program Completed......");

	}

}
