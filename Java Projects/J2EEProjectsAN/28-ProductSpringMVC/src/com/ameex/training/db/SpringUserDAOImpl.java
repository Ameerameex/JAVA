package com.ameex.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ameex.training.business.User;


@Repository
public class SpringUserDAOImpl implements UserDAO,UserInfoQueries{

	@Autowired
	JdbcTemplate template;

	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	@Override
	public User FindUser(String userName) {
		User user=null;
		user=template.queryForObject(FIND_USER, new UserRowMapper(), userName);
		
		
		return user;
	}

	private class UserRowMapper implements RowMapper<User>{

		@Override
		public User mapRow(ResultSet rs, int arg1) throws SQLException {

			User user=new User();
			user.setUserName(rs.getString(1));
			user.setPassword(rs.getString(2));
			return user;
		}
		
	}
}
