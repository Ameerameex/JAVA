package com.example.business;

import java.util.Comparator;

public class IdAscendingComparator implements Comparator<Employee> {

	

	@Override
	public int compare(Employee o1, Employee o2) {
		int r=o1.getId()-o2.getId();
		return r;
	}
	
	

}
