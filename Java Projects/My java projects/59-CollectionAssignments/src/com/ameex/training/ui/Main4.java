package com.ameex.training.ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.ameex.training.bean.Sale;

public class Main4 {

	static void printSalesForCity(List<Sale> sales, String cityName) {
		System.out.println("CityName :  " + cityName);
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("SalesManName" + "\t\t" + "Product" + "\t\t" + "Quantity" + "\t\t" + "Price" + "\t\t" + "Amount");
		System.out.println("---------------------------------------------------------------------------------------");

		if (sales == null || sales.isEmpty()) {

			return;
		} else {
			Iterator<Sale> iterator = sales.iterator();

			while (iterator.hasNext()) {

				Sale sale = iterator.next();
				if ((sale.getSalesCity().equalsIgnoreCase(cityName))) {
					{

						String name = sale.getSalesManName();
						String product = sale.getProductName();
						int quantity = sale.getQuantity();
						double price = sale.getPrice();
						double amount = sale.getAmount();
						String output = String.format("%8s%25s%15d%25.0f%15.0f", name, product, quantity, price, amount);
						System.out.println(output);

					}

				}

			}

		}

	}
	static Set<String> getCityNames(List<Sale> sales){
		
		if(sales.isEmpty())
			return null;
		else{
		Set<String> cityNames=new TreeSet<>();
		for (Sale sale : sales) {
			
			cityNames.add(sale.getSalesCity());
			
		}
		return cityNames;
		}
	}

	static Sale createSale(String salesManName, String productName, String cityName, int quantity, double price) {
		Sale sale = new Sale(salesManName, cityName, productName, quantity, price);
		return sale;

	}

	public static void main(String[] args) {
		List<Sale> allSales = new ArrayList<>();
		allSales.add(createSale("Suriya", "TV", "Chennai", 10, 7777.77));
		allSales.add(createSale("Kumar", "TV", "Madurai", 8, 10000.77));
		allSales.add(createSale("Harish", "TV", "Chennai", 7, 11000.77));
		allSales.add(createSale("JB", "TV", "Madurai", 6, 12000.77));
		allSales.add(createSale("Madhan", "TV", "Chennai", 5, 13000.77));

		allSales.add(createSale("Suriya", "Mobile", "Chennai", 5, 2800.77));
		allSales.add(createSale("Kumar", "Mobile", "Madurai", 4, 2400.77));
		allSales.add(createSale("Harish", "Mobile", "Madurai", 9, 5200.77));
		allSales.add(createSale("JB", "Mobile", "Madurai", 7, 2900.77));
		allSales.add(createSale("Madhan", "Mobile", "Chennai", 1, 3200.77));

		allSales.add(createSale("Suriya", "Laptop", "Chennai", 2, 4500.77));
		allSales.add(createSale("Kumar", "Laptop", "Madurai", 3, 8450.77));
		allSales.add(createSale("Harish", "Laptop", "Madurai", 4, 4525.77));
		allSales.add(createSale("JB", "Laptop", "Madurai", 5, 4200.77));
		allSales.add(createSale("Madhan", "Laptop", "Chennai", 6, 4500.77));

	//	printSalesForCity(allSales, "chennai");
		
		Set<String> cities=getCityNames(allSales);
		for (String cityNames : cities) {
			System.out.println();
			printSalesForCity(allSales, cityNames);
		
	}

}
}