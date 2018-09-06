
public class BusinessLoan extends Loan {

	
	
	private String sector;

	BusinessLoan(double loanAmount, int loanPeriod, String sector) {
		super(loanAmount, loanPeriod);
		this.sector = sector;
	}

	public final String getSector() {
		return sector;
	}

	public final void setSector(String sector) {
		this.sector = sector;
	}
	@Override
	public double getInterestRate() {
		return 18.0/100.0;
	}
	
	
}
