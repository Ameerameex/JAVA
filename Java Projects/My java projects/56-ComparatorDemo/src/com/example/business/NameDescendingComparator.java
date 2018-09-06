package com.example.business;

import java.util.Comparator;

public class NameDescendingComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int r = o2.getName().compareTo(o1.getName());
		return r;
	}

}
