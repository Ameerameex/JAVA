package com.ameex.training.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ameex.training.bean.Sale;

public class Main2 {
	
	static void fillProductNames(List<Sale> sales,Set<String> names){
		if(sales.isEmpty()){
			return;
		}
		for (Sale sale : sales) {
			names.add(sale.getProductName());
		}
		
	}
	static void fillExecutiveNames(List<Sale> sales,Set<String> names){
		if(sales.isEmpty()){
			return;
		}
		for (Sale sale : sales) {
			names.add(sale.getSalesManName());
		}
		
	}
	static void fillCityNames(List<Sale> sales,Set<String> names){
		if(sales.isEmpty()){
			return;
		}
		for (Sale sale : sales) {
			names.add(sale.getSalesCity());
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
		
		Set<String> cities=new TreeSet<>();
		Set<String> executives=new TreeSet<>();
		Set<String> prodNames=new TreeSet<>();
		fillProductNames(allSales, prodNames);
		System.out.println(prodNames);
		fillExecutiveNames(allSales, executives);
		System.out.println(executives);
		fillCityNames(allSales, cities);
		System.out.println(cities);



	}

}
