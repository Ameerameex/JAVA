package com.training.ui;

import java.util.Date;

import com.training.business.Student;
import com.training.common.AnnotationAnalyzer;

public class Main2 {

	public static void main(String[] args) {

		Student student=new Student(201, "kohli", 55.7, 'A',new Date());
		
		AnnotationAnalyzer analyzer=new AnnotationAnalyzer(student);
		
		System.out.println(analyzer.getDBTableName());
		System.out.println(analyzer.getFieldNameColumnNameMap());
		System.out.println(analyzer.getFieldNameColumnTypeMap());
		System.out.println(analyzer.getColumnNameForField("average"));
		System.out.println(analyzer.getColumnTypeForField("name"));
		System.out.println(analyzer.getKeyColumnName());
		System.out.println(analyzer.getKeyColumnType());
		
	}

}
