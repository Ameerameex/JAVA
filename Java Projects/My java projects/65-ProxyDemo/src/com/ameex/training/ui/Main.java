package com.ameex.training.ui;

import com.ameex.training.business.Product;
import com.ameex.training.business.ProductImplements;
import com.ameex.training.business.ProductValidationImpl;

public class Main {

	public static void main(String[] args) {
		
		Product product;
		product=new ProductValidationImpl();
		product.setId(10);
		product.setName("Suriya");
		product.setPrice(1900);
		
	System.out.println(product.getName());
	System.out.println(product.getPrice());
	System.out.println(product.getId());
	}

}
