package com.ameex.training.ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.ameex.training.bean.QuantityComparator;
import com.ameex.training.bean.Sale;

public class Main3 {
	static void filterSalesByRange(List<Sale> sales,Double startRange,double EndRange){
    if(sales==null ||sales.isEmpty()){
			
			return;
		}
    else{
		Iterator<Sale> iterator=sales.iterator();
		
		while(iterator.hasNext()){
			
			Sale sale=iterator.next();
			if((sale.getAmount()<=startRange||sale.getAmount()>=EndRange)){
				iterator.remove();
			}
				
				
		}

    }
		
	}
	
	static void filterChennaiSales(List<Sale> sales){
		if(sales==null ||sales.isEmpty()){
			
			return;
		}
		else{
		Iterator<Sale> iterator=sales.iterator();
		while(iterator.hasNext()){
			Sale sale=iterator.next();
			if(!sale.getSalesCity().equalsIgnoreCase("Chennai")){
				
				iterator.remove();
			}
		
			
		}
		}
	}static void filterSalesForCity(List<Sale> sales,String cityName){
		if(sales==null ||sales.isEmpty()){
			
			return;
		}
		else{
		Iterator<Sale> iterator=sales.iterator();
		while(iterator.hasNext()){
			Sale sale=iterator.next();
			if(!sale.getSalesCity().equalsIgnoreCase(cityName)){
				
				iterator.remove();
			}
		
			
		}
		}
	}
	
	static Sale createSale(String salesManName,String productName,String cityName,int quantity,double price){
		Sale sale=new Sale(salesManName, cityName,productName,  quantity, price);
		return sale;
		
	}

	public static void main(String[] args) {

		List<Sale> allSales=new ArrayList<>();
		allSales.add(createSale("Suriya", "TV", "Chennai", 10, 7777.77));
		allSales.add(createSale("Kumar", "TV", "Madurai", 8, 10000.77));
		allSales.add(createSale("Hari", "TV", "Chennai", 7, 11000.77));
		allSales.add(createSale("JB", "TV", "Madurai", 6, 12000.77));
		allSales.add(createSale("Madhan", "TV", "Chennai", 5, 13000.77));
		
		allSales.add(createSale("Suriya", "Mobile", "Chennai", 5, 2800.77));
		allSales.add(createSale("Kumar", "Mobile", "Madurai", 4, 2400.77));
		allSales.add(createSale("Hari", "Mobile", "Madurai", 9, 5200.77));
		allSales.add(createSale("JB", "Mobile", "Madurai", 7, 2900.77));
		allSales.add(createSale("Madhan", "Mobile", "Chennai", 1, 3200.77));
		
		allSales.add(createSale("Suriya", "Laptop", "Chennai", 2, 4500.77));
		allSales.add(createSale("Kumar", "Laptop", "Madurai", 3, 8450.77));
		allSales.add(createSale("Hari", "Laptop", "Madurai", 4, 4525.77));
		allSales.add(createSale("JB", "Laptop", "Madurai", 5, 4200.77));
		allSales.add(createSale("Madhan", "Laptop", "Chennai", 6, 4500.77));
	
		//System.out.println(allSales);
		
		//Collections.sort(allSales);
		Collections.sort(allSales, new QuantityComparator());
		
		System.out.println(allSales);
		
		
	}

}
