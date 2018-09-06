package com.ameex.training.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ameex.training.business.Product;
import com.ameex.training.db.ProductDAO;

public interface ProductService {

	boolean addProduct(Product product) throws Throwable;
	boolean deleteProduct(Product product) throws Throwable;
	boolean updateProduct(Product product) throws Throwable;
	Product findProduct(int id) throws Throwable;
	List<Product> getAllProducts() throws Throwable;
	
	
	void setProductDAO(ProductDAO productDAO);
	
	
}
