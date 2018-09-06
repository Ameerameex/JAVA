
public class EmployeeClient {

	public static void main(String[] args) {
		
       Employee employee=new Employee();
       
       Employee employee2=new Employee();
       employee.basicSalary=10000;
       Employee.hraPercentage=12;
       Employee.pfPercentage=10;
       
       System.out.println(employee.getHRAllowance());
       System.out.println(employee.getPF());
       System.out.println(employee.getNetSalary());
       
	}

}
