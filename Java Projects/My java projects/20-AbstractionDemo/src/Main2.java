import java.util.Scanner;

public class Main2 {
	
	/*static double computeinterestamount(double loanAmount){
		return loanAmount*12.0/100.0;
		
		

	}
	
	static double computetotalAmount(double loanAmount){
		
		return loanAmount+ computeinterestamount(loanAmount);
	}
	static double computeEMI(double loanAmount,int period){
		return computetotalAmount(loanAmount)/period;
	}
	*/

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);

		
		double interestAmount,totalRepaybleAmount,EMI;

		double loanAmount1;
		int loanTenure1;
		
		System.out.print("Enter Loan Amount    : ");
		loanAmount1=scanner.nextDouble();
		System.out.print("Enter Loan Period    : ");
		loanTenure1=scanner.nextInt();
		Loan loan=new Loan();
		loan.interestRate=12.0f/100.0f;
		loan.period=loanTenure1;
		loan.loanAmount=loanAmount1;
		
		interestAmount=loan.getInterestAmount();
		totalRepaybleAmount=loan.getTotalAmount();
		EMI=loan.getEMI();
		
		System.out.println("Loan Amount               : " + loanAmount1);
		System.out.println("Loan Duration             : " + loanTenure1);
		System.out.println("Loan Interest Rate        : " + (12.0/100.0));
		System.out.println("Repayable Amount	      : " + totalRepaybleAmount);
		System.out.println("EMI					      : " + EMI);
		
		
		
		

	}

}
