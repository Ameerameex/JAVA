package com.training.example.db;

import java.util.List;

import com.training.example.business.Product;
import com.training.example.common.Persistence;
import com.training.example.common.XMLBasedPersistence;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public boolean addProduct(Product product) throws Throwable {
		Persistence<Product> persistence=new XMLBasedPersistence<Product>();
		
		return persistence.save(product);
		
		 
	}

	@Override
	public boolean deleteProduct(Product product) throws Throwable {
Persistence<Product> persistence=new XMLBasedPersistence<Product>();
		
		return persistence.delete(product);
	}

	@Override
	public boolean updateProduct(Product product) throws Throwable {
Persistence<Product> persistence=new XMLBasedPersistence<Product>();
		
		return persistence.update(product);
	}

	@Override
	public Product findProduct(int id) throws Throwable {
		Persistence<Product> persistence=new XMLBasedPersistence<Product>();

		return persistence.find(Product.class, id);
	}

	@Override
	public List<Product> getAllProducts() throws Throwable {
		Persistence<Product> persistence=new XMLBasedPersistence<Product>();

		return persistence.getAll(Product.class);
	}

}
