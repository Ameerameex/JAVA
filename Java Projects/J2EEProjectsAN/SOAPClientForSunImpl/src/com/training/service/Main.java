package com.training.service;

public class Main {

	public static void main(String[] args) {

		StudentServiceImplService implService = new StudentServiceImplService();
		StudentService service = implService.getStudentServiceImplPort();
		Student student = service.findStudent(1015);
		
		
		System.out.println(student.getRollNumber());

		System.out.println(student.getName());
		System.out.println(student.getMark1()+","+student.getMark2()+","+student.getMark3());
		
		CollegeServiceImplService collegeServiceImplService=new CollegeServiceImplService();
		CollegeService collegeService=collegeServiceImplService.getCollegeServiceImplPort();
		
		System.out.println("____________________________________________________");
		System.out.println(collegeService.getCollegeName());
		System.out.println(collegeService.getCollegeEmail());
		System.out.println(collegeService.getCollegePhone());

	}

}
