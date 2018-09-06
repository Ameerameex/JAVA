package com.example.business;


public class Student implements Comparable {
	
	private String name;
	private float mark1,mark2,mark3;
	
	
	
	public Student(String name, float mark1, float mark2, float mark3) {
		super();
		setName(name);
		setMark1(mark1);
		setMark2(mark2);
		setMark3(mark3);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark1() {
		return mark1;
	}
	public void setMark1(float mark1) {
		this.mark1 = mark1;
	}
	public float getMark2() {
		return mark2;
	}
	public void setMark2(float mark2) {
		this.mark2 = mark2;
	}
	public float getMark3() {
		return mark3;
	}
	public void setMark3(float mark3) {
		this.mark3 = mark3;
	}
	
	
	public double getTotal() {
		return mark1+mark2+mark3;
	}
	
	public double getAverage() {
		return getTotal()/3;
	}
	
	public char getGrade() {
		double averge=getAverage();
		if(averge>=90.0)
			return 'A';
		else if(averge>=70.0)
			return 'B';
		else
			return 'C';
	}


	@Override
	public int compareTo(Object o) {
		Student temp=(Student)o;
		if(this.getGrade()<temp.getGrade())
			return 1;
		if(this.getGrade()==temp.getGrade())
			return 0;
		if(this.getGrade()>temp.getGrade())
			return -1;
		return 0;
	}
	

}
