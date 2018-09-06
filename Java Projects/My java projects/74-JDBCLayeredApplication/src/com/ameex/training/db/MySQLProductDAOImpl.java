package com.ameex.training.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ameex.training.business.Product;

public class MySQLProductDAOImpl implements ProductDAO,MySQLProductQueries {

	@Override
	public boolean addProduct(Product product) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(INSERT_QUERY);
		statement.setInt(1, product.getId());
		statement.setString(2, product.getName());
		statement.setDouble(3, product.getPrice());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean deleteProduct(Product product) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(DELETE_QUERY);
		statement.setInt(1, product.getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean updateProduct(Product product) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(UPDATE_QUERY);
		
		statement.setString(1, product.getName());
		statement.setDouble(2, product.getPrice());
		statement.setInt(3, product.getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);
		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public Product findProduct(int id) throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ONE_QUERY);
		statement.setInt(1,id);
		ResultSet resultSet=statement.executeQuery();

		if(resultSet.next()){
			Product product=new Product();
			int i=resultSet.getInt(1);
			String j=resultSet.getString(2);
			double k=resultSet.getDouble(3);
			product.setId(i);
			product.setName(j);
			product.setPrice(k);
			return product;
		}
		
		ConnectionManager.closeConnection(connection);

		return null;
	}

	@Override
	public List<Product> getAllProducts() throws Throwable {
		Connection connection=ConnectionManager.getConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ALL_QUERY);
		List<Product> allProducts=new ArrayList<>();
		ResultSet resultSet=statement.executeQuery();

		while(resultSet.next()){
			Product product=new Product();
			int i=resultSet.getInt(1);
			String j=resultSet.getString(2);
			double k=resultSet.getDouble(3);
			product.setId(i);
			product.setName(j);
			product.setPrice(k);
			allProducts.add(product);
		}
		ConnectionManager.closeConnection(connection);

		return allProducts;
	}

}
