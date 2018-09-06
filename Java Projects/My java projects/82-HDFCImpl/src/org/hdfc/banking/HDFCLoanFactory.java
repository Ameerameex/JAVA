package org.hdfc.banking;

import com.training.example.business.interfaces.Loan;
import com.training.example.business.interfaces.LoanFactory;

public class HDFCLoanFactory implements LoanFactory{

	public  Loan getLoanInstance(int loanType) {
if(loanType==1){
	
	return new BusinessLoanImpl();
}
if(loanType==2){
	
	return new HomeloanImpl();
}	
if(loanType==3){
	
	return new PersonalLoanImpl();
}
return null;
	}

}
