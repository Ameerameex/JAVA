package com.training.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.training.business.Employee;
import com.training.db.EmployeeDAO;
import com.training.db.EmployeeDAOImpl;


public class Main1 {

	public static void main(String[] args) throws Throwable {

		Scanner scanner = new Scanner(System.in);
		//OutputUtil outputUtil=new OutputUtil();

		int choice = 0;
		do {
			System.out.println();
			System.out.println("\t\t 1.ADD EMPLOYEE");
			System.out.println("\t\t 2.SEARCH EMPLOYEE");
			System.out.println("\t\t 3.EDIT EMPLOYEE");
			System.out.println("\t\t 4.DISPLAY ALL EMPLOYEES");
			System.out.println("\t\t 5.DELETE EMPLOYEE");
			System.out.println("\t\t 6.EXIT");
			System.out.println("\n\n");
			System.out.println("\t\tEnter your Choice :");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n\n\n");
				System.out.println("\t\t New Employee ");
				System.out.println("\n\n\n");

				System.out.print("\t\t Employee ID :");
				int id=scanner.nextInt();
				
				System.out.print("\t\t Employee Name :");
				String name=scanner.next();
				
				System.out.print("\t\t Employee Salary :");
				double basiSalary=scanner.nextDouble();
				System.out.print("\t\t Employee Age :");
				int age=scanner.nextInt();
				
EmployeeDAO dao=new EmployeeDAOImpl();
				Employee employee=new Employee(id, name, basiSalary, age);
boolean status=dao.addEmployee(employee);

				
				if(status){
					System.out.println("Added");
				}
				else{
					System.out.println("not added");
				}
				
				break;
			case 2:
				System.out.println("\n\n\n");
				System.out.println("\t\t Find Employee ");
				System.out.println("\n\n\n");
				
				System.out.print("\t\t Employee ID to find :");
				int findId=scanner.nextInt();

EmployeeDAO dao2=new EmployeeDAOImpl();		
 Employee employee2=dao2.findEmployee(findId);
	System.out.printf("%15s%15s%15s%15s%s","ID","NAME\t","BASICSALARY","AGE","\n" );

				if(employee2!=null){
					System.out.println(employee2);
				}
				else{
					System.out.println("Employee Not Found");
				}
				
				break;
			case 3:
				System.out.println("\n\n\n");
				System.out.println("\t\t Edit Employee ");
				System.out.println("\n\n\n");
				
				
				System.out.print("\t\t Employee ID :");
				int editId1=scanner.nextInt();
				
				System.out.print("\t\t Employee Name :");
				String name1=scanner.next();
				
				System.out.print("\t\t Employee salary :");
				double salary1=scanner.nextDouble();
				System.out.print("\t\t Employee Age :");
				int age1=scanner.nextInt();
				EmployeeDAO dao3=new EmployeeDAOImpl();
				Employee  employee3=new Employee(editId1, name1, salary1, age1);
				
				boolean status3=dao3.updateEmpoyee(employee3);
				if(status3){
					System.out.println("Updated");
				}
				else{
					System.out.println("Not Updated");
				}
			
				
				break;
			case 4:
				System.out.println("\n\n\n");
				System.out.println("\t\t Display Product ");
				System.out.println("\n\n\n");
   
				EmployeeDAO dao4=new EmployeeDAOImpl();
				List<Employee> employees=dao4.getAllEmployees();
				System.out.printf("%15s%15s%15s%15s%s","ID","NAME\t","BASICSALARY","AGE","\n" );
				
				for (Employee employee4: employees) {
					
					System.out.println(employee4);
					
				}
				
				break;
			case 5:
				System.out.println("\n\n\n");
				System.out.println("\t\t Delete Employee ");
				System.out.println("\n\n\n");
				System.out.print("\t\t Employee ID to Delete:");
				int deleteId=scanner.nextInt();
				
				Employee employee4=new Employee();
				employee4.setEmpid(deleteId);
				EmployeeDAO dao5=new EmployeeDAOImpl();
				
				boolean status4=dao5.deleteEmployee(employee4);
				if(status4){
					System.out.println("Deleted");
				}
				else{
					System.out.println("not deleted");
				}
				
				break;
				
			
			
			
			}

		} while (choice != 6);
		
		
		
	}

}
