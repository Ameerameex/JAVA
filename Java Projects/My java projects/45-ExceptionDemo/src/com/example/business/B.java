package com.example.business;

import java.io.IOException;
import java.text.ParseException;

public class B extends A {
	
	@Override
	public void print(int n) throws IOException, RuntimeException  {
		
		if(n==100){
			
			IOException exception=new IOException();
			
			throw exception;
		}
		
		if(n==200){
			
			RuntimeException exception=new RuntimeException();
			throw exception;
		}
		
         System.out.println(n*n);
		
		
	}

}
