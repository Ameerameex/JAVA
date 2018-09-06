package com.ameex.training.business;

public class Charger extends Product {

	public Charger(Product product) {
		super(product);
	}

	@Override
	public double getPrice() {
		if(product==null)
		return 2000;
		else{
			return product.getPrice()+2000;
		}
	}

	@Override
	public double getDiscount() {
		if(product==null)
			return 200;
	      else{
	    	  return product.getDiscount()+200;
	      }
	}

}
