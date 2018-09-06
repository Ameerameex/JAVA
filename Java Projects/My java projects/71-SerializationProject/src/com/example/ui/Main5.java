package com.example.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.example.business.Student;

public class Main5 {

	public static void main(String[] args) {
		Collection<Student> students = new ArrayList<Student>();

		InputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		try {
			inputStream = new FileInputStream("std.dat");
			objectInputStream = new ObjectInputStream(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		}

		while (true) {
			Student student = null;
			try {
				student = (Student) objectInputStream.readObject();
			} catch (ClassNotFoundException | IOException e) {
				break;			}
			
			students.add(student);
		}

		System.out.println(students);
		try {
			objectInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
