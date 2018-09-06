package com.training.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.training.business.Employee;

public class MySQLEmployeeDAOImpl1 implements EmployeeDAO, MySQLEmployeeQueries {

	@Override
	public boolean addEmployee(Employee employee) throws Throwable {

		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(EMP_INSERT_QUERY);

		preparedStatement.setInt(1, employee.getId());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setDouble(3, employee.getBasicSalary());
		java.util.Date utilDate = employee.getDateOfJoin();
		java.sql.Date sqlDate = DateConversion.convertToSQLDate(utilDate);
		preparedStatement.setDate(4, sqlDate);
		preparedStatement.setString(5, employee.getGrade() + "");
		int r = preparedStatement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if (r > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Throwable {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(EMP_DELETE_QUERY);

		preparedStatement.setInt(1, employee.getId());

		int r = preparedStatement.executeUpdate();

		ConnectionManager.closeConnection(connection);

		if (r > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Throwable {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement statement = connection.prepareStatement(EMP_UPDATE_QUERY);
		statement.setString(1, employee.getName());
		statement.setDouble(2, employee.getBasicSalary());
		Date udate = employee.getDateOfJoin();
		java.sql.Date doj = DateConversion.convertToSQLDate(udate);
		statement.setDate(3, doj);
		statement.setString(4, employee.getGrade() + "");
		statement.setInt(5, employee.getId());
		int r = statement.executeUpdate();

		ConnectionManager.closeConnection(connection);

		if (r > 0)
			return true;
		else
			return false;
	}

	@Override
	public Employee findEmployee(int id) throws Throwable {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(EMP_FIND_ONE_QUERY);

		preparedStatement.setInt(1, id);
		ResultSet rs = preparedStatement.executeQuery();

		while (rs.next()) {
			Employee employee2 = new Employee();

			employee2.setId(rs.getInt(1));
			employee2.setName(rs.getString(2));
			employee2.setBasicSalary(rs.getDouble(3));
			java.sql.Date sqlDate = rs.getDate(4);

			java.util.Date utilDate = DateConversion.convertToUtilDate(sqlDate);

			employee2.setDateOfJoin(utilDate);

			employee2.setGrade(rs.getString(5).charAt(0));

			rs.close();
			ConnectionManager.closeConnection(connection);
			return employee2;
		}

		rs.close();
		ConnectionManager.closeConnection(connection);
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() throws Throwable {
		Connection connection = ConnectionManager.getConnection();
		PreparedStatement preparedStatement = connection.prepareStatement(EMP_FIND_ALL_QUERY);

		ResultSet rs = preparedStatement.executeQuery();
		List<Employee> employees = new ArrayList<>();

		while (rs.next()) {
			Employee employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setBasicSalary(rs.getDouble(3));
			java.util.Date utilDate = DateConversion.convertToUtilDate(rs.getDate(4));
			employee.setDateOfJoin(utilDate);
			employee.setGrade(rs.getString(5).charAt(0));
			employees.add(employee);
			//System.out.println(employees);
		}
		rs.close();
		ConnectionManager.closeConnection(connection);
		return employees;
	}

}
