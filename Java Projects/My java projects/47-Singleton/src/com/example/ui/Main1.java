
package com.example.ui;

import com.example.business.IdGenerator;

public class Main1 {

	public static void main(String[] args) {

		IdGenerator generator;
		generator=IdGenerator.getInstance();
		System.out.println(generator.getNumber());
		System.out.println(generator.getNumber());
		System.out.println(generator.getNumber());
		System.out.println(generator.getNumber());
		System.out.println(generator.getNumber());

		IdGenerator generator2;
		generator2=IdGenerator.getInstance();
		System.out.println(generator2.getNumber());
		System.out.println(generator2.getNumber());
		System.out.println(generator2.getNumber());
		System.out.println(generator2.getNumber());
		System.out.println(generator2.getNumber());
		

	}

}
