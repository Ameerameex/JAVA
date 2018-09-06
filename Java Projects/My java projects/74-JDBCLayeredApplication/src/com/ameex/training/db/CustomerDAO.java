package com.ameex.training.db;

import java.util.List;

import com.ameex.training.business.Customer;

public interface CustomerDAO {

	boolean addCustomer(Customer Customer) throws Throwable;
	boolean deleteCustomer(Customer Customer) throws Throwable;
	boolean updateCustomer(Customer Customer) throws Throwable;
	Customer findCustomer(int id) throws Throwable;
	
	List<Customer> getAllCustomers() throws Throwable;

	
	
}
