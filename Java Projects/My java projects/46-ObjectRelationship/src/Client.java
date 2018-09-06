
public class Client {

	public static void main(String[] args) {

		Address address = new Address();
		address.setDoorNumber("105");
		address.setStreetName("East Street");
		address.setCity("Chennai");
		address.setPinCode("600028");

		Employee employee;
		employee = new Employee(101, "Suriya", address, 10000, 'C');
		Employee employee2 = new Employee(102, "AMeer", address, 10000, 'B');
		Employee employee3 = new Employee(103, "VIjay", address, 10000, 'A');
		System.out.println(address);
		System.out.println(employee);
		System.out.println(employee2);
		System.out.println(employee3);

		Department department = new Department("Admin", 3);

		department.addEmployee(employee);
		department.addEmployee(employee2);
		department.addEmployee(employee3);

		System.out.println(department);
		System.out.println(employee.getAllowanceAmount());
		System.out.println(employee.getDeductionAmount());
		System.out.println(employee.getNetSalary());

		System.out.println(employee2.getAllowanceAmount());
		System.out.println(employee2.getDeductionAmount());
		System.out.println(employee2.getNetSalary());

		System.out.println(employee3.getAllowanceAmount());
		System.out.println(employee3.getDeductionAmount());
		System.out.println(employee3.getNetSalary());

	}

}
