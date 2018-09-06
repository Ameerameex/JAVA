package com.training.db;
import java.util.List;

import com.training.business.Employee;


public interface EmployeeDAO {

	boolean addEmployee(Employee employee) throws Throwable;
	boolean removeEmployee(Employee employee) throws Throwable;
	boolean updateEmployee(Employee employee) throws Throwable;
	Employee findEmployee(Employee employee) throws Throwable;
	List<Employee> getAllEmployees(Employee employee) throws Throwable;

}
