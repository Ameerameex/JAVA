package com.ameex.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ameex.training.bean.Sale;

public class Main5 {
	
	static List<Sale> findValidData(List<Sale> sales){
		List<Sale> validSales=new ArrayList<>();
		Iterator<Sale> iterator=sales.iterator();
		 while(iterator.hasNext()){
			 Sale sale=iterator.next();
			 if(sale.getSalesManName()!=null){
				 if(sale.getSalesManName().length()>0){
					 if(sale.getProductName()!=null){
						 
						 if(sale.getProductName().length()>0){
							 if(sale.getSalesCity()!=null){
								 if(sale.getSalesCity().length()>0){
									 if(sale.getQuantity()>0){
										 if(sale.getPrice()>0){
											 validSales.add(sale);
										 }
									 }
									 
								 }
								 
							 }
						 }
					 }
					 
				 }
					 
				 
				 
			 }
			 
		 }
		
		
		return validSales;
	}
	
	
	static Sale createSale(String salesManName,String productName,String cityName,int quantity,double price){
		Sale sale=new Sale(salesManName, cityName, productName, quantity, price);
		return sale;
		
	}

	public static void main(String[] args) {

		
		List<Sale> allSales=new ArrayList<>();
		allSales.add(createSale("Suriya", "TV", "Chennai", 10, 7777.77));
		allSales.add(createSale("Kumar", "TV", "Madurai", 8, 10000.77));
		allSales.add(createSale("", "TV", "Chennai", 7, 11000.77));
		allSales.add(createSale("JB", null, "Madurai", 6, 12000.77));
		allSales.add(createSale("Madhan", "TV", "Chennai", 5, 13000.77));
		
		allSales.add(createSale("Suriya", "Mobile", "Chennai", 5, 2800.77));
		allSales.add(createSale("Kumar", "Mobile", "Madurai", 4, 2400.77));
		allSales.add(createSale("Hari", "Mobile", "Madurai", 9, 5200.77));
		allSales.add(createSale("JB", "Mobile", "Madurai", 0, 2900.77));
		allSales.add(createSale("Madhan", "Mobile", "Chennai", 1, 3200.77));
		
		allSales.add(createSale("Suriya", "Laptop", "Chennai", 2, 4500.77));
		allSales.add(createSale(null, "Laptop", "Madurai", 3, 8450.77));
		allSales.add(createSale("Hari", "Laptop", "Madurai", 0, 4525.77));
		allSales.add(createSale("JB", "Laptop", "Madurai", 5, 4200.77));
		allSales.add(createSale("Madhan", "Laptop", "Chennai", 6, 4500.77));
		
		List<Sale> validData =findValidData(allSales);
		
		//print valid sales here
		
		System.out.println(validData);
	}

}
