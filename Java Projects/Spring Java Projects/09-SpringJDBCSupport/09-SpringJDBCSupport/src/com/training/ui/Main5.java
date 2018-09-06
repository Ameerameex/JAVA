package com.training.ui;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.ContactInfo;
import com.training.business.ContactInfo;
import com.training.business.Customer;
import com.training.business.ContactInfo;
import com.training.db.ContactInfoDAO;;

public class Main5 {

	static void insertTest() throws Throwable {
		ContactInfo contactInfo = new ContactInfo("Ameer@gmail.com", "9876543210", 2);
		Customer customer = new Customer();
		customer.setContactInfo(contactInfo);

		ContactInfoDAO dao = getContactInfoDAO();
		System.out.println(dao.addContactInfo(customer));
	}

	private static ContactInfoDAO getContactInfoDAO() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");

		ContactInfoDAO dao = (ContactInfoDAO) applicationContext.getBean("daoBean");
		return dao;
	}

	static void deleteTest() throws Throwable {
		ContactInfo ContactInfo = new ContactInfo();
		ContactInfo.setId(1);
		Customer customer=new Customer();
		customer.setContactInfo(ContactInfo);
		ContactInfoDAO dao = getContactInfoDAO();
		System.out.println(dao.deleteContactInfo(customer));
	}

	static void updateTest() throws Throwable {
		ContactInfo contactInfo = new ContactInfo("Suriya@gmail.com", "9876543210", 2);
		contactInfo.setId(1);
		ContactInfoDAO dao = getContactInfoDAO();
		Customer customer=new Customer();
		customer.setContactInfo(contactInfo);
		System.out.println(dao.updateContactInfo(customer));
	}

	static void findTest() throws Throwable {
		int id = 1;
		ContactInfoDAO dao = getContactInfoDAO();
		ContactInfo ContactInfo = dao.findContactInfo(id);
		System.out.println(ContactInfo);

	}

	static void findAllTest() throws Throwable {
		ContactInfoDAO dao = getContactInfoDAO();

		List<ContactInfo> ContactInfos = dao.getAllContactInfos();
		for (ContactInfo ContactInfo : ContactInfos) {
			System.out.println(ContactInfo);
		}
	}

	public static void main(String[] args) throws Throwable {

		//insertTest();
		//updateTest();
		//deleteTest();
		//findTest();
		 findAllTest();

	}

}
