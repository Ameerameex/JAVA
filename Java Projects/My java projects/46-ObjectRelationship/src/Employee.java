
public class Employee {

	int id;
	String name;
	Address address;
	double basic;
	SalaryCalculator calculator;
	char grade;
	

	Employee(int id, String name, Address address, double basic, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.basic = basic;
		setGrade(grade);
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final Address getAddress() {
		return address;
	}

	public final void setAddress(Address address) {
		this.address = address;
	}

	public final double getBasic() {
		return basic;
	}

	public final void setBasic(double basic) {
		this.basic = basic;
	}

	public final SalaryCalculator getCalculator() {
		return calculator;
	}

	public final void setCalculator(SalaryCalculator calculator) {
		this.calculator = calculator;
	}

	public final char getGrade() {
		return grade;
	}

	public final void setGrade(char grade) {
		this.grade = grade;
		switch (this.grade) {

		case 'A':
			calculator = new AGradeSalaryCalculator();
			break;
		case 'B':
			calculator = new BGradeSalaryCalculator();
			break;
		case 'C':
			calculator = new CGradeSalaryCalculator();
			break;
		default:System.out.println("invalid input");
			break;
		}
	}

	public double getAllowanceAmount() {

		return calculator.getAllowance(this.basic);
	}

	public double getDeductionAmount() {

		return calculator.getDeduction(this.basic);
	}

	public double getNetSalary() {

		return calculator.getNetSalary(this.basic);

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", basic=" + basic + ", grade="
				+ grade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
