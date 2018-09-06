package com.ameex.training.bean;

public class Student {
	
	int rollNumber;
	
	@Override
	public boolean equals(Object obj) {
		
		Student temp=(Student)obj;
		System.out.println(temp.rollNumber);
		if(this.rollNumber==temp.rollNumber){
			return true;
		}
		else
			return false;
	}

}
