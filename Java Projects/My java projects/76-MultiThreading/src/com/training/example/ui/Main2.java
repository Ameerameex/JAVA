package com.training.example.ui;

public class Main2 {

	public static void main(String[] args) {

		Thread namePrintingThread=new NamePrintingThread();
		namePrintingThread.setName("Name Printing Thread");
		namePrintingThread.start();
		System.out.println(namePrintingThread.getName());
		
		Thread numberPrintingThread=new NumberPrintingThread();
		numberPrintingThread.setName("Reverse Number Printing");
		numberPrintingThread.start();
		System.out.println(numberPrintingThread.getName());
		Thread thread=new IPLTeamsPrintingThread("IPL");
		thread.start();
	}
}
