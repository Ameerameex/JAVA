package com.training.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.business.Customer;
import com.training.business.User;

public class SpringCustomerDAOImpl implements CustomerDAO,CustomerQueries {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	private class CustomerRowMapper implements RowMapper<Customer> {

		@Override
		public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
			Customer customer=new Customer();
			customer.setName(rs.getString(2));
			customer.setGender(rs.getString(3).charAt(0));
			customer.setAge(rs.getInt(4));
			customer.setProofId(rs.getString(5));
			customer.setBookingDone(rs.getBoolean(6));
			return customer;
		}

	}
	@Override
	public boolean addCustomer(Customer customer) {
		Object[] values = {customer.getName(),customer.getGender()+"",customer.getAge(),customer.getProofId(),customer.isBookingDone()};
		int rowCount = template.update(INSERT, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
		
	}

	@Override
	public boolean deleteCustomer(Customer customer) {

		Object value=customer.getId();
		int rowCount = template.update(DELETE, value);
		if (rowCount > 0) {
			return true;
		}
		return false;	}

	@Override
	public boolean updateCustomer(Customer customer) {
		Object[] values = {customer.getName(),customer.getGender()+"",customer.getAge(),customer.getProofId(),customer.isBookingDone(),customer.getId()};

		int rowCount = template.update(UPDATE, values);
		if (rowCount > 0) {
			return true;
		}
		return false;	

		
	}

	@Override
	public Customer findCustomer(int id) {
		Customer customer=template.queryForObject(FIND,new CustomerRowMapper(),id);

		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> customers=template.query(FINDALL, new CustomerRowMapper());

		return customers;
	}

	
	
}
