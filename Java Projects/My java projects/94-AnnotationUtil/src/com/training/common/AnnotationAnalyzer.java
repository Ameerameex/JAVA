package com.training.common;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.training.annotations.Column;
import com.training.annotations.Id;
import com.training.annotations.Table;

public class AnnotationAnalyzer {

	private Object object;
	protected Class loadedClass;

	public AnnotationAnalyzer(Object object) {
		super();
		this.object = object;
		this.loadedClass = object.getClass();
	}

	public String getDBTableName() {

		Table tableInfo = (Table) this.loadedClass.getDeclaredAnnotation(Table.class);

		if (tableInfo == null) {
			return null;
		} else {
			return tableInfo.name();
		}
	}

	public Map<String, String> getFieldNameColumnNameMap() {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		List<String> fieldNames = analyzer.getFieldNames();
		Map<String, String> returnMap = new TreeMap<>();
		for (String fieldName : fieldNames) {
			try {
				Field field = this.loadedClass.getDeclaredField(fieldName);
				Column column = field.getDeclaredAnnotation(Column.class);
				if (column != null) {
					String colName = column.columnName();
					returnMap.put(fieldName, colName);

				}

			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}

		return returnMap;

	}
	public Map<String, String> getFieldNameColumnTypeMap() {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		List<String> fieldNames = analyzer.getFieldNames();
		Map<String, String> returnMap = new TreeMap<>();
		for (String fieldName : fieldNames) {
			try {
				Field field = this.loadedClass.getDeclaredField(fieldName);
				Column column = field.getDeclaredAnnotation(Column.class);
				if (column != null) {
					String colType = column.columnType();
					returnMap.put(fieldName, colType);

				}

			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}

		return returnMap;

	}
	public String getColumnNameForField(String fieldName){
		Map<String,String> map=getFieldNameColumnNameMap();
		return map.get(fieldName);
		
	}
	public String getColumnTypeForField(String fieldName){
		Map<String,String> map=getFieldNameColumnTypeMap();
		return map.get(fieldName);
	}
	public String getKeyColumnName(){
		List<String> allFieldNames=null;
		ReflectionAnalyzer analyzer=new ReflectionAnalyzer(loadedClass);
		allFieldNames=analyzer.getFieldNames();
		for (String fieldName : allFieldNames) {
			try {
				Field field=this.loadedClass.getDeclaredField(fieldName);
				
				if(field!=null){
				Id idInfo=field.getDeclaredAnnotation(Id.class);
				if(idInfo!=null){
					String ColumnName=idInfo.columnName();
					return ColumnName;
				}
				
				
				}
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public String getKeyColumnType(){
		List<String> allFieldNames=null;
		ReflectionAnalyzer analyzer=new ReflectionAnalyzer(loadedClass);
		allFieldNames=analyzer.getFieldNames();
		for (String fieldName : allFieldNames) {
			try {
				Field field=this.loadedClass.getDeclaredField(fieldName);
				
				if(field!=null){
				Id idInfo=field.getDeclaredAnnotation(Id.class);
				if(idInfo!=null){
					String ColumnName=idInfo.columnType();
					return ColumnName;
				}
				
				
				}
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}
