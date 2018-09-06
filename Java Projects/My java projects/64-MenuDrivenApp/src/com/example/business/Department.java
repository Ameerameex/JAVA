package com.example.business;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Department {
	private int id;
	private String departmentName;
	private String headOfDepartment;

	private List<Department> departments;

	public Department(String departmentName, String headOfDepartment) {
		super();
	
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
		this.departments = new LinkedList<>();
	}

	

	public Department() {
		this.departments=new LinkedList<>();
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}

	public boolean addDepartment(Department departments) {

		boolean status = this.departments.add(departments);

		return status;
	}

	public final List<Department> getDepartments() {
		return this.departments;
	}

	public final void setDepartments(List<Department> Departments) {
		this.departments = departments;
	}

	public Department findDepartment(int id) {
		Department Department = new Department();
		Department.setId(id);
		boolean found = isDepartmentExisting(id);
		if (found) {
			int position = this.departments.indexOf(Department);
			Department = this.departments.get(position);
			return Department;
		} else

			return null;
	}

	public boolean updateDepartment(Department departments) {
		int id = departments.getId();
		boolean found = isDepartmentExisting(id);

		if (found) {
			int position = this.departments.indexOf(departments);
			Department Department2 = this.departments.set(position, departments);

		}

		return found;
	}

	public boolean deleteDepartment(Department departments) {
		int id = departments.getId();
		boolean found = isDepartmentExisting(id);

		if (found) {
			int position = this.departments.indexOf(departments);
			this.departments.remove(position);

		}
		return found;
	}

	public void deleteDepartment(int id) {
		Department department = new Department();
		department.setId(id);
		boolean found = isDepartmentExisting(id);

		if (found) {
			int position = this.departments.indexOf(department);
			this.departments.remove(position);

		}

	}

	public boolean isDepartmentExisting(int id) {
		Department department = new Department();
		department.setId(id);
		boolean found = this.departments.contains(department);
		return found;

	}

	@Override
	public String toString() {

		System.out.printf("%s%-15d%15s%20s", "\n", id, departmentName, headOfDepartment);
		return "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
		result = prime * result + ((headOfDepartment == null) ? 0 : headOfDepartment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (departmentName == null) {
			if (other.departmentName != null)
				return false;
		} else if (!departmentName.equals(other.departmentName))
			return false;
		if (headOfDepartment == null) {
			if (other.headOfDepartment != null)
				return false;
		} else if (!headOfDepartment.equals(other.headOfDepartment))
			return false;
		return true;
	}

	public int getId() {

		return id;
	}

}
