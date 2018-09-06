package com.ameex.training.bean;

public class StudentClient {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.rollNumber=200;
		Student s2=new Student();
		s2.rollNumber=200;
		
		int x=50,y=50;
		System.out.println(x==y);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		

	}

}
