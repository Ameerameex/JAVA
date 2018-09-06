//package com.example.service;
//
//import java.util.List;
//
//import com.example.business.Department;
//import com.example.business.Employee;
//import com.example.ui.EmployeeOutputUtil;
//
//public class EmployeeDisplayAllAction extends Action {
//
//	@Override
//	public void displayTitle() {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void execute() {
//		ApplicationData applicationDate=ApplicationData.getInstance();
//		Department department=applicationDate.getDepartment();
//
//		List<Employee> employees=department.getEmployees();
//		if(employees!=null && employees.size()>0){
//			status=true;
//			EmployeeOutputUtil util=new EmployeeOutputUtil();
//			util.display(employees);
//		}
//		else{
//			status=false;
//		}
//		
//	}
//
//	@Override
//	public void displayStatus() {
//		if(status==false){
//			System.out.println("No Employees Found");
//		}
//
//	}
//
//}
