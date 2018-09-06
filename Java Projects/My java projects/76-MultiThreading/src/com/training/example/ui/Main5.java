package com.training.example.ui;

public class Main5 {

	public static void main(String[] args) {

		ApolloPrintingTask apolloPrintingTask = new ApolloPrintingTask();
		Thread thread, thread3, thread5;
		thread = new Thread(apolloPrintingTask);
		thread.start();

		TourismPrintingTask printingTask = new TourismPrintingTask();

		thread3 = new Thread(printingTask, "Tourism Printing Task");
		thread3.start();

		OxygenPrintingTask oxygenPrintingTask = new OxygenPrintingTask();

		thread5 = new Thread(oxygenPrintingTask, "Oxygen Printing Task");

		thread5.start();
	}

}
