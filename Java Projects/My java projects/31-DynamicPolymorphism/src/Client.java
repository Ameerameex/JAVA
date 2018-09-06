import java.util.Scanner;

import javax.print.attribute.standard.PrinterLocation;

public class Client {
	
	 static void printLoan(Loan loan){
		if(loan instanceof CarLoan){
		CarLoan carLoan=(CarLoan)loan;
		System.out.println(carLoan.getRegistration());
		}
		else if(loan instanceof HomeLoan){
			HomeLoan homeLoan=(HomeLoan)loan;
			System.out.println(homeLoan.getAddress());
		}
		else if(loan instanceof BusinessLoan){
			BusinessLoan businessLoan=(BusinessLoan) loan;
			System.out.println(businessLoan.getSector());
		}
		
		System.out.println(loan.getInterestRate());
		System.out.println(loan.getInterestAmount());
				
		System.out.println(loan.getTotal());
		System.out.println(loan.getEMI());
		

	}
	public static void main(String[] args) {

Loan loan = null;
Scanner scanner=new Scanner(System.in);
int choice=scanner.nextInt();
if(choice==LoanTypes.CL)
{
loan=new CarLoan(100000.0, 34, "TN 01 A 1234");
}
else if(choice==LoanTypes.HL){
	loan=new HomeLoan(100000.0, 34, "chennai");
}
else if(choice==LoanTypes.BL){
	loan=new BusinessLoan(100000.0, 34, "Banking");
}


printLoan(loan);

		
		
	}

}
