package com.training.example.ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.training.example.business.Product;
import com.training.example.db.MySQLProductDAOImplementation;
import com.training.example.db.MySQLProductDAOImplementation2;
import com.training.example.db.ProductDAO;

public class Main {

	public static void main(String[] args) throws Throwable {
		Scanner scanner = new Scanner(System.in);
		OutputUtil outputUtil=new OutputUtil();

		int choice = 0;
		do {
			System.out.println();
			outputUtil.printData("\t\t 1.ADD PRODUCTS", 15,Alignments.RIGHT);
			System.out.println("\t\t 2.SEARCH PRODUCT");
			System.out.println("\t\t 3.EDIT PRODUCT");
			System.out.println("\t\t 4.DISPLAY ALL PRODUCTS");
			System.out.println("\t\t 5.DELETE PRODUCT");
			System.out.println("\t\t 6.EXIT");
			System.out.println("\n\n");
			System.out.println("\t\tEnter your Choice :");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("\n\n\n");
				System.out.println("\t\t New Product ");
				System.out.println("\n\n\n");

				System.out.print("\t\t product ID :");
				int id=scanner.nextInt();
				
				System.out.print("\t\t product Name :");
				String name=scanner.next();
				
				System.out.print("\t\t product Price :");
				double price=scanner.nextDouble();
				System.out.print("\t\t Manufactured Date :");
				String string=scanner.next();
				Date mDate=new SimpleDateFormat("dd-MM-yyyy").parse(string);
				System.out.print("\t\t Category :");
				char category=scanner.next().charAt(0);
				

				Product product=new Product(id, name, price,mDate,category);
				
				ProductDAO dao=new MySQLProductDAOImplementation2();
				
				boolean status=dao.addProduct(product);
				if(status){
					System.out.println("Added");
				}
				else{
					System.out.println("not added");
				}
				
				break;
			case 2:
				System.out.println("\n\n\n");
				System.out.println("\t\t Find Product ");
				System.out.println("\n\n\n");
				
				System.out.print("\t\t product ID to find :");
				int findId=scanner.nextInt();
				Product product2=new Product();
				product2.setId(findId);
				ProductDAO dao2=new MySQLProductDAOImplementation2();
				product2=dao2.findProduct(findId);
				if(product2!=null){
					System.out.println(product2);
				}
				else{
					System.out.println("product Not Found");
				}
				
				break;
			case 3:
				System.out.println("\n\n\n");
				System.out.println("\t\t Edit Product ");
				System.out.println("\n\n\n");
				
				
				System.out.print("\t\t product ID :");
				int editId1=scanner.nextInt();
				
				System.out.print("\t\t product Name :");
				String name1=scanner.next();
				
				System.out.print("\t\t product Price :");
				double price1=scanner.nextDouble();
				System.out.print("\t\t Manufactured Date :");
				String string1=scanner.next();
				Date mDate1=new SimpleDateFormat("dd-MM-yyyy").parse(string1);
				System.out.print("\t\t Category :");
				char category1=scanner.next().charAt(0);
				Product product5=new Product(editId1, name1, price1,mDate1,category1);
				
				ProductDAO dao5=new MySQLProductDAOImplementation2();
				boolean status3=dao5.updateProduct(product5);
				if(status3){
					System.out.println("Updated");
				}
				else{
					System.out.println("Not Updated");
				}
			
				
				break;
			case 4:
				System.out.println("\n\n\n");
				System.out.println("\t\t Display Product ");
				System.out.println("\n\n\n");
   
				ProductDAO dao3=new MySQLProductDAOImplementation2();
				List<Product> products=dao3.getAllProducts();
				System.out.printf("%15s%15s%15s\t%25s\t%15s%s","ID","NAME","PRICE","MANUFACTURINGDATE","CATEGORY","\n" );
				
				for (Product product3 : products) {
					
					System.out.println(product3);
					
				}
				
				break;
			case 5:
				System.out.println("\n\n\n");
				System.out.println("\t\t Delete Product ");
				System.out.println("\n\n\n");
				System.out.print("\t\t product ID to Delete:");
				int deleteId=scanner.nextInt();
				
				Product product4=new Product();
				product4.setId(deleteId);
				ProductDAO dao4=new MySQLProductDAOImplementation2();
				
				boolean status4=dao4.deleteProduct(product4);
				if(status4){
					System.out.println("Deleted");
				}
				else{
					System.out.println("not deleted");
				}
				
				break;
				
			
			
			
			}

		} while (choice != 6);
	}

}
