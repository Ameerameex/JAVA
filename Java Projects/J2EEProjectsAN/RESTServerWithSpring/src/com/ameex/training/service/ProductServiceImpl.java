package com.ameex.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.ameex.training.business.Product;
import com.ameex.training.db.ProductDAO;


@Service(value="productService")
public class ProductServiceImpl implements ProductService{
	

	@Autowired
	ProductDAO productDAO;
	
	
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
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
