package com.example.ui;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import com.example.business.Circle;
import com.example.business.GradeAscendingComparotor;
import com.example.business.GradeDescendingComparator;
import com.example.business.IdAscendingComparator;
import com.example.business.IdDescendingComparator;
import com.example.business.NameAscendingComparator;
import com.example.business.Student;
import com.example.business.TotalAscendingComparator;

public class Main2 {

	public static void main(String[] args) {
		
		Student student=new Student(106, "Suriya", 90,95,92);
		Student student2=new Student(107, "Kumar", 80,86,89);
		Student student3=new Student(102, "Ameer", 10,12,15);
		Student student4=new Student(101, "Khan", 20,23,73);
		Student student5=new Student(108, "Dhoni", 10,89,71);

        //IdDescendingComparator descendingComparator=new IdDescendingComparator();	
		//GradeAscendingComparotor ascendingComparotor=new GradeAscendingComparotor();
		NameAscendingComparator ascendingComparotor=new NameAscendingComparator();
		//TotalAscendingComparator ascendingComparotor=new TotalAscendingComparator();
		//GradeDescendingComparator descendingComparator=new GradeDescendingComparator();
		Set<Student> students=new TreeSet<>(ascendingComparotor);
		
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		System.out.println(students);

			
			
		

	}

}
