package com.training.service;

import java.util.List;

import javax.jws.WebService;

import com.training.business.Student;
import com.training.business.StudentManagement;

@WebService(endpointInterface="com.training.service.StudentService")
public class StudentServiceImpl implements StudentService{

	StudentManagement management=new StudentManagement();
	
	public boolean addStudent(Student student) {
		
		return management.addStudent(student);
	}

	public Student findStudent(int rollNumber) {
		
		return management.findStudent(rollNumber);
	}

	public boolean removeStudent(int rollNumber) {
		
		return management.deleteStudent(rollNumber);
	}
	
	public List<Student> getStudentList(){
		return management.getAllStudents();
	}

	
}
