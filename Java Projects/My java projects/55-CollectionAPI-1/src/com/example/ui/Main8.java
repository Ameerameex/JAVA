package com.example.ui;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.example.business.Department;

public class Main8 {

	public static void main(String[] args) {
		
Department d1=new Department("Admin", "joseph");
Department d2=new Department("HR", "Suriya");
Department d3=new Department("TL", "kumar");
Department d4=new Department("PM", "dhoni");
Department d5=new Department("Manager", "kohli");
Department d6=new Department("HR", "Suriya");

System.out.println(d2.equals(d6));
Set<Department> departments=new HashSet<>();
System.out.println(departments.add(d1));
System.out.println(departments.add(d2));
System.out.println(departments.add(d3));
System.out.println(departments.add(d4));
System.out.println(departments.add(d5));
System.out.println(departments.add(d6));

System.out.println(departments);
		
		
	}

}
