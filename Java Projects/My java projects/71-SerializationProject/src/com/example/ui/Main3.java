package com.example.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.example.business.Employee;

public class Main3 {

	public static void main(String[] args) throws Exception {
		
		InputStream inputStream=new FileInputStream("emp.dat");
		ObjectInputStream inputStream2=new ObjectInputStream(inputStream);
		
		Employee employee=(Employee) inputStream2.readObject();
		System.out.println(employee);

	}

}
