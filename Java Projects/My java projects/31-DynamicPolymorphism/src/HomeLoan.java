
public class HomeLoan extends Loan {

	private String Address;

	HomeLoan(double loanAmount, int loanPeriod, String address) {
		super(loanAmount, loanPeriod);
		Address = address;
	}

	public final String getAddress() {
		return Address;
	}

	public final void setAddress(String address) {
		Address = address;
	}
	@Override
	public double getInterestRate() {
		return 12.0/100.0;
	}
	
	
}
