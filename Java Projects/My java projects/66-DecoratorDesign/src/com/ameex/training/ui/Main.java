package com.ameex.training.ui;

import com.ameex.training.business.Charger;
import com.ameex.training.business.Computer;
import com.ameex.training.business.Mouse;
import com.ameex.training.business.Product;

public class Main {

	public static void main(String[] args) {

		Product product;
		product=new Computer(null);
		System.out.println(product.getPrice());
		Product product2=new Mouse(product);
		
		System.out.println(product2.getPrice());
		Product product3=new Charger(product2);
		System.out.println(product3.getPrice());
		System.out.println(product3.getDiscount());

		
		
	}

}
