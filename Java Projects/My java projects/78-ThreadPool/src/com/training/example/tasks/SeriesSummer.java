package com.training.example.tasks;

public class SeriesSummer implements Runnable{
	
	int start,end;
	
	

	public SeriesSummer(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}



	@Override
	public void run() {
		int sum=0;
		for(int i=start; i<=end; i++) {
			sum=sum+i;
		}
		
		System.out.println("\t\t ["+ Thread.currentThread().getName());
		System.out.println("\t\t  "+ start+ "...."+ end +" :" + sum + "]");
		
	}

}
