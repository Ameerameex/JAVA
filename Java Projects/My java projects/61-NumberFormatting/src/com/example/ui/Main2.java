package com.example.ui;

import java.text.NumberFormat;

import com.example.business.Employee;

public class Main2 {

	public static void main(String[] args) {
		
		Employee employee1;
		employee1=new Employee(2051, "John Abraham", 45500.00, 'A');
		
		Employee employee2;
		employee2=new Employee(2052, "Megala Devi", 22800.00, 'B');
		
		Employee employee3;
		employee3=new Employee(2053, "Arnab", 37200.00, 'A');
		
		Employee employee4;
		employee4=new Employee(2053, "Smitha Patel", 26300.00, 'A');
		
		Employee employee5;
		employee5=new Employee(2053, "Gourav ", 35760.00, 'A');
		
		
		Employee [] employees=new Employee[5];
		employees[0]=employee1;employees[1]=employee2;
		employees[2]=employee3;employees[3]=employee3;
		employees[4]=employee5;
		NumberFormat format=NumberFormat.getInstance();
		format.setGroupingUsed(true);
		format.setMinimumFractionDigits(2);
		format.setMaximumFractionDigits(5);
		for(Employee employee:employees) {
			System.out.println("\n");
			System.out.print("\t"+employee.getId());
			System.out.printf("%20s",employee.getName());
			
			System.out.print("\t"+format.format(employee.getBasicSalary()));
			System.out.print("\t"+employee.getGrade());
			System.out.print("\t"+format.format(employee.getNetSalary()));
			System.out.print("\t"+format.format(employee.getAllowance()));
			System.out.print("\t"+format.format(employee.getDeduction()));

			
		}
	}

}
