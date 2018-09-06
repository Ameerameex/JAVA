package com.training.business;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
	
	List<Student> allStudents;

	public StudentManagement() {
		super();
		allStudents=new ArrayList<Student>();
		allStudents.add(new Student(1015, "Vidhya", 100, 90, 80));
		allStudents.add(new Student(1016, "John", 98, 91, 84));
		allStudents.add(new Student(1017, "Dinesh", 56, 60, 88));
		allStudents.add(new Student(1018, "Sumithra", 75, 79, 85));
		allStudents.add(new Student(1019, "Vaishnavi", 63, 91, 82));
		allStudents.add(new Student(1020, "Kiran", 82, 94, 78));
	}
	
	public boolean addStudent(Student student){
		return allStudents.add(student);
	}
	
	public boolean deleteStudent(int rollNumber){
		Student student=new Student();
		student.setRollNumber(rollNumber);
		int index=allStudents.indexOf(student);
		if(index<0) return false;
		else{
			allStudents.remove(index);
			return true;
		}
	}
	
	public Student findStudent(int rollNumber){
		Student student=new Student();
		student.setRollNumber(rollNumber);
		int index=allStudents.indexOf(student);
		if(index>=0){
			return allStudents.get(index);
		}
		return null;
	}

	public List<Student> getAllStudents() {
		return allStudents;
	}
	
	

}
