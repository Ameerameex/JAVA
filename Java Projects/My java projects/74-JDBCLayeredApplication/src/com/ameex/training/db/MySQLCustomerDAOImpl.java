package com.ameex.training.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ameex.training.business.Customer;

public class MySQLCustomerDAOImpl implements CustomerDAO,MySQLCustomerQueries {

	@Override
	public boolean addCustomer(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(INSERT_QUERY);
		statement.setString(1,customer.getName());
		statement.setString(2, customer.getGender()+"");
		statement.setInt(3, customer.getAge());
		statement.setString(4, customer.getProofId());
		statement.setBoolean(5, customer.isBookingDone());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean deleteCustomer(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(DELETE_QUERY);
		statement.setInt(1, customer.getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(UPDATE_QUERY);
		
		statement.setString(1,customer.getName());
		statement.setString(2, customer.getGender()+"");
		statement.setInt(3, customer.getAge());
		statement.setString(4, customer.getProofId());
		statement.setBoolean(5, customer.isBookingDone());
		statement.setInt(6, customer.getId());


		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);
		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public Customer findCustomer(int id) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ONE_QUERY);
		statement.setInt(1,id);
		ResultSet resultSet=statement.executeQuery();

		if(resultSet.next()){
			Customer customer=new Customer();
			
			customer.setId(id);
			customer.setName(resultSet.getString(2));
			customer.setGender(resultSet.getString(3).charAt(0));
			customer.setAge(resultSet.getInt(4));
			customer.setProofId(resultSet.getString(5));
			customer.setBookingDone(resultSet.getBoolean(6));
			return customer;
		}
		
		ConnectionManager.closeConnection(connection);

		return null;
	}

	@Override
	public List<Customer> getAllCustomers() throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ALL_QUERY);
		List<Customer> allCustomers=new ArrayList<>();
		ResultSet resultSet=statement.executeQuery();

		while(resultSet.next()){
			Customer customer=new Customer();
			
			customer.setId(resultSet.getInt(1));
			customer.setName(resultSet.getString(2));
			customer.setGender(resultSet.getString(3).charAt(0));
			customer.setAge(resultSet.getInt(4));
			customer.setProofId(resultSet.getString(5));
			customer.setBookingDone(resultSet.getBoolean(6));
			allCustomers.add(customer);
		}
		ConnectionManager.closeConnection(connection);

		return allCustomers;
	}

}
