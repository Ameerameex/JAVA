package com.example.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.example.business.Department;
import com.example.business.Employee;

import com.example.db.DepartmentDAO;
import com.example.db.EmployeeDAO;
import com.example.db.MySQLEmployeeDAOImplementation;
import com.example.db.MySQLEmployeeDAOImplementation2;
import com.example.db.MySQLEmployeeDAOImplementation3;

public class Main2 {

	public static void main(String[] args) throws Throwable {
		Scanner scanner = new Scanner(System.in);
		OutputUtil outputUtil = new OutputUtil();

		int choice = 0;
		do {
			System.out.println();
			outputUtil.printData("\t\t 1.ADD Employee", 15, Alignments.RIGHT);
			System.out.println("\t\t 2.SEARCH Employee");
			System.out.println("\t\t 3.EDIT Employee");
			System.out.println("\t\t 4.DISPLAY ALL Employees");
			System.out.println("\t\t 5.DELETE Employee");
			System.out.println("\t\t 6.EXIT");
			System.out.println("\n\n");
			System.out.println("\t\tEnter your Choice :");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n\n\n");
				System.out.println("\t\t New Employee ");
				System.out.println("\n\n\n");

				System.out.print("\t\t Employee Name :");
				String name = scanner.next();

				System.out.print("\t\t Basic Salary :");
				double basicSalary = scanner.nextDouble();
				
				System.out.println("\t\t Grade :");
				char grade=scanner.next().charAt(0);
				
				System.out.println("\t\t DataOfJoin :");
				String string=scanner.next();
				Date date=new SimpleDateFormat("dd-MM-yyyy").parse(string);
				
				System.out.println("\t\t Department Id :");
				int did=scanner.nextInt();
				

				Employee employee=new Employee( name, basicSalary, grade, date, did);
				Department department=new Department();
				

				EmployeeDAO employeeDAO=new MySQLEmployeeDAOImplementation3();

				boolean status = employeeDAO.addEmployee( employee);
				if (status) {
					System.out.println("Added");
				} else {
					System.out.println("not added");
				}

				break;
			case 2:
			System.out.println("\n\n\n");
				System.out.println("\t\t Find Product ");
				System.out.println("\n\n\n");

				System.out.print("\t\t product ID to find :");
				int findId = scanner.nextInt();
				Employee employee2=new Employee();
				employee2.setId(findId);
				EmployeeDAO employeeDAO2 = new MySQLEmployeeDAOImplementation3();
				employee2=employeeDAO2.findEmployee(employee2);
				if (employee2 != null) {			
				
					System.out.printf("%-15s%15s%15s%15s%15s%15s%15s%s", "ID\t\t","Name\t\t", "BasicSalary\t\t","Grade\t\t ","DateOfJoin\t\t\t\t","DepartmentId\t","NetSalary\t\t","\n");
					outputUtil.printLine(175);
					System.out.println(employee2);

				}

			 else 
			 {
				System.out.println("department Not Found");
			}

			break;
		case 3:
			System.out.println("\n\n\n");
			System.out.println("\t\t Edit Employee ");
			System.out.println("\n\n\n");

			System.out.print("\t\t Enter the ID to update :");
			int editId1 = scanner.nextInt();

			System.out.print("\t\t Employee Name :");
			String name1 = scanner.next();

			System.out.print("\t\t Basic Salary :");
			double basicSalary1 = scanner.nextDouble();
			
			System.out.println("\t\t Grade :");
			char grade1=scanner.next().charAt(0);
			
			System.out.println("\t\t DataOfJoin :");
			String string1=scanner.next();
			Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(string1);
			
			System.out.println("\t\t Department Id :");
			int did1=scanner.nextInt();

			Employee employee3=new Employee(name1, basicSalary1, grade1, date1, did1);
			employee3.setId(editId1);
			EmployeeDAO employeeDAO3 = new MySQLEmployeeDAOImplementation3();
			Department department2=new Department();
			boolean status3 = employeeDAO3.updateEmployee( employee3);
				if (status3) {
					System.out.println("Updated");
				} else {
				System.out.println("Not Updated");
			}

		break;
			case 4:
				System.out.println("\n\n\n");
				System.out.println("\t\t Display Employee ");
			System.out.println("\n\n\n");
			Employee employee4=new Employee();
			EmployeeDAO employeeDAO4 = new MySQLEmployeeDAOImplementation3();
				List<Employee> employees = employeeDAO4.getAllEmployees(employee4);
				System.out.printf("%-15s%15s%15s%15s%15s%15s%15s%s", "ID\t\t","Name\t\t", "BasicSalary\t\t","Grade\t\t ","DateOfJoin\t\t\t\t","DepartmentId\t","NetSalary\t\t","\n");
				outputUtil.printLine(175);

			for (Employee employee5 : employees) {

				System.out.println(employee5);

				}

				break;
				
		case 5:
				System.out.println("\n\n\n");
			System.out.println("\t\t Delete Employee");
			System.out.println("\n\n\n");
			System.out.print("\t\t Employee ID to Delete:");
			int deleteId = scanner.nextInt();

			Department department4 = new Department();
			Employee employee6=new Employee();
			employee6.setId(deleteId);
			
				EmployeeDAO employeeDAO5= new MySQLEmployeeDAOImplementation3();

			boolean status4 = employeeDAO5.removeEmployee(employee6);
			if (status4) {
					System.out.println("Deleted");
			} else {
				System.out.println("not deleted");
			}

				break;

			}

		} while (choice != 6);
		}
		
}

