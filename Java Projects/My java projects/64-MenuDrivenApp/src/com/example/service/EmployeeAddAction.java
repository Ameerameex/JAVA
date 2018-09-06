//package com.example.service;
//
//import java.util.Date;
//
//import com.example.business.Department;
//import com.example.business.Employee;
//import com.example.ui.InputUtil;
//import com.example.ui.OutputUtil;
//
//public class EmployeeAddAction extends Action
//{
//
//	@Override
//	public	void displayTitle() {
//
//		
//		
//		System.out.println("\n");	
//	System.out.println("\t\t New Employee Data");
//	
//	new OutputUtil().printLine(50);
//	System.out.println();		
//	}
//
//	@Override
//	public void execute() {
//	int id;
//	String name;
//	char grade;
//	double basicSalary;
//	Date dateofJoin;
//	
//	InputUtil inputUtil=new InputUtil();
//	inputUtil.prompt("Enter ID");
//	id=inputUtil.readIntInput();
//	
//	inputUtil.prompt("Enter name");
//	name=inputUtil.readStringInput();
//	
//	inputUtil.prompt("Enter grade");
//	grade=inputUtil.readCharInput();
//	
//	
//	inputUtil.prompt("Enter basic Salary");
//	basicSalary=inputUtil.readDoubleInput();
//	
//	inputUtil.prompt("Enter date of Join");
//	dateofJoin=inputUtil.readDateInput();
//	
//	
//	Employee employee=new Employee(id, name, basicSalary, grade, dateofJoin);
//	
//	
//	ApplicationData applicationDate=ApplicationData.getInstance();
//	Department department=applicationDate.getDepartment();
//	status=department.addEmployee(employee);
//	
//	
//	
//	}
//
//	@Override
//	public	void displayStatus() {
//		if(status==true)
//		{
//			System.out.println();
//			System.out.println("\t\t Employee Added Successfully");
//			System.out.println();
//		}else
//		{
//			System.out.println();
//			System.out.println("\t\tFailed");
//			System.out.println();
//		}
//		
//	}
//
//}