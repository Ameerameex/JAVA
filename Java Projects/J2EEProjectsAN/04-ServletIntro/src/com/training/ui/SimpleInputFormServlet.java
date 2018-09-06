package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleInputFormServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Demo</title>");
		out.println("</head>");
		out.println("<body>");
		String str1 = "<form action='' method='get'>";
		String str2 = "<input type='text' name='txt_name' required>";
		String str3 = "<input type='text' name='txt_age' required>";
		String str4 = "<input type='submit' value='SUBMIT'>";
		String str5 = "</form>";
		out.println("</body>");
		out.println("</html>");
		out.println(str1);
		out.println("<table>");
		out.print("<tr>");
		out.print("<td>Enter Your Name</td>");
		out.print("<td>");
		out.println(str2);
		out.print("</td>");
		out.print("</tr>");
		
		out.print("<tr>");
		out.print("<td>Enter Your Age</td>");
		out.print("<td>");
		out.println(str3);
		out.print("</td>");
		out.print("</tr>");

		out.print("<tr>");
		out.println("<td colspan='2'>");
		out.println(str4);
		out.println("</td>");
		
		out.print("</table>");
		
		out.println(str5);


	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
