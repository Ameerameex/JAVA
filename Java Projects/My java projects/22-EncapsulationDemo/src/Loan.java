
public class Loan {

	
  private int period;
	 private double loanAmount;
	 private float interestRate;
	 
	 void setPeriod(int p){
		 if(p>0)
		 period=p;
		 else
			 System.out.println("invalid amount");
	 }
	int getPeriod(){
		
		return period;
	}
	 void setLoanAmount(double i){
		 if(i>0)
		 loanAmount=i;
		 else
			 System.out.println("invalid amount");
	 }
	double getLoanAmount(){
		
		return loanAmount;
	}
	
	
	 float getInterestRate() {
		return interestRate;
	}
	 void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	 
	 
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
