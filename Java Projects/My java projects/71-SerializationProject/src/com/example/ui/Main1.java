package com.example.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.example.business.Employee;

public class Main1{

	public static void main(String[] args) throws Exception {
		
		Employee employee;
		employee=new Employee(2051, "John Abraham", 45500.00, 'A');
		OutputStream outputStream=new FileOutputStream("emp.dat");
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
		
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		objectOutputStream.close();
		outputStream.flush();
		outputStream.close();
		
		
	}

}
