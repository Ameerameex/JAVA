package com.ameex.training.db;



import java.util.List;

import com.ameex.training.business.ContactInfo;
import com.ameex.training.business.Customer;



public interface ContactInfoDAO {

	boolean addContactInfo(Customer customer) throws Throwable;
	boolean deleteContactInfo(Customer customer) throws Throwable;
	boolean updateContactInfo(Customer customer) throws Throwable;
	ContactInfo findContactInfo(int id) throws Throwable;
	List<ContactInfo> getAllContactInfos() throws Throwable;

	
}
