package com.ameex.training.ui;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ameex.training.business.Product;
import com.ameex.training.db.MySQLProductDAOImpl;
import com.ameex.training.db.ProductDAO;


public class ProductListDownloadExcelServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductDAO dao = new MySQLProductDAOImpl();

		try {
			List<Product> products = dao.getAllProducts();

			response.setContentType("application/vnd.ms-excel");
			
			response.setHeader("Content-Disposition", "attachment; fileName=Products.xls");
			PrintWriter out = response.getWriter();
			


			out.println("<table>");
			for (Product product : products) {
				out.println("<tr>");
				out.println("<td>" + product.getId() + "</td>");
				out.println("<td>" + product.getName() + "</td>");
				out.println("<td>" + product.getPrice() + "</td>");

				out.println("<td>" + product.getManufacturedDate() + "</td>");

				out.println("<td>" + product.getCategory() + "</td>");
				out.println("</tr>");

			}

			out.println("</table>");
			
			
		} catch (Throwable e) {

			request.setAttribute("statusString", "There iS a Problem in retrieving ProductList");
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Pages/JSP/StatusDisplayer.jsp");
			dispatcher.forward(request, response);
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
