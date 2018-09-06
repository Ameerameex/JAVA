package com.example.business;

public class Department {
	
	private String departmentName;
	private String headOfDepartment;
	
	public Department(String departmentName, String headOfDepartment) {
		super();
		this.departmentName = departmentName;
		this.headOfDepartment = headOfDepartment;
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

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", headOfDepartment=" + headOfDepartment + "]";
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
	
	
	
}
