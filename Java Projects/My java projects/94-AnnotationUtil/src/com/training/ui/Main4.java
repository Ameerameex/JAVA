package com.training.ui;

import java.lang.reflect.Field;

import com.training.annotations.Column;
import com.training.annotations.Id;
import com.training.annotations.Table;
import com.training.business.Employee;
import com.training.common.AnnotationAnalyzer;

public class Main4 {

	public static void main(String[] args) throws Exception, SecurityException {

		Employee employee = new Employee(1, "Dhoni", 123446.0, 35);
		
AnnotationAnalyzer analyzer=new AnnotationAnalyzer(employee);
		
System.out.println(analyzer.getDBTableName());
System.out.println(analyzer.getFieldNameColumnNameMap());
System.out.println(analyzer.getFieldNameColumnTypeMap());
System.out.println(analyzer.getColumnNameForField("basicSalary"));
System.out.println(analyzer.getColumnNameForField("empid"));
System.out.println(analyzer.getColumnTypeForField("name"));
System.out.println(analyzer.getKeyColumnName());
System.out.println(analyzer.getKeyColumnType());
	}
}
