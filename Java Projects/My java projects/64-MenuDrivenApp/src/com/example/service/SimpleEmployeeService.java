//package com.example.service;
//
//import java.util.List;
//
//import com.example.business.Department;
//import com.example.business.Employee;
//
//public class SimpleEmployeeService implements EmployeeService {
//
//	@Override
//	public boolean addEmployee(Department department, Employee employee) throws Throwable {
//		boolean status=department.addEmployee(employee);
//		return status;
//	}
//
//	@Override
//	public boolean removeEmployee(Department department, Employee employee) throws Throwable {
//		boolean status=department.deleteEmployee(employee);
//		return status;
//	}
//
//	@Override
//	public boolean updateEmployee(Department department, Employee employee) throws Throwable {
//		boolean status=department.updateEmployee(employee);
//		return status;
//	}
//
//	@Override
//	public Employee findEmployee(Department department, Employee employee) throws Throwable {
//		Employee employee2=department.findEmployee(employee.getId());
//		return employee2;
//	}
//
//	@Override
//	public List<Employee> getAllEmployees(Department department) throws Throwable {
//	
//		return department.getEmployees();
//	}
//
//}
