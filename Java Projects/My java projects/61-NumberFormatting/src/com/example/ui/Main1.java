package com.example.ui;

import java.text.NumberFormat;

import com.example.business.Employee;

public class Main1 {

	public static void main(String[] args) {
		
		Employee employee;
		employee=new Employee(2051, "John Abraham", 45000.00, 'A');
		
		System.out.println(employee.getBasicSalary());
		System.out.println(employee.getNetSalary());
		System.out.printf("%4.2f",employee.getBasicSalary());
		NumberFormat numberFormat=NumberFormat.getInstance();
		System.out.println();
		
		numberFormat.setGroupingUsed(true);
		numberFormat.setMinimumFractionDigits(3);
		numberFormat.setMaximumFractionDigits(10);
		//numberFormat.setMinimumIntegerDigits(10);
		String s=numberFormat.format(employee.getBasicSalary());
		System.out.println(s);
		

	}

}
