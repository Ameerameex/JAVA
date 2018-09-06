package com.training.ui;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.training.business.Address;
import com.training.business.Attendance;
import com.training.business.Contact;
import com.training.business.Employee;

public class Main4 {

	public static void main(String[] args) {
		Address address=new Address("A5", "K K Nagar", "Madurai", "605110");
		Employee employee=new Employee(101, "Dinesh", new Date(), 45000, 'A',address);
		Attendance attendance1=new Attendance("Jan-2017", 20);
		Attendance attendance2=new Attendance("Feb-2017", 21);
		Attendance attendance3=new Attendance("Mar-2017", 18);
		
		employee.addAttendance(attendance1);
		employee.addAttendance(attendance2);
		employee.addAttendance(attendance3);
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller=context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			marshaller.marshal(employee, System.out);
			marshaller.marshal(employee,new File("employee.xml"));

			
		} catch (JAXBException e) {

			e.printStackTrace();
		}
		
		
		
		

	}

}
