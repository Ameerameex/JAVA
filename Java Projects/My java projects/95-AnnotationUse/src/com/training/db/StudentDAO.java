package com.training.db;

import java.util.List;

import com.training.business.Employee;
import com.training.business.Student;



public interface StudentDAO {
	boolean addStudent(Student student) throws Throwable;
	boolean deleteStudent(Student student) throws Throwable;
	boolean updateStudent(Student student) throws Throwable;
	Student findStudent(int i) throws Throwable;
	List<Student> getAllStudents() throws Throwable;
}
