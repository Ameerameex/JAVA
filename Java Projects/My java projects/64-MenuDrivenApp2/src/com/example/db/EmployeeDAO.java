package com.example.db;
import java.util.List;
import com.example.business.Department;
import com.example.business.Employee;

public interface EmployeeDAO {

	boolean addEmployee(Department department,Employee employee) throws Throwable;
	boolean removeEmployee(Department department,Employee employee) throws Throwable;
	boolean updateEmployee(Department department,Employee employee) throws Throwable;
	Employee findEmployee(Department department,Employee employee) throws Throwable;
	List<Employee> getAllEmployees(Department department) throws Throwable;

}
