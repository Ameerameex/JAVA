package com.training.ui;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Address;
import com.training.business.ContactInfo;
import com.training.business.Customer;
import com.training.db.AddressDAO;
import com.training.db.ContactInfoDAO;
import com.training.db.CustomerDAO;
import com.training.db.SpringAddressDAOImpl;
import com.training.db.SpringContactInfoDAOImp;;

public class Main3 {

	static void insertTest() throws Throwable {
		Address address = null;
		ContactInfo contactInfo = null;
		Customer Customer = new Customer("Ameer", 'M', 20, "PanCard", address, contactInfo, true);

		CustomerDAO dao = getCustomerDAO();
		System.out.println(dao.addCustomer(Customer));
	}

	private static CustomerDAO getCustomerDAO() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans3.xml");

		CustomerDAO dao = (CustomerDAO) applicationContext.getBean("daoBean");
		return dao;
	}

	static void deleteTest() throws Throwable {
		Customer Customer = new Customer();
		Customer.setId(1);
		CustomerDAO dao = getCustomerDAO();
		System.out.println(dao.deleteCustomer(Customer));
	}

	static void updateTest() throws Throwable {
		Address address = null;
		ContactInfo contactInfo = null;
		Customer Customer = new Customer("Ameer", 'M', 22, "PanCard", address, contactInfo, true);
		Customer.setId(2);
		CustomerDAO dao = getCustomerDAO();
		System.out.println(dao.updateCustomer(Customer));
	}

	static void findTest() throws Throwable {
		int id = 2;

		CustomerDAO dao = getCustomerDAO();
		Customer customer = dao.findCustomer(id);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
		AddressDAO dao1 = (AddressDAO) applicationContext.getBean("daoBean");
		Address address = dao1.findAddress(id);
		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("beans2.xml");
		ContactInfoDAO dao2 = (ContactInfoDAO) applicationContext1.getBean("daoBean");
		ContactInfo info = dao2.findContactInfo(id);
		customer.setAddress(address);
		customer.setContactInfo(info);
		System.out.println(customer);

	}

	static void findAllTest() throws Throwable {
		CustomerDAO dao = getCustomerDAO();
		

		List<Customer> customers = dao.getAllCustomers();
		for (Customer Customer : customers) {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");
			AddressDAO dao1 = (AddressDAO) applicationContext.getBean("daoBean");
			Address address = dao1.findAddress(Customer.getcId());
			ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("beans2.xml");
			ContactInfoDAO dao2 = (ContactInfoDAO) applicationContext1.getBean("daoBean");
			ContactInfo info = dao2.findContactInfo(Customer.getcId());
			Customer.setAddress(address);
			Customer.setContactInfo(info);
			System.out.println(Customer);
		}
	}

	public static void main(String[] args) throws Throwable {

		// insertTest();
		// updateTest();
		// deleteTest();
		//findTest();
		 findAllTest();

	}

}
