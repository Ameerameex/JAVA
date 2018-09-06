package com.example.ui;



import com.example.business.A;
import com.example.business.C;
import com.example.business.C.D;
import com.example.business.E;


public class Application {

	public static void main(String[] args) {
		
		A obj=new A(5,10);
		obj.test2();
		
		
	C.D obj1=new C.D();	
	
	System.out.println();
	
	obj1.test();
	
	E obj2=new E(4, 6);
	obj2.printResults();
		
	}

}
