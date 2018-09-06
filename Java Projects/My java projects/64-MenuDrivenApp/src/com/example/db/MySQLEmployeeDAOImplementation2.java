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

public class MySQLEmployeeDAOImplementation2 implements EmployeeDAO, EmployeeQueries {

	private ResultSet resultSet;
	private List<Employee> allEmployees;

	public MySQLEmployeeDAOImplementation2() {
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

				String name = resultSet.getString("name");
				double basic = resultSet.getDouble("basic");
				char grade = resultSet.getString("grade").charAt(0);
				java.sql.Date sDate = resultSet.getDate("doj");
				Date uDate = DateConversion.convertToUtilDate(sDate);
				int did = resultSet.getInt("did");

				Employee employee = new Employee(name, basic, grade, uDate, did);

				employee.setId(resultSet.getInt("id"));
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
		resultSet.updateString("name", employee.getName());
		resultSet.updateDouble("basic", employee.getBasicSalary());
		resultSet.updateString("grade", employee.getGrade() + "");
		java.sql.Date sDate = DateConversion.convertToSQLDate(employee.getDateOfJoin());
		resultSet.updateDate("doj", sDate);
		resultSet.updateInt("did", employee.getDid());
		resultSet.insertRow();
		allEmployees.add(employee);

		return true;
}

	@Override
	public boolean removeEmployee(Employee employee) throws Throwable {
		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt("id") == employee.getId()) {
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
			if (resultSet.getInt("id") == employee.getId()) {

				// resultSet.updateInt(1, employee.getId());
				resultSet.updateString("name", employee.getName());
				resultSet.updateDouble("basic", employee.getBasicSalary());
				resultSet.updateString("grade", employee.getGrade() + "");
				java.sql.Date sDate = DateConversion.convertToSQLDate(employee.getDateOfJoin());
				resultSet.updateDate("doj", sDate);
				resultSet.updateInt("did", employee.getDid());

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
			if (resultSet.getInt("id") == employee.getId()) {

				String name = resultSet.getString("name");
				double basic = resultSet.getDouble("basic");
				char grade = resultSet.getString("grade").charAt(0);
				java.sql.Date sDate = resultSet.getDate("doj");
				Date uDate = DateConversion.convertToUtilDate(sDate);
				int did = resultSet.getInt("did");

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