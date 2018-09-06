package com.example.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.business.Department;

public class MySQLDepartmentDAOImplementation2 implements DepartmentDAO, DepartmentQueries {

	private ResultSet resultSet;
	private List<Department> allDepartments;

	public MySQLDepartmentDAOImplementation2() {
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
				if (allDepartments == null) {
					allDepartments = new ArrayList<Department>();
				}
				int id = resultSet.getInt("id");
				String departmentName = resultSet.getString("name");
				String headOfDepartment = resultSet.getString("head");

				Department department = new Department( departmentName, headOfDepartment);
department.setId(id);
				allDepartments.add(department);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("Error creating result");
			System.exit(0);
		}

	}

	@Override
	public boolean addDepartment(Department department) throws Throwable {
		resultSet.moveToInsertRow();
		resultSet.updateInt("id", department.getId());
		resultSet.updateString("name", department.getDepartmentName());
		resultSet.updateString("head", department.getHeadOfDepartment());
		resultSet.insertRow();
		allDepartments.add(department);

		return true;
	}

	@Override
	public boolean deleteDepartment(Department Department) throws Throwable {
		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt("id") == Department.getId()) {
				resultSet.deleteRow();
				allDepartments.remove(Department);
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean updateDepartment(Department Department) throws Throwable {
		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt("id") == Department.getId()) {

				resultSet.updateInt("id", Department.getId());
				resultSet.updateString("name", Department.getDepartmentName());
				resultSet.updateString("head", Department.getHeadOfDepartment());

				resultSet.updateRow();
				// int position=allDepartments.indexOf(Department);
				// allDepartments.set(position,Department);
				return true;
			}
		}
		return false;
	}

	@Override
	public Department findDepartment(int id) throws Throwable {

		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt("id") == id) {

				String departmentName = resultSet.getString("name");
				String headOfDepartment = resultSet.getString("head");

				Department department = new Department( departmentName, headOfDepartment);
				department.setId(id);
				return department;
			}
		}
		return null;
	}

	@Override
	public List<Department> getAllDepartments() throws Throwable {
		return allDepartments;
	}

}
