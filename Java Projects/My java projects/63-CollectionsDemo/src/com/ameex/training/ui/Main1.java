package com.ameex.training.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ameex.training.bean.Sale;

public class Main1 {
	
	
	static Set<String> getProductNames(List<Sale> sales){
		if(sales.isEmpty()){
			return Collections.emptySet();
		}
		else{
		
		Set<String> productName=new TreeSet<>();
		for(Sale sale:sales){
			productName.add(sale.getProductName());
		}
		
		return productName;
		}
	}
	static Set<String> getCityName(List<Sale> sales){
		if(sales.isEmpty()){
			return null;
		}
		else{
			Set<String> cityNames=new HashSet<>();
			for (Sale sale :sales) {
				cityNames.add(sale.getSalesCity());
				
			}
			return cityNames;
		}
		
	}
	static Set<String> getName(List<Sale> sales){
		if(sales.isEmpty()){
			return null;
		}
		else{
			Set<String> Names=new HashSet<>();
			for (Sale sale :sales) {
				Names.add(sale.getSalesManName());
				
			}
			return Names;
		}
		
	}
	static Sale createSale(String salesManName,String productName,String cityName,int quantity,double price){
		Sale sale=new Sale(salesManName, cityName, productName, quantity, price);
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

//System.out.println(getProductNames(allSales));
//System.out.println(getCityName(allSales));
//System.out.println(getName(allSales));
		//System.out.println(allSales);
		Collections.shuffle(allSales);
		//System.out.println(allSales);
		Collections.shuffle(allSales);
		//System.out.println(allSales);
		
		Sale[] array=new Sale[allSales.size()];
		allSales.toArray(array);
		
		System.out.println(Arrays.toString(array));
		
		List<Sale> mySales=new ArrayList<>(allSales);
		
		List<Sale> mySales2=Arrays.asList(array);
		
		System.out.println(getProductNames(allSales));
		System.out.println(getProductNames(allSales).size());
		
		List<Sale> febSales= new ArrayList<>();
		System.out.println(getProductNames(febSales));
		
		//if(getProductNames(febSales)!=null)
		
		System.out.println(getProductNames(febSales).size());


		



		
	}

}
