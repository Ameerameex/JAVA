package com.example.db;

import java.util.List;

import com.example.business.Department;

public interface DepartmentDAO {
	boolean addDepartment(Department Department) throws Throwable;

	boolean deleteDepartment(Department Department) throws Throwable;

	boolean updateDepartment(Department Department) throws Throwable;

	Department findDepartment(int id) throws Throwable;

	List<Department> getAllDepartments() throws Throwable;
}
