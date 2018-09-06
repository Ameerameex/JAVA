package com.training.ui;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.training.business.Employee;
import com.training.db.EmployeeDAO;
import com.training.db.MySQLEmployeeDAOImpl1;


public class EmployeeUpdatingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1,s2,s3,s4,s5;
		s1=request.getParameter("txt_id");
		s2=request.getParameter("txt_name");
		s3=request.getParameter("txt_basic");
		s4=request.getParameter("txt_doj");
		s5=request.getParameter("combo_grade");

		int id=0;
		String name=null;
		double basic=0.0;
		Date doj=null;
		char grade='\0';
		
		if(s1!=null && s1.trim().length()>0){
			id=Integer.parseInt(s1);
		}
		if(s2!=null){
			name=s2.trim();
		}
		if(s3!=null && s3.trim().length()>0){
			basic=Double.parseDouble(s3);
		}
		if(s4!=null && s4.trim().length()>0){
			SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
			try {
				doj=dateFormat.parse(s4);
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
		}
		if(s5!=null && !(s5.equals("-"))){
			grade=s5.charAt(0);
		}
		
		
		Employee employee=new Employee(id, name, basic, grade, doj);
		EmployeeDAO dao=new MySQLEmployeeDAOImpl1();
		
		boolean status=false;
		try {
		 status=dao.updateEmployee(employee);
		} catch (Throwable e) {
			request.setAttribute("statusString", "Employee Not Updated");

		}
		if(status==true){
			request.setAttribute("statusString", "Employee Updated Successfully");

		}else
		{
			request.setAttribute("statusString", "Employee Not Updated");
		}
		RequestDispatcher dispatcher=request.getRequestDispatcher("StatusDisplayer.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		doGet(request, response);
	}

}
