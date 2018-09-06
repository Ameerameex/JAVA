package com.example.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.business.Department;
import com.example.business.Employee;

public class MySQLEmployeeDAOImplementation implements EmployeeDAO, EmployeeQueries {

	private ResultSet resultSet;
	private List<Employee> allEmployees;

	public MySQLEmployeeDAOImplementation() {
		super();
		init();
	}

	private void init() {
		Connection connection = ConnectionManager.createConnection();

		try {
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
					ResultSet.CONCUR_UPDATABLE);
			resultSet = statement.executeQuery(SELECT_ALL);

			while (resultSet.next()) {
				if (allEmployees == null) {
					allEmployees = new ArrayList<Employee>();
				}

				String name = resultSet.getString(2);
				double basic = resultSet.getDouble(3);
				char grade = resultSet.getString(4).charAt(0);
				java.sql.Date sDate = resultSet.getDate(5);
				Date uDate = DateConversion.convertToUtilDate(sDate);
				int did = resultSet.getInt(6);

				Employee employee = new Employee(name, basic, grade, uDate, did);

				employee.setId(resultSet.getInt(1));
				allEmployees.add(employee);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Error creating result");
			System.exit(0);
		}

	}

	
	




	@Override
	public boolean addEmployee(Employee employee) throws Throwable {
		resultSet.moveToInsertRow();
		// resultSet.updateInt(1, employee.getId());
		resultSet.updateString(2, employee.getName());
		resultSet.updateDouble(3, employee.getBasicSalary());
		resultSet.updateString(4, employee.getGrade() + "");
		java.sql.Date sDate = DateConversion.convertToSQLDate(employee.getDateOfJoin());
		resultSet.updateDate(5, sDate);
		resultSet.updateInt(6, employee.getDid());
		resultSet.insertRow();
		allEmployees.add(employee);

		return true;
}

	@Override
	public boolean removeEmployee(Employee employee) throws Throwable {
		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt(1) == employee.getId()) {
				resultSet.deleteRow();
				allEmployees.remove(employee);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Throwable {
		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt(1) == employee.getId()) {

				// resultSet.updateInt(1, employee.getId());
				resultSet.updateString(2, employee.getName());
				resultSet.updateDouble(3, employee.getBasicSalary());
				resultSet.updateString(4, employee.getGrade() + "");
				java.sql.Date sDate = DateConversion.convertToSQLDate(employee.getDateOfJoin());
				resultSet.updateDate(5, sDate);
				resultSet.updateInt(6, employee.getDid());

				resultSet.updateRow();

				return true;
			}
		}
		return false;
	}

	@Override
	public Employee findEmployee(Employee employee) throws Throwable {
		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt(1) == employee.getId()) {

				String name = resultSet.getString(2);
				double basic = resultSet.getDouble(3);
				char grade = resultSet.getString(4).charAt(0);
				java.sql.Date sDate = resultSet.getDate(5);
				Date uDate = DateConversion.convertToUtilDate(sDate);
				int did = resultSet.getInt(6);

				Employee employee2 = new Employee(name, basic, grade, uDate, did);

				employee2.setId(employee.getId());
				return employee2;
			}
		}
		return null;
	}
	

	public List<Employee> getAllEmployees(Employee employee) throws Throwable {
		return allEmployees;
	}

	}