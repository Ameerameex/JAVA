package com.example.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.example.business.Student;

public class Main4 {

	public static void main(String[] args) throws Exception {

		//Collection<Student> students = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		char choice = '\0';
		OutputStream outputStream=null;
		ObjectOutputStream objectOutputStream=null;
		 outputStream = new FileOutputStream("std.dat");
		 objectOutputStream = new ObjectOutputStream(outputStream);
		do {
			System.out.println("Enter the Id :");
			int id = scanner.nextInt();
			System.out.println("ENter tha Name :");
			String name = scanner.next();
			System.out.println("ENter tha Marks :");
			String marks = scanner.next();
			StringTokenizer stringTokenizer = new StringTokenizer(marks, ",");

			int markArray[] = new int[3];
			
			markArray[0] = Integer.parseInt(stringTokenizer.nextToken());
			markArray[1] = Integer.parseInt(stringTokenizer.nextToken());
			markArray[2] = Integer.parseInt(stringTokenizer.nextToken());

			Student student = new Student(id, name, markArray);
			
			
			objectOutputStream.writeObject(student);
			
			System.out.println("Do you want to continue ?");
			choice = scanner.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		
		objectOutputStream.flush();
		objectOutputStream.close();
		outputStream.close();
	}

}
