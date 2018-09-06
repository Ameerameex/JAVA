package com.example.business;

import java.util.Comparator;

public class GradeAscendingComparotor implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		if(o1.getGrade()<o2.getGrade())
			return -1;
			if(o1.getGrade()>o2.getGrade())
				return 1;
			
				return 0;
		
	}

}
