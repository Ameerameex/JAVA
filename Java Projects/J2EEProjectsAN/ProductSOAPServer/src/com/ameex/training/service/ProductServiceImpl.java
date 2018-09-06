package com.ameex.training.service;

import java.util.List;

import javax.jws.WebService;

import com.ameex.training.business.Product;
import com.ameex.training.db.MySQLProductDAOImpl;
import com.ameex.training.db.ProductDAO;

@WebService(endpointInterface="com.ameex.training.service.ProductService")
public class ProductServiceImpl implements ProductService {

	ProductDAO productDAO;
	
	
	

	public ProductServiceImpl() {
		super();

		productDAO=new MySQLProductDAOImpl();
	}
	@Override
	public boolean addProduct(Product product) throws Throwable {

		return productDAO.addProduct(product);
	}
	@Override
	public boolean deleteProduct(Product product) throws Throwable {

		return productDAO.deleteProduct(product);
	}
	@Override
	public boolean updateProduct(Product product) throws Throwable {

		return productDAO.updateProduct(product);
	}
	@Override
	public Product findProduct(int id) throws Throwable {

		return productDAO.findProduct(id);
	}
	@Override
	public List<Product> getAllProducts() throws Throwable {

		return productDAO.getAllProducts();
	}
}
