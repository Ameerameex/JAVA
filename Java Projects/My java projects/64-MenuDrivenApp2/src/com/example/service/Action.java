package com.example.service;

abstract public class Action {
protected boolean status;
	public abstract void displayTitle();
	public abstract void execute();
	public abstract void displayStatus();
	
	
	public final void doAction(){
		
		displayTitle();
		execute();
		displayStatus();
	}
	
}
