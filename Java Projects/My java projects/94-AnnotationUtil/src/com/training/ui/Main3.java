package com.training.ui;

import java.util.Date;

import com.training.business.Student1;
import com.training.common.AnnotationAnalyzer;
import com.training.common.GetMethodsAnnotationAnalyzer;

public class Main3 {

	public static void main(String[] args) {
		
		Student1 student1=new Student1(101, "ABD", 50.6, 'B',new Date() );

		AnnotationAnalyzer analyzer=new GetMethodsAnnotationAnalyzer(student1);
		
		System.out.println(analyzer.getDBTableName());
		System.out.println(analyzer.getFieldNameColumnNameMap());
		System.out.println(analyzer.getFieldNameColumnTypeMap());
		System.out.println(analyzer.getColumnNameForField("average"));
		System.out.println(analyzer.getColumnTypeForField("name"));
		System.out.println(analyzer.getKeyColumnName());
		System.out.println(analyzer.getKeyColumnType());
		
		
	}
	
}
