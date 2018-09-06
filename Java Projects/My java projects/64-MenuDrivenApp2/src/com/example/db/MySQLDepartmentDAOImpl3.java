package com.example.db;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.business.Department;



public class MySQLDepartmentDAOImpl3 implements DepartmentDAO,MySQLDepartmentQueries {

	
	public boolean addDepartment(Department department) throws Throwable {
		Connection connection=ConnectionManager.createConnection();
		PreparedStatement statement=connection.prepareStatement(INSERT_QUERY);
		statement.setInt(1, department.getId());
		statement.setString(2, department.getDepartmentName());
		statement.setString(3, department.getHeadOfDepartment());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean deleteDepartment(Department department) throws Throwable {
		Connection connection=ConnectionManager.createConnection();
		PreparedStatement statement=connection.prepareStatement(DELETE_QUERY);
		statement.setInt(1, department.getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);

		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public boolean updateDepartment(Department department) throws Throwable {
		Connection connection=ConnectionManager.createConnection();
		PreparedStatement statement=connection.prepareStatement(UPDATE_QUERY);
		
		statement.setString(1, department.getDepartmentName());
		statement.setString(2, department.getHeadOfDepartment());
		statement.setInt(3, department.getId());
		int r= statement.executeUpdate();
		ConnectionManager.closeConnection(connection);
		if(r>0){
			return true;
		}
		else
		return false;
	}

	@Override
	public Department findDepartment(int id) throws Throwable {
		Connection connection=ConnectionManager.createConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ONE_QUERY);
		statement.setInt(1,id);
		ResultSet resultSet=statement.executeQuery();

		if(resultSet.next()){
			Department department=new Department();
			int i=resultSet.getInt(1);
			String j=resultSet.getString(2);
		String k=resultSet.getString(3);
			department.setId(i);
			department.setDepartmentName(j);
			department.setHeadOfDepartment(k);
			return department;
		}
		
		ConnectionManager.closeConnection(connection);

		return null;
	}

	@Override
	public List<Department> getAllDepartments() throws Throwable {
		Connection connection=ConnectionManager.createConnection();
		PreparedStatement statement=connection.prepareStatement(FIND_ALL_QUERY);
		List<Department> allProducts=new ArrayList<>();
		ResultSet resultSet=statement.executeQuery();

		while(resultSet.next()){
			Department department=new Department();
			int i=resultSet.getInt(1);
			String j=resultSet.getString(2);
		String k=resultSet.getString(3);
			department.setId(i);
			department.setDepartmentName(j);
			department.setHeadOfDepartment(k);
			allProducts.add(department);
		}
		ConnectionManager.closeConnection(connection);

		return allProducts;
	}

	
}
