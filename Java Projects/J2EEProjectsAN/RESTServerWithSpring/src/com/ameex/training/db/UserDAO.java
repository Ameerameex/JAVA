package com.ameex.training.db;

import java.sql.SQLException;

import com.ameex.training.business.User;

public interface UserDAO {
	
	
	User findUser(String userName) throws SQLException;

}
