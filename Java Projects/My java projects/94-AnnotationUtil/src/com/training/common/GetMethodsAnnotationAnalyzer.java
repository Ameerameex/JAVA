package com.training.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.training.annotations.Column;
import com.training.annotations.Id;

public class GetMethodsAnnotationAnalyzer extends AnnotationAnalyzer {

	public GetMethodsAnnotationAnalyzer(Object object) {
		super(object);

	}

	@Override
	public String getColumnNameForField(String fieldName) {
		Map<String,String> map=getFieldNameColumnNameMap();
		return map.get(fieldName);
	}

	@Override
	public String getDBTableName() {
		return super.getDBTableName();
	}

	@Override
	public Map<String, String> getFieldNameColumnNameMap() {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		List<String> fieldNames = analyzer.getFieldNames();
		Map<String, String> returnMap = new TreeMap<>();
		List<String> outputMethodNames=analyzer.getOutputMethodNames();
		List<String> outputMethodNames1=new ArrayList<>();
		for (String string : outputMethodNames) {
			
		String s=null;
		if(string.startsWith("get")){
			s=string.substring(3);

		}
		else{
			s=string.substring(2);
		}
		char ch=s.charAt(0);
		char ch1=analyzer.flipCharacter(ch);
		String s1=ch1+s.substring(1);
		outputMethodNames1.add(s1);
		
			
		}
		for (String fieldName : fieldNames) {
			try {
				//Field field = this.loadedClass.getDeclaredField(fieldName);
			boolean existing=outputMethodNames1.contains(fieldName);
			if(existing){
				int position=outputMethodNames1.indexOf(fieldName);
				//System.out.println(position);
				String methodName=outputMethodNames.get(position);
				//System.out.println(methodName);
			Method method=this.loadedClass.getDeclaredMethod(methodName);
			
				Column column = method.getDeclaredAnnotation(Column.class);
				if (column != null) {
					String colName = column.columnName();
					returnMap.put(fieldName, colName);

				}
			}
			}  catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}

		return returnMap;
	}

	@Override
	public Map<String, String> getFieldNameColumnTypeMap() {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		List<String> fieldNames = analyzer.getFieldNames();
		Map<String, String> returnMap = new TreeMap<>();
		List<String> outputMethodNames=analyzer.getOutputMethodNames();
		List<String> outputMethodNames1=new ArrayList<>();
		for (String string : outputMethodNames) {
			
		String s=null;
		if(string.startsWith("get")){
			s=string.substring(3);

		}
		else{
			s=string.substring(2);
		}
		char ch=s.charAt(0);
		char ch1=analyzer.flipCharacter(ch);
		String s1=ch1+s.substring(1);
		outputMethodNames1.add(s1);
		
			
		}
		for (String fieldName : fieldNames) {
			try {
				//Field field = this.loadedClass.getDeclaredField(fieldName);
			boolean existing=outputMethodNames1.contains(fieldName);
			if(existing){
				int position=outputMethodNames1.indexOf(fieldName);
				//System.out.println(position);
				String methodName=outputMethodNames.get(position);
				//System.out.println(methodName);
			Method method=this.loadedClass.getDeclaredMethod(methodName);
			
				Column column = method.getDeclaredAnnotation(Column.class);
				if (column != null) {
					String colName = column.columnType();
					returnMap.put(fieldName, colName);

				}
			}
			}  catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}

		return returnMap;
	}

	@Override
	public String getColumnTypeForField(String fieldName) {
		Map<String,String> map=getFieldNameColumnTypeMap();
		return map.get(fieldName);
	}

	@Override
	public String getKeyColumnName() {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		List<String> fieldNames = analyzer.getFieldNames();
		String columnName= null;
		List<String> outputMethodNames=analyzer.getOutputMethodNames();
		List<String> outputMethodNames1=new ArrayList<>();
		for (String string : outputMethodNames) {
			
		String s=null;
		if(string.startsWith("get")){
			s=string.substring(3);

		}
		else{
			s=string.substring(2);
		}
		char ch=s.charAt(0);
		char ch1=analyzer.flipCharacter(ch);
		String s1=ch1+s.substring(1);
		outputMethodNames1.add(s1);
		
			
		}
		for (String fieldName : fieldNames) {
			try {
				//Field field = this.loadedClass.getDeclaredField(fieldName);
			boolean existing=outputMethodNames1.contains(fieldName);
			if(existing){
				int position=outputMethodNames1.indexOf(fieldName);
				//System.out.println(position);
				String methodName=outputMethodNames.get(position);
				//System.out.println(methodName);
			Method method=this.loadedClass.getDeclaredMethod(methodName);
			
				Id id = method.getDeclaredAnnotation(Id.class);
				if (id != null) {
					String colName = id.columnName();
					return colName;

				}
			}
			}  catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public String getKeyColumnType() {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		List<String> fieldNames = analyzer.getFieldNames();
		String columnName= null;
		List<String> outputMethodNames=analyzer.getOutputMethodNames();
		List<String> outputMethodNames1=new ArrayList<>();
		for (String string : outputMethodNames) {
			
		String s=null;
		if(string.startsWith("get")){
			s=string.substring(3);

		}
		else{
			s=string.substring(2);
		}
		char ch=s.charAt(0);
		char ch1=analyzer.flipCharacter(ch);
		String s1=ch1+s.substring(1);
		outputMethodNames1.add(s1);
		
			
		}
		for (String fieldName : fieldNames) {
			try {
				//Field field = this.loadedClass.getDeclaredField(fieldName);
			boolean existing=outputMethodNames1.contains(fieldName);
			if(existing){
				int position=outputMethodNames1.indexOf(fieldName);
				//System.out.println(position);
				String methodName=outputMethodNames.get(position);
				//System.out.println(methodName);
			Method method=this.loadedClass.getDeclaredMethod(methodName);
			
				Id id = method.getDeclaredAnnotation(Id.class);
				if (id != null) {
					String colName = id.columnType();
					return colName;

				}
			}
			}  catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
