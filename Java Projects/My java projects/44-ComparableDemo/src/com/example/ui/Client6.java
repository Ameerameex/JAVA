package com.example.ui;

import com.example.business.Student;

public class Client6 {

	public static void main(String[] args) {

		Student student=new Student("Suriya", 90, 80,80);
		Student student1=new Student("Ameer", 60, 50, 35);
		
		System.out.println(student.compareTo(student1));

		
	}

}
