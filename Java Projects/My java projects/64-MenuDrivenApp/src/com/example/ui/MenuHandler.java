//package com.example.ui;
//
//import com.example.service.Action;
//import com.example.service.EmployeeAddAction;
//import com.example.service.EmployeeDisplayAllAction;
//import com.example.service.EmployeeEditAction;
//import com.example.service.EmployeeRemoveAction;
//import com.example.service.EmployeeSearchAction;
//import com.example.service.ExitAction;
//
//public class MenuHandler {
//
//	public void displayMenu() {
//String[] menuItems=new String[6];
//menuItems[0]="Add Employee Data";
//menuItems[1]="Search Employee Data";
//menuItems[2]="Edit Employee Data";
//menuItems[3]="Remove Employee Data";
//menuItems[4]="Display Employee Data";
//menuItems[5]="Exit";
//
//
//for (int i = 0; i < menuItems.length; i++) {
//	
//	System.out.println("\t\t "+(i+1)+"."+menuItems[i]);
//	
//}
//
//
//	}
//
//	public int getChoice() {
//		System.out.println("\n\n\t\t Enter Your Choice :");
//		
//		int choice=new InputUtil().readIntInput();
//		return choice;
//
//		
//	}
//
//	public void dispatchChoice(int choice) {
//		Action action=null;
//		switch (choice) {
//		case 1:
//			action=new EmployeeAddAction();
//			break;
//		case 2:
//			action=new EmployeeSearchAction();
//			break;
//		case 3:
//			action=new EmployeeEditAction();
//			break;
//		case 4:
//			action=new EmployeeRemoveAction();
//			break;
//		case 5:
//			action=new EmployeeDisplayAllAction();
//			break;
//		case 6:
//			action=new ExitAction();
//			break;
//
//		default:System.out.println("\t\t Invalid Choice");
//			break;
//		}
//
//		action.doAction();
//	}
//
//}
