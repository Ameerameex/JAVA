package com.training.ui;

import java.lang.reflect.Field;
import java.util.List;

import com.training.annotations.Column;
import com.training.annotations.Id;
import com.training.annotations.Table;
import com.training.business.Employee;
import com.training.common.ReflectionAnalyzer;

public class Main {

	public static void main(String[] args) throws Exception, SecurityException {

		Employee employee = new Employee(1, "Dhoni", 123446.0, 35);
		Class employeeClass = employee.getClass();


		Field field = employeeClass.getDeclaredField("empid");
		Field field2 = employeeClass.getDeclaredField("name");
		Field field3 = employeeClass.getDeclaredField("age");
		Field field4 = employeeClass.getDeclaredField("basicSalary");

		Column columnDate = field.getDeclaredAnnotation(Column.class);
		System.out.println(columnDate.columnName());
		System.out.println(columnDate.columnType());
		System.out.println(columnDate.CoumnWidth());
		System.out.println(columnDate.decimalwidth());
		Id id = field.getDeclaredAnnotation(Id.class);
		System.out.println(id.columnName());
		System.out.println(id.generatedStrategy());
		System.out.println(id.columnType());
		Column columnDate1 = field2.getDeclaredAnnotation(Column.class);
		System.out.println(columnDate1.columnName());
		System.out.println(columnDate1.columnType());
		System.out.println(columnDate1.CoumnWidth());
		System.out.println(columnDate1.decimalwidth());
		Column columnDate2 = field3.getDeclaredAnnotation(Column.class);
		System.out.println(columnDate2.columnName());
		System.out.println(columnDate2.columnType());
		System.out.println(columnDate2.CoumnWidth());
		System.out.println(columnDate2.decimalwidth());
		Column columnDate3 = field4.getDeclaredAnnotation(Column.class);
		System.out.println(columnDate3.columnName());
		System.out.println(columnDate3.columnType());
		System.out.println(columnDate3.CoumnWidth());
		System.out.println(columnDate3.decimalwidth());

		Table table = (Table) employeeClass.getDeclaredAnnotation(Table.class);
		System.out.println(table.name());

	}
}
