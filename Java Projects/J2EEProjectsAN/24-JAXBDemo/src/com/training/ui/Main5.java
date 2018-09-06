package com.training.ui;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.training.business.Employee;

public class Main5 {

	public static void main(String[] args) {
		Employee employee=null;
		
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller=context.createUnmarshaller();
			
			employee=(Employee) unmarshaller.unmarshal(new File("employee.xml"));
			System.out.println(employee);
		} catch (JAXBException e) {

			e.printStackTrace();
		}
		
		
		
		
		

	}

}
