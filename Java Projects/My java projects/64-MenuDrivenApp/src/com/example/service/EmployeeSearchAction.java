//package com.example.service;
//
//import com.example.business.Department;
//import com.example.business.Employee;
//import com.example.ui.EmployeeOutputUtil;
//import com.example.ui.InputUtil;
//import com.example.ui.OutputUtil;
//
//public class EmployeeSearchAction extends Action{
//
//	@Override
//	public	void displayTitle() {
//		System.out.println("\n");
//	System.out.println("\t\t Searching Employee Data");
//	new OutputUtil().printLine(50);
//	System.out.println();		
//	}
//
//	@Override
//	public	void execute() {
//		
//		int id;
//		InputUtil inputUtil=new InputUtil();
//		inputUtil.prompt("Enter Id to Search");
//		id=inputUtil.readIntInput();
//		
//		ApplicationData applicationDate=ApplicationData.getInstance();
//		Department department=applicationDate.getDepartment();
//		Employee employee= department.findEmployee(id);
//		
//		
//		if(employee==null){
//			status=false;
//		}
//			else
//			{
//				status=true;
//			}
//		
//	
//	EmployeeOutputUtil util=new EmployeeOutputUtil();
//	util.display(employee);
//}
//
//	@Override
//	public	void displayStatus() {
//		if(status==true)
//		{
//			System.out.println();
//			System.out.println("\t\t Employee found Successfully");
//			System.out.println();
//		}else
//		{
//			System.out.println();
//			System.out.println("\t\tFailed");
//			System.out.println();
//		}
//	
//	
//	}
//}
