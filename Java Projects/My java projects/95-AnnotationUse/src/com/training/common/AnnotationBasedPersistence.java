package com.training.common;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.training.example.common.ConnectionManager;
import com.training.example.common.DateConversion;
import com.training.example.common.Persistence;
import com.training.example.common.ReflectionAnalyzer;

public class AnnotationBasedPersistence<T> implements Persistence<T> {

	@Override
	public boolean delete(T object) throws Throwable {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(object.getClass());
		String SQL = "select * from ";
		Class loadedClass = object.getClass();
		AnnotationAnalyzer annotationAnalyzer = new AnnotationAnalyzer(object);
		String tableName = annotationAnalyzer.getDBTableName();
		SQL = SQL + tableName + " where ";

		String keyColumn = annotationAnalyzer.getKeyColumnName();
		SQL = SQL + keyColumn + " = ";
		String keyColType = annotationAnalyzer.getKeyColumnType();
		String keyFieldName = annotationAnalyzer.getKeyFieldName();
		if (keyColType.equalsIgnoreCase("BYTE")) {
			byte value = analyzer.byteReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("SHORT")) {
			short value = analyzer.shortReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("INT")) {
			int value = analyzer.intReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("LONG")) {
			long value = analyzer.longReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("FLOAT")) {
			float value = analyzer.floatReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("DOUBLE")) {
			double value = analyzer.doubleReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("BOOLEAN")) {
			boolean value = analyzer.booleanReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("CHAR")) {
			char value = analyzer.charReturnValueForField(keyFieldName, object);
			SQL = SQL + "'" + value + "'";
		}

		if (keyColType.equalsIgnoreCase("STRING")) {
			String value = analyzer.stringReturnValueForField(keyFieldName, object);
			SQL = SQL + "'" + value + "'";
		}
		if (keyColType.equalsIgnoreCase("DATE")) {
			Date value = analyzer.dateReturnValueForFields(keyFieldName, object);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

			SQL = SQL + "'" + dateFormat.format(value) + "'";
		}
		System.out.println(SQL);
		Connection connection = ConnectionManager.createConnection();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);
		resultSet.next();
		resultSet.deleteRow();
		return true;
	}

	@Override
	public T find(Class loadedClass, Object keyValue) throws Throwable {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		String SQL = "select * from ";
		AnnotationAnalyzer annotationAnalyzer = new AnnotationAnalyzer(loadedClass);
		String tableName = annotationAnalyzer.getDBTableName();
		SQL = SQL + tableName + " where ";

		String keyColumn = annotationAnalyzer.getKeyColumnName();
		SQL = SQL + keyColumn + " = ";
		String keyColType = annotationAnalyzer.getKeyColumnType();
		String keyFieldName = annotationAnalyzer.getKeyFieldName();
		if (keyColType.equalsIgnoreCase("BYTE")) {
			//byte value = analyzer.byteReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + keyValue;
		}
		if (keyColType.equalsIgnoreCase("SHORT")) {
			//short value = analyzer.shortReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + keyValue;
		}
		if (keyColType.equalsIgnoreCase("INT")) {
			//int value = analyzer.intReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + keyValue;
		}
		if (keyColType.equalsIgnoreCase("LONG")) {
			//long value = analyzer.longReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + keyValue;
		}
		if (keyColType.equalsIgnoreCase("FLOAT")) {
			//float value = analyzer.floatReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + keyValue;
		}
		if (keyColType.equalsIgnoreCase("DOUBLE")) {
			//double value = analyzer.doubleReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + keyValue;
		}
		if (keyColType.equalsIgnoreCase("BOOLEAN")) {
			//boolean value = analyzer.booleanReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + keyValue;
		}
		if (keyColType.equalsIgnoreCase("CHAR")) {
			//char value = analyzer.charReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + "'" + keyValue + "'";
		}

		if (keyColType.equalsIgnoreCase("STRING")) {
			//String value = analyzer.stringReturnValueForField(keyFieldName, keyValue);
			SQL = SQL + "'" + keyValue + "'";
		}
		if (keyColType.equalsIgnoreCase("DATE")) {
			//Date value = analyzer.dateReturnValueForFields(keyFieldName, keyValue);
			//SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

			SQL = SQL + "'" + keyValue + "'";
		}
		System.out.println(SQL);
		Connection connection = ConnectionManager.createConnection();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);
		Object target=null;
		if (resultSet.next()) {
			target = loadedClass.newInstance();
			List<String> allfieldNames = analyzer.getFieldNames();
			Set<String> fieldSet = new TreeSet<>(allfieldNames);
			for (String fieldName : fieldSet) {

				String colName = annotationAnalyzer.getColumnNameForField(fieldName);
				String colType = annotationAnalyzer.getColumnTypeForField(fieldName);
				if (colType.equalsIgnoreCase("BYTE")) {
                byte value=(byte) resultSet.getInt(colName);
                analyzer.byteInputValueForFields(fieldName, target, value);
				}
				if (colType.equalsIgnoreCase("SHORT")) {
	                short value=(short) resultSet.getInt(colName);
	                analyzer.shortInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("INT")) {
	                int value=resultSet.getInt(colName);
	                analyzer.intInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("LONG")) {
long value=resultSet.getLong(colName);
analyzer.longInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("FLOAT")) {
float value=resultSet.getFloat(colName);
analyzer.floatInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("DOUBLE")) {
double  value=resultSet.getDouble(colName);
analyzer.doubleInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("BOOLEAN")) {
boolean  value=resultSet.getBoolean(colName);
analyzer.booleanInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("CHAR")) {
char  value=resultSet.getString(colName).charAt(0);
analyzer.charInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("STRING")) {
String  value=resultSet.getString(colName);
analyzer.stringInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("DATE")) {
java.sql.Date  value=resultSet.getDate(colName);
java.util.Date uDate=DateConversion.convertToUtilDate(value);
analyzer.dateInputValueForFields(fieldName, target, uDate);
				}

			}
			return (T) target;
		}
		return null;
	}

	@Override
	public List getAll(Class loadedClass) throws Throwable {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(loadedClass);
		String SQL = "select * from ";
		AnnotationAnalyzer annotationAnalyzer = new AnnotationAnalyzer(loadedClass);
		String tableName = annotationAnalyzer.getDBTableName();
		SQL = SQL + tableName;
		System.out.println(SQL);
		Connection connection = ConnectionManager.createConnection();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);
		List returnList=new ArrayList<>();

		Object target=null;
		while (resultSet.next()) {
			target = loadedClass.newInstance();
			returnList.add(target);
			List<String> allfieldNames = analyzer.getFieldNames();
			Set<String> fieldSet = new TreeSet<>(allfieldNames);
			for (String fieldName : fieldSet) {

				String colName = annotationAnalyzer.getColumnNameForField(fieldName);
				String colType = annotationAnalyzer.getColumnTypeForField(fieldName);
				if (colType.equalsIgnoreCase("BYTE")) {
                byte value=(byte) resultSet.getInt(colName);
                analyzer.byteInputValueForFields(fieldName, target, value);
				}
				if (colType.equalsIgnoreCase("SHORT")) {
	                short value=(short) resultSet.getInt(colName);
	                analyzer.shortInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("INT")) {
	                int value=resultSet.getInt(colName);
	                analyzer.intInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("LONG")) {
long value=resultSet.getLong(colName);
analyzer.longInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("FLOAT")) {
float value=resultSet.getFloat(colName);
analyzer.floatInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("DOUBLE")) {
double  value=resultSet.getDouble(colName);
analyzer.doubleInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("BOOLEAN")) {
boolean  value=resultSet.getBoolean(colName);
analyzer.booleanInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("CHAR")) {
char  value=resultSet.getString(colName).charAt(0);
analyzer.charInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("STRING")) {
String  value=resultSet.getString(colName);
analyzer.stringInputValueForFields(fieldName, target, value);

				}
				if (colType.equalsIgnoreCase("DATE")) {
java.sql.Date  value=resultSet.getDate(colName);
java.util.Date uDate=DateConversion.convertToUtilDate(value);
analyzer.dateInputValueForFields(fieldName, target, uDate);
				}

			}
			
		}
		return returnList;
		
	
	}

	@Override
	public boolean save(T object) throws Throwable {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(object.getClass());
		String SQL = "select * from ";
		Class loadedClass = object.getClass();
		AnnotationAnalyzer annotationAnalyzer = new AnnotationAnalyzer(object);
		String tableName = annotationAnalyzer.getDBTableName();
		SQL = SQL + tableName;
		Connection connection = ConnectionManager.createConnection();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);
		resultSet.moveToInsertRow();
		Map<String, String> map1 = annotationAnalyzer.getFieldNameColumnNameMap();
		Map<String, String> map2 = annotationAnalyzer.getFieldNameColumnTypeMap();
		List<String> fieldNames = analyzer.getFieldNames();
		Set<String> fieldSet = new TreeSet<>(fieldNames);
		Iterator<String> it = fieldSet.iterator();

		while (it.hasNext()) {
			String fieldName = it.next();

			String colName = annotationAnalyzer.getColumnNameForField(fieldName);
			String colType = annotationAnalyzer.getColumnTypeForField(fieldName);
			if (colType.equalsIgnoreCase("BYTE")) {
				byte value = analyzer.byteReturnValueForField(fieldName, object);
				resultSet.updateInt(colName, value);

			}
			if (colType.equalsIgnoreCase("SHORT")) {
				short value = analyzer.shortReturnValueForField(fieldName, object);
				resultSet.updateInt(colName, value);
			}
			if (colType.equalsIgnoreCase("INT")) {
				int value = analyzer.intReturnValueForField(fieldName, object);
				resultSet.updateInt(colName, value);
			}
			if (colType.equalsIgnoreCase("LONG")) {
				long value = analyzer.longReturnValueForField(fieldName, object);
				resultSet.updateLong(colName, value);
			}
			if (colType.equalsIgnoreCase("FLOAT")) {
				float value = analyzer.floatReturnValueForField(fieldName, object);
				resultSet.updateFloat(colName, value);
			}
			if (colType.equalsIgnoreCase("DOUBLE")) {
				double value = analyzer.doubleReturnValueForField(fieldName, object);
				resultSet.updateDouble(colName, value);
			}
			if (colType.equalsIgnoreCase("BOOLEAN")) {
				boolean value = analyzer.booleanReturnValueForField(fieldName, object);
				resultSet.updateBoolean(colName, value);
			}
			if (colType.equalsIgnoreCase("CHAR")) {
				char value = analyzer.charReturnValueForField(fieldName, object);
				resultSet.updateString(colName, value + "");
			}
			if (colType.equalsIgnoreCase("STRING")) {
				String value = analyzer.stringReturnValueForField(fieldName, object);
				resultSet.updateString(colName, value);
			}
			if (colType.equalsIgnoreCase("DATE")) {
				Date uDate = analyzer.dateReturnValueForFields(fieldName, object);
				java.sql.Date value = DateConversion.convertToSQLDate(uDate);
				resultSet.updateDate(colName, value);
			}

		}

		resultSet.insertRow();
		return true;
	}

	@Override
	public boolean update(T object) throws Throwable {
		ReflectionAnalyzer analyzer = new ReflectionAnalyzer(object.getClass());
		String SQL = "select * from ";
		Class loadedClass = object.getClass();
		AnnotationAnalyzer annotationAnalyzer = new AnnotationAnalyzer(object);
		String tableName = annotationAnalyzer.getDBTableName();
		SQL = SQL + tableName + " where ";

		String keyColumn = annotationAnalyzer.getKeyColumnName();
		SQL = SQL + keyColumn + " = ";
		String keyColType = annotationAnalyzer.getKeyColumnType();
		String keyFieldName = annotationAnalyzer.getKeyFieldName();
		if (keyColType.equalsIgnoreCase("BYTE")) {
			byte value = analyzer.byteReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("SHORT")) {
			short value = analyzer.shortReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("INT")) {
			int value = analyzer.intReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("LONG")) {
			long value = analyzer.longReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("FLOAT")) {
			float value = analyzer.floatReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("DOUBLE")) {
			double value = analyzer.doubleReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("BOOLEAN")) {
			boolean value = analyzer.booleanReturnValueForField(keyFieldName, object);
			SQL = SQL + value;
		}
		if (keyColType.equalsIgnoreCase("CHAR")) {
			char value = analyzer.charReturnValueForField(keyFieldName, object);
			SQL = SQL + "'" + value + "'";
		}

		if (keyColType.equalsIgnoreCase("STRING")) {
			String value = analyzer.stringReturnValueForField(keyFieldName, object);
			SQL = SQL + "'" + value + "'";
		}
		if (keyColType.equalsIgnoreCase("DATE")) {
			Date value = analyzer.dateReturnValueForFields(keyFieldName, object);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

			SQL = SQL + "'" + dateFormat.format(value) + "'";
		}
		System.out.println(SQL);
		Connection connection = ConnectionManager.createConnection();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);
		resultSet.next();
		Map<String, String> map1 = annotationAnalyzer.getFieldNameColumnNameMap();
		Map<String, String> map2 = annotationAnalyzer.getFieldNameColumnTypeMap();
		List<String> fieldNames = analyzer.getFieldNames();
		Set<String> fieldSet = new TreeSet<>(fieldNames);
		Iterator<String> it = fieldSet.iterator();

		while (it.hasNext()) {
			String fieldName = it.next();

			String colName = annotationAnalyzer.getColumnNameForField(fieldName);
			String colType = annotationAnalyzer.getColumnTypeForField(fieldName);
			if (colType.equalsIgnoreCase("BYTE")) {
				byte value = analyzer.byteReturnValueForField(fieldName, object);
				resultSet.updateInt(colName, value);

			}
			if (colType.equalsIgnoreCase("SHORT")) {
				short value = analyzer.shortReturnValueForField(fieldName, object);
				resultSet.updateInt(colName, value);
			}
			if (colType.equalsIgnoreCase("INT")) {
				int value = analyzer.intReturnValueForField(fieldName, object);
				resultSet.updateInt(colName, value);
			}
			if (colType.equalsIgnoreCase("LONG")) {
				long value = analyzer.longReturnValueForField(fieldName, object);
				resultSet.updateLong(colName, value);
			}
			if (colType.equalsIgnoreCase("FLOAT")) {
				float value = analyzer.floatReturnValueForField(fieldName, object);
				resultSet.updateFloat(colName, value);
			}
			if (colType.equalsIgnoreCase("DOUBLE")) {
				double value = analyzer.doubleReturnValueForField(fieldName, object);
				resultSet.updateDouble(colName, value);
			}
			if (colType.equalsIgnoreCase("BOOLEAN")) {
				boolean value = analyzer.booleanReturnValueForField(fieldName, object);
				resultSet.updateBoolean(colName, value);
			}
			if (colType.equalsIgnoreCase("CHAR")) {
				char value = analyzer.charReturnValueForField(fieldName, object);
				resultSet.updateString(colName, value + "");
			}
			if (colType.equalsIgnoreCase("STRING")) {
				String value = analyzer.stringReturnValueForField(fieldName, object);
				resultSet.updateString(colName, value);
			}
			if (colType.equalsIgnoreCase("DATE")) {
				Date uDate = analyzer.dateReturnValueForFields(fieldName, object);
				java.sql.Date value = DateConversion.convertToSQLDate(uDate);
				resultSet.updateDate(colName, value);
			}

		}

		resultSet.updateRow();
		return true;
	}

}
