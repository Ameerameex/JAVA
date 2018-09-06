package com.example.ui;

import java.io.IOException;

import com.example.business.A;
import com.example.business.B;

public class Client8 {

	public static void main(String[] args) {

		A obj=new B();
		
		try {
			obj.print(200);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
