package com.training.example.ui;

public class IPLTeamsPrintingThread extends Thread{

	String[] teams={"CSK","SRH","DD","KKR"};
	
	public IPLTeamsPrintingThread(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		
		for (String string : teams) {
			
			System.out.println("\t\t\t"+Thread.currentThread()+"\t"+string);
			
		}
		
		
	}
	
}
