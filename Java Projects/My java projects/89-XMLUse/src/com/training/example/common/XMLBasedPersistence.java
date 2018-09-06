package com.training.example.common;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class XMLBasedPersistence<T> implements Persistence<T> {

	XMLAnalyzer xmlAnalyzer;
	ReflectionAnalyzer reflectionAnalyzer;
	String SQL;

	@Override
	public boolean save(T object) throws Throwable {
		String className = object.getClass().getSimpleName();
		String mappingFile = className + "-" + "Mapping.xml";
		xmlAnalyzer = new XMLAnalyzer(mappingFile);
		reflectionAnalyzer = new ReflectionAnalyzer(object.getClass());

		Connection connection = ConnectionManager.createConnection();
		SQL = "select * from ";
		String tableName = xmlAnalyzer.getAttributeValueOfElement("class", 0, "tableName");
		SQL = SQL + tableName;
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);

		resultSet.moveToInsertRow();
		int count = xmlAnalyzer.getElementCount("property");
		for (int i = 0; i < count; i++) {
			String propName = xmlAnalyzer.getAttributeValueOfElement("property", i, "name");
			String colType = xmlAnalyzer.getAttributeValueOfElement("property", i, "type");
			String colName = xmlAnalyzer.getAttributeValueOfElement("property", i, "columnName");

			if (colType.equals("BYTE")) {
				int value = reflectionAnalyzer.intReturnValueForField(propName, object);
				resultSet.updateInt(colName, value);

			}
			if (colType.equals("SHORT")) {
				int value = reflectionAnalyzer.intReturnValueForField(propName, object);
				resultSet.updateInt(colName, value);
			}
			if (colType.equals("INT")) {
				int value = reflectionAnalyzer.intReturnValueForField(propName, object);
				resultSet.updateInt(colName, value);
			}
			if (colType.equals("LONG")) {
				long value = reflectionAnalyzer.longReturnValueForField(propName, object);
				resultSet.updateLong(colName, value);
			}
			if (colType.equals("FLOAT")) {
				float value = reflectionAnalyzer.floatReturnValueForField(propName, object);
				resultSet.updateFloat(colName, value);
			}
			if (colType.equals("DOUBLE")) {
				double value = reflectionAnalyzer.doubleReturnValueForField(propName, object);
				resultSet.updateDouble(colName, value);
			}
			if (colType.equals("CHAR")) {
				char value = reflectionAnalyzer.charReturnValueForField(propName, object);
				resultSet.updateString(colName, value + "");
			}
			if (colType.equals("BOOLEAN")) {
				boolean value = reflectionAnalyzer.booleanReturnValueForField(propName, object);
				resultSet.updateBoolean(colName, value);
			}
			if (colType.equals("STRING")) {

				String value = reflectionAnalyzer.stringReturnValueForField(propName, object);
				System.out.println(value);
				System.out.println(colName);
				System.out.println(propName);
				resultSet.updateString(colName, value);
			}
			if (colType.equals("DATE")) {
				Date value = reflectionAnalyzer.dateReturnValueForFields(propName, object);
				java.sql.Date date = DateConversion.convertToSQLDate(value);
				resultSet.updateDate(colName, date);
			}
		}
		String colName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "columnName");
		String colType = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "type");
		String propName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "name");
		if (colType.equals("BYTE")) {
			int value = reflectionAnalyzer.intReturnValueForField(propName, object);
			resultSet.updateInt(colName, value);

		}
		if (colType.equals("SHORT")) {
			int value = reflectionAnalyzer.intReturnValueForField(propName, object);
			resultSet.updateInt(colName, value);
		}
		if (colType.equals("INT")) {
			int value = reflectionAnalyzer.intReturnValueForField(propName, object);
			resultSet.updateInt(colName, value);
		}
		if (colType.equals("LONG")) {
			long value = reflectionAnalyzer.longReturnValueForField(propName, object);
			resultSet.updateLong(colName, value);
		}
		if (colType.equals("FLOAT")) {
			float value = reflectionAnalyzer.floatReturnValueForField(propName, object);
			resultSet.updateFloat(colName, value);
		}
		if (colType.equals("DOUBLE")) {
			double value = reflectionAnalyzer.doubleReturnValueForField(propName, object);
			resultSet.updateDouble(colName, value);
		}
		if (colType.equals("CHAR")) {
			char value = reflectionAnalyzer.charReturnValueForField(propName, object);
			resultSet.updateString(colName, value + "");
		}
		if (colType.equals("BOOLEAN")) {
			boolean value = reflectionAnalyzer.booleanReturnValueForField(propName, object);
			resultSet.updateBoolean(colName, value);
		}
		if (colType.equals("STRING")) {
			String value = reflectionAnalyzer.stringReturnValueForField(propName, object);
			resultSet.updateString(colName, value);
		}
		if (colType.equals("DATE")) {
			Date value = reflectionAnalyzer.dateReturnValueForFields(propName, object);
			java.sql.Date date = DateConversion.convertToSQLDate(value);
			resultSet.updateDate(colName, date);
		}
		resultSet.insertRow();
		resultSet.close();
		ConnectionManager.closeConnection(connection);
		return true;
	}

	@Override
	public boolean delete(T object) throws Throwable {
		String className = object.getClass().getSimpleName();
		String mappingFile = className + "-" + "Mapping.xml";
		xmlAnalyzer = new XMLAnalyzer(mappingFile);
		reflectionAnalyzer = new ReflectionAnalyzer(object.getClass());
		SQL = "select * from ";
		Connection connection = ConnectionManager.createConnection();
		String tableName = xmlAnalyzer.getAttributeValueOfElement("class", 0, "tableName");
		SQL = SQL + tableName;
		String keycolumnName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "columnName");
		String keyPropName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "name");
		String keyColType = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "type");
		if (keyColType.equals("DATE")) {
			Date keyValue = reflectionAnalyzer.dateReturnValueForFields(keyPropName, object);
			java.sql.Date date = DateConversion.convertToSQLDate(keyValue);
			SQL = SQL + " where " + keycolumnName + " = '" + date + " '";
		}
		if (keyColType.equals("INT")) {

			int keyValue = reflectionAnalyzer.intReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;

		}
		if (keyColType.equals("BYTE")) {
			int keyValue = reflectionAnalyzer.intReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("SHORT")) {
			int keyValue = reflectionAnalyzer.intReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("LONG")) {
			long keyValue = reflectionAnalyzer.longReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("FLOAT")) {
			float keyValue = reflectionAnalyzer.floatReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("DOUBLE")) {
			double keyValue = reflectionAnalyzer.doubleReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("BOOLEAN")) {
			boolean keyValue = reflectionAnalyzer.booleanReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("CHAR")) {
			char keyValue = reflectionAnalyzer.charReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = '" + keyValue + " '";
		}
		if (keyColType.equals("STRING")) {
			String keyValue = reflectionAnalyzer.stringReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = '" + keyValue + "'";
		}

		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);

		if (resultSet.next()) {
			resultSet.deleteRow();
		} else {

			resultSet.close();
			ConnectionManager.closeConnection(connection);
			return false;
		}
		resultSet.close();
		ConnectionManager.closeConnection(connection);

		return true;
	}

	@Override
	public boolean update(T object) throws Throwable {
		String className = object.getClass().getSimpleName();
		String mappingFile = className + "-" + "Mapping.xml";
		xmlAnalyzer = new XMLAnalyzer(mappingFile);
		reflectionAnalyzer = new ReflectionAnalyzer(object.getClass());

		SQL = "select * from ";
		String tableName = xmlAnalyzer.getAttributeValueOfElement("class", 0, "tableName");
		SQL = SQL + tableName;
		String keycolumnName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "columnName");
		String keyPropName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "name");
		String keyColType = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "type");
		if (keyColType.equals("DATE")) {
			Date keyValue = reflectionAnalyzer.dateReturnValueForFields(keyPropName, object);
			java.sql.Date date = DateConversion.convertToSQLDate(keyValue);
			SQL = SQL + " where " + keycolumnName + " = " + date;
		}
		if (keyColType.equals("INT")) {

			int keyValue = reflectionAnalyzer.intReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;

		}
		if (keyColType.equals("BYTE")) {
			int keyValue = reflectionAnalyzer.intReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("SHORT")) {
			int keyValue = reflectionAnalyzer.intReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("LONG")) {
			long keyValue = reflectionAnalyzer.longReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("FLOAT")) {
			float keyValue = reflectionAnalyzer.floatReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("DOUBLE")) {
			double keyValue = reflectionAnalyzer.doubleReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("BOOLEAN")) {
			boolean keyValue = reflectionAnalyzer.booleanReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("CHAR")) {
			char keyValue = reflectionAnalyzer.charReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		if (keyColType.equals("STRING")) {
			String keyValue = reflectionAnalyzer.stringReturnValueForField(keyPropName, object);
			SQL = SQL + " where " + keycolumnName + " = " + keyValue;
		}
		Connection connection = ConnectionManager.createConnection();
		Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet resultSet = statement.executeQuery(SQL);
		if (resultSet.next()) {
			int count = xmlAnalyzer.getElementCount("property");
			for (int i = 0; i < count; i++) {
				String propName = xmlAnalyzer.getAttributeValueOfElement("property", i, "name");
				String colType = xmlAnalyzer.getAttributeValueOfElement("property", i, "type");
				String colName = xmlAnalyzer.getAttributeValueOfElement("property", i, "columnName");

				if (colType.equals("BYTE")) {
					int value = reflectionAnalyzer.intReturnValueForField(propName, object);
					resultSet.updateInt(colName, value);

				}
				if (colType.equals("SHORT")) {
					int value = reflectionAnalyzer.intReturnValueForField(propName, object);
					resultSet.updateInt(colName, value);
				}
				if (colType.equals("INT")) {
					int value = reflectionAnalyzer.intReturnValueForField(propName, object);
					resultSet.updateInt(colName, value);
				}
				if (colType.equals("LONG")) {
					long value = reflectionAnalyzer.longReturnValueForField(propName, object);
					resultSet.updateLong(colName, value);
				}
				if (colType.equals("FLOAT")) {
					float value = reflectionAnalyzer.floatReturnValueForField(propName, object);
					resultSet.updateFloat(colName, value);
				}
				if (colType.equals("DOUBLE")) {
					double value = reflectionAnalyzer.doubleReturnValueForField(propName, object);
					resultSet.updateDouble(colName, value);
				}
				if (colType.equals("CHAR")) {
					char value = reflectionAnalyzer.charReturnValueForField(propName, object);
					resultSet.updateString(colName, value + "");
				}
				if (colType.equals("BOOLEAN")) {
					boolean value = reflectionAnalyzer.booleanReturnValueForField(propName, object);
					resultSet.updateBoolean(colName, value);
				}
				if (colType.equals("STRING")) {

					String value = reflectionAnalyzer.stringReturnValueForField(propName, object);
					System.out.println(value);
					System.out.println(colName);
					System.out.println(propName);
					resultSet.updateString(colName, value);
				}
				if (colType.equals("DATE")) {
					Date value = reflectionAnalyzer.dateReturnValueForFields(propName, object);
					java.sql.Date date = DateConversion.convertToSQLDate(value);
					resultSet.updateDate(colName, date);
				}
			}
			resultSet.updateRow();
		} else {
			resultSet.close();
			ConnectionManager.closeConnection(connection);
			return false;
		}
		resultSet.close();
		ConnectionManager.closeConnection(connection);
		return true;
	}

	@Override
	public T find(Class loadedClass, Object keyValue) throws Throwable {
		String className = loadedClass.getSimpleName();
		String mappingFile = className + "-" + "Mapping.xml";
		xmlAnalyzer = new XMLAnalyzer(mappingFile);
		reflectionAnalyzer = new ReflectionAnalyzer(loadedClass);
		SQL = "select * from ";
		String tableName = xmlAnalyzer.getAttributeValueOfElement("class", 0, "tableName");
		SQL = SQL + tableName;
		SQL = SQL + " where ";
		String keyColName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "columnName");
		String colType = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "type");
		if (colType.equals("STRING") || colType.equals("CHAR")|| colType.equals("DATE")) {
			SQL = SQL + keyColName + " = '" + keyValue + "'";
			System.out.println(SQL);

		} else {
			SQL = SQL + keyColName + " = " + keyValue;

		}
		System.out.println(SQL);
		Connection connection = ConnectionManager.createConnection();

		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQL);
		if (resultSet.next()) {
			Object returnObject = loadedClass.newInstance();
			String keyProperty = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "name");
			String keyPropType = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "type");
			if (keyPropType.equals("BYTE")) {
				byte value = Byte.parseByte(keyValue.toString());
				reflectionAnalyzer.byteInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("SHORT")) {
				short value = Short.parseShort(keyValue.toString());
				reflectionAnalyzer.shortInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("INT")) {
				int value = Integer.parseInt(keyValue.toString());
				reflectionAnalyzer.intInputValueForFields(keyProperty, returnObject, value);

			}
			if (keyPropType.equals("LONG")) {
				long value = Long.parseLong(keyValue.toString());
				reflectionAnalyzer.longInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("FLOAT")) {
				float value = Float.parseFloat(keyValue.toString());
				reflectionAnalyzer.floatInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("DOUBLE")) {
				double value = Double.parseDouble(keyValue.toString());
				reflectionAnalyzer.doubleInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("CHAR")) {
				char value = keyValue.toString().charAt(0);
				reflectionAnalyzer.charInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("BOOLEAN")) {
				boolean value = Boolean.parseBoolean(keyValue.toString());
				reflectionAnalyzer.booleanInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("STRING")) {
				String value = keyValue.toString();
				reflectionAnalyzer.stringInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("DATE")) {
				Date value = (Date) keyValue;
				reflectionAnalyzer.dateInputValueForFields(keyProperty, returnObject, value);
			}
			Map<String, Method> inputMethods = reflectionAnalyzer.getInputMethodsForFields();

			int count = xmlAnalyzer.getElementCount("property");
			for (int i = 0; i < count; i++) {

				String propName = xmlAnalyzer.getAttributeValueOfElement("property", i, "name");
				String propType = xmlAnalyzer.getAttributeValueOfElement("property", i, "type");
				String colName = xmlAnalyzer.getAttributeValueOfElement("property", i, "columnName");

				if (propType.equals("BYTE")) {
					byte value = (byte) resultSet.getInt(colName);
					reflectionAnalyzer.byteInputValueForFields(propName, returnObject, value);
				}
				if (propType.equals("SHORT")) {
					short value = (short) resultSet.getInt(colName);
					reflectionAnalyzer.shortInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("INT")) {
					int value = resultSet.getInt(colName);
					reflectionAnalyzer.intInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("LONG")) {
					long value = resultSet.getLong(colName);
					reflectionAnalyzer.longInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("FLOAT")) {
					float value = resultSet.getFloat(colName);
					reflectionAnalyzer.floatInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("DOUBLE")) {
					double value = resultSet.getDouble(colName);
					reflectionAnalyzer.doubleInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("CHAR")) {
					char value = resultSet.getString(colName).charAt(0);
					reflectionAnalyzer.charInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("BOOLEAN")) {
					boolean value = resultSet.getBoolean(colName);
					reflectionAnalyzer.booleanInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("STRING")) {
					String value = resultSet.getString(colName);
					reflectionAnalyzer.stringInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("DATE")) {
					java.sql.Date date = resultSet.getDate(colName);
					java.util.Date value = DateConversion.convertToUtilDate(date);
					reflectionAnalyzer.dateInputValueForFields(propName, returnObject, value);

				}

			}
			resultSet.close();
			ConnectionManager.closeConnection(connection);
			return (T) returnObject;
		}

		resultSet.close();
		ConnectionManager.closeConnection(connection);
		return null;
	}

	@Override
	public List getAll(Class loadedClass) throws Throwable {
		String className = loadedClass.getSimpleName();
		String mappingFile = className + "-" + "Mapping.xml";
		xmlAnalyzer = new XMLAnalyzer(mappingFile);
		reflectionAnalyzer = new ReflectionAnalyzer(loadedClass);
		SQL = "select * from ";
		String tableName = xmlAnalyzer.getAttributeValueOfElement("class", 0, "tableName");
		SQL = SQL + tableName;
		System.out.println(SQL);
		Connection connection = ConnectionManager.createConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(SQL);
		List returnList = new ArrayList<>();
		while (resultSet.next()) {
			Object returnObject = loadedClass.newInstance();
			int count = xmlAnalyzer.getElementCount("property");
			for (int i = 0; i < count; i++) {

				String propName = xmlAnalyzer.getAttributeValueOfElement("property", i, "name");
				String propType = xmlAnalyzer.getAttributeValueOfElement("property", i, "type");
				String colName = xmlAnalyzer.getAttributeValueOfElement("property", i, "columnName");

				if (propType.equals("BYTE")) {
					byte value = (byte) resultSet.getInt(colName);
					reflectionAnalyzer.byteInputValueForFields(propName, returnObject, value);
				}
				if (propType.equals("SHORT")) {
					short value = (short) resultSet.getInt(colName);
					reflectionAnalyzer.shortInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("INT")) {
					int value = resultSet.getInt(colName);
					reflectionAnalyzer.intInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("LONG")) {
					long value = resultSet.getLong(colName);
					reflectionAnalyzer.longInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("FLOAT")) {
					float value = resultSet.getFloat(colName);
					reflectionAnalyzer.floatInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("DOUBLE")) {
					double value = resultSet.getDouble(colName);
					reflectionAnalyzer.doubleInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("CHAR")) {
					char value = resultSet.getString(colName).charAt(0);
					reflectionAnalyzer.charInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("BOOLEAN")) {
					boolean value = resultSet.getBoolean(colName);
					reflectionAnalyzer.booleanInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("STRING")) {
					String value = resultSet.getString(colName);
					reflectionAnalyzer.stringInputValueForFields(propName, returnObject, value);

				}
				if (propType.equals("DATE")) {
					java.sql.Date date = resultSet.getDate(colName);
					java.util.Date value = DateConversion.convertToUtilDate(date);
					reflectionAnalyzer.dateInputValueForFields(propName, returnObject, value);

				}

			}
			String colName = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "columnName");
			String keyProperty = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "name");
			String keyPropType = xmlAnalyzer.getAttributeValueOfElement("idProperty", 0, "type");
			if (keyPropType.equals("BYTE")) {
				byte value = (byte) resultSet.getInt(colName);

				reflectionAnalyzer.byteInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("SHORT")) {
				short value = (short) resultSet.getInt(colName);
				reflectionAnalyzer.shortInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("INT")) {
				int value = resultSet.getInt(colName);
				reflectionAnalyzer.intInputValueForFields(keyProperty, returnObject, value);

			}
			if (keyPropType.equals("LONG")) {
				long value = resultSet.getLong(colName);
				reflectionAnalyzer.longInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("FLOAT")) {
				float value = resultSet.getFloat(colName);
				reflectionAnalyzer.floatInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("DOUBLE")) {
				double value = resultSet.getDouble(colName);
				reflectionAnalyzer.doubleInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("CHAR")) {
				char value = resultSet.getString(colName).charAt(0);
				reflectionAnalyzer.charInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("BOOLEAN")) {
				boolean value = resultSet.getBoolean(colName);
				reflectionAnalyzer.booleanInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("STRING")) {
				String value = resultSet.getString(colName);
				reflectionAnalyzer.stringInputValueForFields(keyProperty, returnObject, value);
			}
			if (keyPropType.equals("DATE")) {
				java.sql.Date date = resultSet.getDate(colName);
				java.util.Date value = DateConversion.convertToUtilDate(date);
				reflectionAnalyzer.dateInputValueForFields(keyProperty, returnObject, value);
			}
			returnList.add(returnObject);
		}

		return returnList;
	}

}
