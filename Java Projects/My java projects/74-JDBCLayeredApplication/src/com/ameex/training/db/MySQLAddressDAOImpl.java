package com.ameex.training.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ameex.training.business.Address;
import com.ameex.training.business.Customer;

public class MySQLAddressDAOImpl implements AddressDAO,MySQLAddressQueries {

	@Override
	public boolean addAddress(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(INSERT_QUERY);
		
		statement.setString(1, customer.getAddress().getDoorNo());
		statement.setString(2, customer.getAddress().getAreaName());
		statement.setString(3, customer.getAddress().getCity());
		statement.setString(4, customer.getAddress().getPincode());
		statement.setString(5, customer.getAddress().getState());
		statement.setInt(6, customer.getAddress().getcId());

		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean deleteAddress(Customer customer) throws Throwable{
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(DELETE_QUERY);
		statement.setInt(1, customer.getAddress().getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean updateAddress(Customer customer) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(UPDATE_QUERY);
		statement.setString(1, customer.getAddress().getDoorNo());
		statement.setString(2, customer.getAddress().getAreaName());
		statement.setString(3, customer.getAddress().getCity());
		statement.setString(4, customer.getAddress().getPincode());
		statement.setString(5, customer.getAddress().getState());
		statement.setInt(6, customer.getAddress().getcId());
		statement.setInt(7,customer.getAddress().getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);
		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public Address findAddress(int id) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ONE_QUERY);
		statement.setInt(1,id);
		ResultSet resultSet=statement.executeQuery();

		if(resultSet.next()){
			Address address=new Address();
			address.setId(id);
			address.setDoorNo(resultSet.getString(2));
			address.setAreaName(resultSet.getString(3));
			address.setCity(resultSet.getString(4));
			address.setPincode(resultSet.getString(5));
			address.setState(resultSet.getString(6));
			address.setcId(resultSet.getInt(7));

			return address;
		}
		
		ConnectionManager.closeConnection(connection);

		return null;
	}

	@Override
	public List<Address> getAllAddresss() throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ALL_QUERY);
		List<Address> allAddresss=new ArrayList<>();
		ResultSet resultSet=statement.executeQuery();

		while(resultSet.next()){
			Address address=new Address();
			address.setId(resultSet.getInt(1));
			address.setDoorNo(resultSet.getString(2));
			address.setAreaName(resultSet.getString(3));
			address.setCity(resultSet.getString(4));
			address.setPincode(resultSet.getString(5));
			address.setState(resultSet.getString(6));
			address.setcId(resultSet.getInt(7));
			allAddresss.add(address);
		}
		ConnectionManager.closeConnection(connection);

		return allAddresss;
	}

}
