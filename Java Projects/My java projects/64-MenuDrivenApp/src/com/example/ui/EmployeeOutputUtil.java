package com.example.ui;

import java.util.List;

import com.example.business.Employee;

public class EmployeeOutputUtil {

	String[] captions;
	
	public EmployeeOutputUtil() {
		super();
		
		captions=new String[]{"ID","NAME","GRADE","DOJ","BASIC SALARY","ALLOWANCES","DEDUCTION","NETSALARY"};
	}

	public  void display(Employee employee){
		OutputUtil outputUtil= new OutputUtil();
		outputUtil.printData(captions[0], 15, Alignments.LEFT);
		outputUtil.printData(employee.getId(), 15, Alignments.RIGHT);
		System.out.println();
		
		outputUtil.printData(captions[1], 15, Alignments.LEFT);
		outputUtil.printData(employee.getName(), 15, Alignments.RIGHT);
		System.out.println();

		
		outputUtil.printData(captions[2], 15, Alignments.LEFT);
		outputUtil.printData(employee.getGrade(), 15, Alignments.RIGHT);
		System.out.println();

		
		outputUtil.printData(captions[3], 15, Alignments.LEFT);
		outputUtil.printData(employee.getDateOfJoin(), 10, Alignments.RIGHT);
		System.out.println();

		
		outputUtil.printData(captions[4], 15, Alignments.LEFT);
		outputUtil.printData(employee.getBasicSalary(), 12,2, Alignments.RIGHT);
		System.out.println();

		
		outputUtil.printData(captions[5], 15, Alignments.LEFT);
		outputUtil.printData(employee.getAllowance(), 12,2, Alignments.RIGHT);
		System.out.println();

		
		outputUtil.printData(captions[6], 15, Alignments.LEFT);
		outputUtil.printData(employee.getDeduction(), 12,2, Alignments.RIGHT);
		System.out.println();

		
		outputUtil.printData(captions[7], 15, Alignments.LEFT);
		outputUtil.printData(employee.getNetSalary(), 12,2, Alignments.RIGHT);
		System.out.println();

		
		
		
		
		
		
		
		
	}

	public  void display(List<Employee> employees){
		
	    OutputUtil outputUtil=new OutputUtil();
		for(String caption: captions){
			outputUtil.printData(caption, 15, Alignments.LEFT);
		}
		System.out.println();
		outputUtil.printLine(60);
		
		for(Employee employee: employees){
			outputUtil.printData(employee.getId(), 15, Alignments.LEFT);
			outputUtil.printData(employee.getName(), 15, Alignments.LEFT);
			outputUtil.printData(employee.getGrade());
			outputUtil.printData(employee.getDateOfJoin(), 15, Alignments.RIGHT);
			outputUtil.printData(employee.getBasicSalary(), 15,2, Alignments.RIGHT);
			outputUtil.printData(employee.getAllowance(), 15,2, Alignments.RIGHT);
			outputUtil.printData(employee.getDeduction(), 15,2, Alignments.RIGHT);
			outputUtil.printData(employee.getNetSalary(), 15,2, Alignments.RIGHT);
			
			System.out.println();
			



		}
		
	}
}
