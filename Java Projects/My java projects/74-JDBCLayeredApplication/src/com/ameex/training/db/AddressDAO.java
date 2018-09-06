package com.ameex.training.db;

import java.util.List;

import com.ameex.training.business.Address;
import com.ameex.training.business.Customer;


public interface AddressDAO {

	boolean addAddress(Customer customer) throws Throwable;
	boolean deleteAddress(Customer customer) throws Throwable;
	boolean updateAddress(Customer customer) throws Throwable;
	Address findAddress(int id) throws Throwable;
	List<Address> getAllAddresss() throws Throwable;

	
}
