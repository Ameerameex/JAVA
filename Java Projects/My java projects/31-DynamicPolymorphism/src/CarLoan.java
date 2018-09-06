
public class CarLoan extends Loan {

	private String registration;

	CarLoan(double loanAmount, int loanPeriod, String registration) {
		super(loanAmount, loanPeriod);
		this.registration = registration;
	}

	public final String getRegistration() {
		return registration;
	}

	public final void setRegistration(String registration) {
		this.registration = registration;
	}
	
	@Override
	public double getInterestRate() {
		return 14.0/100.0;
	}
	
	
}
