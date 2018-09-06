
public class Main {

	
	public static void main(String[] args) {
		
		
		Employee employee=new Employee(10000);
		System.out.println(employee.getNetSalary());
		System.out.println(employee.getNetSalary(10));
		
		Employee employee1=new ContractEmployee(10000, 6);
		System.out.println(employee1.getNetSalary());
		System.out.println(employee1.getNetSalary(10));
		
		Manager manager=new Manager(10000,10);
		System.out.println(employee1.getNetSalary());
		System.out.println(employee1.getNetSalary(10));
		
		
		
		
		
		
		
		System.out.println(employee instanceof Manager);
		System.out.println(employee instanceof Employee);
		System.out.println(employee instanceof ContractEmployee);
		System.out.println(manager.i);
		System.out.println(manager.j);
		employee1.test();
		manager.test();
		}
}
