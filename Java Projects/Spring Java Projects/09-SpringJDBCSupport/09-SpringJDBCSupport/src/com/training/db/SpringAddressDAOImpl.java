package com.training.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.business.Address;
import com.training.business.Customer;

public class SpringAddressDAOImpl  implements AddressDAO,AddressQueries{
	
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	private class AddressRowMapper implements RowMapper<Address> {

		@Override
		public Address mapRow(ResultSet rs, int arg1) throws SQLException {
			Address address=new Address();
			address.setDoorNo(rs.getString(2));
			address.setAreaName(rs.getString(3));
			address.setCity(rs.getString(4));
			address.setPincode(rs.getString(5));
			address.setState(rs.getString(6));
			address.setcId(rs.getInt(7));
			return address;
		}

	}
	@Override
	public boolean addAddress(Customer customer) {
		Object[] values = {customer.getAddress().getDoorNo(),customer.getAddress().getAreaName(),customer.getAddress().getCity(),customer.getAddress().getPincode(),customer.getAddress().getState(),customer.getAddress().getcId()};
		int rowCount = template.update(INSERT, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteAddress(Customer customer) {

		Object value=customer.getAddress().getId();
		int rowCount = template.update(DELETE, value);
		if (rowCount > 0) {
			return true;
		}
		return false;	
		}

	@Override
	public boolean updateAddress(Customer customer) {
		Object[] values = {customer.getAddress().getDoorNo(),customer.getAddress().getAreaName(),customer.getAddress().getCity(),customer.getAddress().getPincode(),customer.getAddress().getState(),customer.getAddress().getcId(),customer.getAddress().getId()};
		int rowCount = template.update(UPDATE, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public Address findAddress(int id) {
Address address=template.queryForObject(FIND, new AddressRowMapper(), id);

		return address;
	}

	@Override
	public List<Address> getAllAddresss() {
	List<Address> address=template.query(FINDALL, new AddressRowMapper());

		return address;
	}

	
	
	
}
