package com.training.medicine.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.training.medicine.business.Medicine;
import com.training.medicine.db.MedicineDAO;
import com.training.medicine.db.MedicineDAOImpl;

public class Main {

	public static void main(String[] args) throws Throwable {

		int choice;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println();
			System.out.println("\t\t 1.ADD MEDICINE ");
			System.out.println("\t\t 2.DISPLAY MEDICINES");
			System.out.println("\t\t 3.DELETE MEDICINE");
			System.out.println("\t\t 4.UPDATE MEDICINE");
			System.out.println("\t\t 5.FIND MEDICINE");
			System.out.println("\t\t 6.EXIT");
			System.out.println();

			System.out.print("\t\t Enter your choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:

				System.out.println("\t\t Enter the BatchNo :");

				int batchNo = scanner.nextInt();
				System.out.println("\t\t Enter the Name :");
				String name = scanner.next();

				System.out.println("\t\t Enter the StockQuantity :");

				int stockQty = scanner.nextInt();
				System.out.println("\t\t Enter the Price :");

				double price = scanner.nextDouble();
				System.out.println("\t\t Enter the ExpiryDate :");
				String date = scanner.next();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

				Date expiryDate = dateFormat.parse(date);
				
				Medicine medicine = new Medicine();
				medicine.setBatchNo(batchNo);
				medicine.setName(name);
				medicine.setStockQty(stockQty);
				medicine.setPrice(price);
				medicine.setExpiryDate(expiryDate);

				MedicineDAO medicineDAO = new MedicineDAOImpl();

				boolean status = medicineDAO.addMedicine(medicine);
				if (status) {

					System.out.println("----------Successfully Added---------------");

				} else {
					System.out.println("----------Not Added---------------");

				}

				break;
			case 2:
				MedicineDAO medicineDAO2 = new MedicineDAOImpl();
				List<Medicine> medicines = medicineDAO2.getAllMedicines();
				System.out.println("-----------------------------------------------------------------------------------------");
                System.out.println();
				
				System.out.printf("%15s%15s%10s%15s%15s",  "BATCNO", "NAME\t\t", "STOCKQUANTITY\t", "PRICE\t","EXPIRYDATE");
				System.out.println();
				System.out.println("-----------------------------------------------------------------------------------------");
				for (Medicine medicine2 : medicines) {
					System.out.println(medicine2);
				}
				System.out.println("-----------------------------------------------------------------------------------------");

				break;

			case 3:
				Medicine medicine2 = new Medicine();
				System.out.println("\t\t enter batch Number to delete :");
				int batchNo1 = scanner.nextInt();
				medicine2.setBatchNo(batchNo1);
				

				MedicineDAO medicineDAO3 = new MedicineDAOImpl();
				boolean status1 = medicineDAO3.deleteMedicine(medicine2);

				if (status1) {

					System.out.println("----------Successfully Deleted---------------");
				} else {
					System.out.println("----------Not deleted---------------");

				}
				break;
			case 4:
				Medicine medicine3 = new Medicine();
				System.out.println("\t\t enter batch Number to Update :");
				int batchNo3 = scanner.nextInt();
				medicine3.setBatchNo(batchNo3);
				System.out.println("\t\t Enter the Name :");
				String name1 = scanner.next();

				System.out.println("\t\t Enter the StockQuantity :");

				int stockQty1 = scanner.nextInt();
				System.out.println("\t\t Enter the Price :");

				double price1 = scanner.nextDouble();
				System.out.println("\t\t Enter the ExpiryDate :");
				String date1 = scanner.next();
				SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy");

				Date expiryDate1 = dateFormat1.parse(date1);
				
				medicine3.setName(name1);
				medicine3.setStockQty(stockQty1);
				medicine3.setPrice(price1);
				medicine3.setExpiryDate(expiryDate1);

				MedicineDAO medicineDAO5 = new MedicineDAOImpl();
				boolean status2 = medicineDAO5.updateMedicine(medicine3);

				if (status2) {

					System.out.println("----------Successfully Updated---------------");
				} else {
					System.out.println("----------Not deleted---------------");

				}
				break;
			case 5:
				System.out.println("\t\t enter batch Number to find :");
				int batchNo2 = scanner.nextInt();

				MedicineDAO medicineDAO4 = new MedicineDAOImpl();
				Medicine medicine4 = medicineDAO4.findMedicine(batchNo2);
				System.out.println("-----------------------------------------------------------------------------------------");
System.out.println();
				System.out.printf("%15s%15s%10s%15s%15s",  "BATCNO", "NAME\t\t", "STOCKQUANTITY\t", "PRICE\t","EXPIRYDATE");
				System.out.println();
				System.out.println("---------------------------------------------------------------------------------");

				System.out.println(medicine4);
				System.out.println("-----------------------------------------------------------------------------------------");

				break;
			case 6:
				System.out.println();
				System.out.println("-----------Thank you -------------------");
				break;
			}

		} while (choice != 6);

	}

}
