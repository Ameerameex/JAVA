package com.training.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.training.business.Employee;



public class MySQLEmployeeDAOImplementation3 implements EmployeeDAO,MySQLEmployeeQueries {

	@Override
	public boolean addEmployee(Employee employee) throws Throwable {
		Connection connection = ConnectionManager.createConnection();
		PreparedStatement statement = connection.prepareStatement(INSERT_QUERY);

		statement.setString(2, employee.getName());
		statement.setDouble(3, employee.getBasicSalary());
		statement.setString(4, employee.getGrade() + "");
		Date date = DateConversion.convertToSQLDate(employee.getDateOfJoin());
		statement.setDate(5, date);
	

		int r = statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if (r > 0) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean removeEmployee(Employee employee) throws Throwable {
		Connection connection = ConnectionManager.createConnection();
		PreparedStatement statement = connection.prepareStatement(DELETE_QUERY);
		statement.setInt(1, employee.getId());
		int r = statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if (r > 0) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Throwable {
		Connection connection = ConnectionManager.createConnection();
		PreparedStatement statement = connection.prepareStatement(UPDATE_QUERY);

		statement.setString(1, employee.getName());
		statement.setDouble(2, employee.getBasicSalary());
		statement.setString(3, employee.getGrade() + "");
		Date date = DateConversion.convertToSQLDate(employee.getDateOfJoin());

		statement.setDate(4, date);
		
		statement.setInt(6, employee.getId());

		int r = statement.executeUpdate();
		ConnectionManager.closeConnection(connection);
		if (r > 0) {
			return true;
		} else
			return false;
	}

	@Override
	public Employee findEmployee(Employee employee) throws Throwable {
		Connection connection = ConnectionManager.createConnection();
		PreparedStatement statement = connection.prepareStatement(FIND_ONE_QUERY);
		statement.setInt(1,employee.getId());
		ResultSet resultSet = statement.executeQuery();

		if (resultSet.next()) {
			Employee employee1 = new Employee();
			int i = resultSet.getInt(1);
			String j = resultSet.getString(2);
			double k=resultSet.getDouble(3);
			String l= resultSet.getString(4);
			java.util.Date date=DateConversion.convertToUtilDate(resultSet.getDate(5));
			java.util.Date m=date;
			int n=resultSet.getInt(6);
			
			employee1.setId(i);
			employee1.setName(j);
			employee1.setBasicSalary(k);
			employee1.setGrade(l.charAt(0));
			employee1.setDateOfJoin(m);
			

			return employee1;
		}

		ConnectionManager.closeConnection(connection);

		return null;
	}

	@Override
	public List<Employee> getAllEmployees(Employee employee) throws Throwable {
		Connection connection = ConnectionManager.createConnection();
		PreparedStatement statement = connection.prepareStatement(FIND_ALL_QUERY);
		List<Employee> allEmployees = new ArrayList<>();
		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			Employee employee1 = new Employee();
			int i = resultSet.getInt(1);
			String j = resultSet.getString(2);
			double k=resultSet.getDouble(3);
			String l= resultSet.getString(4);
			java.util.Date date=DateConversion.convertToUtilDate(resultSet.getDate(5));
			java.util.Date m=date;
		
			employee1.setId(i);
			employee1.setName(j);
			employee1.setBasicSalary(k);
			employee1.setGrade(l.charAt(0));
			employee1.setDateOfJoin(m);
		
			allEmployees.add(employee1);
		}
		ConnectionManager.closeConnection(connection);

		return allEmployees;
	}

}
