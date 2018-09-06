package com.training.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.training.business.Address;
import com.training.business.ContactInfo;
import com.training.business.Customer;

public class SpringContactInfoDAOImp implements ContactInfoDAO,ContactInfoQueries {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	private class ContactInfoRowMapper implements RowMapper<ContactInfo> {

		@Override
		public ContactInfo mapRow(ResultSet rs, int arg1) throws SQLException {
			ContactInfo contactInfo=new ContactInfo();
			contactInfo.setEmail(rs.getString(2));
			contactInfo.setPhone(rs.getString(3));
			contactInfo.setcId(rs.getInt(4));
			return contactInfo;
		}

	}
	@Override
	public boolean addContactInfo(Customer customer) {
		Object[] values = {customer.getContactInfo().getEmail(),customer.getContactInfo().getPhone(),customer.getContactInfo().getcId()};
		int rowCount = template.update(INSERT, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteContactInfo(Customer customer) {

		Object value=customer.getContactInfo().getId();
		
		int rowCount = template.update(DELETE, value);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateContactInfo(Customer customer) {

		Object[] values = {customer.getContactInfo().getEmail(),customer.getContactInfo().getPhone(),customer.getContactInfo().getcId(),customer.getContactInfo().getId()};
		int rowCount = template.update(UPDATE, values);
		if (rowCount > 0) {
			return true;
		}
		return false;
	}

	@Override
	public ContactInfo findContactInfo(int id) {

		ContactInfo contactInfo=template.queryForObject(FIND, new ContactInfoRowMapper(), id);

		return contactInfo;
	}

	@Override
	public List<ContactInfo> getAllContactInfos() {

		List<ContactInfo> contactInfos=template.query(FINDALL, new ContactInfoRowMapper());

		return contactInfos;
	}

}
