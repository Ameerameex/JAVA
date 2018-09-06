
abstract public class Loan {

	private double loanAmount;
	private int loanPeriod;

	Loan(double loanAmount, int loanPeriod) {
		super();
		this.loanAmount = loanAmount;
		this.loanPeriod = loanPeriod;
	}

	public final double getLoanAmount() {
		return loanAmount;
	}

	public final void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public final int getLoanPeriod() {
		return loanPeriod;
	}

	public final void setLoanPeriod(int loanPeriod) {
		this.loanPeriod = loanPeriod;
	}

	abstract public double getInterestRate();

	public double getInterestAmount() {

		return loanAmount + loanPeriod * getInterestRate();
	}

	final public double getTotal() {
		return getInterestAmount() + loanAmount;
	}

	final public double getEMI() {

		return getTotal() / loanPeriod;
	}
}
