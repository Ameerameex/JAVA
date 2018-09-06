package com.training.example.ui;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.training.example.tasks.SeriesSummer;

public class Main1 {

	public static void main(String[] args) {
	
		SeriesSummer seriesSummer=new SeriesSummer(1,10);
		SeriesSummer seriesSummer2=new SeriesSummer(11,20);
		SeriesSummer seriesSummer3=new SeriesSummer(21,30);
		SeriesSummer seriesSummer4=new SeriesSummer(31,40);
		SeriesSummer seriesSummer5=new SeriesSummer(41,50);
		SeriesSummer seriesSummer6=new SeriesSummer(51,60);
		SeriesSummer seriesSummer7=new SeriesSummer(61,70);
		SeriesSummer seriesSummer8=new SeriesSummer(71,80);
		SeriesSummer seriesSummer9=new SeriesSummer(81,90);
		SeriesSummer seriesSummer10=new SeriesSummer(91,100);
		
//		ExecutorService executorService=Executors.newSingleThreadExecutor();
//		
//		executorService.execute(seriesSummer);
//		executorService.execute(seriesSummer2);
//		executorService.execute(seriesSummer3);
//		executorService.execute(seriesSummer4);
//		executorService.execute(seriesSummer5);
//		executorService.execute(seriesSummer6);
//		executorService.execute(seriesSummer7);
//		executorService.execute(seriesSummer8);
//		executorService.execute(seriesSummer9);
//		executorService.execute(seriesSummer10);


ScheduledExecutorService executorService2 =Executors.newScheduledThreadPool(3);
executorService2.scheduleWithFixedDelay(seriesSummer, 2000, 1000, TimeUnit.MILLISECONDS);
		
		
	}

}
