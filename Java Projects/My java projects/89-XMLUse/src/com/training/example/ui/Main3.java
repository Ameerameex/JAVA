package com.training.example.ui;

import java.util.Date;

import com.training.example.business.Product;
import com.training.example.common.Persistence;
import com.training.example.common.XMLBasedPersistence;

public class Main3 {

	public static void main(String[] args) throws Throwable {

		Product product=new Product(2000," DELL", 4000.00, new Date(), 'L');
		
		Persistence persistence=new XMLBasedPersistence();
		
		//System.out.println(persistence.save(product));
		
		//Product product2=new Product();
		//product2.setId(2000);
		//System.out.println(persistence.delete(product2));
//		product2.setId(413);
//		product2.setName("MatchBox");
//		product2.setPrice(600.00);
//		product2.setCategory('A');
//		product2.setManufacturedDate(new Date());
//		//System.out.println(persistence.update(product2));
	//Product product2=(Product) persistence.find(Product.class, new Integer(413));
	//System.out.println(product2);
		System.out.println(persistence.getAll(Product.class));
		
		
	}

}
