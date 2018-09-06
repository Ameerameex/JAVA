package com.example.business;

import java.io.IOException;

public class A {

	public void print(int n) throws IOException, InterruptedException {
		if (n < 0) {
			IOException e = new IOException();

			throw e;

		}
		if (n < 50) {
			InterruptedException e1 = new InterruptedException();
			throw e1;
		}
		System.out.println(n);

	}
}
