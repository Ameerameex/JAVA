package com.training.common.Reflection;

import java.lang.Character.Subset;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ReflectionAnalyzer {
	Class loadedClass;
	List<String> fieldNames;
	List<String> privateFieldNames;
	List<String> publicFieldNames;
	List<String> friendlyFieldNames;
	List<String> protectedFieldNames;
	List<String> outputMethodNames;
	

	
	
	

	public final List<String> getOutputMethodNames() {
		
		if(outputMethodNames==null)
			outputMethodNames=new ArrayList<>();
		Method[] arr=this.loadedClass.getDeclaredMethods();
		
		for (Method method : arr) {
			boolean validPrefix=(method.getName().startsWith("get")&&method.getName().length()>3) ||(method.getName().startsWith("is")&&method.getName().length()>2);
			Parameter[] parameters=method.getParameters();
			boolean noParameters=parameters.length==0;
			Class returnValueClass=method.getReturnType();
			boolean notReturning=! returnValueClass.getSimpleName().equals("void");
		if(notReturning&&noParameters&&validPrefix){
			
			outputMethodNames.add(method.getName());
		}
		
		}
		
		return outputMethodNames;
	}

	public static Map<String,Class> getClassMapForPrimitives(){
		Map<String,Class> map=new HashMap<>();
		map.put("byte",byte.class);
		map.put("short",short.class);
		map.put("int",int.class);
		map.put("long",long.class);
		map.put("float",float.class);
		map.put("double",double.class);
		map.put("char",char.class);
		map.put("boolean",boolean.class);
	

		return map;
	}
	public Map<String,Method> getOutputMethodsForFields(){
		
		Map<String, Method> returnMap=new HashMap<>();
		List<String> allGetMethods=getOutputMethodNames();
		List<String> filterMethodList=new ArrayList<>();
		Set<String> foundMethods=new TreeSet<>();
		
		for(String str:allGetMethods){
			String truncatedName=null;
			if(str.startsWith("get")){
				truncatedName=str.substring(3);
			}
			if(str.startsWith("is")){
				truncatedName=str.substring(2);

			}
			char ch=truncatedName.charAt(0);
			char fliipped=flipCharacter(ch);
			String flippedName=fliipped+truncatedName.substring(1);
			foundMethods.add(flippedName);
			
		}
		
		List<String> existingFields=getFieldNames();
		Set<String> fieldSet=new TreeSet<>(existingFields);
		if(fieldSet.equals(foundMethods)){
			for(String s:foundMethods){
				char ch=s.charAt(0);
				char flipChar=flipCharacter(ch);
				String str="get"+flipChar+s.substring(1);
				try {
					Method  methodToFind=this.loadedClass.getMethod(str);
					returnMap.put(s,methodToFind);
				} catch (NoSuchMethodException e) {
					String str1="is"+flipChar+s.substring(1);
					Method methodToFind;
					
					try {
					methodToFind = this.loadedClass.getMethod(str1);
						returnMap.put(str1, methodToFind);
					} catch (Exception e1) {
					}
					
				}
				catch (Exception e) {
				}
			}
		}
		return returnMap;
	}
	public ReflectionAnalyzer(String className) {
		super();
		try {
			this.loadedClass = Class.forName(className);
		} catch (ClassNotFoundException e) {

		}
	}

	public ReflectionAnalyzer(Class loadedClass) {
		super();
		this.loadedClass = loadedClass;
	}

	public final List<String> getFieldNames() {
		if (fieldNames == null) 

			fieldNames = new ArrayList<>();
		Field[] arr=this.loadedClass.getDeclaredFields();
		
		for (Field field : arr) {
			this.fieldNames.add(field.getName());
		}

		return fieldNames;
	}

	public final List<String> getPrivateFieldNames() {
		if (privateFieldNames == null) 

			privateFieldNames = new ArrayList<>();
		Field[] arr=this.loadedClass.getDeclaredFields();
		
		for (Field field : arr) {
			if(field.toString().startsWith("private"))
			this.privateFieldNames.add(field.getName());
		}
		return privateFieldNames;
	}

	public final List<String> getPublicFieldNames() {
		if (publicFieldNames == null) 

			publicFieldNames = new ArrayList<>();
		Field[] arr=this.loadedClass.getDeclaredFields();
		
		for (Field field : arr) {
			if(field.toString().startsWith("public"))
			this.publicFieldNames.add(field.getName());
		}
		return publicFieldNames;
	}

	public final List<String> getFriendlyFieldNames() {
		if (friendlyFieldNames == null) 

			friendlyFieldNames = new ArrayList<>();
		Field[] arr=this.loadedClass.getDeclaredFields();
		
		for (Field field : arr) {
			boolean isPrivate=false;
			boolean isPublic =false;
			boolean isProtected=false;
			isPrivate=field.toString().startsWith("private");
			isPublic=field.toString().startsWith("public");
			isProtected=field.toString().startsWith("protected");
			
			if(! isPrivate&& !isProtected && !isPublic)

			this.friendlyFieldNames.add(field.getName());
		}
		
		return friendlyFieldNames;
	}

	public final List<String> getProtectedFieldNames() {
		if (protectedFieldNames == null) 

			protectedFieldNames = new ArrayList<>();
		Field[] arr=this.loadedClass.getDeclaredFields();
		
		for (Field field : arr) {
			if(field.toString().startsWith("protected"))
			this.protectedFieldNames.add(field.getName());
		}
		return protectedFieldNames;
	}

	private char flipCharacter(char ch) {

		if (ch >= 65 && ch <= 90) {

			return (char) (ch + 32);
		}
		if (ch >= 97 && ch <= 122)
			return (char) (ch - 32);

		return ch;
	}

}