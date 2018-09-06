package com.training.example.ui;

import java.util.Date;

import com.training.example.business.Product;
import com.training.example.common.DateConversion;
import com.training.example.common.ReflectionAnalyzer;

public class Main2 {

	public static void main(String[] args) {

		ReflectionAnalyzer analyzer;
		analyzer = new ReflectionAnalyzer("com.training.example.business.Product");
		
		System.out.println(analyzer.getFieldNames());
		System.out.println(analyzer.getOutputMethodNames());
		System.out.println(analyzer.getOutputMethodsForFields());
		System.out.println(analyzer.getOutputMethodForFields("category"));
		Product product=new Product(1, "abs", 4.00, new Date(), 'A');
		System.out.println(analyzer.returnValueForField("price", product));
		System.out.println(analyzer.returnValueForField("name", product));
		System.out.println(analyzer.intReturnValueForField("id", product));

		System.out.println(analyzer.stringReturnValueForField("name", product));
		System.out.println(analyzer.doubleReturnValueForField("price", product));
		System.out.println(analyzer.charReturnValueForField("category", product));
		System.out.println(analyzer.dateReturnValueForFields("manufacturedDate", product));
		System.out.println(analyzer.getInputMethodsForFields());
		analyzer.intInputValueForFields("id", product, 501);
		analyzer.stringInputValueForFields("name", product, "xyz");
		analyzer.doubleInputValueForFields("price", product, 900.00);
		analyzer.dateInputValueForFields("manufacturedDate", product,null);
		analyzer.charInputValueForFields("category", product, 'C');
		System.out.println(product);


	}

}
