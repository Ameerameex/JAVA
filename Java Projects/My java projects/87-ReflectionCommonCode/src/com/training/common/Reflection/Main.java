package com.training.common.Reflection;

public class Main {

	public static void main(String[] args) {
		
		
		ReflectionAnalyzer reflectionAnalyzer=new ReflectionAnalyzer("com.training.common.Reflection.BankAccount");
		
		System.out.println(reflectionAnalyzer.getFieldNames());
		
		System.out.println(reflectionAnalyzer.getPrivateFieldNames());
		System.out.println(reflectionAnalyzer.getProtectedFieldNames());
		System.out.println(reflectionAnalyzer.getPublicFieldNames());
		System.out.println(reflectionAnalyzer.getFriendlyFieldNames());
		System.out.println(reflectionAnalyzer.getOutputMethodNames());

System.out.println(ReflectionAnalyzer.getClassMapForPrimitives());

System.out.println(reflectionAnalyzer.getOutputMethodsForFields());
	}
	
}
