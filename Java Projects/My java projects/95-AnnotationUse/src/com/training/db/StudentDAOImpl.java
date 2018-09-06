package com.training.db;

import java.util.List;

import com.training.business.Employee;
import com.training.business.Student;
import com.training.common.AnnotationBasedPersistence;
import com.training.example.common.Persistence;


public class StudentDAOImpl implements StudentDAO {

	@Override
	public boolean addStudent(Student student) throws Throwable {
    Persistence<Student> persistence=new AnnotationBasedPersistence<>();
		
		return persistence.save(student);
	}

	@Override
	public boolean deleteStudent(Student student) throws Throwable {
		Persistence<Student> persistence=new AnnotationBasedPersistence<>();

		return persistence.delete(student);
	}

	@Override
	public boolean updateStudent(Student student) throws Throwable {
		Persistence<Student> persistence=new AnnotationBasedPersistence<>();

		return persistence.update(student);
	}

	@Override
	public Student findStudent(int i) throws Throwable {
		Persistence<Student> persistence=new AnnotationBasedPersistence<>();

		return persistence.find(Student.class, i);
	}

	@Override
	public List<Student> getAllStudents() throws Throwable {
		Persistence<Student> persistence=new AnnotationBasedPersistence<>();

		return persistence.getAll(Student.class);
	}

	

}
