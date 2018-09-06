package com.example.ui;

import java.util.ArrayList;
import java.util.Collection;

import com.example.business.Circle;
import com.example.business.Department;

public class Main3 {

	public static void main(String[] args) {

		Collection myObjects = new ArrayList();
		myObjects.add(new Integer(25));
		myObjects.add(new Double(200.00));
		myObjects.add(new Boolean(true));
		myObjects.add(new String("Ameer"));
		myObjects.add(new Circle(5));
		myObjects.add(new Department("Admin", "Dhoni"));

		System.out.println(myObjects);

		for (Object object : myObjects) {

			System.out.println(object);

		}
		System.out.println(myObjects.size());

		myObjects.clear();

		System.out.println(myObjects.isEmpty());

	}

}
