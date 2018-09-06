package com.example.business;

import java.util.Comparator;

public class TotalAscendingComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getTotal()<o2.getTotal())
			return -1;
			if(o1.getTotal()>o2.getTotal())
				return 1;
			
				return 0;
		
	}

}
