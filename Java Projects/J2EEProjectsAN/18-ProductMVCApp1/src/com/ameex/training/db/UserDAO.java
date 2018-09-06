package com.ameex.training.db;

import com.ameex.training.business.User;

public interface UserDAO {

	User FindUser(String userName);
}
