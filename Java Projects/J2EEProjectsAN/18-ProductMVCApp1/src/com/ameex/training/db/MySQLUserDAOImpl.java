package com.ameex.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ameex.training.business.User;



public class MySQLUserDAOImpl implements UserDAO,UserInfoQueries{

	@Override
	public User FindUser(String userName) {
		User user=null;
		Connection connection=ConnectionManager.getConnection();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(FIND_USER);
			preparedStatement.setString(1,userName);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()){
				user=new User();
				user.setUserName(resultSet.getString(1));
				user.setPassword(resultSet.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
