package com.example.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.business.Department;

public class MySQLDepartmentDAOImplementation implements DepartmentDAO, DepartmentQueries {

	private ResultSet resultSet;
	private List<Department> allDepartments;

	public MySQLDepartmentDAOImplementation() {
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
				 ;
				String departmentName = resultSet.getString(2);
				String headOfDepartment = resultSet.getString(3);

				Department department = new Department(departmentName, headOfDepartment);
department.setId(resultSet.getInt(1));
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
		//resultSet.updateInt(1, department.getId());
		resultSet.updateString(2, department.getDepartmentName());
		resultSet.updateString(3, department.getHeadOfDepartment());
		resultSet.insertRow();
		allDepartments.add(department);

		return true;
	}

	@Override
	public boolean deleteDepartment(Department Department) throws Throwable {
		resultSet.beforeFirst();

		while (resultSet.next()) {
			if (resultSet.getInt(1) == Department.getId()) {
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
			if (resultSet.getInt(1) == Department.getId()) {

				//resultSet.updateInt(1, Department.getId());
				resultSet.updateString(2, Department.getDepartmentName());
				resultSet.updateString(3, Department.getHeadOfDepartment());

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
			if (resultSet.getInt(1) == id) {

				String departmentName = resultSet.getString(2);
				String headOfDepartment = resultSet.getString(3);

				Department department = new Department(departmentName, headOfDepartment);
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
