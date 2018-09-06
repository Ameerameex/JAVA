package com.training.example.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.example.business.Product;

public class MySQLProductDAOImplementation implements ProductDAO, ProductQueries {

	private ResultSet resultSet;
	private List<Product> allProducts;

	public MySQLProductDAOImplementation() {
		super();
		init();
	}

	private void init() {
		Connection connection = ConnectionManager.createConnection();

		try {
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery(SELECT_ALL);
			allProducts=new ArrayList<>();
			while (resultSet.next()) {
				if (allProducts == null) {
					allProducts = new ArrayList<Product>();
				}
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				double price = resultSet.getDouble(3);
				java.sql.Date sDate = resultSet.getDate(4);
				java.util.Date mDate = DateConversion.convertToUtilDate(sDate);
				char category = resultSet.getString(5).charAt(0);
				Product product = new Product(id, name, price, mDate, category);
				allProducts.add(product);

			}
		} catch (SQLException e) {

			System.out.println("Error creating result");
			System.exit(0);
		}

	}

	@Override
	public boolean addProduct(Product product) throws Throwable {
		resultSet.moveToInsertRow();
		resultSet.updateInt(1, product.getId());
		resultSet.updateString(2, product.getName());
		resultSet.updateDouble(3, product.getPrice());
		java.sql.Date sDate = DateConversion.convertToSQLDate(product.getManufacturedDate());
		resultSet.updateDate(4, sDate);
		resultSet.updateString(5, product.getCategory() + "");
		resultSet.insertRow();
		allProducts.add(product);

		return true;
	}

	@Override
	public boolean deleteProduct(Product product) throws Throwable {
		resultSet.beforeFirst();
		while (resultSet.next()) {
			if (resultSet.getInt(1) == product.getId()) {
				resultSet.deleteRow();
				allProducts.remove(product);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean updateProduct(Product product) throws Throwable {
		resultSet.beforeFirst();
	while(resultSet.next()){
		if(resultSet.getInt(1)==product.getId()){
			resultSet.updateInt(1, product.getId());
			resultSet.updateString(2, product.getName());
			resultSet.updateDouble(3, product.getPrice());
			java.sql.Date sDate = DateConversion.convertToSQLDate(product.getManufacturedDate());
			resultSet.updateDate(4, sDate);
			resultSet.updateString(5, product.getCategory() + "");
			resultSet.updateRow();
			int position=allProducts.indexOf(product);
			allProducts.set(position, product);
			return true;
		}}
		return false;
	}

	@Override
	public Product findProduct(int id) throws Throwable {
		
		resultSet.beforeFirst();
		while(resultSet.next()){
			if(resultSet.getInt(1)==id){
				int id1 = resultSet.getInt(1);
				String name = resultSet.getString(2);
				double price = resultSet.getDouble(3);
				java.sql.Date sDate = resultSet.getDate(4);
				java.util.Date mDate = DateConversion.convertToUtilDate(sDate);
				char category = resultSet.getString(5).charAt(0);
				Product product = new Product(id, name, price, mDate, category);
				return product;
			}
		}
		return null;
	}

	@Override
	public List<Product> getAllProducts() throws Throwable {
		return allProducts;
	}

}
