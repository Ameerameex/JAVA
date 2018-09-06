package com.training.db;

import java.util.List;

import com.training.business.Product;

public interface ProductDAO {
	boolean addProduct(Product product) throws Throwable;

	boolean deleteProduct(Product product) throws Throwable;

	boolean updateProduct(Product product) throws Throwable;

	Product findProduct(int id) throws Throwable;

	List<Product> getAllProducts() throws Throwable;

}