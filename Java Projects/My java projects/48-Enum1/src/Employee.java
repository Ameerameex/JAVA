
public class Employee {

	
	Gender gender;

	public final Gender getGender() {
		return gender;
	}

	public final void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [gender=" + gender + "]";
	}
	

	
}
