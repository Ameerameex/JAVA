package com.example.business;

import java.util.Arrays;

public class Student  {
	private int id;
	private String name;
	private int[]marks;
	
	public Student(int id, String name, int... marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	public int getTotal() {
		int sum=0;
		for(int mark:marks)
			sum+=mark;
		return sum;
	}
	
	public double getAverage() {
		return getTotal()/marks.length;
	}
	
	public char getGrade() {
		char grade=' ';
		double avg=getAverage();
		if(avg>90.0)
			grade='A';
		else if (avg>80.0) 
			grade='B';
		else if(avg >55.0)
			grade='C';
		else 
			grade='U';
		return grade;
	}

	

	@Override
	public String toString() {
		return "\n Student [getId()=" + getId() + ", getName()=" + getName() + ", getTotal()=" + getTotal()
				+ ", getAverage()=" + getAverage() + ", getGrade()=" + getGrade() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	/*public int compareTo(Student o) {
		TotalAscendingComparator ascendingComparator=new TotalAscendingComparator();
	int r=ascendingComparator.compare(this, o);

		return r;
	}*/
	

}
