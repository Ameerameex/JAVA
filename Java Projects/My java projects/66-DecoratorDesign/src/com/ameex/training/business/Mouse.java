package com.ameex.training.business;

public class Mouse extends Product {

	public Mouse(Product product) {
		super(product);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
if(product==null){
	return 300.00;
}
else{
		return product.getPrice()+300.00;
	}

	
	
}

	@Override
	public double getDiscount() {
		if(product==null)
			return 50;
	      else{
	    	  return product.getDiscount()+50;
	      }
		
	}
}
