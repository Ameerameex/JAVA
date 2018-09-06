package com.ameex.training.business;

public class Computer extends Product{

	public Computer(Product product) {
		super(product);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		if(product==null){
			return 50000;
		}
		else{
			return product.getPrice()+50000;

		}
	}

	@Override
	public double getDiscount() {
      if(product==null)
		return 1000;
      else{
    	  return product.getDiscount()+1000;
      }
	}

}
