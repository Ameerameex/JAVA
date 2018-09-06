package com.example.service;

import com.example.business.Department;

public class ApplicationData {

	private Department department;
	private static ApplicationData instance;
	private ApplicationData(String depName,String head) {
		super();
		department=new Department(depName,head);
		
	}
	
	public static ApplicationData getInstance(){
		
		if(instance==null)
			instance=new ApplicationData("Admim", "Ram");
		return instance;
	
	}

	public final Department getDepartment() {
		return department;
	}
	
	
	
	
	
	
	
	
	
	
}
