package com.example.ui;

import com.example.business.Loan;
import com.example.business.T1;

public class Main1 {

	public static void main(String[] args) {

		Loan loan=new Loan(12,10000.00) {
			
			@Override
			public double getInterestRate() {
				return 0.17;
			}
		};
		System.out.println(loan.getInterestRate());
		System.out.println(loan.getInterestAmount());
		
		Loan loan2=new Loan(24,12000.00) {
			
			@Override
			public double getInterestRate() {
				return 0.10;
			}
		};
		
		System.out.println(loan2.getInterestRate());
		System.out.println(loan2.getInterestAmount());
		
		T1 obj3=new T1() {
			
			@Override
			public void open() {
				
				System.out.println("this is open method");
			}
			
			@Override
			public void close() {
				System.out.println("this is close method");

			}
			public void read(){
				
				System.out.println("this is read method");
			}
		};
		
		obj3.open();
		obj3.close();
		
		
	}
	
	

}
