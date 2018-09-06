package com.training.db;

import java.util.List;

import com.training.business.Address;
import com.training.business.ContactInfo;
import com.training.business.Customer;

public interface ContactInfoDAO {

	boolean addContactInfo(Customer contactInfo);
	boolean deleteContactInfo(Customer contactInfo);
	boolean updateContactInfo(Customer contactInfo);
	ContactInfo findContactInfo(int id);
	List<ContactInfo> getAllContactInfos();

	
}
