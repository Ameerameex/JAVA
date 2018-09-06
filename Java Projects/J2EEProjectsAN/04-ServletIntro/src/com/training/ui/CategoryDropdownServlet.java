package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.training.business.Category;


public class CategoryDropdownServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Category category=new Category(1, "Laptop");
		Category category2=new Category(2, "Mobile");
		Category category3=new Category(3, "Television");
		Category category4=new Category(4, "AC");

		Set<Category> categories=new HashSet<>();
		categories.add(category);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		String str1="<select name='combo_category'";
		String str2="</select>";
		out.print("<h1>Select Category</h1><br>");

		out.print("<form action='' mehod='get'>");
		out.print(str1);
		for (Category category5 : categories) {
			out.println("<option value='"+category5.getId()+"'>");
			out.println(category5.getName());
			out.println("</option>");
		}
		out.println(str2);
		out.print("<br>");
		out.print("<input type='submit'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");


	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
