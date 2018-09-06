package com.ameex.training.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.ameex.training.bean.Sale;

public class Main6 {
	
	static Map<String, Double> analyzeSales(List<Sale> sales){
		 Map<String, Double> map=new HashMap<>();
		 map.put("LOWEST", sales.get(0).getAmount());
		 map.put("HIGHEST", sales.get(0).getAmount());
		 map.put("SUM", 0.0);
		 map.put("AVERAGE", 0.0);
		 
		 double sum=0;
		 for (Sale sale : sales) {
		
			 if(sale.getAmount()<map.get("LOWEST")){
				 
				 map.put("LOWEST", sale.getAmount());
				 
			 }

			 if(sale.getAmount()>map.get("HIGHEST")){
				 
				 map.put("HIGHEST", sale.getAmount());
			 }
			  sum+=sale.getAmount();
			
			 
			
		}
		 double avg=sum/sales.size();
		 map.put("SUM", sum);
		 map.put("AVERAGE", avg);
		 

		return map;
	}
	static Map<String, Integer> getProductSalesCount(List<Sale> sales) {
		Map<String, Integer> countMap = new HashMap<>();
		Set<String> products = getProductNames(sales);
		for (String prod : products) {
			int count = 0;
			for (Sale s : sales) {
				if (s.getProductName().equals(prod))
					count = count + 1;
			}
			countMap.put(prod, count);
		}
		return countMap;
	}

	static Map<String, Double> getProductSalesMap(List<Sale> sales) {
		Map<String, Double> amountMap = new HashMap<>();
		Set<String> products = getProductNames(sales);
		for (String string : products) {
			double count = 0;
			for (Sale s : sales) {
				if (s.getProductName().equals(string))
					count = count + s.getAmount();
			}
			amountMap.put(string, count);
		}
		return amountMap;
	}

	static Set<String> getProductNames(List<Sale> sales) {
		if (sales.isEmpty())
			return null;

		else {
			Set<String> productNames = new TreeSet();
			for (Sale sale : sales) {
				productNames.add(sale.getProductName());
			}
			return productNames;
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

   // Map<String,Double> map=analyzeSales(allSales);
		   Map<String, Double> map=getProductSalesMap(allSales);
		//Map<String,Integer> map=getProductSalesCount(allSales);
    
    System.out.println(map);

}
}
