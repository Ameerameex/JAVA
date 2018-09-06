package com.example.ui;

import com.example.business.Employee;

public class Client2 {

	public static void main(String[] args) {
		
		Employee employee=new Employee(1001, 10000);
		
		Employee employee2=new Employee(1002, 5000);
		
		System.out.println(employee.compareTo(employee2));
	}

}
