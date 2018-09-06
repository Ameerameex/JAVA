package com.example.service;

public class ExitAction extends Action {

	@Override
	public void displayTitle() {
		System.out.println("\n");
		System.out.println("\t\t Quiting the App");
		System.out.println();	
	}

	@Override
	public void execute() {
		
		System.out.println("\t\t....................................................");
	}

	@Override
	public void displayStatus() {
		System.out.println();
		System.out.println("Thank you");
		System.out.println();
		System.exit(0);
	}

}
