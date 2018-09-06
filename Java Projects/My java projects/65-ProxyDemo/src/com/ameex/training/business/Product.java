package com.ameex.training.business;

abstract public class Product {

	int id;
	String name;
	double price;
	abstract public  int getId();
	
	
	abstract public  void setId(int id) ;
	
	abstract public  String getName() ;
	
	abstract public  void setName(String name) ;
		
	abstract public  double getPrice() ;
	
	abstract public  void setPrice(double price) ;
	
	
	
}
