package com.example.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CLient {

	public static void main(String[] args) {
		String myDateOfBirth = null;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Your DOB in dd-mm-yyyy in the format");
		myDateOfBirth = scanner.next();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
Date date=null;
		try {
			 date = dateFormat.parse(myDateOfBirth);
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
System.out.println(dateFormat.format(date));
	}
}
