package com.training.db;

import java.util.List;

import com.training.business.Address;
import com.training.business.Customer;
import com.training.business.User;

public interface UserDAO {

	boolean addUser(User user);
	boolean deleteUser(User user);
	boolean updateUser(User user);
	User findUser(String userName);
	List<User> getAllUsers();

	
}
