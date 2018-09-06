
public class Main {

	public static void main(String[] args) {

		Loan loan;
		loan = new Loan();
		loan.setLoanAmount(20000.00);
		loan.setPeriod(12);
		loan.setInterestRate(0.12f);
		System.out.println(loan.getLoanAmount());
		System.out.println(loan.getPeriod());
		System.out.println(loan.getInterestRate());
		System.out.printf("%s8.2f", loan.getInterestAmount());
		System.out.println();
		System.out.println(loan.getTotalAmount());
		System.out.println(loan.getEMI());
	}

}
