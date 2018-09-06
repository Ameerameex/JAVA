package com.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InputDemo1Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

Map<String, String[]> map=request.getParameterMap();
PrintWriter out = response.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title> Demo</title>");
out.println("</head>");
out.println("<body>");
Set<String> names=map.keySet();
for (String name : names) {
	
	out.print(name+"-"+Arrays.toString(map.get(name))+"<br>");
	
}
out.println("</body>");
out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
