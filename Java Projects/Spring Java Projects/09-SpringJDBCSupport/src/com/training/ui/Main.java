package com.training.ui;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.business.Product;
import com.training.db.ProductDAO;

public class Main {

	static void insertTest() throws Throwable {
		Product product = new Product(101, "Fan", 1005.12, new Date(), 'E');
		
		ProductDAO dao = getProductDAO();
	System.out.println(dao.addProduct(product));
	}

	private static ProductDAO getProductDAO() {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans1.xml");
		
		ProductDAO dao=(ProductDAO) applicationContext.getBean("daoBean");
		return dao;
	}

	static void deleteTest() throws Throwable {
		Product product = new Product();
		product.setId(101);
		ProductDAO dao = getProductDAO();
	System.out.println(dao.deleteProduct(product));
	}

	static void updateTest() throws Throwable {
		Product product = new Product(102, "Lenovo", 1000.13, new Date(), 'B');
		ProductDAO dao = getProductDAO();
		System.out.println(dao.updateProduct(product));
	}

	static void findTest() throws Throwable {
		int id = 103;
		ProductDAO dao = getProductDAO();
		Product product = dao.findProduct(id);
		System.out.println(product);

	}

	static void findAllTest() throws Throwable {
		ProductDAO dao = getProductDAO();

		List<Product> products = dao.getAllProducts();
		for (Product product : products) {
			System.out.println(product);
		}
	}

	public static void main(String[] args) throws Throwable {

		 //insertTest();
		//updateTest();
	deleteTest();
		//findTest();
		// findAllTest();

	}

}
