package com.example.ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import com.example.business.Department;

public class Main3 {

	public static void main(String[] args) {

		Department d1 = new Department("Admin", "joseph");
		Department d2 = new Department("HR", "Suriya");
		Department d3 = new Department("TL", "kuruvila");
		Department d4 = new Department("PM", "dhoni");
		Department d5 = new Department("Manager", "kohli");
		Department d6 = new Department("HR", "Suriya");

		List<Department> departments = new ArrayList<>();

		departments.add(d1);
		departments.add(d2);
		departments.add(d3);
		departments.add(d4);
		departments.add(d5);
		departments.add(d6);

		System.out.println(departments);

		int count = departments.size();
		for (int i = 0; i < count; i++) {

			Department d = departments.get(i);

			System.out.println(d);
		}
		System.out.println();
		for (Department d : departments) {

			System.out.println(d);
		}
		System.out.println();

		Iterator<Department> it = departments.iterator();
		while (it.hasNext()) {

			Department d = it.next();
			System.out.println(d);

		}
		System.out.println();
		ListIterator<Department> it1=departments.listIterator();
		while(it1.hasNext()){
			Department d = it1.next();
		}
		while(it1.hasPrevious()){
			
			Department d=it1.previous();
			System.out.println(d);
		}
	}

}
