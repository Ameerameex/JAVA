package com.example.business;

import java.util.Comparator;

public class NameAscendingComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int r = o1.getName().compareTo(o2.getName());
		return r;

	}

}
