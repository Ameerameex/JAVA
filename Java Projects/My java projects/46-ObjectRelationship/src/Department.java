import java.util.Arrays;

public class Department {

	String departmentName;
	Employee[] employees;
	int index;
	Department(String departmentName,int n) {
		super();
		employees=new Employee[n];
		this.departmentName = departmentName;
	}
	
	public void addEmployee(Employee employee){
		employees[index++]=employee;
		
	}

	public final String getDepartmentName() {
		return departmentName;
	}

	public final void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public final Employee[] getEmployees() {
		return employees;
	}

	public final void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", employees=" + Arrays.toString(employees) + ", index="
				+ index + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departmentName == null) ? 0 : departmentName.hashCode());
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
		return true;
	}
	
	
	
}
