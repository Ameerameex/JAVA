
package com.training.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.training.business.Employee;
import com.training.business.Student;
import com.training.db.EmployeeDAO;
import com.training.db.EmployeeDAOImpl;
import com.training.db.StudentDAO;
import com.training.db.StudentDAOImpl;


public class Main2 {

	public static void main(String[] args) throws Throwable {

		Scanner scanner = new Scanner(System.in);
		//OutputUtil outputUtil=new OutputUtil();

		int choice = 0;
		do {
			System.out.println();
			System.out.println("\t\t 1.ADD STUDENT");
			System.out.println("\t\t 2.SEARCH STUDENT");
			System.out.println("\t\t 3.EDIT STUDENT");
			System.out.println("\t\t 4.DISPLAY ALL STUDENTS");
			System.out.println("\t\t 5.DELETE STUDENT");
			System.out.println("\t\t 6.EXIT");
			System.out.println("\n\n");
			System.out.println("\t\tEnter your Choice :");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n\n\n");
				System.out.println("\t\t New Student ");
				System.out.println("\n\n\n");

				System.out.print("\t\t Student id:");
				int id=scanner.nextInt();
				
				System.out.print("\t\t Student Name :");
				String name=scanner.next();
				
				System.out.print("\t\t Student Average :");
				double average=scanner.nextDouble();
				
				System.out.print("\t\t Student Grade :");
				char grade=scanner.next().charAt(0);
				
				System.out.println("\t\t Date Of Joining :");
				String date=scanner.next();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date uDate=dateFormat.parse(date);
				
               StudentDAO dao=new StudentDAOImpl();
				Student student=new Student(id, name, average, grade, uDate);
				boolean status=dao.addStudent(student);

				
				if(status){
					System.out.println("Added");
				}
				else{
					System.out.println("not added");
				}
				
				break;
			case 2:
				System.out.println("\n\n\n");
				System.out.println("\t\t Find Student ");
				System.out.println("\n\n\n");
				
				System.out.print("\t\t Student ID to find :");
				int findId=scanner.nextInt();

	               StudentDAO dao2=new StudentDAOImpl();
	               Student student2=dao2.findStudent(findId);
					System.out.printf("%15s%15s%15s%15s%15s%s","ID","NAME","AVERAGE","GRADE\t\t","DATE OF JOINING","\n" );

				if(student2!=null){
					System.out.println(student2);
				}
				else{
					System.out.println("Student Not Found");
				}
				
				break;
			case 3:
				System.out.println("\n\n\n");
				System.out.println("\t\t Edit Student ");
				System.out.println("\n\n\n");
				
				
				System.out.print("\t\t Student id:");
				int id1=scanner.nextInt();
				
				System.out.print("\t\t Student Name :");
				String name1=scanner.next();
				
				System.out.print("\t\t Student Average :");
				double average1=scanner.nextDouble();
				
				System.out.print("\t\t Student Grade :");
				char grade1=scanner.next().charAt(0);
				
				System.out.println("\t\t Date Of Joining :");
				String date1=scanner.next();
				SimpleDateFormat dateFormat1=new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date uDate1=dateFormat1.parse(date1);
				 StudentDAO dao3=new StudentDAOImpl();
					Student student1=new Student(id1, name1, average1, grade1, uDate1);
					boolean status1=dao3.addStudent(student1);

				if(status1){
					System.out.println("Updated");
				}
				else{
					System.out.println("Not Updated");
				}
			
				
				break;
			case 4:
				System.out.println("\n\n\n");
				System.out.println("\t\t Display Student ");
				System.out.println("\n\n\n");
   
				 StudentDAO dao4=new StudentDAOImpl();
				List<Student> students3=dao4.getAllStudents();
				System.out.printf("%15s%15s%15s%15s%15s%s","ID","NAME","AVERAGE","GRADE\t","DATE OF JOINING","\n" );
				
				for (Student students4: students3) {
					
					System.out.println(students4);
					
				}
				
				break;
			case 5:
				System.out.println("\n\n\n");
				System.out.println("\t\t Delete Student ");
				System.out.println("\n\n\n");
				System.out.print("\t\t Student ID to Delete:");
				int deleteId=scanner.nextInt();
				
				Student student3=new Student();
				student3.setRollNumber(deleteId);
				 StudentDAO dao5=new StudentDAOImpl();
				
				boolean status4=dao5.deleteStudent(student3);
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
