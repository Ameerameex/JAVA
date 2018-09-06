package com.training.db;

import java.util.List;

import com.training.business.Employee;



public interface EmployeeDAO {
	boolean addEmployee(Employee employee) throws Throwable;
	boolean deleteEmployee(Employee employee) throws Throwable;
	boolean updateEmpoyee(Employee employee) throws Throwable;
	Employee findEmployee(int i) throws Throwable;
	List<Employee> getAllEmployees() throws Throwable;
}
