package com.training.example.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.training.example.business.Product;

public class MySQLProductDAOImplementation2 implements ProductDAO, ProductQueries {

	private ResultSet resultSet;
	private List<Product> allProducts;

	public MySQLProductDAOImplementation2() {
		super();
		init();
	}

	private void init() {
		Connection connection = ConnectionManager.createConnection();

		try {
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery(SELECT_ALL);
			allProducts = new ArrayList<>();
			while (resultSet.next()) {
				if (allProducts == null) {
					allProducts = new ArrayList<Product>();
				}
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double price = resultSet.getDouble("price");
				java.sql.Date sDate = resultSet.getDate("mdate");
				java.util.Date mDate = DateConversion.convertToUtilDate(sDate);
				char category = resultSet.getString("category").charAt(0);
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
		resultSet.updateInt("id", product.getId());
		resultSet.updateString("name", product.getName());
		resultSet.updateDouble("price", product.getPrice());
		java.sql.Date sDate = DateConversion.convertToSQLDate(product.getManufacturedDate());
		resultSet.updateDate("mdate", sDate);
		resultSet.updateString("category", product.getCategory() + "");
		resultSet.insertRow();
		allProducts.add(product);

		return true;
	}

	@Override
	public boolean deleteProduct(Product product) throws Throwable {
		resultSet.beforeFirst();
		while (resultSet.next()) {
			if (resultSet.getInt("id") == product.getId()) {
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
		while (resultSet.next()) {
			if (resultSet.getInt("id") == product.getId()) {
				resultSet.updateInt("id", product.getId());
				resultSet.updateString("name", product.getName());
				resultSet.updateDouble("price", product.getPrice());
				java.sql.Date sDate = DateConversion.convertToSQLDate(product.getManufacturedDate());
				resultSet.updateDate("mdate", sDate);
				resultSet.updateString("category", product.getCategory() + "");
				resultSet.updateRow();
				int position = allProducts.indexOf(product);
				allProducts.set(position, product);
				return true;
			}
		}
		return false;
	}

	@Override
	public Product findProduct(int id) throws Throwable {

		resultSet.beforeFirst();
		while (resultSet.next()) {
			if (resultSet.getInt("id") == id) {
				int id1 = resultSet.getInt("id");
				String name = resultSet.getString("name");
				double price = resultSet.getDouble("price");
				java.sql.Date sDate = resultSet.getDate("mdate");
				java.util.Date mDate = DateConversion.convertToUtilDate(sDate);
				char category = resultSet.getString("category").charAt(0);
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
