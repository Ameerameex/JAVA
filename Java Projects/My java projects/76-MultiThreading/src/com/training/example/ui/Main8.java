package com.training.example.ui;

public class Main8 {

	public static void main(String[] args) {
System.out.println("begins");

Runnable runnable=new GreetCsk();
Thread thread=new Thread(runnable);
thread.start();
try {
	
	thread.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("ends");
System.out.println(thread.isAlive());
System.out.println(Thread.currentThread().isAlive());
	}

}
