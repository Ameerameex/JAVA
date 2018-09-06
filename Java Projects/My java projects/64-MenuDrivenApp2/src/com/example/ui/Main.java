package com.example.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.example.business.Department;
import com.example.db.MySQLDepartmentDAOImpl3;

import com.example.db.DepartmentDAO;
import com.example.db.MySQLDepartmentDAOImpl3;

public class Main {

	public static void main(String[] args) throws Throwable {
		Scanner scanner = new Scanner(System.in);
		OutputUtil outputUtil = new OutputUtil();

		int choice = 0;
		do {
			System.out.println();
			outputUtil.printData("\t\t 1.ADD Department", 15, Alignments.RIGHT);
			System.out.println("\t\t 2.SEARCH Department");
			System.out.println("\t\t 3.EDIT Department");
			System.out.println("\t\t 4.DISPLAY ALL Departments");
			System.out.println("\t\t 5.DELETE Department");
			System.out.println("\t\t 6.EXIT");
			System.out.println("\n\n");
			System.out.println("\t\tEnter your Choice :");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n\n\n");
				System.out.println("\t\t New Department ");
				System.out.println("\n\n\n");

				System.out.print("\t\t Department Name :");
				String name = scanner.next();

				System.out.print("\t\t HEAD OF THE Department :");
				String name1 = scanner.next();

				Department department = new Department(name, name1);

				DepartmentDAO dao = new MySQLDepartmentDAOImpl3();

				boolean status = dao.addDepartment(department);
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
				Department department2 = new Department();
				department2.setId(findId);
				DepartmentDAO dao1 = new MySQLDepartmentDAOImpl3();
				department2 = dao1.findDepartment(findId);
				if (department2 != null) {
					System.out.printf("%-15s%15s%20s", "ID", "Department Name\t\t", "Head of the department", "\n");

					System.out.println(department2);
				} else {
					System.out.println("department Not Found");
				}

				break;
			case 3:
				System.out.println("\n\n\n");
				System.out.println("\t\t Edit department ");
				System.out.println("\n\n\n");

				System.out.print("\t\t Enter the ID to update :");
				int editId1 = scanner.nextInt();

				System.out.print("\t\t department Name :");
				String departmentName = scanner.next();

				System.out.print("\t\t Head of the Department :");
				String headOfDepartment = scanner.next();

				Department department3 = new Department(departmentName, headOfDepartment);

				department3.setId(editId1);
				DepartmentDAO dao3 = new MySQLDepartmentDAOImpl3();
				boolean status3 = dao3.updateDepartment(department3);
				if (status3) {
					System.out.println("Updated");
				} else {
					System.out.println("Not Updated");
				}

				break;
			case 4:
				System.out.println("\n\n\n");
				System.out.println("\t\t Display Department ");
				System.out.println("\n\n\n");

				DepartmentDAO dao4 = new MySQLDepartmentDAOImpl3();
				List<Department> departments = dao4.getAllDepartments();
				System.out.printf("%-15s%15s%20s", "ID", "Department Name\t\t", "Head of the department", "\n");

				for (Department department4 : departments) {

					System.out.println(department4);

				}

				break;
			case 5:
				System.out.println("\n\n\n");
				System.out.println("\t\t Delete Department");
				System.out.println("\n\n\n");
				System.out.print("\t\t Department ID to Delete:");
				int deleteId = scanner.nextInt();

				Department department4 = new Department();
				department4.setId(deleteId);
				DepartmentDAO dao5 = new MySQLDepartmentDAOImpl3();

				boolean status4 = dao5.deleteDepartment(department4);
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
