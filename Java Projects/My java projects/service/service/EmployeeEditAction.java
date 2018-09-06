package com.example.service;

import com.example.ui.InputUtil;
import com.example.ui.OutputUtil;

public class EmployeeEditAction extends Action {

	@Override
	public
	void displayTitle() {
		System.out.println("\n");
	System.out.println("\t\t Searching Employee Data");
	System.out.println();		
	}

	@Override
	public
	void execute() {
		int id;
		InputUtil inputUtil=new InputUtil();
		inputUtil.prompt("Enter Id to Edit");
		new OutputUtil().printLine(50);
		id=inputUtil.readIntInput();
		
	}

	@Override
	public
	void displayStatus() {
		if(status==true)
		{
			System.out.println();
			System.out.println("\t\t Employee found Successfully");
			System.out.println();
		}else
		{
			System.out.println();
			System.out.println("\t\tFailed");
			System.out.println();
		}
	
	
	}

}
