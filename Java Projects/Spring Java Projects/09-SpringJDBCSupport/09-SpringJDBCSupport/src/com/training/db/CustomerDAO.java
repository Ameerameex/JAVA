package com.training.db;

import java.util.List;

import com.training.business.Customer;

public interface CustomerDAO {

	boolean addCustomer(Customer customer);
	boolean deleteCustomer(Customer customer);
	boolean updateCustomer(Customer customer);
	Customer findCustomer(int id);
	List<Customer> getAllCustomers();

	
}
