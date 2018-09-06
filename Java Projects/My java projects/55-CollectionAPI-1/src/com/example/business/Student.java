package com.example.business;

import java.util.Arrays;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int[]marks;
	
	public Student(int id, String name, int[] marks) {
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
			sum=+mark;
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
		else if (avg>60) 
			grade='B';
		else
			grade='C';
		return grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
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

	@Override
	public int compareTo(Student o) {
if(this.id<o.id){
	return -1;
}
if(this.id>o.id){
	return 1;
}

		return 0;
	}
	

}
