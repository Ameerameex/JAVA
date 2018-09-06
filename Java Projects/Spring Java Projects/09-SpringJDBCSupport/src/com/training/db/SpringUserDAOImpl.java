package com.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.training.business.HotelRoom;
import com.training.business.User;

public class SpringUserDAOImpl implements UserDAO, UserQueries {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	private class UserRowMapper implements RowMapper<User> {

		@Override
		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			User user = new User();
			user.setUserName(rs.getString(2));
			user.setPassword(rs.getString(3));
			user.setUserType(rs.getInt(5));

			return user;
		}

	}

	@Override
	public boolean addUser(User user) {
		Object[] values = { user.getUserName(), user.getPassword(), user.getUserType() };
		int rowCount = template.update(INSERT, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		Object values=user.getUserName();
		int rowCount = template.update(DELETE, values);
		if (rowCount > 0) {
			return true;
		}
		return false;

	}

	@Override
	public User findUser(String userName) {
		User user = (User) template.queryForObject(FIND, new UserRowMapper(), userName);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = template.query(FINDALL, new UserRowMapper());
		return users;
	}

	@Override
	public boolean updateUser(User user) {
		Object[] values = {user.getUserName(),user.getPassword(),user.getUserType(),user.getUserName()};
		int rowCount = template.update(UPDATE, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}


}
