package com.training.ui;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Address;
import com.training.business.ContactInfo;
import com.training.business.Customer;
import com.training.business.Address;
import com.training.db.AddressDAO;;

public class Main4 {

	static void insertTest() throws Throwable {
		Address address = new Address("12B", "Perungudi", "Chennai", "600026", "TamilNadu", 2);
		Customer customer = new Customer();
		customer.setAddress(address);

		AddressDAO dao = getAddressDAO();
		System.out.println(dao.addAddress(customer));
	}

	private static AddressDAO getAddressDAO() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans1.xml");

		AddressDAO dao = (AddressDAO) applicationContext.getBean("daoBean");
		return dao;
	}

	static void deleteTest() throws Throwable {
		Address address = new Address();
		address.setId(1);
		Customer customer=new Customer();
		customer.setAddress(address);
		AddressDAO dao = getAddressDAO();
		System.out.println(dao.deleteAddress(customer));
	}

	static void updateTest() throws Throwable {
		Address address = new Address("14B", "Perungudi", "Chennai", "600026", "TamilNadu", 2);
		address.setId(2);
		AddressDAO dao = getAddressDAO();
		Customer customer=new Customer();
		customer.setAddress(address);
		System.out.println(dao.updateAddress(customer));
	}

	static void findTest() throws Throwable {
		int id = 2;

		AddressDAO dao = getAddressDAO();
		Address Address = dao.findAddress(id);
		System.out.println(Address);

	}

	static void findAllTest() throws Throwable {
		AddressDAO dao = getAddressDAO();

		List<Address> Addresss = dao.getAllAddresss();
		for (Address Address : Addresss) {
			System.out.println(Address);
		}
	}

	public static void main(String[] args) throws Throwable {

		//insertTest();
		//updateTest();
		//deleteTest();
		findTest();
		 //findAllTest();

	}

}
