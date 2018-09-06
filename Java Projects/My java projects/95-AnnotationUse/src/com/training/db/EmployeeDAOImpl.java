package com.training.db;

import java.util.List;

import com.training.business.Employee;
import com.training.common.AnnotationBasedPersistence;
import com.training.example.common.Persistence;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean addEmployee(Employee employee) throws Throwable {
		Persistence<Employee> persistence=new AnnotationBasedPersistence<>();
		
		return persistence.save(employee);
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Throwable {
		Persistence<Employee> persistence=new AnnotationBasedPersistence<>();

		return persistence.delete(employee);
	}

	@Override
	public boolean updateEmpoyee(Employee employee) throws Throwable {
		Persistence<Employee> persistence=new AnnotationBasedPersistence<>();

		return persistence.update(employee);
	}

	@Override
	public Employee findEmployee(int i) throws Throwable {
		Persistence<Employee> persistence=new AnnotationBasedPersistence<>();

		return persistence.find(Employee.class, i);
	}



	@Override
	public List<Employee> getAllEmployees() throws Throwable {
		Persistence<Employee> persistence=new AnnotationBasedPersistence<>();

		return persistence.getAll(Employee.class);
	}

}
