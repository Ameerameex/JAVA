package com.training.example.ui;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {

		System.out.println("begin");
		Runnable r = new Runnable() {

			@Override
			public void run() {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter Your Age");
int age=scanner.nextInt();
System.out.println(age);


			}
		};
		Thread t = new Thread(r);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("ends");
System.out.println(t.isAlive());
System.out.println(Thread.currentThread().isAlive());

	}

}
