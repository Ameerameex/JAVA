package com.training.service;

import javax.jws.WebService;

import com.training.business.Student;

@WebService
public interface StudentService {
	
	boolean addStudent(Student student);
	Student findStudent(int rollNumber);
	boolean removeStudent(int rollNumber);
	
	
	
}
