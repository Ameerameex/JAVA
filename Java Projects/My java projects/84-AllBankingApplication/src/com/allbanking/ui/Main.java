package com.allbanking.ui;

import org.hdfc.banking.HDFCLoanFactory;
import org.icici.banking.ICICILoanFactory;

import com.training.example.business.interfaces.Loan;
import com.training.example.business.interfaces.LoanFactory;

public class Main {

	public static void main(String[] args) {

		LoanFactory loanFactory=new ICICILoanFactory();
		
		Loan loan=loanFactory.getLoanInstance(2);
		System.out.println(loan.getInterestRate());
		
		
	}

}
