package com.training.db;

import java.util.List;

import com.training.business.Employee;
public interface EmployeeDAO {

	boolean addEmployee(Employee employee) throws Throwable;
	boolean deleteEmployee(Employee employee) throws Throwable;
	boolean updateEmployee( Employee employee) throws Throwable;
	Employee findEmployee( int id) throws Throwable;
	List<Employee> getAllEmployees() throws Throwable;
}
