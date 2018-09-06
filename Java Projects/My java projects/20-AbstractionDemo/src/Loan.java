
public class Loan {

	
	int period;
	double loanAmount;
	float interestRate;
	
	double getInterestAmount(){
		
		return loanAmount*interestRate;
	}
	double getTotalAmount(){
		return loanAmount+getInterestAmount();
	}
	
	double getEMI(){
		return getTotalAmount()/period;
	}
}
