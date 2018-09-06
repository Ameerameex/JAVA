package com.training.ui;

import javax.swing.plaf.SliderUI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.SalaryComputor;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext appletContext=new ClassPathXmlApplicationContext("beans1.xml");
		  
		SalaryComputor salaryComputor=(SalaryComputor) appletContext.getBean("salBean");
		
		System.out.println(salaryComputor.getAllowance(10000.00));
		System.out.println(salaryComputor.getDeduction(10000.00));
		System.out.println(salaryComputor.getNetSalary(10000.00));
		
	}

}
