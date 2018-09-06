package com.ameex.training.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ameex.training.business.ContactInfo;
import com.ameex.training.business.Customer;

public class MySQLContactInfoDAOImpl implements ContactInfoDAO,MySQLContactInfoQueries {

	@Override
	public boolean addContactInfo(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(INSERT_QUERY);
		statement.setString(1, customer.getContactInfo().getEmail());
		statement.setString(2, customer.getContactInfo().getPhone());
		statement.setInt(3, customer.getContactInfo().getcId());

		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean deleteContactInfo(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(DELETE_QUERY);
		statement.setInt(1, customer.getContactInfo().getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean updateContactInfo(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(UPDATE_QUERY);
		
		statement.setString(1, customer.getContactInfo().getEmail());
		statement.setString(2, customer.getContactInfo().getPhone());
		statement.setInt(3, customer.getContactInfo().getcId());
		statement.setInt(4, customer.getContactInfo().getId());

		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);
		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public ContactInfo findContactInfo(int id) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ONE_QUERY);
		statement.setInt(1,id);
		ResultSet resultSet=statement.executeQuery();

		if(resultSet.next()){
			ContactInfo contactInfo=new ContactInfo();
			contactInfo.setId(id);
		contactInfo.setEmail(resultSet.getString(2));
		contactInfo.setPhone(resultSet.getString(3));
		contactInfo.setcId(resultSet.getInt(4));


			return contactInfo;
		}
		
		ConnectionManager.closeConnection(connection);

		return null;
	}

	@Override
	public List<ContactInfo> getAllContactInfos() throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ALL_QUERY);
		List<ContactInfo> allContactInfos=new ArrayList<>();
		ResultSet resultSet=statement.executeQuery();

		while(resultSet.next()){
			ContactInfo contactInfo=new ContactInfo();
			contactInfo.setId(resultSet.getInt(1));
			contactInfo.setEmail(resultSet.getString(2));
			contactInfo.setPhone(resultSet.getString(3));
			contactInfo.setcId(resultSet.getInt(4));

			allContactInfos.add(contactInfo);
		}
		ConnectionManager.closeConnection(connection);

		return allContactInfos;
	}

}
