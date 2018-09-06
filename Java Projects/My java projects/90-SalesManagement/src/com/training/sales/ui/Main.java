package com.training.sales.ui;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.training.sales.business.SalesDetail;
import com.training.sales.db.SalesDetailsDAO;
import com.training.sales.db.SalesDetailsDAOImpl;

public class Main {

	public static void main(String[] args) throws Throwable {

		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println();
			System.out.println("\t\t 1.ADD SALE DETAILS");
			System.out.println("\t\t 2.DISPLAY SALE DETAILS");
			System.out.println("\t\t 3.DELETE DETAILS");
			System.out.println("\t\t 4.FIND DETAILS");

			System.out.println("\t\t 5.EXIT");
			System.out.println();

			System.out.println("Enter Your Choice :");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				SalesDetail detail = new SalesDetail();
				System.out.print("\t\t Enter the SalesMan Name :");
				String salesManName = scanner.next();

				System.out.print("\t\t Enter the Sales Date :");
				String str = scanner.next();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

				java.util.Date salesDate = dateFormat.parse(str);

				System.out.print("\t\t Enter the Sales Amount :");
				double salesAmount = scanner.nextDouble();

				System.out.print("\t\t Enter the Sales Product Name :");
				String salesProduct = scanner.next();

				detail.setSalesAmount(salesAmount);
				detail.setSalesDate(salesDate);
				detail.setSalesManName(salesManName);
				detail.setSalesProductName(salesProduct);
				SalesDetailsDAO detailsDAO = new SalesDetailsDAOImpl();
			boolean status=	detailsDAO.addSales(detail);
			if(status==true){
				System.out.println("ADDED");
			}
			else{
				System.out.println("Not Added");
			}
				break;

			case 2:
				SalesDetailsDAO detailsDAO1 = new SalesDetailsDAOImpl();
				System.out.println(detailsDAO1.getAllSalesDetails());
				break;
			case 3:	SalesDetail detail1 = new SalesDetail();
			SalesDetailsDAO detailsDAO2 = new SalesDetailsDAOImpl();

			System.out.print("\t\t Enter the SalesMan Name to Delete :");
			String salesManName1 = scanner.next();
			detail1.setSalesManName(salesManName1);
			boolean status1=detailsDAO2.deleteSales(detail1);
			if(status1==true){
			System.out.println("Deleted");
			}
			else{
				System.out.println("Not Deleted");
			}
				break;
			case 4:	SalesDetail detail2 = new SalesDetail();
			SalesDetailsDAO detailsDAO3 = new SalesDetailsDAOImpl();

			System.out.print("\t\t Enter the SalesMan Name to find :");
			String salesManName2 = scanner.next();
			detail2.setSalesManName(salesManName2);
			SalesDetail salesDetail=detailsDAO3.findSales(salesManName2);
			System.out.println(salesDetail);
			break;
			
			case 5:
				System.out.println("\t\t Thank You !!");
				break;
			}

		} while (choice != 4);

	}
}
