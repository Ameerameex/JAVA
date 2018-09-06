package com.training.ui;

import java.lang.reflect.Field;

import com.training.annotations.Column;
import com.training.annotations.Id;
import com.training.annotations.Table;
import com.training.business.Employee;
import com.training.common.AnnotationBasedPersistence;
import com.training.example.common.Persistence;

public class Main {

	public static void main(String[] args) throws Throwable {

		Employee employee=new Employee(101, "Ram", 1234.00, 32);
		Persistence<Employee> persistence=new AnnotationBasedPersistence<>();
		//System.out.println(persistence.save(employee));
		//employee.setBasicSalary(30000.00);
		//employee.setAge(39);;
		//employee.setName(employee.getName().toUpperCase());
		//System.out.println(persistence.update(employee));
		//System.out.println(persistence.delete(employee));
		//Employee employee2=persistence.find(Employee.class, 101);
		
		//System.out.println(employee2);
		System.out.println(persistence.getAll(Employee.class));
		
	}
}
