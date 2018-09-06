
public class Client {

	public static void main(String[] args) {

		Employee employee=new Employee();
		employee.setGender(Gender.MALE);
		employee.setGender(Gender.FEMALE);

		System.out.println(employee);

	}

}
