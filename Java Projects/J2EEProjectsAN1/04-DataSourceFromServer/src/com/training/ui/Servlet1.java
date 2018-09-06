package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class Servlet1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("here1");
		Context initContext;
		try {
			initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/salesDB");
			Connection conn = ds.getConnection();
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery("select * from product");
			//System.out.println("here2");
			PrintWriter out=response.getWriter();
			while(rs.next()){
				//System.out.println("here3");
				out.print(rs.getInt(1)+","+ rs.getString(2)+"<br>");
			}
			
			
		} catch (NamingException e) {   
			//System.out.println("here4");
			System.out.println(e);
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//System.out.println("here5");
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
			IOException {
		doGet(request, response);
	}

}
