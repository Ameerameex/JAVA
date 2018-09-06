package com.ameex.training.service;

import java.util.List;

import javax.jws.WebService;

import com.ameex.training.business.Product;

@WebService
public interface ProductService {

	boolean addProduct(Product product) throws Throwable;
	boolean deleteProduct(Product product) throws Throwable;
	boolean updateProduct(Product product) throws Throwable;
	Product findProduct(int id) throws Throwable;
	List<Product> getAllProducts() throws Throwable;
	

	
	
}
