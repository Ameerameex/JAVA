package com.training.db;

import java.util.List;

import com.training.business.Address;
import com.training.business.Customer;

public interface AddressDAO {

	boolean addAddress(Customer customer);
	boolean deleteAddress(Customer customer);
	boolean updateAddress(Customer customer);
	Address findAddress(int id);
	List<Address> getAllAddresss();

	
}
