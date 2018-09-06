package com.example.ui;

import com.example.business.Docter;

public class Client5 {

	public static void main(String[] args) {

		
		Docter docter=new Docter("Vetri", 5.00, 20);
		Docter docter1=new Docter("suriya", 100.00, 30);
		
		int r=docter.compareTo(docter1);
		if(r!=0){
			System.out.println("not equal");
		}
		else if(r==0){
			System.out.println("Equal");
		}

	}

}
